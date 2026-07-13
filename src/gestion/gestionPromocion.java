/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;
import clases.Promocion;
/**
 *
 * @author Phillipe
 */
public class gestionPromocion {
    private Promocion[] promociones;
    private int totalPromociones;

    public gestionPromocion() {
        promociones = new Promocion[50];
        totalPromociones = 0;
    }

    // Buscar promoción por un código único
    public Promocion buscarPorCodigo(String codigo) {
        for (int i = 0; i < totalPromociones; i++) {
            if(promociones[i].getCodigo().equalsIgnoreCase(codigo)){
                return promociones[i];
            }
        }
        return null;
    }

    public boolean registrar(Promocion promocion) {
        if(totalPromociones == promociones.length) {
            return false;
        }

        // Evitar duplicados
        if(buscarPorCodigo(promocion.getCodigo()) != null) {
            return false;
        }

        promociones[totalPromociones] = promocion;
        totalPromociones++;
        return true;
    }

    public boolean actualizar(Promocion promocion) {
        for (int i = 0; i < totalPromociones; i++) {
            if(promociones[i].getCodigo().equalsIgnoreCase(promocion.getCodigo())){
                promociones[i].setDescripcion(promocion.getDescripcion());
                promociones[i].setTipoDescuento(promocion.getTipoDescuento());
                promociones[i].setFechaFin(promocion.getFechaFin());
                return true;
            }
        }
        return false;
    }

    public boolean eliminar(String codigo) {
        for (int i = 0; i < totalPromociones; i++) {
            if(promociones[i].getCodigo().equalsIgnoreCase(codigo)){

                // Corrimiento de elementos a la izquierda
                for (int j = i; j < totalPromociones - 1; j++) {
                    promociones[j] = promociones[j+1];
                }

                // Limpiar el último casillero
                promociones[totalPromociones - 1] = null;
                totalPromociones--;
                return true;
            }
        }
        return false;
    }

    public Promocion[] obtenerPromociones() {
        return promociones;
    }

    public int obtenerTotalPromociones() {
        return totalPromociones;
    }
}
