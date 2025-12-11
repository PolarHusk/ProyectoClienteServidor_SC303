/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Modelo.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Dylan
 */
public class IncidenteDatos {

    private final Conexion conexion = new Conexion();

    private final UsuarioDatos usuario = new UsuarioDatos();
    private final ActivoDatos activoDatos = new ActivoDatos();

    public boolean crearIncidente(Incidente i) {

        String sql = """
                INSERT INTO incidentes 
                (titulo, descripcion, estadoIncidente, prioridad, reportadoPor, asignadoA, activo, fechaCreacion, fechaCierre)
                VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)
                """;

        try (Connection cn = conexion.Conectar(); PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, i.getTitulo());
            ps.setString(2, i.getDescripcion());
            ps.setString(3, i.getEstadoIncidente().name());
            ps.setString(4, i.getPrioridad().name());
            ps.setInt(5, i.getReportadoPor().getId());
            if (i.getAsignadoA() != null) {
                ps.setInt(6, i.getAsignadoA().getId());
            } else {
                ps.setNull(6, java.sql.Types.INTEGER);
            }
            ps.setInt(7, i.getActivo().getId());
            ps.setString(8, i.getFechaCreacion());
            ps.setString(9, i.getFechaCierre());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al crear incidente: " + e.getMessage());
        }

        return false;
    }

    public boolean actualizar(Incidente i) {

        if (i.getIdIncidente() <= 0) {
            return false;
        }

        String sql = """
            UPDATE incidentes SET 
                titulo=?,
                descripcion=?,
                estadoIncidente=?,
                prioridad=?,
                reportadoPor=?,
                asignadoA=?,
                activo=?,
                fechaCreacion=?,
                fechaCierre=?
            WHERE idIncidente=?
        """;

        try (Connection cn = conexion.Conectar(); PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, i.getTitulo());
            ps.setString(2, i.getDescripcion());
            ps.setString(3, i.getEstadoIncidente().name());
            ps.setString(4, i.getPrioridad().name());
            ps.setInt(5, i.getReportadoPor().getId());
            if (i.getAsignadoA() != null) {
                ps.setInt(6, i.getAsignadoA().getId());
            } else {
                ps.setNull(6, java.sql.Types.INTEGER);
            }
            ps.setInt(7, i.getActivo().getId());
            ps.setString(8, i.getFechaCreacion());
            ps.setString(9, i.getFechaCierre());
            ps.setInt(10, i.getIdIncidente());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Error al actualizar incidente: " + e.getMessage());
        }

        return false;
    }

    public boolean actualizarEstadoYPrioridad(Incidente i) {

        if (i.getIdIncidente() <= 0) {
            return false;
        }

        String sql = """
                     UPDATE incidentes SET estadoIncidente=?,prioridad=?, fechaCierre=?, asignadoA=? WHERE idIncidente=?
                     """;

        try (Connection con = conexion.Conectar(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, i.getEstadoIncidente().name());
            ps.setString(2, i.getPrioridad().name());
            ps.setString(3, i.getFechaCierre());
            
            if (i.getAsignadoA() != null) {
                ps.setInt(4, i.getAsignadoA().getId());
            } else {
                ps.setNull(4, java.sql.Types.INTEGER);
            }
            
            ps.setInt(5, i.getIdIncidente());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar activo: " + e.getMessage());
        }
        return false;
    }

    public boolean eliminar(int id) {
        String sql = "DELETE FROM incidentes WHERE idIncidente=?";

        try (Connection cn = conexion.Conectar(); PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, id);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Error al eliminar incidente: " + e.getMessage());
        }

        return false;
    }

    public Incidente buscarPorId(int id) {
        String sql = "SELECT * FROM incidentes WHERE idIncidente=?";

        try (Connection cn = conexion.Conectar(); PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return map(rs);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Error al buscar incidente: " + e.getMessage());
        }

        return null;
    }

    private Incidente map(ResultSet rs) throws SQLException {

        Usuario reportadoPor = usuario.buscarPorId(rs.getInt("reportadoPor"));
        Usuario asignadoA = usuario.buscarPorId(rs.getInt("asignadoA"));
        Activo activo = activoDatos.buscarPorId(rs.getInt("activo"));

        return new Incidente(
                rs.getString("titulo"),
                rs.getString("descripcion"),
                Estado.valueOf(rs.getString("estadoIncidente")),
                Prioridad.valueOf(rs.getString("prioridad")),
                reportadoPor,
                asignadoA,
                activo,
                rs.getString("fechaCreacion"),
                rs.getString("fechaCierre")
        );
    }

    public ResultSet obtenerTodosIncidentes() throws SQLException {
        String sql = """
                     SELECT i.idIncidente,
                            i.titulo,
                            i.descripcion,
                            i.estadoIncidente,
                            i.prioridad,
                            u1.usuario AS reportadoNombre,
                            u2.usuario AS asignadoNombre,
                            a.nombreHost AS activoNombre,
                            i.fechaCreacion,
                            i.fechaCierre
                     FROM incidentes i
                     LEFT JOIN usuario u1 ON i.reportadoPor = u1.idUsuario
                     LEFT JOIN usuario u2 ON i.asignadoA = u2.idUsuario
                     LEFT JOIN activos a ON i.activo = a.idActivo""";
        Connection con = conexion.Conectar();
        PreparedStatement ps = con.prepareStatement(sql);
        return ps.executeQuery();
    }

    public ResultSet obtenerIncidentesReportadosPor(int idUsuario) throws SQLException {
        String sql = """
                 SELECT i.idIncidente,
                        i.titulo,
                        i.descripcion,
                        i.estadoIncidente,
                        i.prioridad,
                        u1.usuario AS reportadoNombre,
                        u2.usuario AS asignadoNombre,
                        a.nombreHost AS activoNombre,
                        i.fechaCreacion,
                        i.fechaCierre
                 FROM incidentes i
                 LEFT JOIN usuario u1 ON i.reportadoPor = u1.idUsuario
                 LEFT JOIN usuario u2 ON i.asignadoA = u2.idUsuario
                 LEFT JOIN activos a ON i.activo = a.idActivo
                 WHERE i.reportadoPor = ?
                 """;

        Connection con = conexion.Conectar();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idUsuario);
        return ps.executeQuery();
    }

}
