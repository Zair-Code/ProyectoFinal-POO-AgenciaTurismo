/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;
import clases.ItinerarioDetallado;

/**
 *
 * @author Phillipe
 */
public class gestionItinerario {
    private ItinerarioDetallado[] itinerarios;
    private int totalItinerarios;

    public gestionItinerario() {

        itinerarios =
                new ItinerarioDetallado[100];

        totalItinerarios = 0;
    }

    public boolean registrar(
            ItinerarioDetallado itinerario) {

        if (itinerario == null) {
            return false;
        }

        if (totalItinerarios
                >= itinerarios.length) {

            return false;
        }

        itinerarios[totalItinerarios] =
                itinerario;

        totalItinerarios++;

        return true;
    }

    public ItinerarioDetallado buscarPorPosicion(
            int posicion) {

        if (posicion < 0) {
            return null;
        }

        if (posicion >= totalItinerarios) {
            return null;
        }

        return itinerarios[posicion];
    }

    public boolean actualizar(
            int posicion,
            ItinerarioDetallado itinerarioNuevo) {

        if (itinerarioNuevo == null) {
            return false;
        }

        if (posicion < 0) {
            return false;
        }

        if (posicion >= totalItinerarios) {
            return false;
        }

        itinerarios[posicion] =
                itinerarioNuevo;

        return true;
    }

    public boolean eliminar(int posicion) {

        if (posicion < 0) {
            return false;
        }

        if (posicion >= totalItinerarios) {
            return false;
        }

        for (int i = posicion;
             i < totalItinerarios - 1;
             i++) {

            itinerarios[i] =
                    itinerarios[i + 1];
        }

        itinerarios[totalItinerarios - 1] =
                null;

        totalItinerarios--;

        return true;
    }

    public ItinerarioDetallado[]
    obtenerItinerarios() {

        return itinerarios;
    }

    public int obtenerTotalItinerarios() {

        return totalItinerarios;
    }
}