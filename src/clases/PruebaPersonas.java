/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Phillipe
 */
public class PruebaPersonas {
    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("       PRUEBA DE EMPLEADOS");
        System.out.println("==================================");

        Empleado[] empleados = new Empleado[3];

        empleados[0] = new Administrador(
                "12345678",
                "Carlos",
                "Pérez López",
                "cperez",
                "1234"
        );

        empleados[1] = new AsesorViajes(
                "87654321",
                "Ana",
                "Torres Ruiz",
                "atorres",
                "5678"
        );

        empleados[2] = new Operador(
                "11223344",
                "Luis",
                "Gómez Díaz",
                "lgomez",
                "9999"
        );

        for (int i = 0; i < empleados.length; i++) {

            System.out.println("\nEMPLEADO " + (i + 1));
            System.out.println(empleados[i].mostrarInformacion());
            System.out.println(
                    "Funciones: "
                            + empleados[i].mostrarFunciones()
            );
        }

        System.out.println("\n==================================");
        System.out.println("         PRUEBA DE CLIENTES");
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

        System.out.println(cliente1.mostrarInformacion());

        System.out.println("\n==================================");
        System.out.println("       PRUEBA DE DESTINO");
        System.out.println("==================================");

        DestinoTuristico destino = new DestinoTuristico(
                "Machu Picchu",
                "Perú",
                "Cusco",
                "Ciudadela inca ubicada en los Andes.",
                "Templado",
                "Español",
                "imagenes/machu_picchu.jpg"
        );

        System.out.println(destino.mostrarInformacion());

        System.out.println("\n==================================");
        System.out.println("       PRUEBA DE SERVICIOS");
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

        System.out.println(servicioHotel.mostrarInformacion());
        System.out.println(servicioVuelo.mostrarInformacion());
        System.out.println(servicioTraslado.mostrarInformacion());

        System.out.println("\n==================================");
        System.out.println("       PRUEBA DE ITINERARIO");
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

        System.out.println(actividad1.mostrarInformacion());
        System.out.println(actividad2.mostrarInformacion());
        System.out.println(actividad3.mostrarInformacion());

        System.out.println("\n==================================");
        System.out.println("     PRUEBA DE PAQUETE TURÍSTICO");
        System.out.println("==================================");

        PaqueteTuristico paquete = new PaqueteTuristico(
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

        boolean destinoAgregado =
                paquete.agregarDestino(destino);

        boolean hotelAgregado =
                paquete.agregarServicio(servicioHotel);

        boolean vueloAgregado =
                paquete.agregarServicio(servicioVuelo);

        boolean trasladoAgregado =
                paquete.agregarServicio(servicioTraslado);

        boolean actividad1Agregada =
                paquete.agregarItinerario(actividad1);

        boolean actividad2Agregada =
                paquete.agregarItinerario(actividad2);

        boolean actividad3Agregada =
                paquete.agregarItinerario(actividad3);

        System.out.println(
                "Destino agregado: " + destinoAgregado
        );

        System.out.println(
                "Hotel agregado: " + hotelAgregado
        );

        System.out.println(
                "Vuelo agregado: " + vueloAgregado
        );

        System.out.println(
                "Traslado agregado: " + trasladoAgregado
        );

        System.out.println(
                "Actividad 1 agregada: "
                        + actividad1Agregada
        );

        System.out.println(
                "Actividad 2 agregada: "
                        + actividad2Agregada
        );

        System.out.println(
                "Actividad 3 agregada: "
                        + actividad3Agregada
        );

        System.out.println("\n" + paquete.mostrarInformacion());

        System.out.println("\n==================================");
        System.out.println("       PRUEBA DE PROMOCIÓN");
        System.out.println("==================================");

        Promocion promocion = new Promocion(
                "PROMO01",
                "Descuento por vacaciones",
                "Porcentaje",
                10,
                "01/07/2026",
                "31/08/2026"
        );

        paquete.setPromocion(promocion);

        System.out.println(promocion.mostrarInformacion());

        double precioPrueba = 1200;

        double precioConDescuento =
                promocion.calcularPrecioConDescuento(
                        precioPrueba
                );

        System.out.println(
                "Precio original: S/ " + precioPrueba
        );

        System.out.println(
                "Precio con descuento: S/ "
                        + precioConDescuento
        );

        System.out.println("\n==================================");
        System.out.println("        PRUEBA DE RESERVA");
        System.out.println("==================================");

        AsesorViajes asesor =
                (AsesorViajes) empleados[1];

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

        boolean cliente1Agregado =
                reserva.agregarCliente(cliente1);

        boolean cliente2Agregado =
                reserva.agregarCliente(cliente2);

        boolean cliente3Agregado =
                reserva.agregarCliente(cliente3);

        System.out.println(
                "Cliente 1 agregado: "
                        + cliente1Agregado
        );

        System.out.println(
                "Cliente 2 agregado: "
                        + cliente2Agregado
        );

        System.out.println(
                "Cliente 3 agregado: "
                        + cliente3Agregado
        );

        System.out.println(
                "\nCupos disponibles después de reservar: "
                        + paquete.getCupoDisponible()
        );

        System.out.println("\n" + reserva.mostrarInformacion());

        System.out.println("\n==================================");
        System.out.println("          PRUEBA DE PAGO");
        System.out.println("==================================");

        Pago pago1 = new Pago(
                "PAG001",
                "12/07/2026",
                1000.00,
                "Adelanto",
                "Tarjeta"
        );

        boolean pagoRegistrado =
                reserva.agregarPago(pago1);

        System.out.println(
                "Pago registrado: " + pagoRegistrado
        );

        System.out.println(
                "Monto total pagado: S/ "
                        + reserva.calcularMontoPagado()
        );

        System.out.println(
                "Saldo pendiente: S/ "
                        + reserva.calcularSaldoPendiente()
        );

        System.out.println(
                "Estado de la reserva: "
                        + reserva.getEstado()
        );

        System.out.println("\n==================================");
        System.out.println("             VOUCHER");
        System.out.println("==================================");

        System.out.println(reserva.generarVoucher());

        System.out.println("\n==================================");
        System.out.println("     TODAS LAS PRUEBAS TERMINARON");
        System.out.println("==================================");
    }

}
