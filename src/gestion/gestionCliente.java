/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;
import clases.Cliente;
/**
 *
 * @author Phillipe
 */
public class gestionCliente {

    private Cliente[] clientes;
    private int totalClientes;

    public gestionCliente() {
        clientes = new Cliente[100];
        totalClientes = 0;
    }

    public Cliente buscarPorDni(String dni) {

        for (int i = 0; i < totalClientes; i++) {

            if (clientes[i].getDni()
                    .equalsIgnoreCase(dni)) {

                return clientes[i];
            }
        }

        return null;
    }

    public boolean registrar(Cliente cliente) {

        if (cliente == null) {
            return false;
        }

        if (totalClientes >= clientes.length) {
            return false;
        }

        if (buscarPorDni(cliente.getDni()) != null) {
            return false;
        }

        clientes[totalClientes] = cliente;
        totalClientes++;

        return true;
    }

    public boolean actualizar(Cliente cliente) {

        if (cliente == null) {
            return false;
        }

        for (int i = 0; i < totalClientes; i++) {

            if (clientes[i].getDni()
                    .equalsIgnoreCase(
                            cliente.getDni())) {

                clientes[i].setNombres(
                        cliente.getNombres()
                );

                clientes[i].setApellidos(
                        cliente.getApellidos()
                );

                clientes[i].setTipoDocumento(
                        cliente.getTipoDocumento()
                );

                clientes[i].setFechaNacimiento(
                        cliente.getFechaNacimiento()
                );

                clientes[i].setNacionalidad(
                        cliente.getNacionalidad()
                );

                clientes[i].setTelefono(
                        cliente.getTelefono()
                );

                clientes[i].setCorreo(
                        cliente.getCorreo()
                );

                return true;
            }
        }

        return false;
    }

    public boolean eliminar(String dni) {

        for (int i = 0; i < totalClientes; i++) {

            if (clientes[i].getDni()
                    .equalsIgnoreCase(dni)) {

                for (int j = i;
                     j < totalClientes - 1;
                     j++) {

                    clientes[j] =
                            clientes[j + 1];
                }

                clientes[totalClientes - 1] =
                        null;

                totalClientes--;

                return true;
            }
        }

        return false;
    }

    public Cliente[] obtenerClientes() {
        return clientes;
    }

    public int obtenerTotalClientes() {
        return totalClientes;
    }
}
