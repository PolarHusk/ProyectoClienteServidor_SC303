/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author dylan
 */
public class Tecnico extends Usuario{
        
    
    public Tecnico() {
    }

    public Tecnico(String nombre, String apellido1, String apellido2, String correo, String usuario, String password, String departamento) {
        super(nombre, apellido1, apellido2, correo, Rol.TECNICO, usuario, password, departamento);
    }

    public Tecnico(int id, String nombre, String apellido1, String apellido2, String correo, String usuario, String password, String departamento) {
        super(id, nombre, apellido1, apellido2, correo, Rol.TECNICO, usuario, password, departamento);
    }

    




    @Override
    public void abrirInterfaz() {

    }
    
}
