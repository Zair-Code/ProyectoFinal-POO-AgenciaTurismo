/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Phillipe
 */
public abstract class NivelFidelidad {
    public abstract String getNombreNivel();

    public abstract double getPorcentajeDescuento();

    public abstract int getPuntosMinimos();

    public String mostrarBeneficios() {

        return "Nivel " + getNombreNivel()
                + " (desde " + getPuntosMinimos() + " puntos): "
                + getPorcentajeDescuento()
                + "% de descuento en próximas reservas.";
    }
}
