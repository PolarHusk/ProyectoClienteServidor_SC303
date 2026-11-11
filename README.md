# ProyectoClienteServidor_SC303

Desktop application (Java Swing) for managing IT **assets** (*activos*) and **incidents** (*incidentes*), with three user roles (Admin, Técnico, End User) and a client-server chat built on sockets. Data is stored in MySQL.

Course project for *Programación Cliente Servidor Concurrente* (SC-303), Universidad Fidélitas.

---

## Requirements

Install these before you start:

| Tool | Version | Notes |
|------|---------|-------|
| [Apache NetBeans](https://netbeans.apache.org/download/) | 24 or newer | Includes Maven and Git, so you don't need to install them separately |
| [JDK](https://jdk.java.net/) | **24 or newer** | The project compiles with `maven.compiler.release = 24` |
| [MySQL Server](https://dev.mysql.com/downloads/mysql/) | 8.x | Plus MySQL Workbench to run the database script |

---

## 1. Download the repository

**Option A: clone from NetBeans**
1. **Team → Git → Clone…**
2. Repository URL: `https://github.com/PolarHusk/ProyectoClienteServidor_SC303.git`
3. Click **Next** until you reach **Finish**, and choose a destination folder.
4. When NetBeans asks whether to open the cloned project, click **Open Project**.

**Option B: download the ZIP**
1. On the GitHub page, click **Code → Download ZIP** and unzip it.
2. In NetBeans, go to **File → Open Project** and select the unzipped folder.

NetBeans recognizes it as a Maven project. The first time you open it, NetBeans downloads the dependencies (MySQL Connector/J, iTextPDF, AbsoluteLayout), which can take a minute.

---

## 2. Create the database

The script [`src/main/resources/creaTablas.sql`](src/main/resources/creaTablas.sql) creates the `proyectoclienteprogra` database, its tables (`usuario`, `activos`, `incidentes`) and a default admin user.

1. Open **MySQL Workbench** and connect to your local server (`localhost:3306`).
2. **File → Open SQL Script** and choose `creaTablas.sql` from the project folder.
3. Run it with the ⚡ button.

> The script starts with `CREATE DATABASE`, so it fails if the database already exists. To start over, run `DROP DATABASE proyectoclienteprogra;` first.

---

## 3. Configure the database connection

In NetBeans, open `Source Packages → Datos → Conexion.java`. The connection details are hard-coded there:

```java
String url = "jdbc:mysql://localhost:3306/proyectoclienteprogra";
String user = "root";
String password = "cisco123!";
```

Change `user` and `password` to match **your** MySQL installation. If your MySQL server doesn't run on port `3306`, change the port in `url` too.

> Try not to commit your personal password. Before you commit, either keep this change out of the commit or put the original value back.

---

## 4. Check the project's JDK

Right-click the project → **Properties → Build → Compile** and make sure **Java Platform** is JDK 24 or newer. If yours isn't listed, add it under **Tools → Java Platforms → Add Platform…**.

Then right-click the project → **Clean and Build**. You should see `BUILD SUCCESS` in the Output window.

---

## 5. Run the application

The application has **two programs**, and the order you start them in matters:

| Program | File | Purpose |
|---------|------|---------|
| Chat server | `Servidor → ServidorChat.java` | Listens on port **1234** for chat clients |
| Client application | `Principal → FormPrincipal.java` | Login screen and the main app |

1. In the **Projects** panel, expand **Source Packages → Servidor**, right-click `ServidorChat.java` → **Run File** (Shift+F6). Leave it running; it has no window, and it shows up as a running task at the bottom of NetBeans.
2. Expand **Source Packages → Principal**, right-click `FormPrincipal.java` → **Run File** (Shift+F6). The login window opens.

> Use **Run File**, not the green **Run Project** button. Run Project looks for a main class that isn't configured correctly in `pom.xml`.

You only need the chat server for the chat window. Without it, the rest of the app still works, but the chat can't connect.

To stop the server, click the ✖ next to the running task in NetBeans' status bar, or the red stop button in its Output tab.

---

## 6. Log in

The SQL script creates one administrator account:

| User | Password | Role |
|------|----------|------|
| `admin` | `cisco123` | ADMIN |

From the admin view you can create more users with the `TECNICO` and `ENDUSER` roles.

---

## Project structure

```
src/main/java/
├── Principal/     Entry point (FormPrincipal: login screen)
├── Vista/         Swing windows (Admin, Técnico, End User, Chat)
├── Controlador/   Controllers connecting views to data
├── Modelo/        Domain classes (Usuario, Activo, Incidente, enums)
├── Datos/         Database access (Conexion, *Datos classes)
└── Servidor/      Socket chat server (ServidorChat, port 1234)
src/main/resources/
├── creaTablas.sql Database creation script
└── imagenes/      Images used by the UI
```

The admin view exports PDF reports (`Reporte_de_Activos.pdf`, `Reporte_de_Incidente.pdf`) into the project folder.

---

## Troubleshooting

| Problem | Likely cause / fix |
|---------|--------------------|
| `Access denied for user 'root'@'localhost'` | The user or password in `Conexion.java` doesn't match your MySQL setup (step 3). |
| `Unknown database 'proyectoclienteprogra'` | You haven't run the SQL script yet (step 2). |
| `Communications link failure` | The MySQL service isn't running, or it uses a port other than 3306. |
| `invalid target release: 24` / `release version 24 not supported` | The project's Java Platform is older than JDK 24 (step 4). |
| Imports in red / "package does not exist" | Dependencies weren't downloaded. Right-click the project → **Reload POM**, then **Clean and Build**. |
| Run Project says the main class can't be found | Use **Run File** on `FormPrincipal.java` instead (step 5). |
| Chat window shows `Connection refused` | Start `ServidorChat` before you open the chat. |
| `Address already in use` when starting the server | The server is already running (check the bottom of NetBeans), or another program is using port 1234. |
