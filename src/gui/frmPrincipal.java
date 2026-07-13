/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;
import clases.Empleado;
import gestion.SistemaAgencia;
import javax.swing.*;
import java.awt.*;

public class frmPrincipal extends JFrame {
    private SistemaAgencia sistema;
    private Empleado usuarioLogueado;

    private JButton btnEmpleados, btnClientes, btnDestinos, btnItinerarios, btnPaquetes, 
                    btnConfigurarPaquete, btnPromociones, btnReservas, btnPagos, 
                    btnFidelidad, btnReportes, btnCerrarSesion;

    public frmPrincipal(SistemaAgencia sistema, Empleado empleado) {
        this.sistema = sistema;
        this.usuarioLogueado = empleado;
        configurarVentana();
        aplicarPermisos();
    }

    private void configurarVentana() {
        setTitle("Sistema de Agencia de Viajes");
        setSize(900, 620);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JLabel lblBienvenida = new JLabel("  Bienvenido: " + usuarioLogueado.getNombres() + " " 
                                        + usuarioLogueado.getApellidos() + " - Rol: " + usuarioLogueado.getRol());
        add(lblBienvenida, BorderLayout.NORTH);

        JPanel pnlBotones = new JPanel(new GridLayout(4, 3, 10, 10));

        btnEmpleados = new JButton("Empleados");
        btnClientes = new JButton("Clientes");
        btnDestinos = new JButton("Destinos");
        btnItinerarios = new JButton("Itinerarios");
        btnPaquetes = new JButton("Paquetes");
        btnConfigurarPaquete = new JButton("Configurar Paquete");
        btnPromociones = new JButton("Promociones");
        btnReservas = new JButton("Reservas");
        btnPagos = new JButton("Pagos");
        btnFidelidad = new JButton("Fidelidad");
        btnReportes = new JButton("Reportes");
        btnCerrarSesion = new JButton("Cerrar Sesión");

        // Agregar botones al panel
        JButton[] botones = {btnEmpleados, btnClientes, btnDestinos, btnItinerarios, btnPaquetes, 
                             btnConfigurarPaquete, btnPromociones, btnReservas, btnPagos, 
                             btnFidelidad, btnReportes, btnCerrarSesion};
        for (JButton b : botones) pnlBotones.add(b);

        add(pnlBotones, BorderLayout.CENTER);

        // Eventos
        btnEmpleados.addActionListener(e -> new frmMantenimientoEmpleados(sistema).setVisible(true));
        btnReportes.addActionListener(e -> new frmReportes(sistema).setVisible(true));
        btnCerrarSesion.addActionListener(e -> cerrarSesion());
        
        // Aquí puedes agregar el resto de los listeners de la misma forma (e -> ...)
        
        crearMenu();
    }

    private void crearMenu() {
        JMenuBar barra = new JMenuBar();
        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem itemCerrarSesion = new JMenuItem("Cerrar sesión");
        JMenuItem itemSalir = new JMenuItem("Salir");
        
        menuArchivo.add(itemCerrarSesion);
        menuArchivo.add(itemSalir);
        barra.add(menuArchivo);
        setJMenuBar(barra);

        itemCerrarSesion.addActionListener(e -> cerrarSesion());
        itemSalir.addActionListener(e -> System.exit(0));
    }

    private void aplicarPermisos() {
        String rol = usuarioLogueado.getRol();
        if (rol.equalsIgnoreCase("Administrador")) return;

        if (rol.equalsIgnoreCase("Asesor de Viaje")) {
            btnEmpleados.setEnabled(false);
            btnDestinos.setEnabled(false);
            // ... (resto de permisos)
        }
    }

    private void cerrarSesion() {
        new frmLogin(sistema).setVisible(true);
        dispose();
    }
}