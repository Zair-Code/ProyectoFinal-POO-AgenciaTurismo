/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Phillipe
 */
public class ServicioIncluido {

    private String tipoServicio;
    private String descripcion;

    public ServicioIncluido(String tipoServicio, String descripcion) {
        this.tipoServicio = tipoServicio;
        this.descripcion = descripcion;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String mostrarInformacion() {
        return "Tipo de servicio: " + tipoServicio
                + "\nDescripción: " + descripcion;
    }
}