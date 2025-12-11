/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Datos.ActivoDatos;
import Datos.Conexion;
import Datos.IncidenteDatos;
import Datos.UsuarioDatos;
import Modelo.Activo;
import Modelo.Estado;
import Modelo.EstadoActivo;
import Modelo.Incidente;
import Modelo.Prioridad;
import Modelo.Tecnico;
import Modelo.Usuario;
import Vista.VistaChat;
import Vista.VistaTecnico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dylan
 */
public class ControladorTecnico {

    private final VistaTecnico vista;
    private final UsuarioDatos usuarioConexion;
    private final ActivoDatos activoConexion;
    private IncidenteDatos incidenteConexion;
    private final Conexion conectar = new Conexion();

    public ControladorTecnico(VistaTecnico vista) {
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
        this.vista.getBtnActualizarTecnico().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarTecnico();
                mostrarDatosUsuarios();
            }

        });

        this.vista.getBtnBuscarTecnico().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarTecnico();
                mostrarDatosUsuarios();
            }

        });

        this.vista.getTblUsuarios().addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int rec = vista.getTblUsuarios().getSelectedRow();
                int idUsuarioSeleccionado = Integer.parseInt(vista.getTblUsuarios().getValueAt(rec, 0).toString());
                vista.setIdUsuarioSeleccionado(idUsuarioSeleccionado);
                vista.getLblTecnicoUsuarioVariable().setText(vista.getTblUsuarios().getValueAt(rec, 4).toString());
                vista.getTxtTecnicoNombre().setText(vista.getTblUsuarios().getValueAt(rec, 1).toString());
                vista.getTxtTecnicoApellido1().setText(vista.getTblUsuarios().getValueAt(rec, 2).toString());
                vista.getTxtTecnicoCorreo().setText(vista.getTblUsuarios().getValueAt(rec, 3).toString());
                vista.getLblPuestoTecnicoVariable().setText(vista.getTblUsuarios().getValueAt(rec, 5).toString());
                vista.getLblDepartamentoTecnicoVariable().setText(vista.getTblUsuarios().getValueAt(rec, 6).toString());
            }
        });

        this.vista.getBtnBuscarActivoTecnico().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarActivo();
                mostrarDatosActivos();
            }

        });

        this.vista.getBtnModificarActivoTecnico().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarActivo();
                mostrarDatosActivos();
            }

        });

        this.vista.getTblActivos().addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int rec = vista.getTblActivos().getSelectedRow();
                int idActivoSeleccionado = Integer.parseInt(vista.getTblActivos().getValueAt(rec, 0).toString());
                vista.setIdActivoSeleccionado(idActivoSeleccionado);
                vista.getLblActivoNombreVariable().setText(vista.getTblActivos().getValueAt(rec, 2).toString());
                vista.getLblIPActivoTecnicoVariable().setText(vista.getTblActivos().getValueAt(rec, 1).toString());
                vista.getLblOSActivoTecnicoVariable().setText(vista.getTblActivos().getValueAt(rec, 3).toString());
                vista.getLblTipoDeActivoTecnicoVariable().setText(vista.getTblActivos().getValueAt(rec, 4).toString());
                vista.getLblUbicacionActivoTecnicoVariable().setText(vista.getTblActivos().getValueAt(rec, 6).toString());
                vista.getLblDepartamentoActivoTecnicoVariable().setText(vista.getTblActivos().getValueAt(rec, 7).toString());
                vista.getCbEstadoActivoTecnico().setSelectedItem(vista.getTblActivos().getValueAt(rec, 5));

            }

        });

        this.vista.getBtnActualizarIncidente().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarIncidente();
                mostrarDatosIncidentes();
            }

        });

        this.vista.getBtnBuscarIncidente().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarIncidente();
                mostrarDatosIncidentes();
            }

        });

        this.vista.getTblIncidentes().addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int rec = vista.getTblIncidentes().getSelectedRow();
                int idIncidenteSeleccionado = Integer.parseInt(vista.getTblIncidentes().getValueAt(rec, 0).toString());
                vista.setIdIncidenteSeleccionado(idIncidenteSeleccionado);
                vista.getLblTituloIncidenteVariable().setText(vista.getTblIncidentes().getValueAt(rec, 1).toString());
                vista.getLblDescripcionIncidenteVariable().setText(vista.getTblIncidentes().getValueAt(rec, 2).toString());
                vista.getCbEstadoIncidenteTecnico().setSelectedItem(vista.getTblIncidentes().getValueAt(rec, 3).toString());
                vista.getCbPrioridadIncidenteTecnico().setSelectedItem(vista.getTblIncidentes().getValueAt(rec, 4).toString());
                vista.getLblReportadoPorVariable().setText(vista.getTblIncidentes().getValueAt(rec, 5).toString());
                vista.getLblActivoImpactadoVariable().setText(vista.getTblIncidentes().getValueAt(rec, 7).toString());
                vista.getLblFechaAperturaVariable().setText(vista.getTblIncidentes().getValueAt(rec, 8).toString());

                if (vista.getTblIncidentes().getValueAt(rec, 6) == null) {
                    vista.getTxtAsignadoA().setText("Sin tecnico asignado");
                } else {
                    vista.getTxtAsignadoA().setText(vista.getTblIncidentes().getValueAt(rec, 6).toString());
                }

                if (vista.getTblIncidentes().getValueAt(rec, 9) == null) {
                    vista.getLblFechaCierreVariable().setText("Incidente Abierto");
                } else {
                    vista.getLblFechaCierreVariable().setText(vista.getTblIncidentes().getValueAt(rec, 9).toString());
                }
            }

        });

        this.vista.getBtnChatEnVivo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int incidenteSeleccionado = vista.getIdIncidenteSeleccionado();
                if (incidenteSeleccionado > 0) {
                    VistaChat chat = new VistaChat(incidenteSeleccionado);
                    new ControladorChat(chat, vista.getLogueado());
                    chat.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(vista, "Seleccione un incidente primero");
                }

            }

        });

    }

    private void actualizarTecnico() {

        int id = vista.getIdUsuarioSeleccionado();
        if (this.vista.getLogueado().getId() != id) {
            JOptionPane.showMessageDialog(vista, "Solo puedes editar tu usuario");
            return;
        }

        Usuario logueado = vista.getLogueado();

        String nombre = vista.getTxtTecnicoNombre().getText();
        String apellido1 = vista.getTxtTecnicoApellido1().getText();
        String apellido2 = vista.getTxtTecnicoApellido2().getText();
        String correo = vista.getTxtTecnicoCorreo().getText();
        String contrasenaIngresada = vista.getPass();

        Tecnico actualizado = new Tecnico(
                logueado.getId(),
                nombre, apellido1, apellido2,
                correo, logueado.getUsuario(), null, logueado.getDepartamento());

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
            JOptionPane.showMessageDialog(vista, "Error al actualizar el usuario");
        }

    }

    private void buscarTecnico() {
        this.vista.getTblUsuarios().clearSelection();

        String usuarioBusqueda = vista.getBusquedaUsuario();

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
        vista.getLblTecnicoUsuarioVariable().setText(encontrado.getUsuario());
        vista.getTxtTecnicoNombre().setText(encontrado.getNombre());
        vista.getTxtTecnicoApellido1().setText(encontrado.getApellido1());
        vista.getTxtTecnicoApellido2().setText(encontrado.getApellido2());
        vista.getTxtTecnicoCorreo().setText(encontrado.getCorreo());
        vista.getLblDepartamentoTecnicoVariable().setText(encontrado.getDepartamento());
        vista.getLblPuestoTecnicoVariable().setText(String.valueOf(encontrado.getRolUsuario()));
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

    private void buscarActivo() {

        this.vista.getTblActivos().clearSelection();

        String activoBusqueda = vista.getTxtBusquedaNombreActivoTecnico().getText();

        if (activoBusqueda == null || activoBusqueda.trim().isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Ingrese un activo para buscar");
        }
        Activo encontrado = activoConexion.buscarPorNombre(activoBusqueda);

        if (encontrado == null) {
            JOptionPane.showMessageDialog(vista, "Activo no encontrado en la base de datos");
            return;
        }

        vista.setIdActivoSeleccionado(encontrado.getId());
        vista.getLblActivoNombreVariable().setText(encontrado.getNombreHost());
        vista.getLblIPActivoTecnicoVariable().setText(encontrado.getIp());
        vista.getLblOSActivoTecnicoVariable().setText(encontrado.getSistemaOperativo());
        vista.getLblUbicacionActivoTecnicoVariable().setText(encontrado.getUbicacion());
        vista.getLblDepartamentoActivoTecnicoVariable().setText(encontrado.getDepartamento());
        vista.getCbEstadoActivoTecnico().setSelectedItem(encontrado.getEstadoActivo());
        vista.getLblTipoDeActivoTecnicoVariable().setText(String.valueOf(encontrado.getActivo()));

        JOptionPane.showMessageDialog(vista, "Activo encontrado");

    }

    private void actualizarActivo() {

        int id = vista.getIdActivoSeleccionado();

        EstadoActivo estadoActivo = EstadoActivo.valueOf(vista.getCbEstadoActivoTecnico().getSelectedItem().toString().toUpperCase());

        Activo actualizado = new Activo(id, estadoActivo);

        if (activoConexion.actualizarEstado(actualizado)) {
            JOptionPane.showMessageDialog(vista, "Activo actualizado correctamente");
        } else {
            JOptionPane.showMessageDialog(vista, "Activo no encontrado");
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

    private void actualizarIncidente() {

        int id = vista.getIdIncidenteSeleccionado();

        Estado estadoIncidente = Estado.valueOf(this.vista.getCbEstadoIncidenteTecnico().getSelectedItem().toString().toUpperCase());

        Prioridad prioridadIncidente = Prioridad.valueOf(this.vista.getCbPrioridadIncidenteTecnico().getSelectedItem().toString().toUpperCase());

        String asignadoSeleccionado = this.vista.getTxtAsignadoA().getText().trim();

        Usuario nuevoAsignado = usuarioConexion.buscarPorUsuario(asignadoSeleccionado);

        if (nuevoAsignado == null) {
            JOptionPane.showMessageDialog(vista, "El tecnico no esta asignado aun", "Incidente sin tecnico asignado", JOptionPane.WARNING_MESSAGE);
        }

        String fechaCierre;

        if (estadoIncidente == Estado.RESUELTO || estadoIncidente == Estado.CANCELADO) {
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime fecha = LocalDateTime.now();
            fechaCierre = fecha.format(formato);
        } else {
            fechaCierre = null;
        }

        Incidente actualizado = new Incidente(id, estadoIncidente, prioridadIncidente, fechaCierre,nuevoAsignado);

        if (incidenteConexion.actualizarEstadoYPrioridad(actualizado)) {
            JOptionPane.showMessageDialog(vista, "Incidente actualizado correctamente");
        } else {
            JOptionPane.showMessageDialog(vista, "Incidente no encontrado en la base de datos");
        }

    }

    private void buscarIncidente() {

        this.vista.getTblIncidentes().clearSelection();

        int idIncidenteSeleccionado = Integer.parseInt(this.vista.getTxtReportadoPor().getText());

        Incidente encontrado = incidenteConexion.buscarPorId(idIncidenteSeleccionado);

        if (encontrado == null) {
            JOptionPane.showMessageDialog(vista, "Incidente no encontrado en la base de datos");
        } else {
            JOptionPane.showMessageDialog(vista, "Incidente encontrado");
        }

        vista.setIdIncidenteSeleccionado(idIncidenteSeleccionado);

        vista.getLblTituloIncidenteVariable().setText(encontrado.getTitulo());
        vista.getLblDescripcionIncidenteVariable().setText(encontrado.getDescripcion());
        vista.getCbEstadoIncidenteTecnico().setSelectedItem(encontrado.getEstadoIncidente().toString());
        vista.getCbPrioridadIncidenteTecnico().setSelectedItem(encontrado.getPrioridad().toString());
        vista.getLblReportadoPorVariable().setText(encontrado.getReportadoPor().getUsuario());

        if (encontrado.getAsignadoA() == null) {
            vista.getTxtAsignadoA().setText("Sin tecnico asignado");
        } else {
            vista.getTxtAsignadoA().setText(encontrado.getAsignadoA().getUsuario());

        }

        vista.getLblActivoImpactadoVariable().setText(encontrado.getActivo().getNombreHost());
        vista.getLblFechaAperturaVariable().setText(encontrado.getFechaCreacion());

        if (encontrado.getFechaCierre() == null) {
            vista.getLblFechaCierreVariable().setText("Incidente Abierto");
        } else {
            vista.getLblFechaCierreVariable().setText(encontrado.getFechaCierre());
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
