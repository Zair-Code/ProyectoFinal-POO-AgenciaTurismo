/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Phillipe
 */
public  class Empleado extends Persona {
    private String Contraseña;
    private String Rol;
    private String Usuario;

    public Empleado(String dni, String apellido, String nombre,String Contraseña,String Rol,String Usuario) {
        super(dni, apellido, nombre);
        this.Contraseña = Contraseña;
        this.Rol = Rol;
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    
    public String InfoEmpleado() {
        return "Empleado{" + "Contrase\u00f1a=" + Contraseña + ", Rol=" + Rol + ", Usuario=" + Usuario + '}';
    }
    
    
}
