/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Phillipe
 */
public class PruebaPersonas {
    public static void main(String[] args) {

        Empleado[] empleados = new Empleado[3];

        empleados[0] = new Administrador(
                "12345678",
                "Carlos",
                "Pérez López",
                "cperez",
                "1234"
        );

        empleados[1] = new AsesorViajes(
                "87654321",
                "Ana",
                "Torres Ruiz",
                "atorres",
                "5678"
        );

        empleados[2] = new Operador(
                "11223344",
                "Luis",
                "Gómez Díaz",
                "lgomez",
                "9999"
        );

        for (int i = 0; i < empleados.length; i++) {

            System.out.println("EMPLEADO " + (i + 1));

            System.out.println(
                    empleados[i].mostrarInformacion()
            );

            System.out.println(
                    "Funciones: "
                            + empleados[i].mostrarFunciones()
            );

            System.out.println("--------------------------------");
        }

        Cliente cliente = new Cliente(
                "44556677",
                "María",
                "Salazar Ramos",
                "DNI",
                "15/08/2001",
                "Peruana",
                "999888777",
                "maria@gmail.com"
        );

        System.out.println("CLIENTE");

        System.out.println(
                cliente.mostrarInformacion()
        );

        System.out.println("\nPRUEBA DE LOGIN");




    }
}
