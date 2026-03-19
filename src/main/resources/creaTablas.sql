CREATE DATABASE proyectoclienteprogra;
USE proyectoclienteprogra;

CREATE TABLE usuario (
	idUsuario INT AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(100) NOT NULL,
	apellido1 VARCHAR(100) NOT NULL,
	apellido2 VARCHAR(100) NOT NULL,
	correo VARCHAR(150) NOT NULL,
	rol ENUM('ADMIN','TECNICO','ENDUSER') NOT NULL,
	usuario varchar(50) NOT NULL UNIQUE,
	password varchar(100) NOT NULL,
	departamento varchar(100) NULL
);

INSERT INTO usuario 
(nombre, apellido1, apellido2, correo, rol, usuario, password)
VALUES 
('Dylan', 'Calderon', 'Navarro', 'dylan@gmail.com', 'ADMIN', 'admin', 'cisco123');

CREATE TABLE activos (
    idActivo INT AUTO_INCREMENT PRIMARY KEY,
    ip VARCHAR(45) NOT NULL,
    nombreHost VARCHAR(100) NOT NULL UNIQUE,
    sistemaOperativo VARCHAR(50) NOT NULL,
    tipoActivo ENUM('HARDWARE', 'SOFTWARE', 'LICENCIA', 'RED', 'PERIFERICO', 'OTRO') NOT NULL,
    estadoActivo ENUM('OPERATIVO','CUARENTENA','MANTENIMIENTO','APAGADO'),
    ubicacion VARCHAR(100) NOT NULL,
    departamento VARCHAR(100) NOT NULL
);

CREATE TABLE incidentes (
    idIncidente INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    descripcion TEXT NOT NULL,
    estadoIncidente ENUM('ABIERTO', 'EN_PROCESO', 'RESUELTO', 'CANCELADO') NOT NULL,
    prioridad ENUM('BAJA', 'MEDIA', 'ALTA', 'CRITICA') NOT NULL,
    reportadoPor INT NOT NULL,
    asignadoA INT NULL,
    activo INT NOT NULL,
    fechaCreacion DATETIME NOT NULL,
    fechaCierre DATETIME NULL,
    FOREIGN KEY (reportadoPor) REFERENCES usuario(idUsuario),
    FOREIGN KEY (asignadoA) REFERENCES usuario(idUsuario),
    FOREIGN KEY (activo) REFERENCES activos(idActivo)
);