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
    
    private Itinerario[] itinerarios;
    private int totalItinerarios;
    
    public GestionItinerario() {
        itinerarios = new Itinerario[100]; 
        totalItinerarios = 0;
    }
    
    
    public Itinerario buscarPorCodigo(String codigo) {
        for (int i = 0; i < totalItinerarios; i++) {
            if(itinerarios[i].getCodigoItinerario().equalsIgnoreCase(codigo)){
                return itinerarios[i];
            }
        }
        return null;
    }
    
    public boolean registrar(Itinerario itinerario) {
        if(totalItinerarios == itinerarios.length) {
            return false;
        }
        
        
        if(buscarPorCodigo(itinerario.getCodigoItinerario()) != null) {
            return false;
        }
        
        itinerarios[totalItinerarios] = itinerario;
        totalItinerarios++;
        return true;
    }
    
    public boolean actualizar(Itinerario itinerario) {
        for (int i = 0; i < totalItinerarios; i++) {
            if(itinerarios[i].getCodigoItinerario().equalsIgnoreCase(itinerario.getCodigoItinerario())){
                itinerarios[i].setDescripcionActividades(itinerario.getDescripcionActividades());
                itinerarios[i].setDia(itinerario.getDia());
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminar(String codigo) {
        for (int i = 0; i < totalItinerarios; i++) {
            if(itinerarios[i].getCodigoItinerario().equalsIgnoreCase(codigo)){
                
                
                for (int j = i; j < totalItinerarios - 1; j++) {
                    itinerarios[j] = itinerarios[j+1];
                }
                
                itinerarios[totalItinerarios - 1] = null;
                totalItinerarios--;
                return true;
            }
        }
        return false;
    }
    
    public Itinerario[] obtenerItinerarios() {
        return itinerarios;
    }
    
    public int obtenerTotalItinerarios() {
        return totalItinerarios;
    }
}
}
