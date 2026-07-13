/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import clases.*;
import gestion.SistemaAgencia;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class frmMantenimientoReservas extends JFrame {
    private SistemaAgencia sistema;
    private JTextField txtCodigo, txtFecha, txtAdultos, txtMenores, txtDescuentoMenor, txtPagoMinimo;
    private JComboBox<String> cboPaquete, cboAsesor;
    private JComboBox<Cliente> cboCliente;
    private DefaultTableModel modelo;
    private JTable tabla;

    public frmMantenimientoReservas(SistemaAgencia sistema) {
        this.sistema = sistema;
        configurarVentana();
        cargarListas();
        listar();
    }

    private void configurarVentana() {
        setTitle("Mantenimiento de Reservas");
        setSize(1200, 670);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JPanel pnlDatos = new JPanel(new GridLayout(5, 4, 5, 5));
        
        // Campos (añadidos al panel)
        pnlDatos.add(new JLabel("Código de reserva:"));
        pnlDatos.add(txtCodigo = new JTextField());
        pnlDatos.add(new JLabel("Fecha de reserva:"));
        pnlDatos.add(txtFecha = new JTextField());
        pnlDatos.add(new JLabel("Paquete:"));
        pnlDatos.add(cboPaquete = new JComboBox<>());
        pnlDatos.add(new JLabel("Asesor (DNI):"));
        pnlDatos.add(cboAsesor = new JComboBox<>());
        pnlDatos.add(new JLabel("Cantidad de adultos:"));
        pnlDatos.add(txtAdultos = new JTextField());
        pnlDatos.add(new JLabel("Cantidad de menores:"));
        pnlDatos.add(txtMenores = new JTextField());
        pnlDatos.add(new JLabel("Descuento a menores (%):"));
        pnlDatos.add(txtDescuentoMenor = new JTextField("20"));
        pnlDatos.add(new JLabel("Pago mínimo (%):"));
        pnlDatos.add(txtPagoMinimo = new JTextField("30"));
        pnlDatos.add(new JLabel("Cliente para agregar:"));
        pnlDatos.add(cboCliente = new JComboBox<>());

        JButton btnAgregarCliente = new JButton("Agregar cliente a reserva");
        JButton btnRecargar = new JButton("Recargar listas");
        pnlDatos.add(btnAgregarCliente);
        pnlDatos.add(btnRecargar);

        // Botones de acción
        JPanel pnlBotones = new JPanel(new GridLayout(2, 5, 5, 5));
        String[] nombresBotones = {"Registrar", "Buscar", "Actualizar fecha", "Cancelar reserva", "Eliminar", 
                                   "Aplicar fidelidad", "Ver voucher", "Ver detalle", "Limpiar", "Actualizar tabla"};
        
        // Aquí conectarías los listeners (ejemplo para Registrar)
        JButton btnRegistrar = new JButton("Registrar");
        btnRegistrar.addActionListener(e -> registrar());
        pnlBotones.add(btnRegistrar);
        // ... (Agrega los demás botones y sus respectivos listeners de la misma forma)

        JPanel pnlSuperior = new JPanel(new BorderLayout());
        pnlSuperior.add(pnlDatos, BorderLayout.CENTER);
        pnlSuperior.add(pnlBotones, BorderLayout.SOUTH);
        add(pnlSuperior, BorderLayout.NORTH);

        modelo = new DefaultTableModel(new String[]{"Código", "Fecha", "Paquete", "Asesor", "Adultos", "Menores", 
                                                    "Total", "Pagado", "Saldo", "Estado", "Nivel fidelidad"}, 0);
        tabla = new JTable(modelo);
        add(new JScrollPane(tabla), BorderLayout.CENTER);
    }

    // --- PEGA AQUÍ TODOS TUS MÉTODOS DE LÓGICA (registrar, buscar, listar, etc.) ---
    // Asegúrate de incluir obtenerEntero, obtenerDouble, cargarListas, obtenerAsesor, etc.
}