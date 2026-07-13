/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import clases.Empleado;
import gestion.SistemaAgencia;
import javax.swing.*;

public class frmLogin extends JFrame {
    private SistemaAgencia sistema;
    private JTextField txtUsuario;
    private JPasswordField txtContrasena;
    private JButton btnIngresar, btnSalir;

    public frmLogin(SistemaAgencia sistema) {
        this.sistema = sistema;
        configurarVentana();
    }

    private void configurarVentana() {
        setTitle("Ingreso al sistema");
        setSize(420, 280);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblTitulo = new JLabel("AGENCIA DE VIAJES");
        lblTitulo.setBounds(135, 25, 200, 30);
        add(lblTitulo);

        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setBounds(65, 85, 100, 25);
        add(lblUsuario);

        txtUsuario = new JTextField();
        txtUsuario.setBounds(160, 85, 180, 25);
        add(txtUsuario);

        JLabel lblContrasena = new JLabel("Contraseña:");
        lblContrasena.setBounds(65, 125, 100, 25);
        add(lblContrasena);

        txtContrasena = new JPasswordField();
        txtContrasena.setBounds(160, 125, 180, 25);
        add(txtContrasena);

        btnIngresar = new JButton("Ingresar");
        btnIngresar.setBounds(90, 185, 110, 30);
        btnIngresar.addActionListener(e -> ingresar());
        add(btnIngresar);

        btnSalir = new JButton("Salir");
        btnSalir.setBounds(220, 185, 110, 30);
        btnSalir.addActionListener(e -> System.exit(0));
        add(btnSalir);

        getRootPane().setDefaultButton(btnIngresar);
    }

    // --- PEGA AQUÍ TU MÉTODO DE LÓGICA (ingresar) ---
}