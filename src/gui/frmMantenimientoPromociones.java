/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import clases.Promocion;
import gestion.SistemaAgencia;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class frmMantenimientoPromociones extends JFrame {

    private SistemaAgencia sistema;
    private JTextField txtCodigo, txtDescripcion, txtValorDescuento, txtFechaInicio, txtFechaFin;
    private JComboBox<String> cboTipoDescuento;
    private JCheckBox chkActiva;
    private DefaultTableModel modelo;
    private JTable tabla;

    public frmMantenimientoPromociones(SistemaAgencia sistema) {
        this.sistema = sistema;
        configurarVentana();
        listar();
    }

    private void configurarVentana() {
        setTitle("Mantenimiento de Promociones");
        setSize(1000, 560);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JPanel pnlDatos = new JPanel(new GridLayout(4, 4, 5, 5));

        pnlDatos.add(new JLabel("Código:"));
        pnlDatos.add(txtCodigo = new JTextField());
        pnlDatos.add(new JLabel("Descripción:"));
        pnlDatos.add(txtDescripcion = new JTextField());
        pnlDatos.add(new JLabel("Tipo de descuento:"));
        pnlDatos.add(cboTipoDescuento = new JComboBox<>(new String[]{"Porcentaje", "Monto fijo"}));
        pnlDatos.add(new JLabel("Valor del descuento:"));
        pnlDatos.add(txtValorDescuento = new JTextField());
        pnlDatos.add(new JLabel("Fecha de inicio:"));
        pnlDatos.add(txtFechaInicio = new JTextField());
        pnlDatos.add(new JLabel("Fecha de fin:"));
        pnlDatos.add(txtFechaFin = new JTextField());
        pnlDatos.add(new JLabel("Promoción activa:"));
        pnlDatos.add(chkActiva = new JCheckBox("Sí", true));
        pnlDatos.add(new JLabel("Formato fecha:"));
        pnlDatos.add(new JLabel("dd/mm/aaaa"));

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

        pnlBotones.add(btnRegistrar);
        pnlBotones.add(btnBuscar);
        pnlBotones.add(btnActualizar);
        pnlBotones.add(btnEliminar);
        pnlBotones.add(btnLimpiar);

        JPanel pnlSuperior = new JPanel(new BorderLayout());
        pnlSuperior.add(pnlDatos, BorderLayout.CENTER);
        pnlSuperior.add(pnlBotones, BorderLayout.SOUTH);
        add(pnlSuperior, BorderLayout.NORTH);

        modelo = new DefaultTableModel(new String[]{"Código", "Descripción", "Tipo", "Valor", "Inicio", "Fin", "Estado"}, 0);
        tabla = new JTable(modelo);
        add(new JScrollPane(tabla), BorderLayout.CENTER);
    }

    // --- LÓGICA (Pega aquí tus métodos existentes sin cambios) ---
    // registrar(), buscar(), actualizar(), eliminar(), listar(), limpiar(), crearPromocion(), validarCampos(), obtenerValor()
}
