/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author dylan
 */
public class Administrador extends Usuario {

    public Administrador(String nombre, String apellido1, String apellido2, String correo, String usuario, String password, String departamento) {
        super(nombre, apellido1, apellido2, correo, Rol.ADMIN, usuario, password, departamento);
    }

    public Administrador(int id, String nombre, String apellido1, String apellido2, String correo, String usuario, String password, String departamento) {
        super(id, nombre, apellido1, apellido2, correo, Rol.ADMIN, usuario, password, departamento);
    }
    


    public Administrador() {
    }

    @Override
    public void abrirInterfaz() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
