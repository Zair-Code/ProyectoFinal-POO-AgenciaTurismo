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

public class frmMantenimientoPaquetes extends JFrame {

    private SistemaAgencia sistema;
    private JTextField txtCodigo, txtNombre, txtDias, txtNoches, txtTipo, txtPrecio, txtFechaSalida, txtFechaRetorno, txtCupoMaximo;
    private JComboBox<String> cboPromocion, cboEstado;
    private DefaultTableModel modelo;
    private JTable tabla;

    public frmMantenimientoPaquetes(SistemaAgencia sistema) {
        this.sistema = sistema;
        configurarVentana();
        cargarPromociones();
        listar();
    }

    private void configurarVentana() {
        setTitle("Mantenimiento de Paquetes Turísticos");
        setSize(1150, 650);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JPanel pnlDatos = new JPanel(new GridLayout(6, 4, 5, 5));

        pnlDatos.add(new JLabel("Código:")); pnlDatos.add(txtCodigo = new JTextField());
        pnlDatos.add(new JLabel("Nombre:")); pnlDatos.add(txtNombre = new JTextField());
        pnlDatos.add(new JLabel("Duración en días:")); pnlDatos.add(txtDias = new JTextField());
        pnlDatos.add(new JLabel("Duración en noches:")); pnlDatos.add(txtNoches = new JTextField());
        pnlDatos.add(new JLabel("Tipo:")); pnlDatos.add(txtTipo = new JTextField());
        pnlDatos.add(new JLabel("Precio por persona:")); pnlDatos.add(txtPrecio = new JTextField());
        pnlDatos.add(new JLabel("Fecha de salida:")); pnlDatos.add(txtFechaSalida = new JTextField());
        pnlDatos.add(new JLabel("Fecha de retorno:")); pnlDatos.add(txtFechaRetorno = new JTextField());
        pnlDatos.add(new JLabel("Cupo máximo:")); pnlDatos.add(txtCupoMaximo = new JTextField());
        pnlDatos.add(new JLabel("Promoción:")); pnlDatos.add(cboPromocion = new JComboBox<>());
        pnlDatos.add(new JLabel("Estado:")); pnlDatos.add(cboEstado = new JComboBox<>(new String[]{"Activo", "Cancelado"}));
        pnlDatos.add(new JLabel("Formato fecha:")); pnlDatos.add(new JLabel("dd/mm/aaaa"));

        JPanel pnlBotones = new JPanel();
        JButton btnRegistrar = new JButton("Registrar");
        JButton btnBuscar = new JButton("Buscar");
        JButton btnActualizar = new JButton("Actualizar");
        JButton btnEliminar = new JButton("Eliminar");
        JButton btnLimpiar = new JButton("Limpiar");
        JButton btnRecargar = new JButton("Recargar promociones");

        btnRegistrar.addActionListener(e -> registrar());
        btnBuscar.addActionListener(e -> buscar());
        btnActualizar.addActionListener(e -> actualizar());
        btnEliminar.addActionListener(e -> eliminar());
        btnLimpiar.addActionListener(e -> limpiar());
        btnRecargar.addActionListener(e -> cargarPromociones());

        pnlBotones.add(btnRegistrar); pnlBotones.add(btnBuscar); pnlBotones.add(btnActualizar);
        pnlBotones.add(btnEliminar); pnlBotones.add(btnLimpiar); pnlBotones.add(btnRecargar);

        JPanel pnlSuperior = new JPanel(new BorderLayout());
        pnlSuperior.add(pnlDatos, BorderLayout.CENTER);
        pnlSuperior.add(pnlBotones, BorderLayout.SOUTH);
        add(pnlSuperior, BorderLayout.NORTH);

        modelo = new DefaultTableModel(new String[]{"Código", "Nombre", "Días", "Noches", "Tipo", "Precio", "Salida", "Retorno", "Cupo", "Disponible", "Estado", "Promoción"}, 0);
        tabla = new JTable(modelo);
        add(new JScrollPane(tabla), BorderLayout.CENTER);
    }

    // --- AQUÍ PEGA TODA TU LÓGICA (registrar, buscar, actualizar, eliminar, listar, limpiar, crearPaquete, validarCampos, etc.) ---
}