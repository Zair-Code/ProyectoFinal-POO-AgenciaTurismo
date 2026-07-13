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

public class frmMantenimientoEmpleados extends JFrame {

    private SistemaAgencia sistema;
    private JTextField txtDni, txtNombres, txtApellidos, txtUsuario;
    private JPasswordField txtContrasena;
    private JComboBox<String> cboRol;
    private DefaultTableModel modelo;
    private JTable tabla;

    public frmMantenimientoEmpleados(SistemaAgencia sistema) {
        this.sistema = sistema;
        configurarVentana();
        listar();
    }

    private void configurarVentana() {
        setTitle("Mantenimiento de Empleados");
        setSize(900, 560);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JPanel pnlDatos = new JPanel(new GridLayout(6, 2, 5, 5));
        pnlDatos.add(new JLabel("DNI:")); pnlDatos.add(txtDni = new JTextField());
        pnlDatos.add(new JLabel("Nombres:")); pnlDatos.add(txtNombres = new JTextField());
        pnlDatos.add(new JLabel("Apellidos:")); pnlDatos.add(txtApellidos = new JTextField());
        pnlDatos.add(new JLabel("Usuario:")); pnlDatos.add(txtUsuario = new JTextField());
        pnlDatos.add(new JLabel("Contraseña:")); pnlDatos.add(txtContrasena = new JPasswordField());
        pnlDatos.add(new JLabel("Rol:")); pnlDatos.add(cboRol = new JComboBox<>(new String[]{"Administrador", "Asesor de Viaje", "Operador"}));

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

        modelo = new DefaultTableModel(new String[]{"DNI", "Nombres", "Apellidos", "Usuario", "Rol"}, 0);
        tabla = new JTable(modelo);
        add(new JScrollPane(tabla), BorderLayout.CENTER);
    }

    // --- PEGA AQUÍ TUS MÉTODOS DE LÓGICA (crearEmpleado, validarCampos, registrar, buscar, actualizar, eliminar, listar, limpiar) ---
}