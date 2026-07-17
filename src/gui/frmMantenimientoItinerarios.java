/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import clases.ItinerarioDetallado;
import gestion.SistemaAgencia;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.awt.GridLayout;

/**
 * Formulario de la agencia de viajes.
 */
public class frmMantenimientoItinerarios extends javax.swing.JFrame {

    private SistemaAgencia sistema;
    private DefaultTableModel modelo;

    public frmMantenimientoItinerarios(SistemaAgencia sistema) {
    
            this.sistema = sistema;
            initComponents();
            modelo = (DefaultTableModel) tabla.getModel();
            setLocationRelativeTo(null);
            listar();
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSuperior = new javax.swing.JPanel();
        pnlDatos = new javax.swing.JPanel();
        lblPosicion = new javax.swing.JLabel();
        txtPosicion = new javax.swing.JTextField();
        lblNumeroDia = new javax.swing.JLabel();
        txtNumeroDia = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        pnlBotones = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mantenimiento de Itinerarios");
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));

        pnlSuperior.setLayout(new java.awt.BorderLayout(0, 5));
        pnlDatos.setLayout(new java.awt.GridLayout(3, 2, 5, 5));
        lblPosicion.setText("Posición para buscar, actualizar o eliminar:");
        pnlDatos.add(lblPosicion);
        pnlDatos.add(txtPosicion);
        lblNumeroDia.setText("Número de día:");
        pnlDatos.add(lblNumeroDia);
        pnlDatos.add(txtNumeroDia);
        lblDescripcion.setText("Descripción:");
        pnlDatos.add(lblDescripcion);
        pnlDatos.add(txtDescripcion);
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
            new String [] {"Posición", "Número de día", "Descripción"}
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


    private int obtenerNumero(String texto, String nombreCampo) {

        try {
            return Integer.parseInt(texto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El campo " + nombreCampo + " debe ser numérico.");
            return -1;
        }
    }

    private void registrar() {

        int numeroDia = obtenerNumero(txtNumeroDia.getText(), "número de día");

        if (numeroDia <= 0) {
            return;
        }

        if (txtDescripcion.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese la descripción.");
            return;
        }

        ItinerarioDetallado itinerario = new ItinerarioDetallado(
                numeroDia,
                txtDescripcion.getText()
        );

        if (sistema.registrarItinerario(itinerario)) {
            JOptionPane.showMessageDialog(this, "Itinerario registrado.");
            limpiar();
            listar();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo registrar.");
        }
    }

    private void buscar() {

        int posicionVisible = obtenerNumero(txtPosicion.getText(), "posición");

        if (posicionVisible <= 0) {
            return;
        }

        ItinerarioDetallado itinerario = sistema.buscarItinerarioPorPosicion(posicionVisible - 1);

        if (itinerario == null) {
            JOptionPane.showMessageDialog(this, "Itinerario no encontrado.");
            return;
        }

        txtNumeroDia.setText(String.valueOf(itinerario.getNumeroDia()));
        txtDescripcion.setText(itinerario.getDescripcion());
    }

    private void actualizar() {

        int posicionVisible = obtenerNumero(txtPosicion.getText(), "posición");
        int numeroDia = obtenerNumero(txtNumeroDia.getText(), "número de día");

        if (posicionVisible <= 0) {
            return;
        }

        if (numeroDia <= 0) {
            return;
        }

        ItinerarioDetallado itinerario = new ItinerarioDetallado(
                numeroDia,
                txtDescripcion.getText()
        );

        if (sistema.actualizarItinerario(posicionVisible - 1, itinerario)) {
            JOptionPane.showMessageDialog(this, "Itinerario actualizado.");
            limpiar();
            listar();
        } else {
            JOptionPane.showMessageDialog(this, "Itinerario no encontrado.");
        }
    }

    private void eliminar() {

        int posicionVisible = obtenerNumero(txtPosicion.getText(), "posición");

        if (posicionVisible <= 0) {
            return;
        }

        if (sistema.eliminarItinerario(posicionVisible - 1)) {
            JOptionPane.showMessageDialog(this, "Itinerario eliminado.");
            limpiar();
            listar();
        } else {
            JOptionPane.showMessageDialog(this, "Itinerario no encontrado.");
        }
    }

    private void listar() {

        modelo.setRowCount(0);
        ItinerarioDetallado[] itinerarios = sistema.getItinerarios();

        for (int i = 0; i < sistema.getContItinerarios(); i++) {
            modelo.addRow(new Object[]{
                    i + 1,
                    itinerarios[i].getNumeroDia(),
                    itinerarios[i].getDescripcion()
            });
        }
    }

    private void limpiar() {

        txtPosicion.setText("");
        txtNumeroDia.setText("");
        txtDescripcion.setText("");
        txtNumeroDia.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblNumeroDia;
    private javax.swing.JLabel lblPosicion;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlSuperior;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNumeroDia;
    private javax.swing.JTextField txtPosicion;
    // End of variables declaration//GEN-END:variables
}