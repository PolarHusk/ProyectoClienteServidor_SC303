/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author dylan
 */
public abstract class Usuario {

    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String correo;
    private Rol rolUsuario;
    private String usuario;
    private String password;
    private String departamento;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido1, String apellido2, String correo, Rol rolUsuario, String usuario, String password, String departamento) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.correo = correo;
        this.rolUsuario = rolUsuario;
        this.usuario = usuario;
        this.password = password;
        this.departamento = departamento;
    }

    public Usuario(int id,String nombre, String apellido1, String apellido2, String correo, Rol rolUsuario, String usuario, String password, String departamento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.correo = correo;
        this.rolUsuario = rolUsuario;
        this.usuario = usuario;
        this.password = password;
        this.departamento = departamento;
    }

    public abstract void abrirInterfaz();

    public int getId() {
        return id;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public boolean passValid(String pass) {
        return this.password.equals(pass);
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Rol getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(Rol rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
