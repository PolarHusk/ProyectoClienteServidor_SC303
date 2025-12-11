package Controlador;

import Datos.*;
import Modelo.*;
import Vista.*;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPTable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileOutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Dylan
 */
public class ControladorAdmin {

    private final VistaAdmin vista;
    private final UsuarioDatos usuarioConexion;
    private final ActivoDatos activoConexion;
    private final IncidenteDatos incidenteConexion;
    private final Conexion conectar = new Conexion();

    public ControladorAdmin(VistaAdmin vista) {
        this.vista = vista;
        this.usuarioConexion = new UsuarioDatos();
        this.activoConexion = new ActivoDatos();
        this.incidenteConexion = new IncidenteDatos();

        listeners();

        mostrarDatosUsuarios();
        mostrarDatosActivos();
        mostrarDatosIncidentes();

    }

    private void listeners() {

        this.vista.getBtnAgregarUsuario().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarUsuario();
                mostrarDatosUsuarios();

            }

        });

        this.vista.getBtnActualizarUsuario().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarUsuario();
                mostrarDatosUsuarios();

            }

        });

        this.vista.getBtnEliminarUsuario().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarUsuario();
                mostrarDatosUsuarios();

            }

        });

        this.vista.getBtnBuscarUsuario().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarUsuario();
            }

        });

        this.vista.getTblUsuarios().addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent e) {
                int rec = vista.getTblUsuarios().getSelectedRow();
                int idUsuarioSeleccionado = Integer.parseInt(vista.getTblUsuarios().getValueAt(rec, 0).toString());
                vista.setIdUsuarioSeleccionado(idUsuarioSeleccionado);
                vista.getTxtNombreDeUsuario().setText(vista.getTblUsuarios().getValueAt(rec, 4).toString());
                vista.getTxtUsuarioNombre().setText(vista.getTblUsuarios().getValueAt(rec, 1).toString());
                vista.getTxtUsuarioApellido1().setText(vista.getTblUsuarios().getValueAt(rec, 2).toString());
                vista.getTxtUsuarioCorreo().setText(vista.getTblUsuarios().getValueAt(rec, 3).toString());
                vista.getCbRolUsuario().setSelectedItem(vista.getTblUsuarios().getValueAt(rec, 5));
                vista.getCbDepartamentoUsuario().setSelectedItem(vista.getTblUsuarios().getValueAt(rec, 6));
            }

        });

        this.vista.getBtnAgregarActivo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarActivo();
                mostrarDatosActivos();
            }

        });

        this.vista.getBtnModificarActivo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modificarActivo();
                mostrarDatosActivos();
            }

        });

        this.vista.getBtnEliminarActivo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarActivo();
                mostrarDatosActivos();
            }

        });

        this.vista.getBtnBuscarActivo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarActivo();
            }

        });

        this.vista.getCbDepartamento().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarActivosDepartamento();
            }

        });

        this.vista.getCbOSActivo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarActivosSistemaOperativo();
            }

        });

        this.vista.getBtnReporteActivos().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reporteActivos();
            }

        });

        this.vista.getTblActivos().addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int rec = vista.getTblActivos().getSelectedRow();
                int idActivoSeleccionado = Integer.parseInt(vista.getTblActivos().getValueAt(rec, 0).toString());
                vista.setIdActivoSeleccionado(idActivoSeleccionado);
                vista.getTxtNombreActivo().setText(vista.getTblActivos().getValueAt(rec, 2).toString());
                vista.getTxtIPActivo().setText(vista.getTblActivos().getValueAt(rec, 1).toString());
                vista.getCbOSActivo().setSelectedItem(vista.getTblActivos().getValueAt(rec, 3).toString());
                vista.getCbTipoDeActivo().setSelectedItem(vista.getTblActivos().getValueAt(rec, 4));
                vista.getTxtUbicacionActivo().setText(vista.getTblActivos().getValueAt(rec, 6).toString());
                vista.getCbDepartamento().setSelectedItem(vista.getTblActivos().getValueAt(rec, 7).toString());
                vista.getCbEstadoActivo().setSelectedItem(vista.getTblActivos().getValueAt(rec, 5));

            }

        });

        this.vista.getBtnAgregarIncidente().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarIncidente();
                mostrarDatosIncidentes();
            }

        });

        this.vista.getBtnActualizarIncidente().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarIncidente();
                mostrarDatosIncidentes();
            }

        });

        this.vista.getBtnEliminarIncidente().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarIncidente();
                mostrarDatosIncidentes();
            }

        });
        
        this.vista.getBtnBuscarIncidente().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarIncidente();
                mostrarDatosIncidentes();
            }
        
        
        });
        

        this.vista.getBtnReporteIncidentes().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reporteIncidentes();
                mostrarDatosIncidentes();
            }
        });

        this.vista.getTblIncidentes().addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int rec = vista.getTblIncidentes().getSelectedRow();
                int idIncidenteSeleccionado = Integer.parseInt(vista.getTblIncidentes().getValueAt(rec, 0).toString());
                vista.setIdIncidenteSeleccionado(idIncidenteSeleccionado);
                vista.getTxtTituloIncidente().setText(vista.getTblIncidentes().getValueAt(rec, 1).toString());
                vista.getDescripcionIncidente().setText(vista.getTblIncidentes().getValueAt(rec, 2).toString());
                vista.getCbEstadoIncidente().setSelectedItem(vista.getTblIncidentes().getValueAt(rec, 3).toString());
                vista.getCbPrioridadIncidente().setSelectedItem(vista.getTblIncidentes().getValueAt(rec, 4).toString());
                vista.getTxtReportadoPor().setText(vista.getTblIncidentes().getValueAt(rec, 5).toString());
                vista.getTxtActivoAfectado().setText(vista.getTblIncidentes().getValueAt(rec, 7).toString());
                vista.getLblFechaAperturaVariable().setText(vista.getTblIncidentes().getValueAt(rec, 8).toString());

                if (vista.getTblIncidentes().getValueAt(rec, 6) == null) {
                    vista.getTxtAsignadoA1().setText("Sin tecnico asignado");
                } else {
                    vista.getTxtAsignadoA1().setText(vista.getTblIncidentes().getValueAt(rec, 6).toString());
                }

                if (vista.getTblIncidentes().getValueAt(rec, 9) == null) {
                    vista.getLblFechaCierreVariable().setText("Incidente Abierto");
                } else {
                    vista.getLblFechaCierreVariable().setText(vista.getTblIncidentes().getValueAt(rec, 9).toString());
                }
            }
        });

    }

    private void agregarUsuario() {

        String nombre = vista.getNombre();
        String apellido1 = vista.getApellido1();
        String apellido2 = vista.getApellido2();
        String usuario = vista.getUsuario();

        String contrasena = vista.getPass();

        if (usuario.isEmpty() || contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Ingrese el usuario y contrasena");
            return;
        }

        String correo = vista.getCorreo();
        String departamento = vista.getDepartamento();
        Rol rol = vista.getRol();

        Usuario nuevo;

        switch (rol) {
            case ADMIN:
                nuevo = new Administrador(nombre, apellido1, apellido2, correo, usuario, contrasena, departamento);
                break;
            case TECNICO:
                nuevo = new Tecnico(nombre, apellido1, apellido2, correo, usuario, contrasena, departamento);
                break;
            case ENDUSER:
                nuevo = new UsuarioFinal(nombre, apellido1, apellido2, nombre, usuario, contrasena, departamento);
                break;
            default:
                throw new AssertionError();
        }

        if (usuarioConexion.insertar(nuevo)) {
            JOptionPane.showMessageDialog(vista, "Usuario Creado Correctamente");
        } else {
            JOptionPane.showMessageDialog(vista, "El usuario ya existe en la base de datos");
        }

    }

    private void actualizarUsuario() {

        int id = vista.getIdUsuarioSeleccionado();
        String nombre = vista.getNombre();
        String apellido1 = vista.getApellido1();
        String apellido2 = vista.getApellido2();
        String correo = vista.getCorreo();
        String usuario = vista.getUsuario();
        String departamento = vista.getDepartamento();

        Rol rol = vista.getRol();

        String contrasenaIngresada = vista.getPass();

        Usuario actualizado;

        switch (rol) {
            case ADMIN:
                actualizado = new Administrador(id, nombre, apellido1, apellido2, correo, usuario, null, departamento);
                break;
            case TECNICO:
                actualizado = new Tecnico(id, nombre, apellido1, apellido2, correo, usuario, null, departamento);
                break;
            case ENDUSER:
                actualizado = new UsuarioFinal(id, nombre, apellido1, apellido2, correo, usuario, null, departamento);
                break;
            default:
                throw new AssertionError();
        }

        boolean actualizacion;

        if (contrasenaIngresada != null && !contrasenaIngresada.trim().isEmpty()) {
            actualizado.setPassword(contrasenaIngresada);
            actualizacion = usuarioConexion.actualizarConPassword(actualizado);
        } else {
            actualizacion = usuarioConexion.actualizarSinPassword(actualizado);
        }

        if (actualizacion) {
            JOptionPane.showMessageDialog(vista, "Usuario Actualizado Correctamente");
        } else {
            JOptionPane.showMessageDialog(vista, "El usuario no existe en la base de datos");
        }
    }

    private void eliminarUsuario() {

        int idEliminarUsuario = vista.getIdUsuarioSeleccionado();

        if (idEliminarUsuario <= 0) {
            JOptionPane.showMessageDialog(vista, "Debe seleccionar o buscar un usuario para eliminar");
            return;
        }

        if (usuarioConexion.eliminar(idEliminarUsuario)) {
            JOptionPane.showMessageDialog(vista, "Usuario eliminado correctamente");
        } else {
            JOptionPane.showMessageDialog(vista, "El usuario no existe en la base de datos o tiene incidentes asignados aun.\n Reasigne los incidentes antes"
                    + " para eliminar este usuario", "Error al eliminar el usuario", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void buscarUsuario() {

        this.vista.getTblUsuarios().clearSelection();

        String usuarioBusqueda = vista.getUsuarioBusqueda();

        if (usuarioBusqueda == null || usuarioBusqueda.trim().isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Ingrese un usuario para buscar");
            return;
        }

        Usuario encontrado = usuarioConexion.buscarPorUsuario(usuarioBusqueda);

        if (encontrado == null) {
            JOptionPane.showMessageDialog(vista, "Usuario no encontrado en la base de datos");
            return;
        }

        vista.setIdUsuarioSeleccionado(encontrado.getId());
        vista.getTxtNombreDeUsuario().setText(encontrado.getUsuario());
        vista.getTxtUsuarioNombre().setText(encontrado.getNombre());
        vista.getTxtUsuarioApellido1().setText(encontrado.getApellido1());
        vista.getTxtUsuarioApellido2().setText(encontrado.getApellido2());
        vista.getTxtUsuarioCorreo().setText(encontrado.getCorreo());
        vista.getCbRolUsuario().setSelectedItem(encontrado.getRolUsuario());
        vista.getCbDepartamentoUsuario().setSelectedItem(encontrado.getDepartamento());

        JOptionPane.showMessageDialog(vista, "Usuario encontrado");

    }

    private void mostrarDatosUsuarios() {
        try {
            ResultSet rsUsuarios = usuarioConexion.obtenerTodosUsuarios();

            DefaultTableModel tblUsuarios = new DefaultTableModel();
            tblUsuarios.addColumn("ID");
            tblUsuarios.addColumn("Nombre");
            tblUsuarios.addColumn("Primer Apellido");
            tblUsuarios.addColumn("Correo");
            tblUsuarios.addColumn("Usuario");
            tblUsuarios.addColumn("Rol");
            tblUsuarios.addColumn("Departamento");

            while (rsUsuarios.next()) {
                tblUsuarios.addRow(new Object[]{
                    rsUsuarios.getInt("idUsuario"),
                    rsUsuarios.getString("nombre"),
                    rsUsuarios.getString("apellido1"),
                    rsUsuarios.getString("correo"),
                    rsUsuarios.getString("usuario"),
                    rsUsuarios.getString("rol"),
                    rsUsuarios.getString("departamento")
                });
            }

            this.vista.getTblUsuarios().setModel(tblUsuarios);

            rsUsuarios.getStatement().getConnection().close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Error cargando usuarios: " + ex.getMessage());
        }
    }

    private void agregarActivo() {

        String hostname = vista.getNombreActivo();

        String direccionIP = vista.getIPActivo();

        if (hostname.isEmpty() || direccionIP.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Ingrese el nombre del activo y la direccion IP", "Error al agregar un nuevo activo", JOptionPane.ERROR_MESSAGE);
        }

        String sistemaOperativo = vista.getOSActivo();
        String ubicacionActivo = vista.getUbicacionActivo();
        String departamentoActivo = vista.getDepartamentoActivo();
        EstadoActivo estadoActivo = vista.getEstadoDeActivo();
        TipoActivo tipoActivo = vista.getTipoActivo();

        Activo nuevo = new Activo(direccionIP, hostname, sistemaOperativo, tipoActivo, estadoActivo, ubicacionActivo, departamentoActivo);

        if (activoConexion.insertar(nuevo)) {
            JOptionPane.showMessageDialog(vista, "Activo creado correctamente");
        } else {
            JOptionPane.showMessageDialog(vista, "Activo ya existe en la base de datos");
        }

    }

    private void modificarActivo() {

        int id = vista.getIdActivoSeleccionado();
        String hostname = vista.getNombreActivo();
        String direccionIP = vista.getIPActivo();
        String sistemaOperativo = vista.getOSActivo();
        String ubicacionActivo = vista.getUbicacionActivo();
        String departamentoActivo = vista.getDepartamentoActivo();
        EstadoActivo estadoActivo = vista.getEstadoDeActivo();
        TipoActivo tipoActivo = vista.getTipoActivo();

        Activo actualizado = new Activo(id, direccionIP, hostname, sistemaOperativo, tipoActivo, estadoActivo, ubicacionActivo, departamentoActivo);

        if (activoConexion.actualizar(actualizado)) {
            JOptionPane.showMessageDialog(vista, "Activo actualizado correctamente");
        } else {
            JOptionPane.showMessageDialog(vista, "Activo no encontrado");
        }
    }

    private void eliminarActivo() {

        int idEliminarActivo = vista.getIdActivoSeleccionado();

        if (idEliminarActivo <= 0) {
            JOptionPane.showMessageDialog(vista, "Debe seleccionar un activo de la tabla para eliminar");
            return;
        }

        if (activoConexion.eliminar(idEliminarActivo)) {
            JOptionPane.showMessageDialog(vista, "Activo eliminado correctamente");
        } else {
            JOptionPane.showMessageDialog(vista, "Error eliminando activo");
        }

    }

    private void buscarActivo() {

        this.vista.getTblActivos().clearSelection();

        String activoBusqueda = vista.getActivoBusqueda();

        if (activoBusqueda == null || activoBusqueda.trim().isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Ingrese un activo para buscar");
        }

        Activo encontrado = activoConexion.buscarPorNombre(activoBusqueda);

        if (encontrado == null) {
            JOptionPane.showMessageDialog(vista, "Activo no encontrado en la base de datos");
            return;
        }

        vista.setIdActivoSeleccionado(encontrado.getId());
        vista.getTxtNombreActivo().setText(encontrado.getNombreHost());
        vista.getTxtIPActivo().setText(encontrado.getIp());
        vista.getCbOSActivo().setSelectedItem(encontrado.getSistemaOperativo());
        vista.getTxtUbicacionActivo().setText(encontrado.getUbicacion());
        vista.getCbDepartamento().setSelectedItem(encontrado.getDepartamento());
        vista.getCbEstadoActivo().setSelectedItem(encontrado.getEstadoActivo());
        vista.getCbTipoDeActivo().setSelectedItem(encontrado.getActivo());

        JOptionPane.showMessageDialog(vista, "Activo encontrado");
    }

    private void mostrarActivosDepartamento() {
        try {
            String departamento = vista.getCbDepartamento().getSelectedItem().toString();

            String sql = "Select count(*) AS cantidad from activos where departamento=?";

            PreparedStatement pstmt = conectar.Conectar().prepareStatement(sql);

            pstmt.setString(1, departamento);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                int activosPorDepartamento = rs.getInt("cantidad");
                this.vista.getLblDepartamentoTotalTitulo().setText("Total de activos en " + departamento + ": ");
                this.vista.getLblDepartamentoTotalActivos().setText(String.valueOf(activosPorDepartamento));
            }

            rs.close();
            pstmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void mostrarActivosSistemaOperativo() {
        try {
            String sistemaOperativo = vista.getCbOSActivo().getSelectedItem().toString();

            String sql = "Select count(*) as cantidad from activos where sistemaOperativo=?";

            PreparedStatement pstmt = conectar.Conectar().prepareStatement(sql);

            pstmt.setString(1, sistemaOperativo);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                int activosPorSistemaOperativo = rs.getInt("cantidad");
                this.vista.getLblOSTitulo().setText("Total de activos de " + sistemaOperativo + ": ");
                this.vista.getLblOSTotalActivos().setText(String.valueOf(activosPorSistemaOperativo));
            }

            rs.close();
            pstmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void reporteActivos() {

        try {

            Document documento = new Document();
            PdfWriter.getInstance(documento, new FileOutputStream("Reporte_de_Activos.pdf"));

            documento.open();

            documento.add(new Paragraph("Planilla de Activos exportada en PDF"));
            documento.add(new Paragraph("Exportado por: " + this.vista.getLogueado().getCorreo() + "\t" + this.vista.getLogueado().getUsuario()));
            documento.add(new Paragraph("\n\nLista de activos"));

            PdfPTable pdfTable = new PdfPTable(vista.getTblActivos().getColumnCount());
            pdfTable.setWidthPercentage(100);

            TableModel model = vista.getTblActivos().getModel();

            for (int col = 0; col < model.getColumnCount(); col++) {
                pdfTable.addCell(new Phrase(model.getColumnName(col),
                        FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12)));

            }

            for (int row = 0; row < model.getRowCount(); row++) {
                for (int col = 0; col < model.getColumnCount(); col++) {
                    Object value = model.getValueAt(row, col);
                    pdfTable.addCell(new Phrase(value != null ? value.toString() : "",
                            FontFactory.getFont(FontFactory.HELVETICA, 10)));
                }
            }

            documento.add(pdfTable);
            documento.close();
            JOptionPane.showMessageDialog(vista, "Reporte de activos en PDF generado correctamente");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(vista, "Error al generar el pdf");
        }

    }

    private void mostrarDatosActivos() {

        try {
            ResultSet rsActivos = activoConexion.obtenerTodosActivos();

            DefaultTableModel tblActivos = new DefaultTableModel();
            tblActivos.addColumn("ID");
            tblActivos.addColumn("Direccion IP");
            tblActivos.addColumn("Hostname");
            tblActivos.addColumn("OS");
            tblActivos.addColumn("Tipo de Activo");
            tblActivos.addColumn("Estado Activo");
            tblActivos.addColumn("Ubicacion");
            tblActivos.addColumn("Departamento");

            while (rsActivos.next()) {
                tblActivos.addRow(new Object[]{
                    rsActivos.getInt("idActivo"),
                    rsActivos.getString("ip"),
                    rsActivos.getString("nombreHost"),
                    rsActivos.getString("sistemaoperativo"),
                    rsActivos.getString("tipoActivo"),
                    rsActivos.getString("estadoActivo"),
                    rsActivos.getString("ubicacion"),
                    rsActivos.getString("departamento")
                });
            }

            this.vista.getTblActivos().setModel(tblActivos);

            rsActivos.getStatement().getConnection().close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Error cargando activos: " + ex.getMessage());
        }
    }

    private void agregarIncidente() {

        String titulo = this.vista.getTxtTituloIncidente().getText().trim();
        String descripcion = this.vista.getDescripcionIncidente().getText().trim();

        if (titulo.isEmpty() || descripcion.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Complete el titulo y descripcion");
        }

        Usuario reportadoPor = usuarioConexion.buscarPorUsuario(vista.getTxtReportadoPor().getText().trim());

        Usuario asignadoA = usuarioConexion.buscarPorUsuario(vista.getTxtAsignadoA1().getText().trim());

        if (reportadoPor == null) {
            JOptionPane.showMessageDialog(vista, "El usuario que ha reportado el incidente no fue encontrado en la base de datos");
            return;
        }

        if (asignadoA == null) {
            JOptionPane.showMessageDialog(vista, "El tecnico no esta asignado aun", "Incidente sin tecnico asignado", JOptionPane.WARNING_MESSAGE);
        }

        Activo activo = activoConexion.buscarPorNombre(vista.getTxtActivoAfectado().getText().trim());

        if (activo == null) {
            JOptionPane.showMessageDialog(vista, "El activo afectado no existe en la base de datos");
        }

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime fecha = LocalDateTime.now();
        String fechaCreacion = fecha.format(formato);

        Incidente nuevo = new Incidente(titulo, descripcion, Estado.valueOf(vista.getCbEstadoIncidente().getSelectedItem().toString().toUpperCase()), Prioridad.valueOf(vista.getCbPrioridadIncidente().getSelectedItem().toString().toUpperCase()),
                reportadoPor, asignadoA, activo, fechaCreacion, null);

        if (incidenteConexion.crearIncidente(nuevo)) {
            JOptionPane.showMessageDialog(vista, "Incidente Creado");
        } else {
            JOptionPane.showMessageDialog(vista, "Error al crear incidente");
        }
    }

    private void actualizarIncidente() {
        int id = vista.getIdIncidenteSeleccionado();
        String titulo = this.vista.getTxtTituloIncidente().getText().trim();
        String descripcion = this.vista.getDescripcionIncidente().getText().trim();

        Estado estadoIncidente = Estado.valueOf(this.vista.getCbEstadoIncidente().getSelectedItem().toString());

        String fechaCreacion = this.vista.getLblFechaAperturaVariable().getText();

        String fechaCierre;

        if (estadoIncidente == Estado.RESUELTO || estadoIncidente == Estado.CANCELADO) {
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime fecha = LocalDateTime.now();
            fechaCierre = fecha.format(formato);
        } else {
            fechaCierre = null;
        }

        Prioridad prioridadIncidente = Prioridad.valueOf(this.vista.getCbPrioridadIncidente().getSelectedItem().toString());

        String reportadoSeleccionado = this.vista.getTxtReportadoPor().getText().trim();

        Usuario nuevoReportado = usuarioConexion.buscarPorUsuario(reportadoSeleccionado);

        String asignadoSeleccionado = this.vista.getTxtAsignadoA1().getText().trim();

        Usuario nuevoAsignado = usuarioConexion.buscarPorUsuario(asignadoSeleccionado);

        String activoSeleccionado = this.vista.getTxtActivoAfectado().getText().trim();

        if (nuevoReportado == null) {
            JOptionPane.showMessageDialog(vista, "Ingrese el usuario que ha reportado el incidente", "Error al actualizar incidente", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (nuevoAsignado == null) {
            JOptionPane.showMessageDialog(vista, "El tecnico no esta asignado aun", "Incidente sin tecnico asignado", JOptionPane.WARNING_MESSAGE);
        }

        Activo nuevoActivo = activoConexion.buscarPorNombre(activoSeleccionado);

        if (nuevoActivo == null) {
            JOptionPane.showMessageDialog(vista, "El activo nuevo no existe en la base de datos");
            return;
        }

        Incidente actualizado = new Incidente(id,
                titulo,
                descripcion,
                estadoIncidente,
                prioridadIncidente,
                nuevoReportado,
                nuevoAsignado,
                nuevoActivo, fechaCreacion, fechaCierre);

        if (incidenteConexion.actualizar(actualizado)) {
            JOptionPane.showMessageDialog(vista, "Incidente actualizado correctamente", "Actualizacion exitosa", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(vista, "Incidente no encontrado en la base de datos");
        }

    }
    
    private void buscarIncidente(){
        

        this.vista.getTblIncidentes().clearSelection();
        
        int idIncidenteSeleccionado = Integer.parseInt(this.vista.getTxtBusquedaIncidente().getText());
        
        Incidente encontrado = incidenteConexion.buscarPorId(idIncidenteSeleccionado);
        
        if (encontrado == null) {
            JOptionPane.showMessageDialog(vista, "Incidente no encontrado en la base de datos");
            return;
        } else {
            JOptionPane.showMessageDialog(vista, "Incidente encontrado");
        }
        
        vista.setIdIncidenteSeleccionado(idIncidenteSeleccionado);
        vista.getTxtTituloIncidente().setText(encontrado.getTitulo());
        vista.getTxtDescripcionIncidente().setText(encontrado.getDescripcion());
        vista.getLblFechaAperturaVariable().setText(encontrado.getFechaCreacion());
        
        if (encontrado.getFechaCierre() == null) {
            vista.getLblFechaCierreVariable().setText("Incidente Abierto");
        } else {
            vista.getLblFechaCierreVariable().setText(encontrado.getFechaCierre());
        }
        
        vista.getTxtReportadoPor().setText(encontrado.getReportadoPor().getUsuario());
        
        if (encontrado.getAsignadoA() == null) {
            vista.getTxtAsignadoA1().setText("Sin tecnico asignado");
        } else {
            vista.getTxtAsignadoA1().setText(encontrado.getAsignadoA().getUsuario());
        }
        
        vista.getCbEstadoIncidente().setSelectedItem(encontrado.getEstadoIncidente().toString());
        vista.getCbPrioridadIncidente().setSelectedItem(encontrado.getPrioridad().toString());
        vista.getTxtActivoAfectado().setText(encontrado.getActivo().getNombreHost());
        
        
        
        
    }

    private void eliminarIncidente() {

        int idEliminarIncidente = vista.getIdIncidenteSeleccionado();

        if (idEliminarIncidente <= 0) {
            JOptionPane.showMessageDialog(vista, "Debe seleccionar un incidente de la tabla para eliminar");
            return;
        }

        if (incidenteConexion.eliminar(idEliminarIncidente)) {
            JOptionPane.showMessageDialog(vista, "Incidente eliminado correctamente");
        } else {
            JOptionPane.showMessageDialog(vista, "Error eliminando incidente");
        }

    }

    private void reporteIncidentes() {

        try {
            Document documento = new Document();
            PdfWriter.getInstance(documento, new FileOutputStream("Reporte_de_Incidente.pdf"));
            documento.open();

            documento.add(new Paragraph("Historial de incidentes exportado en PDF"));
            documento.add(new Paragraph("Exportado por: " + this.vista.getLogueado().getCorreo() + "\n" + this.vista.getLogueado().getUsuario()));
            documento.add(new Paragraph("\n\n Historial de incidentes: \n\n"));

            PdfPTable pdfTable = new PdfPTable(vista.getTblIncidentes().getColumnCount());
            pdfTable.setWidthPercentage(100);

            TableModel model = vista.getTblIncidentes().getModel();
            for (int col = 0; col < model.getColumnCount(); col++) {
                pdfTable.addCell(new Phrase(model.getColumnName(col),
                        FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12)));

            }

            for (int row = 0; row < model.getRowCount(); row++) {
                for (int col = 0; col < model.getColumnCount(); col++) {
                    Object value = model.getValueAt(row, col);
                    pdfTable.addCell(new Phrase(value != null ? value.toString() : "",
                            FontFactory.getFont(FontFactory.HELVETICA, 10)));
                }
            }

            documento.add(pdfTable);
            documento.close();
            JOptionPane.showMessageDialog(vista, "Reporte de incidentes en PDF generado correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(vista, "Error al generar el pdf");
        }
    }

    private void mostrarDatosIncidentes() {

        try {
            ResultSet rsIncidentes = incidenteConexion.obtenerTodosIncidentes();

            DefaultTableModel tblIncidentes = new DefaultTableModel();
            tblIncidentes.addColumn("ID");
            tblIncidentes.addColumn("Titulo");
            tblIncidentes.addColumn("Descripcion");
            tblIncidentes.addColumn("Estado Incidente");
            tblIncidentes.addColumn("Prioridad");
            tblIncidentes.addColumn("Reportado Por");
            tblIncidentes.addColumn("Asignado A");
            tblIncidentes.addColumn("Activo Impactado: ");
            tblIncidentes.addColumn("Fecha Creacion");
            tblIncidentes.addColumn("Fecha Cierre");

            while (rsIncidentes.next()) {
                tblIncidentes.addRow(new Object[]{
                    rsIncidentes.getInt("idIncidente"),
                    rsIncidentes.getString("titulo"),
                    rsIncidentes.getString("descripcion"),
                    rsIncidentes.getString("estadoIncidente"),
                    rsIncidentes.getString("prioridad"),
                    rsIncidentes.getString("reportadoNombre"),
                    rsIncidentes.getString("asignadoNombre"),
                    rsIncidentes.getString("activoNombre"),
                    rsIncidentes.getString("fechaCreacion"),
                    rsIncidentes.getString("fechaCierre")
                });
            }

            this.vista.getTblIncidentes().setModel(tblIncidentes);

            rsIncidentes.getStatement().getConnection().close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Error cargando usuarios: " + ex.getMessage());
        }
    }
}
