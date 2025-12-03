/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Datos.ActivoDatos;
import Datos.IncidenteDatos;
import Datos.UsuarioDatos;
import Vista.VistaTecnico;

/**
 *
 * @author Dylan
 */
public class ControladorTecnico {

    private final VistaTecnico vista;
    private final UsuarioDatos usuarioConexion;
    private final ActivoDatos activoConexion;
    private IncidenteDatos incidenteConexion;

    public ControladorTecnico(VistaTecnico vista) {
        this.vista = vista;
        this.usuarioConexion = new UsuarioDatos();
        this.activoConexion = new ActivoDatos();
        this.incidenteConexion = new IncidenteDatos();
//
//        mostrarDatosUsuarios();
//        // mostrarDatosActivos();
//        // mostrarDatosIncidentes();
//
//        listeners();

    }
}
