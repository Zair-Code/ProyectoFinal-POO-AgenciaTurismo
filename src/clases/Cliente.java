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

    public Cliente(String dni, String nombres, String apellidos,
                   String tipoDocumento, String fechaNacimiento,
                   String nacionalidad, String telefono, String correo) {

        super(dni, nombres, apellidos);

        this.tipoDocumento = tipoDocumento;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
        this.correo = correo;
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

    @Override
    public String mostrarInformacion() {
        return "Tipo de documento: " + tipoDocumento
                + "\n" + super.mostrarInformacion()
                + "\nFecha de nacimiento: " + fechaNacimiento
                + "\nNacionalidad: " + nacionalidad
                + "\nTeléfono: " + telefono
                + "\nCorreo: " + correo;
    }
}
    

    
    
    
    
    
    
    

