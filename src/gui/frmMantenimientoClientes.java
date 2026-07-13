/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import clases.Cliente;
import gestion.SistemaAgencia;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class frmMantenimientoClientes extends JFrame {
    private SistemaAgencia sistema;
    private JTextField txtDni, txtNombres, txtApellidos, txtTipoDocumento, txtFechaNacimiento, txtNacionalidad, txtTelefono, txtCorreo;
    private DefaultTableModel modelo;
    private JTable tabla;

    public frmMantenimientoClientes(SistemaAgencia sistema) {
        this.sistema = sistema;
        configurarVentana();
        listar();
    }

    private void configurarVentana() {
        setTitle("Mantenimiento de Clientes");
        setSize(1050, 600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JPanel pnlDatos = new JPanel(new GridLayout(4, 4, 5, 5));
        pnlDatos.add(new JLabel("DNI:")); pnlDatos.add(txtDni = new JTextField());
        pnlDatos.add(new JLabel("Nombres:")); pnlDatos.add(txtNombres = new JTextField());
        pnlDatos.add(new JLabel("Apellidos:")); pnlDatos.add(txtApellidos = new JTextField());
        pnlDatos.add(new JLabel("Tipo de documento:")); pnlDatos.add(txtTipoDocumento = new JTextField());
        pnlDatos.add(new JLabel("Fecha de nacimiento:")); pnlDatos.add(txtFechaNacimiento = new JTextField());
        pnlDatos.add(new JLabel("Nacionalidad:")); pnlDatos.add(txtNacionalidad = new JTextField());
        pnlDatos.add(new JLabel("Teléfono:")); pnlDatos.add(txtTelefono = new JTextField());
        pnlDatos.add(new JLabel("Correo:")); pnlDatos.add(txtCorreo = new JTextField());

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

        modelo = new DefaultTableModel(new String[]{"DNI", "Nombres", "Apellidos", "Documento", "Nacionalidad", "Teléfono", "Correo", "Puntos", "Nivel"}, 0);
        tabla = new JTable(modelo);
        add(new JScrollPane(tabla), BorderLayout.CENTER);
    }

    // --- PEGA AQUÍ TUS MÉTODOS DE LÓGICA (crearCliente, validarCampos, registrar, buscar, actualizar, eliminar, listar, limpiar) ---
}
