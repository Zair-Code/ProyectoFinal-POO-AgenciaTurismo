/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Phillipe
 */
public class Plata extends NivelFidelidad{
    @Override
    public String getNombreNivel() {
        return "Plata";
    }

    @Override
    public double getPorcentajeDescuento() {
        return 5;
    }

    @Override
    public int getPuntosMinimos() {
        return 500;
    }
}
