/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Phillipe
 */
public class AsesorViajes extends Empleado{
    public AsesorViajes(String dni, String nombres, String apellidos,
                        String usuario, String contrasena) {

        super(dni, nombres, apellidos, usuario, contrasena);
    }

    @Override
    public String getRol() {
        return "Asesor de Viaje";
    }

    @Override
    public String mostrarFunciones() {
        return "Gestiona clientes, reservas y pagos.";
    }
}