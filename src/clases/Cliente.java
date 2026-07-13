/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Phillipe
 */
public class Cliente extends Persona{
    private String tipoDocumento;
    private String fechaNacimiento;
    private String nacionalidad;
    private String telefono;
    private String correo;

    // Programa de fidelización
    private int puntosFidelidad;

    public Cliente(String dni, String nombres, String apellidos,
                   String tipoDocumento, String fechaNacimiento,
                   String nacionalidad, String telefono, String correo) {

        super(dni, nombres, apellidos);

        this.tipoDocumento = tipoDocumento;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
        this.correo = correo;

        this.puntosFidelidad = 0;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // ==================================================
    // PROGRAMA DE FIDELIZACIÓN
    // ==================================================

    public int getPuntosFidelidad() {
        return puntosFidelidad;
    }

    /**
     * Acumula puntos de fidelidad en función de un monto pagado.
     * Regla: 1 punto por cada S/ 10 pagados.
     */
    public void acumularPuntos(double montoPagado) {

        if (montoPagado <= 0) {
            return;
        }

        puntosFidelidad += (int) (montoPagado / 10);
    }

    /**
     * Calcula el nivel de fidelidad actual del cliente según sus puntos
     * acumulados. Aprovecha el polimorfismo de NivelFidelidad: quien use
     * el nivel no necesita saber si es Bronce, Plata u Oro.
     */
    public NivelFidelidad getNivelFidelidad() {

        if (puntosFidelidad >= 1500) {
            return new Oro();
        }

        if (puntosFidelidad >= 500) {
            return new Plata();
        }

        return new Bronce();
    }

    @Override
    public String toString() {
        return getNombres() + " " + getApellidos() + " (" + getDni() + ")";
    }

    @Override
    public String mostrarInformacion() {
        return "Tipo de documento: " + tipoDocumento
                + "\n" + super.mostrarInformacion()
                + "\nFecha de nacimiento: " + fechaNacimiento
                + "\nNacionalidad: " + nacionalidad
                + "\nTeléfono: " + telefono
                + "\nCorreo: " + correo
                + "\nPuntos de fidelidad: " + puntosFidelidad
                + " (Nivel " + getNivelFidelidad().getNombreNivel() + ")";
    }
}
