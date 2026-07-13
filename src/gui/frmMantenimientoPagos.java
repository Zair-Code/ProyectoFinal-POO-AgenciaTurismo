/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import clases.Pago;
import clases.Reserva;
import gestion.SistemaAgencia;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class frmMantenimientoPagos extends JFrame {

    private SistemaAgencia sistema;
    private JComboBox<String> cboReserva, cboTipoPago, cboMetodoPago;
    private JTextField txtCodigoPago, txtFechaPago, txtMonto;
    private DefaultTableModel modelo;
    private JTable tabla;

    public frmMantenimientoPagos(SistemaAgencia sistema) {
        this.sistema = sistema;
        configurarVentana();
        cargarReservas();
        listar();
    }

    private void configurarVentana() {
        setTitle("Mantenimiento de Pagos");
        setSize(1000, 560);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JPanel pnlDatos = new JPanel(new GridLayout(3, 4, 5, 5));

        pnlDatos.add(new JLabel("Reserva:"));
        pnlDatos.add(cboReserva = new JComboBox<>());
        pnlDatos.add(new JLabel("Código de pago:"));
        pnlDatos.add(txtCodigoPago = new JTextField());
        pnlDatos.add(new JLabel("Fecha de pago:"));
        pnlDatos.add(txtFechaPago = new JTextField());
        pnlDatos.add(new JLabel("Monto:"));
        pnlDatos.add(txtMonto = new JTextField());
        
        pnlDatos.add(new JLabel("Tipo de pago:"));
        pnlDatos.add(cboTipoPago = new JComboBox<>(new String[]{"Adelanto", "Pago parcial", "Pago final"}));
        pnlDatos.add(new JLabel("Método de pago:"));
        pnlDatos.add(cboMetodoPago = new JComboBox<>(new String[]{"Efectivo", "Tarjeta", "Transferencia", "Yape o Plin"}));

        JPanel pnlBotones = new JPanel();
        JButton btnRegistrar = new JButton("Registrar pago");
        JButton btnBuscar = new JButton("Buscar");
        JButton btnActualizar = new JButton("Actualizar");
        JButton btnEliminar = new JButton("Eliminar registro");
        JButton btnLimpiar = new JButton("Limpiar");
        JButton btnRecargar = new JButton("Recargar reservas");
        JButton btnVerSaldo = new JButton("Ver saldo");

        // Eventos
        btnRegistrar.addActionListener(e -> registrar());
        btnBuscar.addActionListener(e -> buscar());
        btnActualizar.addActionListener(e -> actualizar());
        btnEliminar.addActionListener(e -> eliminar());
        btnLimpiar.addActionListener(e -> limpiar());
        btnRecargar.addActionListener(e -> cargarReservas());
        btnVerSaldo.addActionListener(e -> verSaldo());

        pnlBotones.add(btnRegistrar); pnlBotones.add(btnBuscar); pnlBotones.add(btnActualizar);
        pnlBotones.add(btnEliminar); pnlBotones.add(btnLimpiar); pnlBotones.add(btnRecargar);
        pnlBotones.add(btnVerSaldo);

        JPanel pnlSuperior = new JPanel(new BorderLayout());
        pnlSuperior.add(pnlDatos, BorderLayout.CENTER);
        pnlSuperior.add(pnlBotones, BorderLayout.SOUTH);
        add(pnlSuperior, BorderLayout.NORTH);

        modelo = new DefaultTableModel(new String[]{"Código", "Fecha", "Monto", "Tipo", "Método"}, 0);
        tabla = new JTable(modelo);
        add(new JScrollPane(tabla), BorderLayout.CENTER);
    }

    // --- PEGA AQUÍ TUS MÉTODOS DE LÓGICA (cargarReservas, obtenerReserva, obtenerMonto, validarCampos, crearPago, registrar, buscar, actualizar, eliminar, verSaldo, listar, limpiar) ---
}