/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Phillipe
 */
public class Oro extends NivelFidelidad{
    @Override
    public String getNombreNivel() {
        return "Oro";
    }

    @Override
    public double getPorcentajeDescuento() {
        return 10;
    }

    @Override
    public int getPuntosMinimos() {
        return 1500;
    }
}
