/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;
import clases.Reserva;
/**
 *
 * @author Phillipe
 */
public class GestionReserva {
    
    private Reserva[] reservas;
    private int totalReservas;
    
    public GestionReserva() {
        reservas = new Reserva[100]; // Tamaño definido para las reservas
        totalReservas = 0;
    }
    
    // Buscar por ID de reserva o código único
    public Reserva buscarPorCodigo(String codigoReserva) {
        for (int i = 0; i < totalReservas; i++) {
            if(reservas[i].getCodigoReserva().equalsIgnoreCase(codigoReserva)){
                return reservas[i];
            }
        }
        return null;
    }
    
    public boolean registrar(Reserva reserva) {
        if(totalReservas == reservas.length) {
            return false;
        }
        
        // Evitar duplicados
        if(buscarPorCodigo(reserva.getCodigoReserva()) != null) {
            return false;
        }
        
        reservas[totalReservas] = reserva;
        totalReservas++;
        return true;
    }
    
    public boolean actualizar(Reserva reserva) {
        for (int i = 0; i < totalReservas; i++) {
            if(reservas[i].getCodigoReserva().equalsIgnoreCase(reserva.getCodigoReserva())){
                reservas[i].setCliente(reserva.);
                reservas[i].setPaquete(reserva.getPaquete());
                reservas[i].set(reserva.getCantidadAdultos());
                reservas[i].setNumPasajerosMenores(reserva.getNumPasajerosMenores());
                reservas[i].setEstadoReserva(reserva.getEstadoReserva());
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminar(String codigoReserva) {
        for (int i = 0; i < totalReservas; i++) {
            if(reservas[i].getCodigoReserva().equalsIgnoreCase(codigoReserva)){
                
                // Corrimiento a la izquierda
                for (int j = i; j < totalReservas - 1; j++) {
                    reservas[j] = reservas[j+1];
                }
                
                reservas[totalReservas - 1] = null;
                totalReservas--;
                return true;
            }
        }
        return false;
    }
    
    public Reserva[] obtenerReservas() {
        return reservas;
    }
    
    public int obtenerTotalReservas() {
        return totalReservas;
    }
}

