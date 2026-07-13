/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Phillipe
 */
public class Bronce extends NivelFidelidad{
    @Override
    public String getNombreNivel() {
        return "Bronce";
    }

    @Override
    public double getPorcentajeDescuento() {
        return 0;
    }

    @Override
    public int getPuntosMinimos() {
        return 0;
    }
}
