/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;
import clases.Administrador;
import clases.Cliente;
import clases.DestinoTuristico;
import clases.Empleado;
import clases.ItinerarioDetallado;
import clases.Pago;
import clases.PaqueteTuristico;
import clases.Promocion;
import clases.Reserva;

/**
 *
 * @author Phillipe
 */
public class SistemaAgencia {
    private gestionEmpleado gestionEmpleados;
    private gestionCliente gestionClientes;
    private gestionDestino gestionDestinos;
    private gestionItinerario gestionItinerarios;
    private gestionPaquete gestionPaquetes;
    private gestionPago gestionPagos;
    private gestionPromocion gestionPromociones;
    private gestionReserva gestionReservas;

    private Autenticador autenticador;

    public SistemaAgencia() {

        gestionEmpleados = new gestionEmpleado();
        gestionClientes = new gestionCliente();
        gestionDestinos = new gestionDestino();
        gestionItinerarios = new gestionItinerario();
        gestionPaquetes = new gestionPaquete();
        gestionPagos = new gestionPago();
        gestionPromociones = new gestionPromocion();
        gestionReservas = new gestionReserva();

        autenticador = new Autenticador(gestionEmpleados);

        cargarAdministradorInicial();
    }

    private void cargarAdministradorInicial() {

        Administrador administrador = new Administrador(
                "00000000",
                "Administrador",
                "General",
                "admin",
                "1234"
        );

        gestionEmpleados.registrar(administrador);
    }

    // ==================================================
    // LOGIN
    // ==================================================

    public Empleado validarLogin(
            String usuario,
            String password) {

        return autenticador.validarAcceso(
                usuario,
                password
        );
    }

    // ==================================================
    // EMPLEADOS
    // ==================================================

    public boolean registrarEmpleado(
            Empleado empleado) {

        return gestionEmpleados.registrar(
                empleado
        );
    }

    public Empleado buscarEmpleadoPorDni(
            String dni) {

        return gestionEmpleados.buscarPorDni(
                dni
        );
    }

    public boolean actualizarEmpleado(
            Empleado empleado) {

        return gestionEmpleados.actualizar(
                empleado
        );
    }

    public boolean eliminarEmpleado(
            String dni) {

        return gestionEmpleados.eliminar(
                dni
        );
    }

    public Empleado[] getEmpleados() {

        return gestionEmpleados.obtenerEmpleados();
    }

    public int getContEmpleados() {

        return gestionEmpleados
                .obtenerTotalEmpleados();
    }

    // ==================================================
    // CLIENTES
    // ==================================================

    public boolean registrarCliente(
            Cliente cliente) {

        return gestionClientes.registrar(
                cliente
        );
    }

    public Cliente buscarClientePorDni(
            String dni) {

        return gestionClientes.buscarPorDni(
                dni
        );
    }

    public boolean actualizarCliente(
            Cliente cliente) {

        return gestionClientes.actualizar(
                cliente
        );
    }

    public boolean eliminarCliente(
            String dni) {

        return gestionClientes.eliminar(
                dni
        );
    }

    public Cliente[] getClientes() {

        return gestionClientes.obtenerClientes();
    }

    public int getContClientes() {

        return gestionClientes
                .obtenerTotalClientes();
    }

    // ==================================================
    // DESTINOS
    // ==================================================

    public boolean registrarDestino(
            DestinoTuristico destino) {

        return gestionDestinos.registrar(
                destino
        );
    }

    public DestinoTuristico buscarDestinoPorNombre(
            String nombre) {

        return gestionDestinos.buscarPorNombre(
                nombre
        );
    }

    public boolean actualizarDestino(
            DestinoTuristico destino) {

        return gestionDestinos.actualizar(
                destino
        );
    }

    public boolean eliminarDestino(
            String nombre) {

        return gestionDestinos.eliminar(
                nombre
        );
    }

    public DestinoTuristico[] getDestinos() {

        return gestionDestinos.obtenerDestinos();
    }

    public int getContDestinos() {

        return gestionDestinos.obtenerTotalDestinos();
                
    }

    // ==================================================
    // ITINERARIOS
    // ==================================================

    public boolean registrarItinerario(
            ItinerarioDetallado itinerario) {

        return gestionItinerarios.registrar(
                itinerario
        );
    }

    public ItinerarioDetallado buscarItinerarioPorPosicion(
            int posicion) {

        return gestionItinerarios
                .buscarPorPosicion(posicion);
    }

    public boolean actualizarItinerario(
            int posicion,
            ItinerarioDetallado itinerarioNuevo) {

        return gestionItinerarios.actualizar(
                posicion,
                itinerarioNuevo
        );
    }

    public boolean eliminarItinerario(
            int posicion) {

        return gestionItinerarios.eliminar(
                posicion
        );
    }

    public ItinerarioDetallado[] getItinerarios() {

        return gestionItinerarios
                .obtenerItinerarios();
    }

    public int getContItinerarios() {

        return gestionItinerarios
                .obtenerTotalItinerarios();
    }

    // ==================================================
    // PAQUETES TURÍSTICOS
    // ==================================================

    public boolean registrarPaquete(
            PaqueteTuristico paquete) {

        return gestionPaquetes.registrar(
                paquete
        );
    }

    public PaqueteTuristico buscarPaquetePorCodigo(
            String codigo) {

        return gestionPaquetes.buscarPorCodigo(
                codigo
        );
    }

    public boolean actualizarPaquete(
            PaqueteTuristico paquete) {

        return gestionPaquetes.actualizar(
                paquete
        );
    }

    public boolean eliminarPaquete(
            String codigo) {

        return gestionPaquetes.eliminar(
                codigo
        );
    }

    public PaqueteTuristico[] getPaquetes() {

        return gestionPaquetes.obtenerPaquetes();
    }

    public int getContPaquetes() {

        return gestionPaquetes
                .obtenerTotalPaquetes();
    }

    // ==================================================
    // PAGOS
    // ==================================================

    public boolean registrarPago(
            Pago pago) {

        return gestionPagos.registrar(
                pago
        );
    }

    public Pago buscarPagoPorCodigo(
            String codigoPago) {

        return gestionPagos.buscarPorCodigo(
                codigoPago
        );
    }

    public boolean actualizarPago(
            Pago pago) {

        return gestionPagos.actualizar(
                pago
        );
    }

    public boolean eliminarPago(
            String codigoPago) {

        return gestionPagos.eliminar(
                codigoPago
        );
    }

    public Pago[] getPagos() {

        return gestionPagos.obtenerPagos();
    }

    public int getContPagos() {

        return gestionPagos
                .obtenerTotalPagos();
    }

    // ==================================================
    // PROMOCIONES
    // ==================================================

    public boolean registrarPromocion(
            Promocion promocion) {

        return gestionPromociones.registrar(
                promocion
        );
    }

    public Promocion buscarPromocionPorCodigo(
            String codigo) {

        return gestionPromociones.buscarPorCodigo(
                codigo
        );
    }

    public boolean actualizarPromocion(
            Promocion promocion) {

        return gestionPromociones.actualizar(
                promocion
        );
    }

    public boolean eliminarPromocion(
            String codigo) {

        return gestionPromociones.eliminar(
                codigo
        );
    }

    public Promocion[] getPromociones() {

        return gestionPromociones
                .obtenerPromociones();
    }

    public int getContPromociones() {

        return gestionPromociones
                .obtenerTotalPromociones();
    }

    // ==================================================
    // RESERVAS
    // ==================================================

    public boolean registrarReserva(
            Reserva reserva) {

        return gestionReservas.registrar(
                reserva
        );
    }

    public Reserva buscarReservaPorCodigo(
            String codigoReserva) {

        return gestionReservas.buscarPorCodigo(
                codigoReserva
        );
    }

    public boolean actualizarReserva(
            Reserva reserva) {

        return gestionReservas.actualizar(
                reserva
        );
    }

    public boolean eliminarReserva(
            String codigoReserva) {

        return gestionReservas.eliminar(
                codigoReserva
        );
    }

    public Reserva[] getReservas() {

        return gestionReservas.obtenerReservas();
    }

    public int getContReservas() {

        return gestionReservas
                .obtenerTotalReservas();
    }
}
