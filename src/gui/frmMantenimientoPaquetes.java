/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import clases.PaqueteTuristico;
import clases.Promocion;
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
public class frmMantenimientoPaquetes extends javax.swing.JFrame {

    private SistemaAgencia sistema;
    private DefaultTableModel modelo;

    public frmMantenimientoPaquetes(SistemaAgencia sistema) {
    
            this.sistema = sistema;
            initComponents();
            cboEstado.addItem("Activo");
            cboEstado.addItem("Cancelado");
            modelo = (DefaultTableModel) tabla.getModel();
            setLocationRelativeTo(null);
            cargarPromociones();
            listar();
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSuperior = new javax.swing.JPanel();
        pnlDatos = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblDias = new javax.swing.JLabel();
        txtDias = new javax.swing.JTextField();
        lblNoches = new javax.swing.JLabel();
        txtNoches = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        lblFechaSalida = new javax.swing.JLabel();
        txtFechaSalida = new javax.swing.JTextField();
        lblFechaRetorno = new javax.swing.JLabel();
        txtFechaRetorno = new javax.swing.JTextField();
        lblCupoMaximo = new javax.swing.JLabel();
        txtCupoMaximo = new javax.swing.JTextField();
        lblPromocion = new javax.swing.JLabel();
        cboPromocion = new javax.swing.JComboBox<>();
        lblEstado = new javax.swing.JLabel();
        cboEstado = new javax.swing.JComboBox<>();
        lblFechasSugeridas = new javax.swing.JLabel();
        lblFormatoFecha = new javax.swing.JLabel();
        pnlBotones = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnRecargarPromociones = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mantenimiento de Paquetes Turísticos");
        setPreferredSize(new java.awt.Dimension(1150, 650));
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));

        pnlSuperior.setLayout(new java.awt.BorderLayout(0, 5));
        pnlDatos.setLayout(new java.awt.GridLayout(6, 4, 5, 5));
        lblCodigo.setText("Código:");
        pnlDatos.add(lblCodigo);
        pnlDatos.add(txtCodigo);
        lblNombre.setText("Nombre:");
        pnlDatos.add(lblNombre);
        pnlDatos.add(txtNombre);
        lblDias.setText("Duración en días:");
        pnlDatos.add(lblDias);
        pnlDatos.add(txtDias);
        lblNoches.setText("Duración en noches:");
        pnlDatos.add(lblNoches);
        pnlDatos.add(txtNoches);
        lblTipo.setText("Tipo:");
        pnlDatos.add(lblTipo);
        pnlDatos.add(txtTipo);
        lblPrecio.setText("Precio por persona:");
        pnlDatos.add(lblPrecio);
        pnlDatos.add(txtPrecio);
        lblFechaSalida.setText("Fecha de salida:");
        pnlDatos.add(lblFechaSalida);
        pnlDatos.add(txtFechaSalida);
        lblFechaRetorno.setText("Fecha de retorno:");
        pnlDatos.add(lblFechaRetorno);
        pnlDatos.add(txtFechaRetorno);
        lblCupoMaximo.setText("Cupo máximo:");
        pnlDatos.add(lblCupoMaximo);
        pnlDatos.add(txtCupoMaximo);
        lblPromocion.setText("Promoción:");
        pnlDatos.add(lblPromocion);
        pnlDatos.add(cboPromocion);
        lblEstado.setText("Estado:");
        pnlDatos.add(lblEstado);
        pnlDatos.add(cboEstado);
        lblFechasSugeridas.setText("Fechas sugeridas:");
        pnlDatos.add(lblFechasSugeridas);
        lblFormatoFecha.setText("dd/mm/aaaa");
        pnlDatos.add(lblFormatoFecha);
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
        btnRecargarPromociones.setText("Recargar promociones");
        btnRecargarPromociones.addActionListener(this::btnRecargarPromocionesActionPerformed);
        pnlBotones.add(btnRecargarPromociones);
        pnlSuperior.add(pnlBotones, java.awt.BorderLayout.SOUTH);
        getContentPane().add(pnlSuperior, java.awt.BorderLayout.NORTH);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"Código", "Nombre", "Días", "Noches", "Tipo", "Precio", "Salida", "Retorno", "Cupo", "Disponible", "Estado", "Promoción"}
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

    private void btnRecargarPromocionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarPromocionesActionPerformed
        cargarPromociones();
    }//GEN-LAST:event_btnRecargarPromocionesActionPerformed


    private int obtenerEntero(String texto, String campo) {

        try {
            return Integer.parseInt(texto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El campo " + campo + " debe ser entero.");
            return -1;
        }
    }

    private double obtenerDouble(String texto, String campo) {

        try {
            return Double.parseDouble(texto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El campo " + campo + " debe ser numérico.");
            return -1;
        }
    }

    private PaqueteTuristico crearPaquete() {

        int dias = obtenerEntero(txtDias.getText(), "días");
        int noches = obtenerEntero(txtNoches.getText(), "noches");
        double precio = obtenerDouble(txtPrecio.getText(), "precio");
        int cupo = obtenerEntero(txtCupoMaximo.getText(), "cupo máximo");

        PaqueteTuristico paquete = new PaqueteTuristico(
                txtCodigo.getText(),
                txtNombre.getText(),
                dias,
                noches,
                txtTipo.getText(),
                precio,
                txtFechaSalida.getText(),
                txtFechaRetorno.getText(),
                cupo
        );

        String codigoPromocion = String.valueOf(cboPromocion.getSelectedItem());

        if (!codigoPromocion.equals("Sin promoción")) {
            Promocion promocion = sistema.buscarPromocionPorCodigo(codigoPromocion);
            paquete.setPromocion(promocion);
        }

        String estado = String.valueOf(cboEstado.getSelectedItem());

        if (estado.equalsIgnoreCase("Cancelado")) {
            paquete.cancelarPaquete();
        }

        return paquete;
    }

    private boolean validarCampos() {

        if (txtCodigo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el código.");
            return false;
        }

        if (txtNombre.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el nombre.");
            return false;
        }

        int dias = obtenerEntero(txtDias.getText(), "días");
        int noches = obtenerEntero(txtNoches.getText(), "noches");
        double precio = obtenerDouble(txtPrecio.getText(), "precio");
        int cupo = obtenerEntero(txtCupoMaximo.getText(), "cupo máximo");

        if (dias <= 0) {
            return false;
        }

        if (noches < 0) {
            return false;
        }

        if (precio < 0) {
            return false;
        }

        if (cupo <= 0) {
            return false;
        }

        return true;
    }

    private void registrar() {

        if (!validarCampos()) {
            return;
        }

        PaqueteTuristico paquete = crearPaquete();

        if (sistema.registrarPaquete(paquete)) {
            JOptionPane.showMessageDialog(this, "Paquete registrado.");
            limpiar();
            listar();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo registrar. Revise el código.");
        }
    }

    private void buscar() {

        PaqueteTuristico paquete = sistema.buscarPaquetePorCodigo(txtCodigo.getText());

        if (paquete == null) {
            JOptionPane.showMessageDialog(this, "Paquete no encontrado.");
            return;
        }

        txtNombre.setText(paquete.getNombre());
        txtDias.setText(String.valueOf(paquete.getDuracionDias()));
        txtNoches.setText(String.valueOf(paquete.getDuracionNoches()));
        txtTipo.setText(paquete.getTipo());
        txtPrecio.setText(String.valueOf(paquete.getPrecioPersona()));
        txtFechaSalida.setText(paquete.getFechaSalida());
        txtFechaRetorno.setText(paquete.getFechaRetorno());
        txtCupoMaximo.setText(String.valueOf(paquete.getCupoMaximo()));
        cboEstado.setSelectedItem(paquete.getEstado());

        if (paquete.getPromocion() == null) {
            cboPromocion.setSelectedItem("Sin promoción");
        } else {
            cboPromocion.setSelectedItem(paquete.getPromocion().getCodigo());
        }

        txtCodigo.setEditable(false);
    }

    private void actualizar() {

        if (!validarCampos()) {
            return;
        }

        PaqueteTuristico actual = sistema.buscarPaquetePorCodigo(txtCodigo.getText());

        if (actual == null) {
            JOptionPane.showMessageDialog(this, "Paquete no encontrado.");
            return;
        }

        PaqueteTuristico nuevo = crearPaquete();
        sistema.actualizarPaquete(nuevo);

        actual.setNombre(nuevo.getNombre());
        actual.setDuracionDias(nuevo.getDuracionDias());
        actual.setDuracionNoches(nuevo.getDuracionNoches());
        actual.setTipo(nuevo.getTipo());
        actual.setPrecioPersona(nuevo.getPrecioPersona());
        actual.setFechaSalida(nuevo.getFechaSalida());
        actual.setFechaRetorno(nuevo.getFechaRetorno());
        actual.setCupoMaximo(nuevo.getCupoMaximo());
        actual.setPromocion(nuevo.getPromocion());

        String estado = String.valueOf(cboEstado.getSelectedItem());

        if (estado.equalsIgnoreCase("Cancelado")) {
            actual.cancelarPaquete();
        } else {
            actual.reactivarPaquete();
        }

        JOptionPane.showMessageDialog(this, "Paquete actualizado.");
        limpiar();
        listar();
    }

    private void eliminar() {

        if (sistema.eliminarPaquete(txtCodigo.getText())) {
            JOptionPane.showMessageDialog(this, "Paquete eliminado.");
            limpiar();
            listar();
        } else {
            JOptionPane.showMessageDialog(this, "Paquete no encontrado.");
        }
    }

    private void cargarPromociones() {

        cboPromocion.removeAllItems();
        cboPromocion.addItem("Sin promoción");

        Promocion[] promociones = sistema.getPromociones();

        for (int i = 0; i < sistema.getContPromociones(); i++) {
            cboPromocion.addItem(promociones[i].getCodigo());
        }
    }

    private void listar() {

        modelo.setRowCount(0);
        PaqueteTuristico[] paquetes = sistema.getPaquetes();

        for (int i = 0; i < sistema.getContPaquetes(); i++) {

            String promocion = "Sin promoción";

            if (paquetes[i].getPromocion() != null) {
                promocion = paquetes[i].getPromocion().getCodigo();
            }

            modelo.addRow(new Object[]{
                    paquetes[i].getCodigo(),
                    paquetes[i].getNombre(),
                    paquetes[i].getDuracionDias(),
                    paquetes[i].getDuracionNoches(),
                    paquetes[i].getTipo(),
                    paquetes[i].getPrecioPersona(),
                    paquetes[i].getFechaSalida(),
                    paquetes[i].getFechaRetorno(),
                    paquetes[i].getCupoMaximo(),
                    paquetes[i].getCupoDisponible(),
                    paquetes[i].getEstado(),
                    promocion
            });
        }
    }

    private void limpiar() {

        txtCodigo.setText("");
        txtNombre.setText("");
        txtDias.setText("");
        txtNoches.setText("");
        txtTipo.setText("");
        txtPrecio.setText("");
        txtFechaSalida.setText("");
        txtFechaRetorno.setText("");
        txtCupoMaximo.setText("");
        cboEstado.setSelectedIndex(0);
        cboPromocion.setSelectedIndex(0);
        txtCodigo.setEditable(true);
        txtCodigo.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRecargarPromociones;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JComboBox<String> cboPromocion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCupoMaximo;
    private javax.swing.JLabel lblDias;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFechaRetorno;
    private javax.swing.JLabel lblFechaSalida;
    private javax.swing.JLabel lblFechasSugeridas;
    private javax.swing.JLabel lblFormatoFecha;
    private javax.swing.JLabel lblNoches;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblPromocion;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlSuperior;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCupoMaximo;
    private javax.swing.JTextField txtDias;
    private javax.swing.JTextField txtFechaRetorno;
    private javax.swing.JTextField txtFechaSalida;
    private javax.swing.JTextField txtNoches;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}