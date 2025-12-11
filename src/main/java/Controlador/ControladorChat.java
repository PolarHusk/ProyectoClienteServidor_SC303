/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Usuario;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;

/**
 *
 * @author Dylan
 */
public class ControladorChat {

    private final VistaChat vista;
    private final Usuario logueado;

    public ControladorChat(VistaChat vista, Usuario logueado) {
        this.vista = vista;
        this.logueado = logueado;
        listeners();
    }

    private void listeners() {
        this.vista.getBtnEnviar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enviarMensaje();
            }

        });

    }
    private void enviarMensaje() {
        String mensaje = logueado.getUsuario() + " -> " + vista.getTxtEnviarMensaje().getText().trim();

        if (!mensaje.isEmpty()) {
            vista.getSalida().println(mensaje);
            vista.getTxtEnviarMensaje().setText("");
        }
    }

}
