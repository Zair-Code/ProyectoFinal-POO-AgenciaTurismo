/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Phillipe
 */
public class Promocion {
    private String codigo;
    private String descripcion;
    private String tipoDescuento;
    private double valorDescuento;
    private String fechaInicio;
    private String fechaFin;
    private boolean activa;

    public Promocion(String codigo,
                     String descripcion,
                     String tipoDescuento,
                     double valorDescuento,
                     String fechaInicio,
                     String fechaFin) {

        this.codigo = codigo;
        this.descripcion = descripcion;
        this.tipoDescuento = tipoDescuento;
        this.valorDescuento = valorDescuento;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.activa = true;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoDescuento() {
        return tipoDescuento;
    }

    public void setTipoDescuento(String tipoDescuento) {
        this.tipoDescuento = tipoDescuento;
    }

    public double getValorDescuento() {
        return valorDescuento;
    }

    public void setValorDescuento(double valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public double calcularPrecioConDescuento(double precioOriginal) {

        double precioFinal = precioOriginal;

        if (activa == true) {

            if (tipoDescuento.equalsIgnoreCase("Porcentaje")) {

                precioFinal = precioOriginal
                        - (precioOriginal * valorDescuento / 100);

            } else if (tipoDescuento.equalsIgnoreCase("Monto fijo")) {

                precioFinal = precioOriginal - valorDescuento;
            }
        }

        if (precioFinal < 0) {
            precioFinal = 0;
        }

        return precioFinal;
    }

    @Override
    public String toString() {
        return codigo + " - " + descripcion;
    }

    public String mostrarInformacion() {

        String estadoPromocion;

        if (activa == true) {
            estadoPromocion = "Activa";
        } else {
            estadoPromocion = "Inactiva";
        }

        return "Código: " + codigo
                + "\nDescripción: " + descripcion
                + "\nTipo de descuento: " + tipoDescuento
                + "\nValor del descuento: " + valorDescuento
                + "\nFecha de inicio: " + fechaInicio
                + "\nFecha de fin: " + fechaFin
                + "\nEstado: " + estadoPromocion;
    }
}