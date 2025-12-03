/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author dylan
 */
public class UsuarioFinal extends Usuario {

    public UsuarioFinal() {
    }

    public UsuarioFinal(String nombre, String apellido1, String apellido2, String correo, String usuario, String password, String departamento) {
        super(nombre, apellido1, apellido2, correo, Rol.ENDUSER, usuario, password, departamento);
    }

    public UsuarioFinal(int id, String nombre, String apellido1, String apellido2, String correo, String usuario, String password, String departamento) {
        super(id, nombre, apellido1, apellido2, correo, Rol.ENDUSER, usuario, password, departamento);
    }
    


    

    
    @Override
    public void abrirInterfaz() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
