/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;
import clases.DestinoTuristico;
/**
 *
 * @author Phillipe
 */
public class gestionDestino {
    private DestinoTuristico[] destinos;
    private int totalDestinos;

    public gestionDestino() {
        destinos = new DestinoTuristico[50];
        totalDestinos = 0;
    }

    public DestinoTuristico buscarPorNombre(String nombre) {
        for (int i = 0; i < totalDestinos; i++) {
            if(destinos[i].getNombre().equalsIgnoreCase(nombre)){
                return destinos[i];
            }
        }
        return null;
    }

    public boolean registrar(DestinoTuristico destino) {
        if(totalDestinos == destinos.length) {
            return false;
        }

        // Evitar duplicados por nombre
        if(buscarPorNombre(destino.getNombre()) != null) {
            return false;
        }

        destinos[totalDestinos] = destino;
        totalDestinos++;
        return true;
    }

    public boolean actualizar(DestinoTuristico destino) {
        for (int i = 0; i < totalDestinos; i++) {
            if(destinos[i].getNombre().equalsIgnoreCase(destino.getNombre())){
                destinos[i].setPais(destino.getPais());
                destinos[i].setCiudad(destino.getCiudad());
                destinos[i].setDescripcion(destino.getDescripcion());
                destinos[i].setClima(destino.getClima());
                destinos[i].setIdiomaPrincipal(destino.getIdiomaPrincipal());

                return true;
            }
        }
        return false;
    }

    public boolean eliminar(String nombre) {
        for (int i = 0; i < totalDestinos; i++) {
            if(destinos[i].getNombre().equalsIgnoreCase(nombre)){

                // Correr elementos a la izquierda
                for (int j = i; j < totalDestinos - 1; j++) {
                    destinos[j] = destinos[j+1];
                }

                // Limpiar último casillero
                destinos[totalDestinos - 1] = null;
                totalDestinos--;
                return true;
            }
        }
        return false;
    }

    public DestinoTuristico[] obtenerDestinos() {
        return destinos;
    }

    public int obtenerTotalDestinos() {
        return totalDestinos;
    }
}
