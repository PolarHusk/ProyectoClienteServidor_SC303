/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Datos.ActivoDatos;
import Datos.IncidenteDatos;
import Datos.UsuarioDatos;
import Vista.VistaEndUser;

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

//        mostrarDatosUsuarios();
//        // mostrarDatosActivos();
//        // mostrarDatosIncidentes();
//
//        listeners();
    }
}
