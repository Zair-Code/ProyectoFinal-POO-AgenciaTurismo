/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;
import clases.PaqueteTuristico;

/**
 *
 * @author Phillipe
 */
public class GestionPaquete {
    
    private PaqueteTuristico[] paquetes;
    private int totalPaquetes;
    
    public GestionPaquete() {
        paquetes = new PaqueteTuristico[50];
        totalPaquetes = 0;
    }
    
    public PaqueteTuristico buscarPorCodigo(String codigo) {
        for (int i = 0; i < totalPaquetes; i++) {
            if(paquetes[i].getCodigo().equalsIgnoreCase(codigo)){
                return paquetes[i];
            }
        }
        return null;
    }
    
    public boolean registrar(PaqueteTuristico paquete) {
        if(totalPaquetes == paquetes.length) {
            return false;
        }
        
        // Evitar duplicados
        if(buscarPorCodigo(paquete.getCodigo()) != null) {
            return false;
        }
        
        paquetes[totalPaquetes] = paquete;
        totalPaquetes++;
        return true;
    }
    
    public boolean actualizar(PaqueteTuristico paquete) {
        for (int i = 0; i < totalPaquetes; i++) {
            if(paquetes[i].getCodigo().equalsIgnoreCase(paquete.getCodigo())){
                paquetes[i].setNombre(paquete.getNombre());
                paquetes[i].setCantidadDestinos(paquete.getCantidadDestinos());
                paquetes[i].setCupoMaximo(paquete.getCupoMaximo());
                paquetes[i].setTipo(paquete.getTipo());
                paquetes[i].setPrecioPersona(paquete.getPrecioPersona());
                paquetes[i].setFechaSalida(paquete.getFechaSalida());
                paquetes[i].setFechaRetorno(paquete.getFechaRetorno());
                paquetes[i].setCupoMaximo(paquete.getCupoMaximo());
                paquetes[i].setEstado(paquete.getEstado());
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminar(String codigo) {
        for (int i = 0; i < totalPaquetes; i++) {
            if(paquetes[i].getCodigo().equalsIgnoreCase(codigo)){
                
                // Corrimiento a la izquierda
                for (int j = i; j < totalPaquetes - 1; j++) {
                    paquetes[j] = paquetes[j+1];
                }
                
                paquetes[totalPaquetes - 1] = null;
                totalPaquetes--;
                return true;
            }
        }
        return false;
    }
    
    public PaqueteTuristico[] obtenerPaquetes() {
        return paquetes;
    }
    
    public int obtenerTotalPaquetes() {
        return totalPaquetes;
    }
}
