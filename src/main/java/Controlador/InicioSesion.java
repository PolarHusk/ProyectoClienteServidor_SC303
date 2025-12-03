/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Datos.*;
import Modelo.Usuario;

/**
 *
 * @author Dylan
 */
public class InicioSesion {

    private final UsuarioDatos usuarioDatos;

    public InicioSesion() {
        this.usuarioDatos = new UsuarioDatos();
    }

    public Usuario iniciarSesion(String userName, String password) {

        Usuario u = usuarioDatos.buscarPorUsuario(userName);

        if (u == null) {
            return null; 
        }

        if (!u.getPassword().equals(password)) {
            return null;
        }

        return u;
    }
}
