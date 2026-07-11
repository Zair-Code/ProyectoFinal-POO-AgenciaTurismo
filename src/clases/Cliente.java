/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Phillipe
 */
public class Cliente extends Persona {
    
    private String fechaNacimiento;
    private String nacionalidad;
    private String telefono;
    private String email;

    public Cliente(String dni, String apellido, String nombre,String fechaNacimiento,String nacionalidad,String telefono,String email) {
        super(dni, apellido, nombre);
        this.fechaNacimiento= fechaNacimiento;
        this.nacionalidad= nacionalidad;
        this.telefono= telefono;
        this.email= email;
        
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Info Empleado 
    public String InfoCliente() {
        return "Cliente{" + "fechaNacimiento=" + fechaNacimiento + ", nacionalidad=" + nacionalidad + ", telefono=" + telefono + ", email=" + email + '}';
    }
    

    
    
    
    
    
    
    
}
