/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

import clases.Empleado;

/**
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
            Empleado emp = empleados[i];
            
            // 1. Validamos que el empleado no sea nulo
            // 2. Validamos que usuario y contraseña no sean nulos antes de comparar
            if (emp != null && emp.getUsuario() != null && emp.getContraseña() != null) {
                
                if (emp.getUsuario().equals(usuario) && emp.getContraseña().equals(password)) {
                    return emp; // Credenciales correctas
                }
            }
        }
        return null; // Credenciales incorrectas o no encontradas
    }
}