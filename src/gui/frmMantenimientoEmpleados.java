/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import clases.Administrador;
import clases.AsesorViajes;
import clases.Empleado;
import clases.Operador;
import gestion.SistemaAgencia;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.awt.GridLayout;

/**
 * Formulario de la agencia de viajes.
 */
public class frmMantenimientoEmpleados extends javax.swing.JFrame {

    private SistemaAgencia sistema;
    private DefaultTableModel modelo;

    public frmMantenimientoEmpleados(SistemaAgencia sistema) {
    
            this.sistema = sistema;
            initComponents();
            cboRol.addItem("Administrador");
            cboRol.addItem("Asesor de Viaje");
            cboRol.addItem("Operador");
            modelo = (DefaultTableModel) tabla.getModel();
            setLocationRelativeTo(null);
            listar();
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSuperior = new javax.swing.JPanel();
        pnlDatos = new javax.swing.JPanel();
        lblDni = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        lblNombres = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        lblApellidos = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblContrasena = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();
        lblRol = new javax.swing.JLabel();
        cboRol = new javax.swing.JComboBox<>();
        pnlBotones = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mantenimiento de Empleados");
        setPreferredSize(new java.awt.Dimension(900, 560));
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));

        pnlSuperior.setLayout(new java.awt.BorderLayout(0, 5));
        pnlDatos.setLayout(new java.awt.GridLayout(6, 2, 5, 5));
        lblDni.setText("DNI:");
        pnlDatos.add(lblDni);
        pnlDatos.add(txtDni);
        lblNombres.setText("Nombres:");
        pnlDatos.add(lblNombres);
        pnlDatos.add(txtNombres);
        lblApellidos.setText("Apellidos:");
        pnlDatos.add(lblApellidos);
        pnlDatos.add(txtApellidos);
        lblUsuario.setText("Usuario:");
        pnlDatos.add(lblUsuario);
        pnlDatos.add(txtUsuario);
        lblContrasena.setText("Contraseña:");
        pnlDatos.add(lblContrasena);
        pnlDatos.add(txtContrasena);
        lblRol.setText("Rol:");
        pnlDatos.add(lblRol);
        pnlDatos.add(cboRol);
        pnlSuperior.add(pnlDatos, java.awt.BorderLayout.CENTER);
        pnlBotones.setLayout(new java.awt.FlowLayout(1, 5, 5));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(this::btnRegistrarActionPerformed);
        pnlBotones.add(btnRegistrar);
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);
        pnlBotones.add(btnBuscar);
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(this::btnActualizarActionPerformed);
        pnlBotones.add(btnActualizar);
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);
        pnlBotones.add(btnEliminar);
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);
        pnlBotones.add(btnLimpiar);
        pnlSuperior.add(pnlBotones, java.awt.BorderLayout.SOUTH);
        getContentPane().add(pnlSuperior, java.awt.BorderLayout.NORTH);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"DNI", "Nombres", "Apellidos", "Usuario", "Rol"}
        ));
        jScrollPane1.setViewportView(tabla);
        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        registrar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed


    private Empleado crearEmpleado() {

        String dni = txtDni.getText();
        String nombres = txtNombres.getText();
        String apellidos = txtApellidos.getText();
        String usuario = txtUsuario.getText();
        String contrasena = String.valueOf(txtContrasena.getPassword());
        String rol = String.valueOf(cboRol.getSelectedItem());

        if (rol.equalsIgnoreCase("Administrador")) {
            return new Administrador(dni, nombres, apellidos, usuario, contrasena);
        }

        if (rol.equalsIgnoreCase("Asesor de Viaje")) {
            return new AsesorViajes(dni, nombres, apellidos, usuario, contrasena);
        }

        return new Operador(dni, nombres, apellidos, usuario, contrasena);
    }

    private boolean validarCampos() {

        if (txtDni.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el DNI.");
            return false;
        }

        if (txtNombres.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese los nombres.");
            return false;
        }

        if (txtApellidos.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese los apellidos.");
            return false;
        }

        if (txtUsuario.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el usuario.");
            return false;
        }

        if (String.valueOf(txtContrasena.getPassword()).trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese la contraseña.");
            return false;
        }

        return true;
    }

    private void registrar() {

        if (!validarCampos()) {
            return;
        }

        Empleado empleado = crearEmpleado();

        if (sistema.registrarEmpleado(empleado)) {
            JOptionPane.showMessageDialog(this, "Empleado registrado.");
            limpiar();
            listar();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo registrar. Revise el DNI.");
        }
    }

    private void buscar() {

        Empleado empleado = sistema.buscarEmpleadoPorDni(txtDni.getText());

        if (empleado == null) {
            JOptionPane.showMessageDialog(this, "Empleado no encontrado.");
            return;
        }

        txtNombres.setText(empleado.getNombres());
        txtApellidos.setText(empleado.getApellidos());
        txtUsuario.setText(empleado.getUsuario());
        txtContrasena.setText(empleado.getContraseña());
        cboRol.setSelectedItem(empleado.getRol());
        cboRol.setEnabled(false);
        txtDni.setEditable(false);
    }

    private void actualizar() {

        if (!validarCampos()) {
            return;
        }

        Empleado empleado = crearEmpleado();

        if (sistema.actualizarEmpleado(empleado)) {
            JOptionPane.showMessageDialog(this, "Empleado actualizado.");
            limpiar();
            listar();
        } else {
            JOptionPane.showMessageDialog(this, "Empleado no encontrado.");
        }
    }

    private void eliminar() {

        String dni = txtDni.getText();

        if (dni.equals("00000000")) {
            JOptionPane.showMessageDialog(this, "No se puede eliminar el administrador inicial.");
            return;
        }

        if (sistema.eliminarEmpleado(dni)) {
            JOptionPane.showMessageDialog(this, "Empleado eliminado.");
            limpiar();
            listar();
        } else {
            JOptionPane.showMessageDialog(this, "Empleado no encontrado.");
        }
    }

    private void listar() {

        modelo.setRowCount(0);

        Empleado[] empleados = sistema.getEmpleados();

        for (int i = 0; i < sistema.getContEmpleados(); i++) {
            modelo.addRow(new Object[]{
                    empleados[i].getDni(),
                    empleados[i].getNombres(),
                    empleados[i].getApellidos(),
                    empleados[i].getUsuario(),
                    empleados[i].getRol()
            });
        }
    }

    private void limpiar() {

        txtDni.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtUsuario.setText("");
        txtContrasena.setText("");
        cboRol.setSelectedIndex(0);
        cboRol.setEnabled(true);
        txtDni.setEditable(true);
        txtDni.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cboRol;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlSuperior;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}