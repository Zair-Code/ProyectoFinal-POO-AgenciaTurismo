/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import clases.Pago;
import clases.Reserva;
import gestion.SistemaAgencia;

import javax.swing.JButton;
import javax.swing.JComboBox;
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
public class frmMantenimientoPagos extends javax.swing.JFrame {

    private SistemaAgencia sistema;
    private DefaultTableModel modelo;

    public frmMantenimientoPagos(SistemaAgencia sistema) {
    
            this.sistema = sistema;
            initComponents();
            cboTipoPago.addItem("Adelanto");
            cboTipoPago.addItem("Pago parcial");
            cboTipoPago.addItem("Pago final");
            cboMetodoPago.addItem("Efectivo");
            cboMetodoPago.addItem("Tarjeta");
            cboMetodoPago.addItem("Transferencia");
            cboMetodoPago.addItem("Yape o Plin");
            modelo = (DefaultTableModel) tabla.getModel();
            setLocationRelativeTo(null);
            cargarReservas();
            listar();
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSuperior = new javax.swing.JPanel();
        pnlDatos = new javax.swing.JPanel();
        lblReserva = new javax.swing.JLabel();
        cboReserva = new javax.swing.JComboBox<>();
        lblCodigoPago = new javax.swing.JLabel();
        txtCodigoPago = new javax.swing.JTextField();
        lblFechaPago = new javax.swing.JLabel();
        txtFechaPago = new javax.swing.JTextField();
        lblMonto = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        lblTipoPago = new javax.swing.JLabel();
        cboTipoPago = new javax.swing.JComboBox<>();
        lblMetodoPago = new javax.swing.JLabel();
        cboMetodoPago = new javax.swing.JComboBox<>();
        pnlBotones = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnRecargar = new javax.swing.JButton();
        btnVerSaldo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mantenimiento de Pagos");
        setPreferredSize(new java.awt.Dimension(1000, 560));
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));

        pnlSuperior.setLayout(new java.awt.BorderLayout(0, 5));
        pnlDatos.setLayout(new java.awt.GridLayout(3, 4, 5, 5));
        lblReserva.setText("Reserva:");
        pnlDatos.add(lblReserva);
        pnlDatos.add(cboReserva);
        lblCodigoPago.setText("Código de pago:");
        pnlDatos.add(lblCodigoPago);
        pnlDatos.add(txtCodigoPago);
        lblFechaPago.setText("Fecha de pago:");
        pnlDatos.add(lblFechaPago);
        pnlDatos.add(txtFechaPago);
        lblMonto.setText("Monto:");
        pnlDatos.add(lblMonto);
        pnlDatos.add(txtMonto);
        lblTipoPago.setText("Tipo de pago:");
        pnlDatos.add(lblTipoPago);
        pnlDatos.add(cboTipoPago);
        lblMetodoPago.setText("Método de pago:");
        pnlDatos.add(lblMetodoPago);
        pnlDatos.add(cboMetodoPago);
        pnlSuperior.add(pnlDatos, java.awt.BorderLayout.CENTER);
        pnlBotones.setLayout(new java.awt.FlowLayout(1, 5, 5));
        btnRegistrar.setText("Registrar pago");
        btnRegistrar.addActionListener(this::btnRegistrarActionPerformed);
        pnlBotones.add(btnRegistrar);
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);
        pnlBotones.add(btnBuscar);
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(this::btnActualizarActionPerformed);
        pnlBotones.add(btnActualizar);
        btnEliminar.setText("Eliminar registro");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);
        pnlBotones.add(btnEliminar);
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);
        pnlBotones.add(btnLimpiar);
        btnRecargar.setText("Recargar reservas");
        btnRecargar.addActionListener(this::btnRecargarActionPerformed);
        pnlBotones.add(btnRecargar);
        btnVerSaldo.setText("Ver saldo");
        btnVerSaldo.addActionListener(this::btnVerSaldoActionPerformed);
        pnlBotones.add(btnVerSaldo);
        pnlSuperior.add(pnlBotones, java.awt.BorderLayout.SOUTH);
        getContentPane().add(pnlSuperior, java.awt.BorderLayout.NORTH);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"Código", "Fecha", "Monto", "Tipo", "Método"}
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

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed
        cargarReservas();
    }//GEN-LAST:event_btnRecargarActionPerformed

    private void btnVerSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerSaldoActionPerformed
        verSaldo();
    }//GEN-LAST:event_btnVerSaldoActionPerformed


    private void cargarReservas() {

        cboReserva.removeAllItems();
        Reserva[] reservas = sistema.getReservas();

        for (int i = 0; i < sistema.getContReservas(); i++) {
            cboReserva.addItem(reservas[i].getCodigoReserva());
        }
    }

    private Reserva obtenerReserva() {

        String codigo = String.valueOf(cboReserva.getSelectedItem());
        return sistema.buscarReservaPorCodigo(codigo);
    }

    private double obtenerMonto() {

        try {
            return Double.parseDouble(txtMonto.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El monto debe ser numérico.");
            return -1;
        }
    }

    private boolean validarCampos() {

        if (obtenerReserva() == null) {
            JOptionPane.showMessageDialog(this, "Seleccione una reserva.");
            return false;
        }

        if (txtCodigoPago.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el código de pago.");
            return false;
        }

        if (txtFechaPago.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese la fecha de pago.");
            return false;
        }

        double monto = obtenerMonto();

        if (monto <= 0) {
            JOptionPane.showMessageDialog(this, "El monto debe ser mayor que cero.");
            return false;
        }

        return true;
    }

    private Pago crearPago() {

        return new Pago(
                txtCodigoPago.getText(),
                txtFechaPago.getText(),
                obtenerMonto(),
                String.valueOf(cboTipoPago.getSelectedItem()),
                String.valueOf(cboMetodoPago.getSelectedItem())
        );
    }

    private void registrar() {

        if (!validarCampos()) {
            return;
        }

        if (sistema.buscarPagoPorCodigo(txtCodigoPago.getText()) != null) {
            JOptionPane.showMessageDialog(this, "El código de pago ya existe.");
            return;
        }

        Reserva reserva = obtenerReserva();
        Pago pago = crearPago();

        if (pago.getMonto() > reserva.calcularSaldoPendiente()) {
            JOptionPane.showMessageDialog(this, "El monto supera el saldo pendiente.");
            return;
        }

        if (!reserva.agregarPago(pago)) {
            JOptionPane.showMessageDialog(this, "No se pudo agregar el pago a la reserva.");
            return;
        }

        sistema.registrarPago(pago);

        JOptionPane.showMessageDialog(
                this,
                "Pago registrado.\nEstado de la reserva: " + reserva.getEstado()
                        + "\nSaldo pendiente: S/ " + reserva.calcularSaldoPendiente()
        );

        limpiar();
        listar();
    }

    private void buscar() {

        Pago pago = sistema.buscarPagoPorCodigo(txtCodigoPago.getText());

        if (pago == null) {
            JOptionPane.showMessageDialog(this, "Pago no encontrado.");
            return;
        }

        txtFechaPago.setText(pago.getFechaPago());
        txtMonto.setText(String.valueOf(pago.getMonto()));
        cboTipoPago.setSelectedItem(pago.getTipoPago());
        cboMetodoPago.setSelectedItem(pago.getMetodoPago());
        txtCodigoPago.setEditable(false);
    }

    private void actualizar() {

        Pago pago = sistema.buscarPagoPorCodigo(txtCodigoPago.getText());

        if (pago == null) {
            JOptionPane.showMessageDialog(this, "Pago no encontrado.");
            return;
        }

        double monto = obtenerMonto();

        if (monto <= 0) {
            return;
        }

        pago.setFechaPago(txtFechaPago.getText());
        pago.setMonto(monto);
        pago.setTipoPago(String.valueOf(cboTipoPago.getSelectedItem()));
        pago.setMetodoPago(String.valueOf(cboMetodoPago.getSelectedItem()));
        sistema.actualizarPago(pago);

        JOptionPane.showMessageDialog(this, "Registro de pago actualizado.");
        limpiar();
        listar();
    }

    private void eliminar() {

        if (sistema.eliminarPago(txtCodigoPago.getText())) {
            JOptionPane.showMessageDialog(
                    this,
                    "Pago eliminado del registro general. La reserva conserva el historial del pago."
            );
            limpiar();
            listar();
        } else {
            JOptionPane.showMessageDialog(this, "Pago no encontrado.");
        }
    }

    private void verSaldo() {

        Reserva reserva = obtenerReserva();

        if (reserva == null) {
            JOptionPane.showMessageDialog(this, "Seleccione una reserva.");
            return;
        }

        JOptionPane.showMessageDialog(
                this,
                "Total: S/ " + reserva.getPrecioTotal()
                        + "\nPagado: S/ " + reserva.calcularMontoPagado()
                        + "\nSaldo: S/ " + reserva.calcularSaldoPendiente()
                        + "\nEstado: " + reserva.getEstado()
        );
    }

    private void listar() {

        modelo.setRowCount(0);
        Pago[] pagos = sistema.getPagos();

        for (int i = 0; i < sistema.getContPagos(); i++) {
            modelo.addRow(new Object[]{
                    pagos[i].getCodigoPago(),
                    pagos[i].getFechaPago(),
                    pagos[i].getMonto(),
                    pagos[i].getTipoPago(),
                    pagos[i].getMetodoPago()
            });
        }
    }

    private void limpiar() {

        txtCodigoPago.setText("");
        txtFechaPago.setText("");
        txtMonto.setText("");
        cboTipoPago.setSelectedIndex(0);
        cboMetodoPago.setSelectedIndex(0);
        txtCodigoPago.setEditable(true);
        txtCodigoPago.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRecargar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVerSaldo;
    private javax.swing.JComboBox<String> cboMetodoPago;
    private javax.swing.JComboBox<String> cboReserva;
    private javax.swing.JComboBox<String> cboTipoPago;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigoPago;
    private javax.swing.JLabel lblFechaPago;
    private javax.swing.JLabel lblMetodoPago;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblReserva;
    private javax.swing.JLabel lblTipoPago;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlSuperior;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCodigoPago;
    private javax.swing.JTextField txtFechaPago;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}