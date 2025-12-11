/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Datos.ActivoDatos;
import Datos.IncidenteDatos;
import Datos.UsuarioDatos;
import Modelo.Activo;
import Modelo.Estado;
import Modelo.Incidente;
import Modelo.Prioridad;
import Modelo.Tecnico;
import Modelo.Usuario;
import Modelo.UsuarioFinal;
import Vista.VistaEndUser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Vista.VistaChat;

/**
 *
 * @author Dylan
 */
public class ControladorEndUser {

    private final VistaEndUser vista;
    private final UsuarioDatos usuarioConexion;
    private final ActivoDatos activoConexion;
    private IncidenteDatos incidenteConexion;

    public ControladorEndUser(VistaEndUser vista) {
        this.vista = vista;
        this.usuarioConexion = new UsuarioDatos();
        this.activoConexion = new ActivoDatos();
        this.incidenteConexion = new IncidenteDatos();

        listeners();
        mostrarDatosUsuarios();
        mostrarDatosIncidentes();

    }

    private void listeners() {

        this.vista.getBtnActualizarFinal().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarFinal();
                mostrarDatosUsuarios();
            }

        });

        this.vista.getBtnBuscarFinal().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarUsuarioFinal();
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

        this.vista.getTblMisIncidentes().addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int rec = vista.getTblMisIncidentes().getSelectedRow();
                int idIncidenteSeleccionado = Integer.parseInt(vista.getTblMisIncidentes().getValueAt(rec, 0).toString());
                vista.setIdIncidenteSeleccionado(idIncidenteSeleccionado);
                vista.getTxtTituloIncidente().setText(vista.getTblMisIncidentes().getValueAt(rec, 1).toString());
                vista.getTxtDescripcionIncidente().setText(vista.getTblMisIncidentes().getValueAt(rec, 2).toString());
                vista.getCbEstadoIncidente().setSelectedItem(vista.getTblMisIncidentes().getValueAt(rec, 3).toString());
                vista.getCbPrioridadIncidente().setSelectedItem(vista.getTblMisIncidentes().getValueAt(rec, 4).toString());
                vista.getTxtReportadoPor().setText(vista.getTblMisIncidentes().getValueAt(rec, 5).toString());


                if (vista.getTblMisIncidentes().getValueAt(rec, 6) == null) {
                    vista.getTxtAsignadoA1().setText("Sin tecnico asignado");
                } else{
                    vista.getTxtAsignadoA1().setText(vista.getTblMisIncidentes().getValueAt(rec, 6).toString());
                }
                
                vista.getTxtActivoAfectado().setText(vista.getTblMisIncidentes().getValueAt(rec, 7).toString());
                vista.getLblFechaAperturaVariable().setText(vista.getTblMisIncidentes().getValueAt(rec, 8).toString());

                if (vista.getTblMisIncidentes().getValueAt(rec, 9) == null) {
                    vista.getLblFechaCierreVariable().setText("Incidente Abierto");
                } else {
                    vista.getLblFechaCierreVariable().setText(vista.getTblMisIncidentes().getValueAt(rec, 9).toString());
                }
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
        
        this.vista.getBtnIniciarChat().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int incidenteSeleccionado = vista.getIdIncidenteSeleccionado();
                if (incidenteSeleccionado > 0) {
                    VistaChat chat = new VistaChat(incidenteSeleccionado);
                    new ControladorChat(chat, vista.getLogueado());
                    chat.setVisible(true);
                } else{
                    JOptionPane.showMessageDialog(vista, "Seleccione un incidente primero");
                }
                
            }     
        });
        

    }

    private void actualizarFinal() {

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

        UsuarioFinal actualizado = new UsuarioFinal(
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

    private void buscarUsuarioFinal() {
        this.vista.getTblUsuarios().clearSelection();

        String usuarioBusqueda = vista.getTxtBusquedaFinal().getText().trim();

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

    private void agregarIncidente() {
        String titulo = this.vista.getTxtTituloIncidente().getText().trim();
        String descripcion = this.vista.getTxtDescripcionIncidente().getText().trim();

        if (titulo.isEmpty() || descripcion.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Complete el titulo y descripcion");
        }

        Usuario reportadoPor = usuarioConexion.buscarPorUsuario(vista.getTxtReportadoPor().getText().trim());

        Usuario asignadoA = usuarioConexion.buscarPorUsuario(vista.getTxtAsignadoA1().getText().trim());

        if (reportadoPor == null) {
            JOptionPane.showMessageDialog(vista, "El usuario que ha reportado el incidente no fue encontrado en la base de datos. Se asignara el usuario logueado");
            reportadoPor = this.vista.getLogueado();
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
        String descripcion = this.vista.getTxtDescripcionIncidente().getText().trim();

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
            JOptionPane.showMessageDialog(vista, "El usuario que ha reportado el incidente no fue encontrado en la base de datos");
            return;
        }

        if (nuevoAsignado == null) {
            JOptionPane.showMessageDialog(vista, "Sin tecnico asignado aun");
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
            JOptionPane.showMessageDialog(vista, "Incidente actualizado correctamente");
        } else {
            JOptionPane.showMessageDialog(vista, "Incidente no encontrado en la base de datos");
        }
    }

    private void mostrarDatosIncidentes() {

        Usuario logueado = vista.getLogueado();

        try {

            ResultSet rsIncidentes = incidenteConexion.obtenerIncidentesReportadosPor(logueado.getId());

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

            this.vista.getTblMisIncidentes().setModel(tblIncidentes);

            rsIncidentes.getStatement().getConnection().close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Error cargando usuarios: " + ex.getMessage());
        }

    }

}
