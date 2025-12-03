/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.sql.*;
import javax.swing.*;
import Modelo.*;

/**
 *
 * @author Dylan
 */
public class ActivoDatos {
    
    private final Conexion conexion;

    public ActivoDatos() {
        this.conexion = new Conexion();
    }

    public boolean insertar(Activo a) {
        String sql = """
            INSERT INTO activos 
            (ip, nombreHost, sistemaOperativo, tipoActivo, estadoActivo, ubicacion, departamento)
            VALUES (?, ?, ?, ?, ?, ?, ?)
        """;

        try (Connection con = conexion.Conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, a.getIp());
            ps.setString(2, a.getNombreHost());
            ps.setString(3, a.getSistemaOperativo());
            ps.setString(4, a.getActivo().name());      // ENUM → STRING
            ps.setString(5, a.getEstadoActivo().name());    // NUEVO ENUM
            ps.setString(6, a.getUbicacion());
            ps.setString(7, a.getDepartamento());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Error al insertar activo: " + e.getMessage());
        }
        return false;
    }

    public boolean actualizar(Activo a) {
        
        if (a.getId() <= 0) {
            return false;
        }
        String sql = """
            UPDATE activos SET
                ip=?, 
                nombreHost=?, 
                sistemaOperativo=?, 
                tipoActivo=?, 
                estadoActivo=?,        -- NUEVO
                ubicacion=?,
                departamento=?
            WHERE idActivo=?
        """;

        try (Connection con = conexion.Conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, a.getIp());
            ps.setString(2, a.getNombreHost());
            ps.setString(3, a.getSistemaOperativo());
            ps.setString(4, a.getActivo().name());
            ps.setString(5, a.getEstadoActivo().name());   // NUEVO
            ps.setString(6, a.getUbicacion());
            ps.setString(7, a.getDepartamento());
            ps.setInt(8, a.getId());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Error al actualizar activo: " + e.getMessage());
        }
        return false;
    }

    public boolean eliminar(int idActivo) {
        String sql = "DELETE FROM activos WHERE idActivo=?";

        try (Connection con = conexion.Conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idActivo);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Error al eliminar activo: " + e.getMessage());
        }
        return false;
    }

    public Activo buscarPorId(int idActivo) {
        String sql = "SELECT * FROM activos WHERE idActivo=?";

        try (Connection con = conexion.Conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idActivo);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return map(rs);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Error al buscar activo: " + e.getMessage());
        }
        return null;
    }
    
    public Activo buscarPorNombre(String activoNombre){
        String sql = "SELECT * from activos where nombreHost=?";
        
        try (Connection con = conexion.Conectar(); PreparedStatement ps  = con.prepareStatement(sql)){
            
            ps.setString(1, activoNombre);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                return map(rs);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    

    private Activo map(ResultSet rs) throws SQLException {
        return new Activo(
                rs.getInt("idActivo"),
                rs.getString("ip"),
                rs.getString("nombreHost"),
                rs.getString("sistemaOperativo"),
                TipoActivo.valueOf(rs.getString("tipoActivo")),
                EstadoActivo.valueOf(rs.getString("estadoActivo")), // NUEVO
                rs.getString("ubicacion"),
                rs.getString("departamento")
        );
    }

    public ResultSet obtenerTodosActivos() throws SQLException {
        String sql = "SELECT * FROM activos";
        Connection con = conexion.Conectar();
        PreparedStatement ps = con.prepareStatement(sql);
        return ps.executeQuery();
    }
}

