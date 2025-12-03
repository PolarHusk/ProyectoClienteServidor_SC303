/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author dylan
 */
public class Incidente {

    private int idIncidente;
    private String titulo;
    private String descripcion;
    private Estado estadoIncidente;
    private Prioridad prioridad;
    private Usuario reportadoPor;
    private Usuario asignadoA;
    private Activo activo;
    private String fechaCreacion;
    private String fechaCierre;

    public Incidente() {
    }

    public Incidente(String titulo, String descripcion, Estado estadoIncidente, Prioridad prioridad, Usuario reportadoPor, Usuario asignadoA, Activo activo, String fechaCreacion, String fechaCierre) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estadoIncidente = estadoIncidente;
        this.prioridad = prioridad;
        this.reportadoPor = reportadoPor;
        this.asignadoA = asignadoA;
        this.activo = activo;
        this.fechaCreacion = fechaCreacion;
        this.fechaCierre = fechaCierre;
    }

    public Incidente(int id,String titulo, String descripcion, Estado estadoIncidente, Prioridad prioridad, Usuario reportadoPor, Usuario asignadoA, Activo activo, String fechaCreacion, String fechaCierre) {
        this.idIncidente = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estadoIncidente = estadoIncidente;
        this.prioridad = prioridad;
        this.reportadoPor = reportadoPor;
        this.asignadoA = asignadoA;
        this.activo = activo;
        this.fechaCreacion = fechaCreacion;
        this.fechaCierre = fechaCierre;
    }

    public int getIdIncidente() {
        return idIncidente;
    }

    public void setIdIncidente(int idIncidente) {
        this.idIncidente = idIncidente;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Estado getEstadoIncidente() {
        return estadoIncidente;
    }

    public void setEstadoIncidente(Estado estadoIncidente) {
        this.estadoIncidente = estadoIncidente;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public Usuario getReportadoPor() {
        return reportadoPor;
    }

    public void setReportadoPor(Usuario reportadoPor) {
        this.reportadoPor = reportadoPor;
    }

    public Usuario getAsignadoA() {
        return asignadoA;
    }

    public void setAsignadoA(Usuario asignadoA) {
        this.asignadoA = asignadoA;
    }

    public Activo getActivo() {
        return activo;
    }

    public void setActivo(Activo activo) {
        this.activo = activo;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(String fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

}
