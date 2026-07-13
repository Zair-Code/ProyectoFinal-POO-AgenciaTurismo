/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import clases.ItinerarioDetallado;
import gestion.SistemaAgencia;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class frmMantenimientoItinerarios extends JFrame {

    private SistemaAgencia sistema;
    private JTextField txtPosicion, txtNumeroDia, txtDescripcion;
    private DefaultTableModel modelo;
    private JTable tabla;

    public frmMantenimientoItinerarios(SistemaAgencia sistema) {
        this.sistema = sistema;
        configurarVentana();
        listar();
    }

    private void configurarVentana() {
        setTitle("Mantenimiento de Itinerarios");
        setSize(800, 500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JPanel pnlDatos = new JPanel(new GridLayout(3, 2, 5, 5));
        pnlDatos.add(new JLabel("Posición para buscar, actualizar o eliminar:"));
        pnlDatos.add(txtPosicion = new JTextField());
        pnlDatos.add(new JLabel("Número de día:"));
        pnlDatos.add(txtNumeroDia = new JTextField());
        pnlDatos.add(new JLabel("Descripción:"));
        pnlDatos.add(txtDescripcion = new JTextField());

        JPanel pnlBotones = new JPanel();
        JButton btnRegistrar = new JButton("Registrar");
        JButton btnBuscar = new JButton("Buscar");
        JButton btnActualizar = new JButton("Actualizar");
        JButton btnEliminar = new JButton("Eliminar");
        JButton btnLimpiar = new JButton("Limpiar");

        btnRegistrar.addActionListener(e -> registrar());
        btnBuscar.addActionListener(e -> buscar());
        btnActualizar.addActionListener(e -> actualizar());
        btnEliminar.addActionListener(e -> eliminar());
        btnLimpiar.addActionListener(e -> limpiar());

        pnlBotones.add(btnRegistrar); pnlBotones.add(btnBuscar);
        pnlBotones.add(btnActualizar); pnlBotones.add(btnEliminar); pnlBotones.add(btnLimpiar);

        JPanel pnlSuperior = new JPanel(new BorderLayout());
        pnlSuperior.add(pnlDatos, BorderLayout.CENTER);
        pnlSuperior.add(pnlBotones, BorderLayout.SOUTH);
        add(pnlSuperior, BorderLayout.NORTH);

        modelo = new DefaultTableModel(new String[]{"Posición", "Número de día", "Descripción"}, 0);
        tabla = new JTable(modelo);
        add(new JScrollPane(tabla), BorderLayout.CENTER);
    }

    // --- PEGA AQUÍ TU LÓGICA ORIGINAL ---
    // Incluye: obtenerNumero, registrar, buscar, actualizar, eliminar, listar y limpiar.
}