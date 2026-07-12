/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Phillipe
 */
public class PaqueteTuristico {
    private String codigo;
    private String nombre;
    private int duracionDias;
    private int duracionNoches;
    private String tipo;
    private double precioPersona;
    private String fechaSalida;
    private String fechaRetorno;
    private int cupoMaximo;
    private int cupoDisponible;
    private String estado;

    // Arreglos de objetos
    private DestinoTuristico[] destinos;
    private ServicioIncluido[] servicios;
    private ItinerarioDetallado[] itinerarios;

    // Contadores
    private int cantidadDestinos;
    private int cantidadServicios;
    private int cantidadItinerarios;

    // Promoción asociada al paquete
    private Promocion promocion;

    public PaqueteTuristico(String codigo,
                            String nombre,
                            int duracionDias,
                            int duracionNoches,
                            String tipo,
                            double precioPersona,
                            String fechaSalida,
                            String fechaRetorno,
                            int cupoMaximo) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.duracionDias = duracionDias;
        this.duracionNoches = duracionNoches;
        this.tipo = tipo;
        this.precioPersona = precioPersona;
        this.fechaSalida = fechaSalida;
        this.fechaRetorno = fechaRetorno;
        this.cupoMaximo = cupoMaximo;
        this.cupoDisponible = cupoMaximo;
        this.estado = "Activo";

        destinos = new DestinoTuristico[5];
        servicios = new ServicioIncluido[10];
        itinerarios = new ItinerarioDetallado[20];

        cantidadDestinos = 0;
        cantidadServicios = 0;
        cantidadItinerarios = 0;

        promocion = null;
    }

    // GETTERS Y SETTERS

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionDias() {
        return duracionDias;
    }

    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }

    public int getDuracionNoches() {
        return duracionNoches;
    }

    public void setDuracionNoches(int duracionNoches) {
        this.duracionNoches = duracionNoches;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioPersona() {
        return precioPersona;
    }

    public void setPrecioPersona(double precioPersona) {

        if (precioPersona >= 0) {
            this.precioPersona = precioPersona;
        }
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaRetorno() {
        return fechaRetorno;
    }

    public void setFechaRetorno(String fechaRetorno) {
        this.fechaRetorno = fechaRetorno;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {

        if (cupoMaximo > 0) {

            int cuposOcupados =
                    this.cupoMaximo - this.cupoDisponible;

            this.cupoMaximo = cupoMaximo;

            this.cupoDisponible =
                    cupoMaximo - cuposOcupados;

            if (this.cupoDisponible < 0) {
                this.cupoDisponible = 0;
            }

            if (estado.equalsIgnoreCase("Cancelado")) {
                return;
            }

            if (this.cupoDisponible == 0) {
                estado = "Agotado";
            } else {
                estado = "Activo";
            }
        }
    }

    public int getCupoDisponible() {
        return cupoDisponible;
    }

    public void setCupoDisponible(int cupoDisponible) {

        if (cupoDisponible < 0) {
            return;
        }

        if (cupoDisponible > cupoMaximo) {
            return;
        }

        this.cupoDisponible = cupoDisponible;

        if (estado.equalsIgnoreCase("Cancelado")) {
            return;
        }

        if (cupoDisponible == 0) {
            estado = "Agotado";
        } else {
            estado = "Activo";
        }
    }

    public String getEstado() {
        return estado;
    }

    public Promocion getPromocion() {
        return promocion;
    }

    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }

    public int getCantidadDestinos() {
        return cantidadDestinos;
    }

    public int getCantidadServicios() {
        return cantidadServicios;
    }

    public int getCantidadItinerarios() {
        return cantidadItinerarios;
    }

    // AGREGAR DESTINO

    public boolean agregarDestino(
            DestinoTuristico destino) {

        if (destino == null) {
            return false;
        }

        if (cantidadDestinos >= destinos.length) {
            return false;
        }

        destinos[cantidadDestinos] = destino;
        cantidadDestinos++;

        return true;
    }

    // AGREGAR SERVICIO

    public boolean agregarServicio(
            ServicioIncluido servicio) {

        if (servicio == null) {
            return false;
        }

        if (cantidadServicios >= servicios.length) {
            return false;
        }

        servicios[cantidadServicios] = servicio;
        cantidadServicios++;

        return true;
    }

    // AGREGAR ACTIVIDAD DEL ITINERARIO

    public boolean agregarItinerario(
            ItinerarioDetallado itinerario) {

        if (itinerario == null) {
            return false;
        }

        if (cantidadItinerarios
                >= itinerarios.length) {

            return false;
        }

        itinerarios[cantidadItinerarios] =
                itinerario;

        cantidadItinerarios++;

        return true;
    }

    // VERIFICAR CUPOS

    public boolean tieneCupos(
            int cantidadPasajeros) {

        if (cantidadPasajeros <= 0) {
            return false;
        }

        if (!estado.equalsIgnoreCase("Activo")) {
            return false;
        }

        if (cupoDisponible
                < cantidadPasajeros) {

            return false;
        }

        return true;
    }

    // RESERVAR CUPOS

    public boolean reservarCupos(
            int cantidadPasajeros) {

        if (!tieneCupos(cantidadPasajeros)) {
            return false;
        }

        cupoDisponible =
                cupoDisponible - cantidadPasajeros;

        if (cupoDisponible == 0) {
            estado = "Agotado";
        }

        return true;
    }

    // DEVOLVER CUPOS AL CANCELAR UNA RESERVA

    public boolean devolverCupos(
            int cantidadPasajeros) {

        if (cantidadPasajeros <= 0) {
            return false;
        }

        cupoDisponible =
                cupoDisponible + cantidadPasajeros;

        if (cupoDisponible > cupoMaximo) {
            cupoDisponible = cupoMaximo;
        }

        if (estado.equalsIgnoreCase("Agotado")) {
            estado = "Activo";
        }

        return true;
    }

    // CANCELAR PAQUETE

    public boolean cancelarPaquete() {

        if (estado.equalsIgnoreCase("Cancelado")) {
            return false;
        }

        estado = "Cancelado";

        return true;
    }

    // REACTIVAR PAQUETE

    public boolean reactivarPaquete() {

        if (!estado.equalsIgnoreCase("Cancelado")) {
            return false;
        }

        if (cupoDisponible == 0) {
            estado = "Agotado";
        } else {
            estado = "Activo";
        }

        return true;
    }

    // MOSTRAR DESTINOS

    public String mostrarDestinos() {

        String informacion = "";

        if (cantidadDestinos == 0) {
            return "No hay destinos registrados.";
        }

        for (int i = 0;
             i < cantidadDestinos;
             i++) {

            informacion += "- "
                    + destinos[i].getNombre()
                    + " - "
                    + destinos[i].getCiudad()
                    + ", "
                    + destinos[i].getPais()
                    + "\n";
        }

        return informacion;
    }

    // MOSTRAR SERVICIOS


    public String mostrarServicios() {

        String informacion = "";

        if (cantidadServicios == 0) {
            return "No hay servicios incluidos.";
        }

        for (int i = 0;
             i < cantidadServicios;
             i++) {

            informacion += "- "
                    + servicios[i].getTipoServicio()
                    + ": "
                    + servicios[i].getDescripcion()
                    + "\n";
        }

        return informacion;
    }

    // MOSTRAR ITINERARIO

    public String mostrarItinerario() {

        String informacion = "";

        if (cantidadItinerarios == 0) {
            return "No hay itinerario registrado.";
        }

        for (int i = 0;
             i < cantidadItinerarios;
             i++) {

            informacion +=
                    itinerarios[i]
                            .mostrarInformacion()
                            + "\n";
        }

        return informacion;
    }

    // MOSTRAR TODA LA INFORMACIÓN DEL PAQUETE

    public String mostrarInformacion() {

        String informacion;

        informacion = "Código: " + codigo
                + "\nNombre: " + nombre
                + "\nDuración: "
                + duracionDias
                + " días y "
                + duracionNoches
                + " noches"
                + "\nTipo: " + tipo
                + "\nPrecio por persona: S/ "
                + precioPersona
                + "\nFecha de salida: "
                + fechaSalida
                + "\nFecha de retorno: "
                + fechaRetorno
                + "\nCupo máximo: "
                + cupoMaximo
                + "\nCupo disponible: "
                + cupoDisponible
                + "\nEstado: "
                + estado;

        informacion += "\n\nDESTINOS:\n"
                + mostrarDestinos();

        informacion += "\nSERVICIOS INCLUIDOS:\n"
                + mostrarServicios();

        informacion += "\nITINERARIO:\n"
                + mostrarItinerario();

        if (promocion == null) {

            informacion +=
                    "\nPROMOCIÓN:\n"
                            + "No tiene promoción.";

        } else {

            informacion +=
                    "\nPROMOCIÓN:\n"
                            + promocion
                            .mostrarInformacion();
        }

        return informacion;
    }
}