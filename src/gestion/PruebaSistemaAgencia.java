/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;
import clases.AsesorViajes;
import clases.Cliente;
import clases.DestinoTuristico;
import clases.Empleado;
import clases.ItinerarioDetallado;
import clases.Pago;
import clases.PaqueteTuristico;
import clases.Promocion;
import clases.Reserva;
import clases.ServicioIncluido;
import gestion.SistemaAgencia;


public class PruebaSistemaAgencia {
    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("    PRUEBA DE SISTEMA AGENCIA");
        System.out.println("==================================");

        SistemaAgencia sistema = new SistemaAgencia();

        // ==================================================
        // PRUEBA DEL LOGIN DEL ADMINISTRADOR
        // ==================================================

        System.out.println("\n==================================");
        System.out.println("          PRUEBA DE LOGIN");
        System.out.println("==================================");

        Empleado administrador =
                sistema.validarLogin(
                        "admin",
                        "1234"
                );

        System.out.println(
                "Login del administrador correcto: "
                        + (administrador != null)
        );

        if (administrador != null) {

            System.out.println(
                    "Usuario encontrado: "
                            + administrador.getNombres()
            );

            System.out.println(
                    "Rol: "
                            + administrador.getRol()
            );
        }

        // ==================================================
        // PRUEBA DE EMPLEADOS
        // ==================================================

        System.out.println("\n==================================");
        System.out.println("       PRUEBA DE EMPLEADOS");
        System.out.println("==================================");

        AsesorViajes asesor = new AsesorViajes(
                "87654321",
                "Ana",
                "Torres Ruiz",
                "atorres",
                "5678"
        );

        boolean empleadoRegistrado =
                sistema.registrarEmpleado(asesor);

        System.out.println(
                "Asesor registrado: "
                        + empleadoRegistrado
        );

        Empleado empleadoEncontrado =
                sistema.buscarEmpleadoPorDni(
                        "87654321"
                );

        System.out.println(
                "Asesor encontrado: "
                        + (empleadoEncontrado != null)
        );

        Empleado loginAsesor =
                sistema.validarLogin(
                        "atorres",
                        "5678"
                );

        System.out.println(
                "Login del asesor correcto: "
                        + (loginAsesor != null)
        );

        System.out.println(
                "Total de empleados: "
                        + sistema.getContEmpleados()
        );

        // ==================================================
        // PRUEBA DE CLIENTES
        // ==================================================

        System.out.println("\n==================================");
        System.out.println("        PRUEBA DE CLIENTES");
        System.out.println("==================================");

        Cliente cliente1 = new Cliente(
                "44556677",
                "María",
                "Salazar Ramos",
                "DNI",
                "15/08/2001",
                "Peruana",
                "999888777",
                "maria@gmail.com"
        );

        Cliente cliente2 = new Cliente(
                "77889911",
                "José",
                "Ramos Castro",
                "DNI",
                "10/05/1998",
                "Peruana",
                "988777666",
                "jose@gmail.com"
        );

        Cliente cliente3 = new Cliente(
                "PA123456",
                "Lucía",
                "Ramos Salazar",
                "Pasaporte",
                "20/07/2015",
                "Peruana",
                "977666555",
                "lucia@gmail.com"
        );

        System.out.println(
                "Cliente 1 registrado: "
                        + sistema.registrarCliente(cliente1)
        );

        System.out.println(
                "Cliente 2 registrado: "
                        + sistema.registrarCliente(cliente2)
        );

        System.out.println(
                "Cliente 3 registrado: "
                        + sistema.registrarCliente(cliente3)
        );

        Cliente clienteBuscado =
                sistema.buscarClientePorDni(
                        "44556677"
                );

        System.out.println(
                "Cliente encontrado: "
                        + (clienteBuscado != null)
        );

        Cliente clienteActualizado = new Cliente(
                "44556677",
                "María",
                "Salazar Ramos",
                "DNI",
                "15/08/2001",
                "Peruana",
                "900111222",
                "maria.actualizada@gmail.com"
        );

        System.out.println(
                "Cliente actualizado: "
                        + sistema.actualizarCliente(
                        clienteActualizado
                )
        );

        System.out.println(
                "Nuevo teléfono: "
                        + sistema.buscarClientePorDni(
                        "44556677"
                ).getTelefono()
        );

        System.out.println(
                "Total de clientes: "
                        + sistema.getContClientes()
        );

        // ==================================================
        // PRUEBA DE DESTINOS
        // ==================================================

        System.out.println("\n==================================");
        System.out.println("        PRUEBA DE DESTINOS");
        System.out.println("==================================");

        DestinoTuristico destino =
                new DestinoTuristico(
                        "Machu Picchu",
                        "Perú",
                        "Cusco",
                        "Ciudadela inca ubicada en los Andes.",
                        "Templado",
                        "Español",
                        "imagenes/machu_picchu.jpg"
                );

        System.out.println(
                "Destino registrado: "
                        + sistema.registrarDestino(destino)
        );

        DestinoTuristico destinoBuscado =
                sistema.buscarDestinoPorNombre(
                        "Machu Picchu"
                );

        System.out.println(
                "Destino encontrado: "
                        + (destinoBuscado != null)
        );

        DestinoTuristico destinoActualizado =
                new DestinoTuristico(
                        "Machu Picchu",
                        "Perú",
                        "Cusco",
                        "Ciudadela inca y atractivo turístico.",
                        "Frío y templado",
                        "Español",
                        "imagenes/machu_picchu.jpg"
                );

        System.out.println(
                "Destino actualizado: "
                        + sistema.actualizarDestino(
                        destinoActualizado
                )
        );

        System.out.println(
                "Nuevo clima: "
                        + sistema.buscarDestinoPorNombre(
                        "Machu Picchu"
                ).getClima()
        );

        System.out.println(
                "Total de destinos: "
                        + sistema.getContDestinos()
        );

        // ==================================================
        // PRUEBA DE ITINERARIOS
        // ==================================================

        System.out.println("\n==================================");
        System.out.println("      PRUEBA DE ITINERARIOS");
        System.out.println("==================================");

        ItinerarioDetallado actividad1 =
                new ItinerarioDetallado(
                        1,
                        "Llegada a Cusco y traslado al hotel"
                );

        ItinerarioDetallado actividad2 =
                new ItinerarioDetallado(
                        2,
                        "Visita guiada a Machu Picchu"
                );

        ItinerarioDetallado actividad3 =
                new ItinerarioDetallado(
                        3,
                        "Recorrido por la ciudad de Cusco"
                );

        System.out.println(
                "Itinerario 1 registrado: "
                        + sistema.registrarItinerario(
                        actividad1
                )
        );

        System.out.println(
                "Itinerario 2 registrado: "
                        + sistema.registrarItinerario(
                        actividad2
                )
        );

        System.out.println(
                "Itinerario 3 registrado: "
                        + sistema.registrarItinerario(
                        actividad3
                )
        );

        ItinerarioDetallado itinerarioBuscado =
                sistema.buscarItinerarioPorPosicion(1);

        System.out.println(
                "Itinerario encontrado: "
                        + (itinerarioBuscado != null)
        );

        ItinerarioDetallado itinerarioNuevo =
                new ItinerarioDetallado(
                        2,
                        "Visita completa a Machu Picchu"
                );

        System.out.println(
                "Itinerario actualizado: "
                        + sistema.actualizarItinerario(
                        1,
                        itinerarioNuevo
                )
        );

        System.out.println(
                "Nueva descripción: "
                        + sistema
                        .buscarItinerarioPorPosicion(1)
                        .getDescripcion()
        );

        System.out.println(
                "Total de itinerarios: "
                        + sistema.getContItinerarios()
        );

        // ==================================================
        // PRUEBA DE PROMOCIONES
        // ==================================================

        System.out.println("\n==================================");
        System.out.println("      PRUEBA DE PROMOCIONES");
        System.out.println("==================================");

        Promocion promocion = new Promocion(
                "PROMO01",
                "Descuento por vacaciones",
                "Porcentaje",
                10,
                "01/07/2026",
                "31/08/2026"
        );

        System.out.println(
                "Promoción registrada: "
                        + sistema.registrarPromocion(
                        promocion
                )
        );

        Promocion promocionBuscada =
                sistema.buscarPromocionPorCodigo(
                        "PROMO01"
                );

        System.out.println(
                "Promoción encontrada: "
                        + (promocionBuscada != null)
        );

        System.out.println(
                "Total de promociones: "
                        + sistema.getContPromociones()
        );

        // ==================================================
        // PRUEBA DE PAQUETES
        // ==================================================

        System.out.println("\n==================================");
        System.out.println("        PRUEBA DE PAQUETES");
        System.out.println("==================================");

        ServicioIncluido servicioHotel =
                new ServicioIncluido(
                        "Hotel",
                        "Alojamiento de tres noches"
                );

        ServicioIncluido servicioVuelo =
                new ServicioIncluido(
                        "Vuelo",
                        "Vuelo de ida y vuelta Lima - Cusco"
                );

        ServicioIncluido servicioTraslado =
                new ServicioIncluido(
                        "Traslado",
                        "Traslado del aeropuerto al hotel"
                );

        PaqueteTuristico paquete =
                new PaqueteTuristico(
                        "PAQ001",
                        "Cusco Mágico",
                        4,
                        3,
                        "Nacional",
                        1200.00,
                        "10/08/2026",
                        "13/08/2026",
                        20
                );

        paquete.agregarDestino(destino);
        paquete.agregarServicio(servicioHotel);
        paquete.agregarServicio(servicioVuelo);
        paquete.agregarServicio(servicioTraslado);

        paquete.agregarItinerario(actividad1);
        paquete.agregarItinerario(itinerarioNuevo);
        paquete.agregarItinerario(actividad3);

        paquete.setPromocion(promocion);

        System.out.println(
                "Paquete registrado: "
                        + sistema.registrarPaquete(paquete)
        );

        PaqueteTuristico paqueteBuscado =
                sistema.buscarPaquetePorCodigo(
                        "PAQ001"
                );

        System.out.println(
                "Paquete encontrado: "
                        + (paqueteBuscado != null)
        );

        System.out.println(
                "Cupos iniciales: "
                        + paquete.getCupoDisponible()
        );

        System.out.println(
                "Total de paquetes: "
                        + sistema.getContPaquetes()
        );

        // ==================================================
        // PRUEBA DE RESERVA
        // ==================================================

        System.out.println("\n==================================");
        System.out.println("        PRUEBA DE RESERVA");
        System.out.println("==================================");

        Reserva reserva = new Reserva(
                "RES001",
                "12/07/2026",
                paquete,
                asesor,
                2,
                1,
                30,
                30
        );

        System.out.println(
                "Cliente 1 agregado a la reserva: "
                        + reserva.agregarCliente(cliente1)
        );

        System.out.println(
                "Cliente 2 agregado a la reserva: "
                        + reserva.agregarCliente(cliente2)
        );

        System.out.println(
                "Cliente 3 agregado a la reserva: "
                        + reserva.agregarCliente(cliente3)
        );

        System.out.println(
                "Reserva registrada en el sistema: "
                        + sistema.registrarReserva(reserva)
        );

        Reserva reservaBuscada =
                sistema.buscarReservaPorCodigo(
                        "RES001"
                );

        System.out.println(
                "Reserva encontrada: "
                        + (reservaBuscada != null)
        );

        System.out.println(
                "Precio total: S/ "
                        + reserva.getPrecioTotal()
        );

        System.out.println(
                "Cupos después de reservar: "
                        + paquete.getCupoDisponible()
        );

        System.out.println(
                "Estado inicial: "
                        + reserva.getEstado()
        );

        // ==================================================
        // PRUEBA DE PAGOS
        // ==================================================

        System.out.println("\n==================================");
        System.out.println("          PRUEBA DE PAGOS");
        System.out.println("==================================");

        Pago pago = new Pago(
                "PAG001",
                "12/07/2026",
                1000.00,
                "Adelanto",
                "Tarjeta"
        );

        System.out.println(
                "Pago agregado a la reserva: "
                        + reserva.agregarPago(pago)
        );

        System.out.println(
                "Pago registrado en el sistema: "
                        + sistema.registrarPago(pago)
        );

        Pago pagoBuscado =
                sistema.buscarPagoPorCodigo(
                        "PAG001"
                );

        System.out.println(
                "Pago encontrado: "
                        + (pagoBuscado != null)
        );

        System.out.println(
                "Monto pagado: S/ "
                        + reserva.calcularMontoPagado()
        );

        System.out.println(
                "Saldo pendiente: S/ "
                        + reserva.calcularSaldoPendiente()
        );

        System.out.println(
                "Estado después del pago: "
                        + reserva.getEstado()
        );

        System.out.println(
                "Total de pagos: "
                        + sistema.getContPagos()
        );

        // ==================================================
        // ACTUALIZACIÓN DE RESERVA
        // ==================================================

        System.out.println("\n==================================");
        System.out.println("    ACTUALIZACIÓN DE RESERVA");
        System.out.println("==================================");

        reserva.setFechaReserva("13/07/2026");

        System.out.println(
                "Reserva actualizada: "
                        + sistema.actualizarReserva(
                        reserva
                )
        );

        System.out.println(
                "Nueva fecha de reserva: "
                        + sistema
                        .buscarReservaPorCodigo("RES001")
                        .getFechaReserva()
        );

        // ==================================================
        // RESUMEN
        // ==================================================

        System.out.println("\n==================================");
        System.out.println("       RESUMEN DEL SISTEMA");
        System.out.println("==================================");

        System.out.println(
                "Empleados: "
                        + sistema.getContEmpleados()
        );

        System.out.println(
                "Clientes: "
                        + sistema.getContClientes()
        );

        System.out.println(
                "Destinos: "
                        + sistema.getContDestinos()
        );

        System.out.println(
                "Itinerarios: "
                        + sistema.getContItinerarios()
        );

        System.out.println(
                "Paquetes: "
                        + sistema.getContPaquetes()
        );

        System.out.println(
                "Promociones: "
                        + sistema.getContPromociones()
        );

        System.out.println(
                "Reservas: "
                        + sistema.getContReservas()
        );

        System.out.println(
                "Pagos: "
                        + sistema.getContPagos()
        );

        // ==================================================
        // VOUCHER
        // ==================================================

        System.out.println("\n==================================");
        System.out.println("             VOUCHER");
        System.out.println("==================================");

        System.out.println(
                reserva.generarVoucher()
        );

        System.out.println("\n==================================");
        System.out.println(" TODAS LAS PRUEBAS HAN TERMINADO");
        System.out.println("==================================");
    }
}
