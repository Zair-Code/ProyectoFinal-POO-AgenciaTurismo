/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Phillipe
 */
public class Operador extends Empleado {

    public Operador(String dni, String nombres, String apellidos,
                    String usuario, String contrasena) {

        super(dni, nombres, apellidos, usuario, contrasena);
    }

    @Override
    public String getRol() {
        return "Operador";
    }

    @Override
    public String mostrarFunciones() {
        return "Gestiona itinerarios y cupos de los paquetes turísticos.";
    }
}