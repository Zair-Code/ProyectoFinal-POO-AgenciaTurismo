/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Phillipe
 */
public abstract class Empleado extends Persona {

    private String usuario;
    private String contraseña;

    public Empleado(String dni, String nombres, String apellidos,
                    String usuario, String contraseña) {

        super(dni, nombres, apellidos);

        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }


    public abstract String getRol();

    public abstract String mostrarFunciones();

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion()
                + "\nUsuario: " + usuario
                + "\nRol: " + getRol();
    }
}
