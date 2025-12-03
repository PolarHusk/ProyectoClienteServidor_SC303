/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Activo {

    private int id;
    private String ip;
    private String nombreHost;
    private String sistemaOperativo;
    private TipoActivo activo;
    private String ubicacion;
    private String departamento;
    private EstadoActivo estadoActivo;

    public Activo() {
    }

    public Activo(String ip, String nombreHost, String sistemaOperativo, TipoActivo activo,EstadoActivo estado,String ubicacion, String departamento) {
        this.ip = ip;
        this.nombreHost = nombreHost;
        this.sistemaOperativo = sistemaOperativo;
        this.activo = activo;
        this.ubicacion = ubicacion;
        this.departamento = departamento;
        this.estadoActivo = estado;
    }

    public Activo(int id, String ip, String nombreHost, String sistemaOperativo, TipoActivo activo,EstadoActivo estado ,String ubicacion, String departamento) {
        this.id = id;
        this.ip = ip;
        this.nombreHost = nombreHost;
        this.sistemaOperativo = sistemaOperativo;
        this.activo = activo;
        this.ubicacion = ubicacion;
        this.departamento = departamento;
        this.estadoActivo = estado;
    }

    public EstadoActivo getEstadoActivo() {
        return estadoActivo;
    }

    public void setEstadoActivo(EstadoActivo estadoActivo) {
        this.estadoActivo = estadoActivo;
    }
    

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getNombreHost() {
        return nombreHost;
    }

    public void setNombreHost(String nombreHost) {
        this.nombreHost = nombreHost;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public TipoActivo getActivo() {
        return activo;
    }

    public void setActivo(TipoActivo activo) {
        this.activo = activo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

}
