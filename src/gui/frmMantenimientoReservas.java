/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import clases.AsesorViajes;
import clases.Cliente;
import clases.Empleado;
import clases.PaqueteTuristico;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.awt.GridLayout;

/**
 * Formulario de la agencia de viajes.
 */
public class frmMantenimientoReservas extends javax.swing.JFrame {

    private SistemaAgencia sistema;
    private DefaultTableModel modelo;

    public frmMantenimientoReservas(SistemaAgencia sistema) {
    
            this.sistema = sistema;
            initComponents();
            modelo = (DefaultTableModel) tabla.getModel();
            setLocationRelativeTo(null);
            cargarListas();
            listar();
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSuperior = new javax.swing.JPanel();
        pnlDatos = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        lblPaquete = new javax.swing.JLabel();
        cboPaquete = new javax.swing.JComboBox<>();
        lblAsesor = new javax.swing.JLabel();
        cboAsesor = new javax.swing.JComboBox<>();
        lblAdultos = new javax.swing.JLabel();
        txtAdultos = new javax.swing.JTextField();
        lblMenores = new javax.swing.JLabel();
        txtMenores = new javax.swing.JTextField();
        lblDescuentoMenor = new javax.swing.JLabel();
        txtDescuentoMenor = new javax.swing.JTextField();
        lblPagoMinimo = new javax.swing.JLabel();
        txtPagoMinimo = new javax.swing.JTextField();
        lblCliente = new javax.swing.JLabel();
        cboCliente = new javax.swing.JComboBox<>();
        btnAgregarCliente = new javax.swing.JButton();
        btnRecargar = new javax.swing.JButton();
        pnlBotones = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnDescuento = new javax.swing.JButton();
        btnVoucher = new javax.swing.JButton();
        btnDetalle = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mantenimiento de Reservas");
        setPreferredSize(new java.awt.Dimension(1200, 670));
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));

        pnlSuperior.setLayout(new java.awt.BorderLayout(0, 5));
        pnlDatos.setLayout(new java.awt.GridLayout(5, 4, 5, 5));
        lblCodigo.setText("Código de reserva:");
        pnlDatos.add(lblCodigo);
        pnlDatos.add(txtCodigo);
        lblFecha.setText("Fecha de reserva:");
        pnlDatos.add(lblFecha);
        pnlDatos.add(txtFecha);
        lblPaquete.setText("Paquete:");
        pnlDatos.add(lblPaquete);
        pnlDatos.add(cboPaquete);
        lblAsesor.setText("Asesor (DNI):");
        pnlDatos.add(lblAsesor);
        pnlDatos.add(cboAsesor);
        lblAdultos.setText("Cantidad de adultos:");
        pnlDatos.add(lblAdultos);
        pnlDatos.add(txtAdultos);
        lblMenores.setText("Cantidad de menores:");
        pnlDatos.add(lblMenores);
        pnlDatos.add(txtMenores);
        lblDescuentoMenor.setText("Descuento a menores (%):");
        pnlDatos.add(lblDescuentoMenor);
        txtDescuentoMenor.setText("20");
        pnlDatos.add(txtDescuentoMenor);
        lblPagoMinimo.setText("Pago mínimo (%):");
        pnlDatos.add(lblPagoMinimo);
        txtPagoMinimo.setText("30");
        pnlDatos.add(txtPagoMinimo);
        lblCliente.setText("Cliente para agregar:");
        pnlDatos.add(lblCliente);
        pnlDatos.add(cboCliente);
        btnAgregarCliente.setText("Agregar cliente a reserva");
        btnAgregarCliente.addActionListener(this::btnAgregarClienteActionPerformed);
        pnlDatos.add(btnAgregarCliente);
        btnRecargar.setText("Recargar listas");
        btnRecargar.addActionListener(this::btnRecargarActionPerformed);
        pnlDatos.add(btnRecargar);
        pnlSuperior.add(pnlDatos, java.awt.BorderLayout.CENTER);
        pnlBotones.setLayout(new java.awt.GridLayout(2, 5, 5, 5));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(this::btnRegistrarActionPerformed);
        pnlBotones.add(btnRegistrar);
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);
        pnlBotones.add(btnBuscar);
        btnActualizar.setText("Actualizar fecha");
        btnActualizar.addActionListener(this::btnActualizarActionPerformed);
        pnlBotones.add(btnActualizar);
        btnCancelar.setText("Cancelar reserva");
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);
        pnlBotones.add(btnCancelar);
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);
        pnlBotones.add(btnEliminar);
        btnDescuento.setText("Aplicar fidelidad");
        btnDescuento.addActionListener(this::btnDescuentoActionPerformed);
        pnlBotones.add(btnDescuento);
        btnVoucher.setText("Ver voucher");
        btnVoucher.addActionListener(this::btnVoucherActionPerformed);
        pnlBotones.add(btnVoucher);
        btnDetalle.setText("Ver detalle");
        btnDetalle.addActionListener(this::btnDetalleActionPerformed);
        pnlBotones.add(btnDetalle);
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);
        pnlBotones.add(btnLimpiar);
        btnListar.setText("Actualizar tabla");
        btnListar.addActionListener(this::btnListarActionPerformed);
        pnlBotones.add(btnListar);
        pnlSuperior.add(pnlBotones, java.awt.BorderLayout.SOUTH);
        getContentPane().add(pnlSuperior, java.awt.BorderLayout.NORTH);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"Código", "Fecha", "Paquete", "Asesor", "Adultos", "Menores", "Total", "Pagado", "Saldo", "Estado", "Nivel fidelidad"}
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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        cancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        agregarCliente();
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void btnDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescuentoActionPerformed
        aplicarDescuento();
    }//GEN-LAST:event_btnDescuentoActionPerformed

    private void btnVoucherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoucherActionPerformed
        mostrarVoucher();
    }//GEN-LAST:event_btnVoucherActionPerformed

    private void btnDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalleActionPerformed
        mostrarDetalle();
    }//GEN-LAST:event_btnDetalleActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed
        cargarListas();
    }//GEN-LAST:event_btnRecargarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        listar();
    }//GEN-LAST:event_btnListarActionPerformed


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

    private void cargarListas() {

        cboPaquete.removeAllItems();
        cboAsesor.removeAllItems();
        cboCliente.removeAllItems();

        PaqueteTuristico[] paquetes = sistema.getPaquetes();
        Empleado[] empleados = sistema.getEmpleados();
        Cliente[] clientes = sistema.getClientes();

        for (int i = 0; i < sistema.getContPaquetes(); i++) {
            cboPaquete.addItem(paquetes[i].getCodigo());
        }

        for (int i = 0; i < sistema.getContEmpleados(); i++) {
            if (empleados[i] instanceof AsesorViajes) {
                cboAsesor.addItem(empleados[i].getDni());
            }
        }

        for (int i = 0; i < sistema.getContClientes(); i++) {
            cboCliente.addItem(clientes[i]);
        }
    }

    private AsesorViajes obtenerAsesor() {

        String dni = String.valueOf(cboAsesor.getSelectedItem());
        Empleado empleado = sistema.buscarEmpleadoPorDni(dni);

        if (empleado instanceof AsesorViajes) {
            return (AsesorViajes) empleado;
        }

        return null;
    }

    private PaqueteTuristico obtenerPaquete() {

        String codigo = String.valueOf(cboPaquete.getSelectedItem());
        return sistema.buscarPaquetePorCodigo(codigo);
    }

    private boolean validarCampos() {

        if (txtCodigo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el código de reserva.");
            return false;
        }

        if (txtFecha.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese la fecha de reserva.");
            return false;
        }

        if (obtenerPaquete() == null) {
            JOptionPane.showMessageDialog(this, "Debe registrar y seleccionar un paquete.");
            return false;
        }

        if (obtenerAsesor() == null) {
            JOptionPane.showMessageDialog(this, "Debe registrar y seleccionar un asesor.");
            return false;
        }

        int adultos = obtenerEntero(txtAdultos.getText(), "adultos");
        int menores = obtenerEntero(txtMenores.getText(), "menores");
        double descuento = obtenerDouble(txtDescuentoMenor.getText(), "descuento de menores");
        double pagoMinimo = obtenerDouble(txtPagoMinimo.getText(), "pago mínimo");

        if (adultos < 0) {
            return false;
        }

        if (menores < 0) {
            return false;
        }

        if (adultos + menores <= 0) {
            JOptionPane.showMessageDialog(this, "Debe existir al menos un pasajero.");
            return false;
        }

        if (descuento < 0) {
            return false;
        }

        if (descuento > 100) {
            JOptionPane.showMessageDialog(this, "El descuento debe estar entre 0 y 100.");
            return false;
        }

        if (pagoMinimo < 0) {
            return false;
        }

        if (pagoMinimo > 100) {
            JOptionPane.showMessageDialog(this, "El pago mínimo debe estar entre 0 y 100.");
            return false;
        }

        return true;
    }

    private void registrar() {

        if (!validarCampos()) {
            return;
        }

        if (sistema.buscarReservaPorCodigo(txtCodigo.getText()) != null) {
            JOptionPane.showMessageDialog(this, "El código de reserva ya existe.");
            return;
        }

        Reserva reserva = new Reserva(
                txtCodigo.getText(),
                txtFecha.getText(),
                obtenerPaquete(),
                obtenerAsesor(),
                obtenerEntero(txtAdultos.getText(), "adultos"),
                obtenerEntero(txtMenores.getText(), "menores"),
                obtenerDouble(txtDescuentoMenor.getText(), "descuento de menores"),
                obtenerDouble(txtPagoMinimo.getText(), "pago mínimo")
        );

        if (reserva.getEstado().equalsIgnoreCase("Sin cupo")) {
            JOptionPane.showMessageDialog(this, "El paquete no tiene cupos suficientes.");
            return;
        }

        if (reserva.getEstado().equalsIgnoreCase("Inválida")) {
            JOptionPane.showMessageDialog(this, "Los datos de la reserva no son válidos.");
            return;
        }

        if (sistema.registrarReserva(reserva)) {
            JOptionPane.showMessageDialog(this, "Reserva registrada. Ahora agregue los clientes.");
            listar();
        } else {
            reserva.cancelarReserva();
            JOptionPane.showMessageDialog(this, "No se pudo registrar la reserva.");
        }
    }

    private void buscar() {

        Reserva reserva = sistema.buscarReservaPorCodigo(txtCodigo.getText());

        if (reserva == null) {
            JOptionPane.showMessageDialog(this, "Reserva no encontrada.");
            return;
        }

        txtFecha.setText(reserva.getFechaReserva());
        cboPaquete.setSelectedItem(reserva.getPaquete().getCodigo());
        cboAsesor.setSelectedItem(reserva.getAsesor().getDni());
        txtAdultos.setText(String.valueOf(reserva.getCantidadAdultos()));
        txtMenores.setText(String.valueOf(reserva.getCantidadMenores()));
        txtDescuentoMenor.setText(String.valueOf(reserva.getPorcentajeDescuentoMenor()));
        txtPagoMinimo.setText(String.valueOf(reserva.getPorcentajePagoMinimo()));
        txtCodigo.setEditable(false);
    }

    private void actualizar() {

        Reserva reserva = sistema.buscarReservaPorCodigo(txtCodigo.getText());

        if (reserva == null) {
            JOptionPane.showMessageDialog(this, "Reserva no encontrada.");
            return;
        }

        reserva.setFechaReserva(txtFecha.getText());
        sistema.actualizarReserva(reserva);

        JOptionPane.showMessageDialog(this, "Fecha de reserva actualizada.");
        listar();
    }

    private void cancelar() {

        Reserva reserva = sistema.buscarReservaPorCodigo(txtCodigo.getText());

        if (reserva == null) {
            JOptionPane.showMessageDialog(this, "Reserva no encontrada.");
            return;
        }

        if (reserva.cancelarReserva()) {
            JOptionPane.showMessageDialog(this, "Reserva cancelada y cupos devueltos.");
            listar();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo cancelar la reserva.");
        }
    }

    private void eliminar() {

        Reserva reserva = sistema.buscarReservaPorCodigo(txtCodigo.getText());

        if (reserva == null) {
            JOptionPane.showMessageDialog(this, "Reserva no encontrada.");
            return;
        }

        if (!reserva.getEstado().equalsIgnoreCase("Cancelada")) {
            reserva.cancelarReserva();
        }

        if (sistema.eliminarReserva(txtCodigo.getText())) {
            JOptionPane.showMessageDialog(this, "Reserva eliminada.");
            limpiar();
            listar();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo eliminar la reserva.");
        }
    }

    private void agregarCliente() {

        Reserva reserva = sistema.buscarReservaPorCodigo(txtCodigo.getText());

        if (reserva == null) {
            JOptionPane.showMessageDialog(this, "Primero busque o registre una reserva.");
            return;
        }

        Cliente cliente = (Cliente) cboCliente.getSelectedItem();

        if (cliente == null) {
            JOptionPane.showMessageDialog(this, "Seleccione un cliente.");
            return;
        }

        if (reserva.agregarCliente(cliente)) {
            JOptionPane.showMessageDialog(this, "Cliente agregado a la reserva.");
            listar();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo agregar el cliente. Puede estar repetido o ya se completó la cantidad de pasajeros.");
        }
    }

    private void aplicarDescuento() {

        Reserva reserva = sistema.buscarReservaPorCodigo(txtCodigo.getText());

        if (reserva == null) {
            JOptionPane.showMessageDialog(this, "Reserva no encontrada.");
            return;
        }

        if (reserva.aplicarDescuentoFidelidad()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Descuento aplicado.\nNivel: " + reserva.getNivelFidelidadAplicado()
                            + "\nDescuento: S/ " + reserva.getDescuentoFidelidadAplicado()
            );
            listar();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo aplicar el descuento. El cliente puede estar en nivel Bronce o el descuento ya fue usado.");
        }
    }

    private void mostrarVoucher() {

        Reserva reserva = sistema.buscarReservaPorCodigo(txtCodigo.getText());

        if (reserva == null) {
            JOptionPane.showMessageDialog(this, "Reserva no encontrada.");
            return;
        }

        mostrarTexto("Voucher", reserva.generarVoucher());
    }

    private void mostrarDetalle() {

        Reserva reserva = sistema.buscarReservaPorCodigo(txtCodigo.getText());

        if (reserva == null) {
            JOptionPane.showMessageDialog(this, "Reserva no encontrada.");
            return;
        }

        mostrarTexto("Detalle de la reserva", reserva.mostrarInformacion());
    }

    private void mostrarTexto(String titulo, String texto) {

        JTextArea area = new JTextArea(texto, 24, 55);
        area.setEditable(false);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);

        JOptionPane.showMessageDialog(
                this,
                new JScrollPane(area),
                titulo,
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    private void listar() {

        modelo.setRowCount(0);
        Reserva[] reservas = sistema.getReservas();

        for (int i = 0; i < sistema.getContReservas(); i++) {

            String nivel = "No aplicado";

            if (reservas[i].getNivelFidelidadAplicado() != null) {
                nivel = reservas[i].getNivelFidelidadAplicado();
            }

            modelo.addRow(new Object[]{
                    reservas[i].getCodigoReserva(),
                    reservas[i].getFechaReserva(),
                    reservas[i].getPaquete().getNombre(),
                    reservas[i].getAsesor().getNombres(),
                    reservas[i].getCantidadAdultos(),
                    reservas[i].getCantidadMenores(),
                    reservas[i].getPrecioTotal(),
                    reservas[i].calcularMontoPagado(),
                    reservas[i].calcularSaldoPendiente(),
                    reservas[i].getEstado(),
                    nivel
            });
        }
    }

    private void limpiar() {

        txtCodigo.setText("");
        txtFecha.setText("");
        txtAdultos.setText("");
        txtMenores.setText("");
        txtDescuentoMenor.setText("20");
        txtPagoMinimo.setText("30");
        txtCodigo.setEditable(true);
        txtCodigo.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDescuento;
    private javax.swing.JButton btnDetalle;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnRecargar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVoucher;
    private javax.swing.JComboBox<String> cboAsesor;
    private javax.swing.JComboBox<Cliente> cboCliente;
    private javax.swing.JComboBox<String> cboPaquete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdultos;
    private javax.swing.JLabel lblAsesor;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescuentoMenor;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblMenores;
    private javax.swing.JLabel lblPagoMinimo;
    private javax.swing.JLabel lblPaquete;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlSuperior;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtAdultos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescuentoMenor;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMenores;
    private javax.swing.JTextField txtPagoMinimo;
    // End of variables declaration//GEN-END:variables
}