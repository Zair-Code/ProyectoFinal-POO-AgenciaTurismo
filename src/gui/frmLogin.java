/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import clases.Empleado;
import gestion.SistemaAgencia;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 * Formulario de la agencia de viajes.
 */
public class frmLogin extends javax.swing.JFrame{

    private SistemaAgencia sistema;

    public frmLogin(SistemaAgencia sistema) {
    
            this.sistema = sistema;
            initComponents();
            getRootPane().setDefaultButton(btnIngresar);
            setLocationRelativeTo(null);
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        pnlCentro = new javax.swing.JPanel();
        pnlDatos = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblContrasena = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();
        pnlBotones = new javax.swing.JPanel();
        btnIngresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingreso al sistema");
        setPreferredSize(new java.awt.Dimension(420, 280));
        setResizable(false);
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));

        pnlTitulo.setLayout(new java.awt.FlowLayout(1, 5, 15));
        lblTitulo.setText("AGENCIA DE VIAJES");
        pnlTitulo.add(lblTitulo);
        getContentPane().add(pnlTitulo, java.awt.BorderLayout.NORTH);

        pnlCentro.setLayout(new java.awt.BorderLayout(0, 10));
        pnlDatos.setLayout(new java.awt.GridLayout(2, 2, 8, 8));
        lblUsuario.setText("Usuario:");
        pnlDatos.add(lblUsuario);
        pnlDatos.add(txtUsuario);
        lblContrasena.setText("Contraseña:");
        pnlDatos.add(lblContrasena);
        pnlDatos.add(txtContrasena);
        pnlCentro.add(pnlDatos, java.awt.BorderLayout.CENTER);
        pnlBotones.setLayout(new java.awt.FlowLayout(1, 10, 5));
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(this::btnIngresarActionPerformed);
        pnlBotones.add(btnIngresar);
        btnSalir.setText("Salir");
        btnSalir.addActionListener(this::btnSalirActionPerformed);
        pnlBotones.add(btnSalir);
        pnlCentro.add(pnlBotones, java.awt.BorderLayout.SOUTH);
        getContentPane().add(pnlCentro, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        ingresar();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed


    private void ingresar() {

        String usuario = txtUsuario.getText();
        String contrasena = String.valueOf(txtContrasena.getPassword());

        if (usuario.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el usuario.");
            return;
        }

        if (contrasena.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese la contraseña.");
            return;
        }

        Empleado empleado = sistema.validarLogin(usuario, contrasena);

        if (empleado == null) {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.");
            return;
        }

        frmPrincipal principal = new frmPrincipal(sistema, empleado);
        principal.setVisible(true);
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}