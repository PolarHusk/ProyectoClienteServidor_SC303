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
import Modelo.EstadoActivo;
import Modelo.Tecnico;
import Modelo.Usuario;
import Vista.VistaTecnico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
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
//        // mostrarDatosIncidentes();

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
        
        this.vista.getBtnModificarActivoTecnico().addActionListener(new ActionListener(){
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
    
    private void actualizarActivo(){
        
        int id = vista.getIdActivoSeleccionado();
        
        EstadoActivo estadoActivo =  EstadoActivo.valueOf(vista.getCbEstadoActivoTecnico().getSelectedItem().toString().toUpperCase());
      
        Activo actualizado = new Activo(id, estadoActivo);
        
        if (activoConexion.actualizarEstado(actualizado)) {
            JOptionPane.showMessageDialog(vista, "Activo actualizado correctamente");
        } else{
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

}
