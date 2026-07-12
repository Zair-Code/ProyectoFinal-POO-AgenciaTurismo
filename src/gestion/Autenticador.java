/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;
import clases.Empleado;
/**
 *
 * @author Phillipe
 */
public class Autenticador {
    
    private gestionEmpleado gestionEmpleado;

    public Autenticador(gestionEmpleado gestionEmpleado) {
        this.gestionEmpleado = gestionEmpleado;
    }

    /**
     * Verifica si el usuario y contraseña son correctos.
     * Retorna el objeto Empleado si la autenticación es exitosa, null si falla.
     */
    public Empleado validarAcceso(String usuario, String password) {
        Empleado[] empleados = gestionEmpleado.obtenerEmpleados();
        int total = gestionEmpleado.obtenerTotalEmpleados();

        for (int i = 0; i < total; i++) {
            if (empleados[i].getUsuario().equals(usuario) && 
                empleados[i].getContraseña().equals(password)) {
                return empleados[i]; // Retorna el empleado encontrado
            }
        }
        return null; // Credenciales incorrectas
    }
}