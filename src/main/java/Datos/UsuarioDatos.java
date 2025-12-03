/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Modelo.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class UsuarioDatos {

    private Conexion conexion = new Conexion();

    // Metodo Insertar en la base de datos
    public boolean insertar(Usuario u) {
        String sql = "INSERT INTO usuario "
                + "(nombre, apellido1, apellido2, correo, rol, usuario, password,departamento) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?,?)";

        try (Connection con = conexion.Conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, u.getNombre());
            ps.setString(2, u.getApellido1());
            ps.setString(3, u.getApellido2());
            ps.setString(4, u.getCorreo());
            ps.setString(5, u.getRolUsuario().name());
            ps.setString(6, u.getUsuario());
            ps.setString(7, u.getPassword());
            ps.setString(8, u.getDepartamento());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    // Metodo para actualizar la contrasena y solo los datos de un usuario
    public boolean actualizarConPassword(Usuario u) {

        if (u.getId() <= 0) {
            return false;
        }

        String sql = "UPDATE usuario SET "
                + "nombre=?, apellido1=?, apellido2=?, correo=?, rol=?, usuario=?, password=?, departamento=?"
                + " WHERE idUsuario=?";

        try (Connection con = conexion.Conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, u.getNombre());
            ps.setString(2, u.getApellido1());
            ps.setString(3, u.getApellido2());
            ps.setString(4, u.getCorreo());
            ps.setString(5, u.getRolUsuario().name());
            ps.setString(6, u.getUsuario());
            ps.setString(7, u.getPassword());
            ps.setString(8, u.getDepartamento());
            ps.setInt(9, u.getId());
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean actualizarSinPassword(Usuario u) {

        if (u.getId() <= 0) {
            return false;
        }

        String sql = "UPDATE usuario SET "
                + "nombre=?, apellido1=?, apellido2=?, correo=?, rol=?, usuario=?, departamento=?"
                + " WHERE idUsuario=?";

        try (Connection con = conexion.Conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, u.getNombre());
            ps.setString(2, u.getApellido1());
            ps.setString(3, u.getApellido2());
            ps.setString(4, u.getCorreo());
            ps.setString(5, u.getRolUsuario().name());
            ps.setString(6, u.getUsuario());
            ps.setString(7, u.getDepartamento());
            ps.setInt(8, u.getId());
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    // Metodo para eliminar los usuarios (Admin)
    public boolean eliminar(int id) {
        String sql = "DELETE FROM usuario WHERE idUsuario=?";

        try (Connection con = conexion.Conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    // Buscar usuarios por ID
    public Usuario buscarPorId(int id) {
        String sql = "SELECT * FROM usuario WHERE idUsuario=?";

        try (Connection con = conexion.Conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return mapUsuario(rs);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    // Buscar usuarios por Nombre de Usuario
    public Usuario buscarPorUsuario(String usuario) {
        String sql = "SELECT * FROM usuario WHERE usuario=?";

        try (Connection con = conexion.Conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, usuario);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return mapUsuario(rs);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    // Metodo para obtener la tabla de todos los usuarios para mostrar en pantalla
    public ResultSet obtenerTodosUsuarios() throws SQLException {
        String sql = "SELECT * FROM usuario";
        Connection con = conexion.Conectar();
        PreparedStatement ps = con.prepareStatement(sql);
        return ps.executeQuery();
    }

    // Metodo para transformar el objeto de SQL a un objeto dentro de las clases (instanciar)
    private Usuario mapUsuario(ResultSet rs) throws SQLException {

        Rol rol = Rol.valueOf(rs.getString("rol"));

        switch (rol) {

            case ADMIN:
                return new Administrador(
                        rs.getInt("idUsuario"),
                        rs.getString("nombre"),
                        rs.getString("apellido1"),
                        rs.getString("apellido2"),
                        rs.getString("correo"),
                        rs.getString("usuario"),
                        rs.getString("password"),
                        rs.getString("departamento")
                );

            case TECNICO:
                return new Tecnico(
                        rs.getInt("idUsuario"),
                        rs.getString("nombre"),
                        rs.getString("apellido1"),
                        rs.getString("apellido2"),
                        rs.getString("correo"),
                        rs.getString("usuario"),
                        rs.getString("password"),
                        rs.getString("departamento")
                );

            case ENDUSER:
                return new UsuarioFinal(
                        rs.getInt("idUsuario"),
                        rs.getString("nombre"),
                        rs.getString("apellido1"),
                        rs.getString("apellido2"),
                        rs.getString("correo"),
                        rs.getString("usuario"),
                        rs.getString("password"),
                        rs.getString("departamento")
                );
        }

        return null;
    }

}
