/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;
import clases.Pago;
/**
 *
 * @author Phillipe
 */
public class gestionPago {
    private Pago[] pagos;
    private int totalPagos;

    public gestionPago() {
        pagos = new Pago[100]; // Tamaño definido
        totalPagos = 0;
    }

    // Buscar pago por código o ID único
    public Pago buscarPorCodigo(String codigoPago) {
        for (int i = 0; i < totalPagos; i++) {
            if(pagos[i].getCodigoPago().equalsIgnoreCase(codigoPago)){
                return pagos[i];
            }
        }
        return null;
    }

    public boolean registrar(Pago pago) {
        if(totalPagos == pagos.length) {
            return false;
        }

        // Evitar duplicados
        if(buscarPorCodigo(pago.getCodigoPago()) != null) {
            return false;
        }

        pagos[totalPagos] = pago;
        totalPagos++;
        return true;
    }

    public boolean actualizar(Pago pago) {
        for (int i = 0; i < totalPagos; i++) {
            if(pagos[i].getCodigoPago().equalsIgnoreCase(pago.getCodigoPago())){
                pagos[i].setMonto(pago.getMonto());
                pagos[i].setMetodoPago(pago.getMetodoPago());
                return true;
            }
        }
        return false;
    }

    public boolean eliminar(String codigoPago) {
        for (int i = 0; i < totalPagos; i++) {
            if(pagos[i].getCodigoPago().equalsIgnoreCase(codigoPago)){

                // Corrimiento a la izquierda
                for (int j = i; j < totalPagos - 1; j++) {
                    pagos[j] = pagos[j+1];
                }

                pagos[totalPagos - 1] = null;
                totalPagos--;
                return true;
            }
        }
        return false;
    }

    public Pago[] obtenerPagos() {
        return pagos;
    }

    public int obtenerTotalPagos() {
        return totalPagos;
    }
}
