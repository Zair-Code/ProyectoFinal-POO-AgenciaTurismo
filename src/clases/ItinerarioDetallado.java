/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Phillipe
 */
public class ItinerarioDetallado {
    private int numeroDia;
    private String descripcion;

    public ItinerarioDetallado(int numeroDia, String descripcion) {
        this.numeroDia = numeroDia;
        this.descripcion = descripcion;
    }

    public int getNumeroDia() {
        return numeroDia;
    }

    public void setNumeroDia(int numeroDia) {
        this.numeroDia = numeroDia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String mostrarInformacion() {
        return "Día " + numeroDia + ": " + descripcion;
    }
}