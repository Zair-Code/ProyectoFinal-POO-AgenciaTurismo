/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import clases.Promocion;
import gestion.SistemaAgencia;

import javax.swing.JButton;
import javax.swing.JCheckBox;
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
public class frmMantenimientoPromociones extends javax.swing.JFrame {

    private SistemaAgencia sistema;
    private DefaultTableModel modelo;

    public frmMantenimientoPromociones(SistemaAgencia sistema) {
    
            this.sistema = sistema;
            initComponents();
            cboTipoDescuento.addItem("Porcentaje");
            cboTipoDescuento.addItem("Monto fijo");
            modelo = (DefaultTableModel) tabla.getModel();
            setLocationRelativeTo(null);
            listar();
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSuperior = new javax.swing.JPanel();
        pnlDatos = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        lblTipoDescuento = new javax.swing.JLabel();
        cboTipoDescuento = new javax.swing.JComboBox<>();
        lblValorDescuento = new javax.swing.JLabel();
        txtValorDescuento = new javax.swing.JTextField();
        lblFechaInicio = new javax.swing.JLabel();
        txtFechaInicio = new javax.swing.JTextField();
        lblFechaFin = new javax.swing.JLabel();
        txtFechaFin = new javax.swing.JTextField();
        lblActiva = new javax.swing.JLabel();
        chkActiva = new javax.swing.JCheckBox();
        lblFormatoFecha = new javax.swing.JLabel();
        lblFechaEjemplo = new javax.swing.JLabel();
        pnlBotones = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mantenimiento de Promociones");
        setPreferredSize(new java.awt.Dimension(1000, 560));
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));

        pnlSuperior.setLayout(new java.awt.BorderLayout(0, 5));
        pnlDatos.setLayout(new java.awt.GridLayout(4, 4, 5, 5));
        lblCodigo.setText("Código:");
        pnlDatos.add(lblCodigo);
        pnlDatos.add(txtCodigo);
        lblDescripcion.setText("Descripción:");
        pnlDatos.add(lblDescripcion);
        pnlDatos.add(txtDescripcion);
        lblTipoDescuento.setText("Tipo de descuento:");
        pnlDatos.add(lblTipoDescuento);
        pnlDatos.add(cboTipoDescuento);
        lblValorDescuento.setText("Valor del descuento:");
        pnlDatos.add(lblValorDescuento);
        pnlDatos.add(txtValorDescuento);
        lblFechaInicio.setText("Fecha de inicio:");
        pnlDatos.add(lblFechaInicio);
        pnlDatos.add(txtFechaInicio);
        lblFechaFin.setText("Fecha de fin:");
        pnlDatos.add(lblFechaFin);
        pnlDatos.add(txtFechaFin);
        lblActiva.setText("Promoción activa:");
        pnlDatos.add(lblActiva);
        chkActiva.setText("Sí");
        pnlDatos.add(chkActiva);
        lblFormatoFecha.setText("Formato sugerido de fecha:");
        pnlDatos.add(lblFormatoFecha);
        lblFechaEjemplo.setText("dd/mm/aaaa");
        pnlDatos.add(lblFechaEjemplo);
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
            new String [] {"Código", "Descripción", "Tipo", "Valor", "Inicio", "Fin", "Estado"}
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


    private double obtenerValor() {

        try {
            return Double.parseDouble(txtValorDescuento.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El valor del descuento debe ser numérico.");
            return -1;
        }
    }

    private Promocion crearPromocion() {

        Promocion promocion = new Promocion(
                txtCodigo.getText(),
                txtDescripcion.getText(),
                String.valueOf(cboTipoDescuento.getSelectedItem()),
                obtenerValor(),
                txtFechaInicio.getText(),
                txtFechaFin.getText()
        );

        promocion.setActiva(chkActiva.isSelected());
        return promocion;
    }

    private boolean validarCampos() {

        if (txtCodigo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el código.");
            return false;
        }

        if (txtDescripcion.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese la descripción.");
            return false;
        }

        double valor = obtenerValor();

        if (valor < 0) {
            return false;
        }

        return true;
    }

    private void registrar() {

        if (!validarCampos()) {
            return;
        }

        Promocion promocion = crearPromocion();

        if (sistema.registrarPromocion(promocion)) {
            JOptionPane.showMessageDialog(this, "Promoción registrada.");
            limpiar();
            listar();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo registrar. Revise el código.");
        }
    }

    private void buscar() {

        Promocion promocion = sistema.buscarPromocionPorCodigo(txtCodigo.getText());

        if (promocion == null) {
            JOptionPane.showMessageDialog(this, "Promoción no encontrada.");
            return;
        }

        txtDescripcion.setText(promocion.getDescripcion());
        cboTipoDescuento.setSelectedItem(promocion.getTipoDescuento());
        txtValorDescuento.setText(String.valueOf(promocion.getValorDescuento()));
        txtFechaInicio.setText(promocion.getFechaInicio());
        txtFechaFin.setText(promocion.getFechaFin());
        chkActiva.setSelected(promocion.isActiva());
        txtCodigo.setEditable(false);
    }

    private void actualizar() {

        if (!validarCampos()) {
            return;
        }

        Promocion promocionNueva = crearPromocion();
        Promocion promocionActual = sistema.buscarPromocionPorCodigo(txtCodigo.getText());

        if (promocionActual == null) {
            JOptionPane.showMessageDialog(this, "Promoción no encontrada.");
            return;
        }

        sistema.actualizarPromocion(promocionNueva);

        promocionActual.setDescripcion(promocionNueva.getDescripcion());
        promocionActual.setTipoDescuento(promocionNueva.getTipoDescuento());
        promocionActual.setValorDescuento(promocionNueva.getValorDescuento());
        promocionActual.setFechaInicio(promocionNueva.getFechaInicio());
        promocionActual.setFechaFin(promocionNueva.getFechaFin());
        promocionActual.setActiva(promocionNueva.isActiva());

        JOptionPane.showMessageDialog(this, "Promoción actualizada.");
        limpiar();
        listar();
    }

    private void eliminar() {

        if (sistema.eliminarPromocion(txtCodigo.getText())) {
            JOptionPane.showMessageDialog(this, "Promoción eliminada.");
            limpiar();
            listar();
        } else {
            JOptionPane.showMessageDialog(this, "Promoción no encontrada.");
        }
    }

    private void listar() {

        modelo.setRowCount(0);
        Promocion[] promociones = sistema.getPromociones();

        for (int i = 0; i < sistema.getContPromociones(); i++) {

            String estado = "Inactiva";

            if (promociones[i].isActiva()) {
                estado = "Activa";
            }

            modelo.addRow(new Object[]{
                    promociones[i].getCodigo(),
                    promociones[i].getDescripcion(),
                    promociones[i].getTipoDescuento(),
                    promociones[i].getValorDescuento(),
                    promociones[i].getFechaInicio(),
                    promociones[i].getFechaFin(),
                    estado
            });
        }
    }

    private void limpiar() {

        txtCodigo.setText("");
        txtDescripcion.setText("");
        cboTipoDescuento.setSelectedIndex(0);
        txtValorDescuento.setText("");
        txtFechaInicio.setText("");
        txtFechaFin.setText("");
        chkActiva.setSelected(true);
        txtCodigo.setEditable(true);
        txtCodigo.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cboTipoDescuento;
    private javax.swing.JCheckBox chkActiva;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblActiva;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblFechaEjemplo;
    private javax.swing.JLabel lblFechaFin;
    private javax.swing.JLabel lblFechaInicio;
    private javax.swing.JLabel lblFormatoFecha;
    private javax.swing.JLabel lblTipoDescuento;
    private javax.swing.JLabel lblValorDescuento;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlSuperior;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFechaFin;
    private javax.swing.JTextField txtFechaInicio;
    private javax.swing.JTextField txtValorDescuento;
    // End of variables declaration//GEN-END:variables
}