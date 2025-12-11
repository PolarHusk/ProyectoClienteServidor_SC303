/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servidor;

import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Dylan
 */
public class ServidorChat {

    private ServerSocket serverSocket;

    private static final Map<Integer, List<PrintWriter>> salas = new HashMap<>();

    public static void main(String[] args) throws IOException {
        ServerSocket servidor = new ServerSocket(1234);
        System.out.println("Servidor de chat iniciado...");

        while (true) {
            new ManejadorCliente(servidor.accept()).start();
        }
    }

    private static class ManejadorCliente extends Thread {

        private final Socket socket;
        private PrintWriter salida;
        private int idIncidenteSala = -1;

        public ManejadorCliente(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try (BufferedReader entrada = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            )) {

                salida = new PrintWriter(socket.getOutputStream(), true);

                String mensajeInicial = entrada.readLine();
                idIncidenteSala = Integer.parseInt(mensajeInicial);
                unirASala(idIncidenteSala, salida);
                System.out.println("Usuario unido a sala " + idIncidenteSala);
                String mensaje;
                while ((mensaje = entrada.readLine()) != null) {
                    enviarASala(idIncidenteSala, mensaje);
                }

            } catch (SocketException e) {
                System.out.println("Usuario salio de la sala:" + idIncidenteSala);

            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                salirDeSala();

                try {
                    socket.close();
                } catch (IOException ex) {

                }

            }
        }

        private void unirASala(int incidenteId, PrintWriter pw) {
            salas.computeIfAbsent(incidenteId, k -> new ArrayList<>()).add(pw);
        }

        private void enviarASala(int incidenteId, String mensaje) {
            List<PrintWriter> clientes = salas.get(incidenteId);
            if (clientes != null) {
                for (PrintWriter c : clientes) {
                    c.println(mensaje);
                }
            }
        }

        private void salirDeSala() {
            if (idIncidenteSala != -1 && salas.containsKey(idIncidenteSala)) {
                salas.get(idIncidenteSala).remove(salida);
            }
        }
    }
}
