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
public class gestionEmpleado {
    private Empleado[] empleados;
    private int totalEmpleados;
    
    public gestionEmpleado() {
        empleados = new Empleado[50]; // Tamaño fijo como en tu ejemplo
        totalEmpleados = 0;
        
        // Puedes precargar algunos aquí si lo necesitas para probar
    }
    
    public Empleado buscarPorDni(String dni) {
        for (int i = 0; i < totalEmpleados; i++) {
            if(empleados[i].getDni().equalsIgnoreCase(dni)){
                return empleados[i];
            }
        }
        return null;
    }
    
    public boolean registrar(Empleado emp) {
        if(totalEmpleados == empleados.length) {
            return false;
        }
        
        if(buscarPorDni(emp.getDni()) != null) {
            return false;
        }
        
        empleados[totalEmpleados] = emp;
        totalEmpleados++;
        return true;
    }
    
    public boolean actualizar(Empleado emp) {
        for (int i = 0; i < totalEmpleados; i++) {
            if(empleados[i].getDni().equalsIgnoreCase(emp.getDni())){
                empleados[i].setNombres(emp.getNombres());
                empleados[i].setApellidos(emp.getApellidos());
                empleados[i].setUsuario(emp.getUsuario());
                empleados[i].setContraseña(emp.getContraseña());
                
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminar(String dni) {
        for (int i = 0; i < totalEmpleados; i++) {
            if(empleados[i].getDni().equalsIgnoreCase(dni)){
                // Correr los elementos a la izquierda
                for (int j = i; j < totalEmpleados - 1; j++) {
                    empleados[j] = empleados[j+1];
                }
                // Limpiar el último casillero
                empleados[totalEmpleados - 1] = null;
                totalEmpleados--;
                return true;
            }
        }
        return false;
    }
    
    public Empleado[] obtenerEmpleados() {
        return empleados;
    }
    
    public int obtenerTotalEmpleados() {
        return totalEmpleados;
    }
}

