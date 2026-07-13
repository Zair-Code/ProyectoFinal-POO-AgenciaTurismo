/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Phillipe
 */
public class Reserva implements Calculable{
    private String codigoReserva;
    private String fechaReserva;

    private PaqueteTuristico paquete;
    private AsesorViajes asesor;

    private Cliente[] clientes;
    private Pago[] pagos;

    private int cantidadClientes;
    private int cantidadPagos;

    private int cantidadAdultos;
    private int cantidadMenores;

    private double porcentajeDescuentoMenor;
    private double porcentajePagoMinimo;

    private double precioTotal;
    private String estado;

    // Programa de fidelización
    private double descuentoFidelidadAplicado;
    private String nivelFidelidadAplicado;

    public Reserva(String codigoReserva,
                   String fechaReserva,
                   PaqueteTuristico paquete,
                   AsesorViajes asesor,
                   int cantidadAdultos,
                   int cantidadMenores,
                   double porcentajeDescuentoMenor,
                   double porcentajePagoMinimo) {

        this.codigoReserva = codigoReserva;
        this.fechaReserva = fechaReserva;
        this.paquete = paquete;
        this.asesor = asesor;
        this.cantidadAdultos = cantidadAdultos;
        this.cantidadMenores = cantidadMenores;
        this.porcentajeDescuentoMenor = porcentajeDescuentoMenor;
        this.porcentajePagoMinimo = porcentajePagoMinimo;

        clientes = new Cliente[20];
        pagos = new Pago[10];

        cantidadClientes = 0;
        cantidadPagos = 0;

        descuentoFidelidadAplicado = 0;
        nivelFidelidadAplicado = null;

        if (datosValidos()) {

            precioTotal = calcularPrecioTotal();

            int totalPasajeros = calcularCantidadPasajeros();

            boolean cuposReservados =
                    paquete.reservarCupos(totalPasajeros);

            if (cuposReservados) {
                estado = "Pendiente de pago";
            } else {
                estado = "Sin cupo";
            }

        } else {

            precioTotal = 0;
            estado = "Inválida";
        }
    }

    private boolean datosValidos() {

        if (paquete == null) {
            return false;
        }

        if (asesor == null) {
            return false;
        }

        if (cantidadAdultos < 0) {
            return false;
        }

        if (cantidadMenores < 0) {
            return false;
        }

        if (calcularCantidadPasajeros() <= 0) {
            return false;
        }

        if (porcentajeDescuentoMenor < 0) {
            return false;
        }

        if (porcentajeDescuentoMenor > 100) {
            return false;
        }

        if (porcentajePagoMinimo < 0) {
            return false;
        }

        if (porcentajePagoMinimo > 100) {
            return false;
        }

        return true;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public PaqueteTuristico getPaquete() {
        return paquete;
    }

    public AsesorViajes getAsesor() {
        return asesor;
    }

    public int getCantidadClientes() {
        return cantidadClientes;
    }

    public int getCantidadPagos() {
        return cantidadPagos;
    }

    public int getCantidadAdultos() {
        return cantidadAdultos;
    }

    public int getCantidadMenores() {
        return cantidadMenores;
    }

    public double getPorcentajeDescuentoMenor() {
        return porcentajeDescuentoMenor;
    }

    public double getPorcentajePagoMinimo() {
        return porcentajePagoMinimo;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public String getEstado() {
        return estado;
    }

    public int calcularCantidadPasajeros() {

        return cantidadAdultos + cantidadMenores;
    }

    @Override
    public double calcularPrecioTotal() {

        double precioPersona =
                paquete.getPrecioPersona();

        double precioAdultos =
                cantidadAdultos * precioPersona;

        double porcentajePagoMenor =
                100 - porcentajeDescuentoMenor;

        double precioMenores =
                cantidadMenores
                        * precioPersona
                        * porcentajePagoMenor / 100;

        double total =
                precioAdultos + precioMenores;

        if (paquete.getPromocion() != null) {

            if (paquete.getPromocion().isActiva()) {

                total = paquete.getPromocion()
                        .calcularPrecioConDescuento(total);
            }
        }

        return total;
    }

    private boolean clienteRepetido(Cliente cliente) {

        for (int i = 0; i < cantidadClientes; i++) {

            if (clientes[i] != null) {

                if (clientes[i].getDni()
                        .equalsIgnoreCase(cliente.getDni())) {

                    return true;
                }
            }
        }

        return false;
    }

    public boolean agregarCliente(Cliente cliente) {

        if (cliente == null) {
            return false;
        }

        if (estado.equalsIgnoreCase("Sin cupo")) {
            return false;
        }

        if (estado.equalsIgnoreCase("Inválida")) {
            return false;
        }

        if (estado.equalsIgnoreCase("Cancelada")) {
            return false;
        }

        if (cantidadClientes >= clientes.length) {
            return false;
        }

        if (cantidadClientes >= calcularCantidadPasajeros()) {
            return false;
        }

        if (clienteRepetido(cliente)) {
            return false;
        }

        clientes[cantidadClientes] = cliente;
        cantidadClientes++;

        return true;
    }

    public double calcularMontoPagado() {

        double montoPagado = 0;

        for (int i = 0; i < cantidadPagos; i++) {

            montoPagado =
                    montoPagado + pagos[i].getMonto();
        }

        return montoPagado;
    }

    public double calcularSaldoPendiente() {

        double saldo =
                precioTotal - calcularMontoPagado();

        if (saldo < 0) {
            saldo = 0;
        }

        return saldo;
    }

    public double calcularPagoMinimo() {

        double pagoMinimo =
                precioTotal * porcentajePagoMinimo / 100;

        return pagoMinimo;
    }

    public boolean agregarPago(Pago pago) {

        if (pago == null) {
            return false;
        }

        if (estado.equalsIgnoreCase("Sin cupo")) {
            return false;
        }

        if (estado.equalsIgnoreCase("Inválida")) {
            return false;
        }

        if (estado.equalsIgnoreCase("Cancelada")) {
            return false;
        }

        if (estado.equalsIgnoreCase("Pagada")) {
            return false;
        }

        if (cantidadPagos >= pagos.length) {
            return false;
        }

        if (pago.getMonto() <= 0) {
            return false;
        }

        if (pago.getMonto() > calcularSaldoPendiente()) {
            return false;
        }

        pagos[cantidadPagos] = pago;
        cantidadPagos++;

        actualizarEstado();
        acumularPuntosFidelidad(pago);

        return true;
    }

    /**
     * Reparte los puntos de fidelidad generados por un pago entre los
     * clientes registrados en la reserva.
     */
    private void acumularPuntosFidelidad(Pago pago) {

        if (cantidadClientes == 0) {
            return;
        }

        double montoPorCliente =
                pago.getMonto() / cantidadClientes;

        for (int i = 0; i < cantidadClientes; i++) {
            clientes[i].acumularPuntos(montoPorCliente);
        }
    }

    /**
     * Aplica un descuento adicional al precio total de la reserva según
     * el mejor nivel de fidelidad entre los clientes registrados.
     * Se apoya en el polimorfismo de NivelFidelidad: no necesita saber
     * si el nivel es Bronce, Plata u Oro para calcular el descuento.
     * Solo puede aplicarse una vez por reserva.
     */
    public boolean aplicarDescuentoFidelidad() {

        if (cantidadClientes == 0) {
            return false;
        }

        if (descuentoFidelidadAplicado > 0) {
            return false;
        }

        if (estado.equalsIgnoreCase("Cancelada")
                || estado.equalsIgnoreCase("Sin cupo")
                || estado.equalsIgnoreCase("Inválida")) {

            return false;
        }

        NivelFidelidad mejorNivel = null;

        for (int i = 0; i < cantidadClientes; i++) {

            NivelFidelidad nivel = clientes[i].getNivelFidelidad();

            if (mejorNivel == null
                    || nivel.getPorcentajeDescuento()
                    > mejorNivel.getPorcentajeDescuento()) {

                mejorNivel = nivel;
            }
        }

        if (mejorNivel == null || mejorNivel.getPorcentajeDescuento() <= 0) {
            return false;
        }

        double descuento =
                precioTotal * mejorNivel.getPorcentajeDescuento() / 100;

        precioTotal = precioTotal - descuento;

        descuentoFidelidadAplicado = descuento;
        nivelFidelidadAplicado = mejorNivel.getNombreNivel();

        actualizarEstado();

        return true;
    }

    public double getDescuentoFidelidadAplicado() {
        return descuentoFidelidadAplicado;
    }

    public String getNivelFidelidadAplicado() {
        return nivelFidelidadAplicado;
    }

    public void actualizarEstado() {

        double montoPagado =
                calcularMontoPagado();

        if (montoPagado >= precioTotal) {

            estado = "Pagada";
            return;
        }

        if (montoPagado >= calcularPagoMinimo()) {

            estado = "Confirmada";
            return;
        }

        estado = "Pendiente de pago";
    }

    public boolean cancelarReserva() {

        if (estado.equalsIgnoreCase("Cancelada")) {
            return false;
        }

        if (estado.equalsIgnoreCase("Sin cupo")) {
            return false;
        }

        if (estado.equalsIgnoreCase("Inválida")) {
            return false;
        }

        int totalPasajeros =
                calcularCantidadPasajeros();

        paquete.devolverCupos(totalPasajeros);

        estado = "Cancelada";

        return true;
    }

    public String mostrarInformacion() {

        String informacion;

        informacion = "Código de reserva: "
                + codigoReserva
                + "\nFecha de reserva: "
                + fechaReserva
                + "\nPaquete turístico: "
                + paquete.getNombre()
                + "\nAsesor: "
                + asesor.getNombres()
                + " "
                + asesor.getApellidos()
                + "\nCantidad de adultos: "
                + cantidadAdultos
                + "\nCantidad de menores: "
                + cantidadMenores
                + "\nTotal de pasajeros: "
                + calcularCantidadPasajeros()
                + "\nPrecio total: S/ "
                + precioTotal
                + "\nMonto pagado: S/ "
                + calcularMontoPagado()
                + "\nSaldo pendiente: S/ "
                + calcularSaldoPendiente()
                + "\nPago mínimo requerido: S/ "
                + calcularPagoMinimo()
                + "\nEstado: "
                + estado;

        if (descuentoFidelidadAplicado > 0) {

            informacion += "\nDescuento fidelidad ("
                    + nivelFidelidadAplicado
                    + "): S/ "
                    + descuentoFidelidadAplicado;
        }

        informacion += "\n\nCLIENTES DE LA RESERVA:";

        if (cantidadClientes == 0) {

            informacion += "\nNo se registraron clientes.";

        } else {

            for (int i = 0; i < cantidadClientes; i++) {

                informacion += "\n- "
                        + clientes[i].getNombres()
                        + " "
                        + clientes[i].getApellidos()
                        + " | Documento: "
                        + clientes[i].getDni();
            }
        }

        informacion += "\n\nPAGOS REGISTRADOS:";

        if (cantidadPagos == 0) {

            informacion += "\nNo se registraron pagos.";

        } else {

            for (int i = 0; i < cantidadPagos; i++) {

                informacion += "\n- Código: "
                        + pagos[i].getCodigoPago()
                        + " | Monto: S/ "
                        + pagos[i].getMonto()
                        + " | Método: "
                        + pagos[i].getMetodoPago();
            }
        }

        return informacion;
    }

    public String generarVoucher() {

        String voucher;

        voucher = "=================================="
                + "\n       VOUCHER DE RESERVA"
                + "\n=================================="
                + "\nCódigo: " + codigoReserva
                + "\nFecha de reserva: " + fechaReserva
                + "\nPaquete: " + paquete.getNombre()
                + "\nFecha de salida: "
                + paquete.getFechaSalida()
                + "\nFecha de retorno: "
                + paquete.getFechaRetorno()
                + "\nAdultos: " + cantidadAdultos
                + "\nMenores: " + cantidadMenores
                + "\nTotal de pasajeros: "
                + calcularCantidadPasajeros()
                + "\nPrecio total: S/ "
                + precioTotal
                + "\nMonto abonado: S/ "
                + calcularMontoPagado()
                + "\nSaldo pendiente: S/ "
                + calcularSaldoPendiente()
                + "\nEstado: " + estado;

        if (descuentoFidelidadAplicado > 0) {

            voucher += "\nDescuento fidelidad ("
                    + nivelFidelidadAplicado
                    + "): S/ "
                    + descuentoFidelidadAplicado;
        }

        voucher += "\n\nCLIENTES:";

        for (int i = 0; i < cantidadClientes; i++) {

            voucher += "\n- "
                    + clientes[i].getNombres()
                    + " "
                    + clientes[i].getApellidos();
        }

        voucher += "\n\nSERVICIOS INCLUIDOS:"
                + "\n"
                + paquete.mostrarServicios();

        voucher += "\n==================================";

        return voucher;
    }
}
