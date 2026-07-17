/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import clases.Cliente;
import clases.DestinoTuristico;
import clases.PaqueteTuristico;
import clases.Reserva;
import gestion.SistemaAgencia;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.BorderLayout;

/**
 * Formulario de la agencia de viajes.
 */
public class frmReportes extends javax.swing.JFrame {

    private SistemaAgencia sistema;

    public frmReportes(SistemaAgencia sistema) {
    
            this.sistema = sistema;
            initComponents();
            setLocationRelativeTo(null);
            reporteResumen();
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBotones = new javax.swing.JPanel();
        btnResumen = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnDestinos = new javax.swing.JButton();
        btnPaquetes = new javax.swing.JButton();
        btnReservas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReporte = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reportes del Sistema");
        setPreferredSize(new java.awt.Dimension(850, 600));
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));

        pnlBotones.setLayout(new java.awt.FlowLayout(1, 5, 5));
        btnResumen.setText("Resumen general");
        btnResumen.addActionListener(this::btnResumenActionPerformed);
        pnlBotones.add(btnResumen);
        btnClientes.setText("Clientes");
        btnClientes.addActionListener(this::btnClientesActionPerformed);
        pnlBotones.add(btnClientes);
        btnDestinos.setText("Destinos");
        btnDestinos.addActionListener(this::btnDestinosActionPerformed);
        pnlBotones.add(btnDestinos);
        btnPaquetes.setText("Paquetes");
        btnPaquetes.addActionListener(this::btnPaquetesActionPerformed);
        pnlBotones.add(btnPaquetes);
        btnReservas.setText("Reservas");
        btnReservas.addActionListener(this::btnReservasActionPerformed);
        pnlBotones.add(btnReservas);
        getContentPane().add(pnlBotones, java.awt.BorderLayout.NORTH);

        txtReporte.setEditable(false);
        jScrollPane1.setViewportView(txtReporte);
        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumenActionPerformed
        reporteResumen();
    }//GEN-LAST:event_btnResumenActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        reporteClientes();
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnDestinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDestinosActionPerformed
        reporteDestinos();
    }//GEN-LAST:event_btnDestinosActionPerformed

    private void btnPaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaquetesActionPerformed
        reportePaquetes();
    }//GEN-LAST:event_btnPaquetesActionPerformed

    private void btnReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservasActionPerformed
        reporteReservas();
    }//GEN-LAST:event_btnReservasActionPerformed


    private void reporteResumen() {

        double totalVentas = 0;
        double totalPagado = 0;

        Reserva[] reservas = sistema.getReservas();

        for (int i = 0; i < sistema.getContReservas(); i++) {
            totalVentas = totalVentas + reservas[i].getPrecioTotal();
            totalPagado = totalPagado + reservas[i].calcularMontoPagado();
        }

        String reporte = "RESUMEN GENERAL\n\n";
        reporte += "Empleados registrados: " + sistema.getContEmpleados() + "\n";
        reporte += "Clientes registrados: " + sistema.getContClientes() + "\n";
        reporte += "Destinos registrados: " + sistema.getContDestinos() + "\n";
        reporte += "Itinerarios registrados: " + sistema.getContItinerarios() + "\n";
        reporte += "Paquetes registrados: " + sistema.getContPaquetes() + "\n";
        reporte += "Promociones registradas: " + sistema.getContPromociones() + "\n";
        reporte += "Reservas registradas: " + sistema.getContReservas() + "\n";
        reporte += "Pagos registrados: " + sistema.getContPagos() + "\n\n";
        reporte += "Valor total de reservas: S/ " + totalVentas + "\n";
        reporte += "Monto total pagado: S/ " + totalPagado + "\n";
        reporte += "Saldo total pendiente: S/ " + (totalVentas - totalPagado) + "\n";

        txtReporte.setText(reporte);
    }

    private void reporteClientes() {

        String reporte = "REPORTE DE CLIENTES\n\n";
        Cliente[] clientes = sistema.getClientes();

        for (int i = 0; i < sistema.getContClientes(); i++) {
            reporte += (i + 1) + ". "
                    + clientes[i].getNombres() + " " + clientes[i].getApellidos()
                    + " | DNI: " + clientes[i].getDni()
                    + " | Puntos: " + clientes[i].getPuntosFidelidad()
                    + " | Nivel: " + clientes[i].getNivelFidelidad().getNombreNivel()
                    + "\n";
        }

        txtReporte.setText(reporte);
    }

    private void reporteDestinos() {

        String reporte = "REPORTE DE DESTINOS\n\n";
        DestinoTuristico[] destinos = sistema.getDestinos();

        for (int i = 0; i < sistema.getContDestinos(); i++) {
            reporte += (i + 1) + ". "
                    + destinos[i].getNombre()
                    + " | " + destinos[i].getCiudad()
                    + " | " + destinos[i].getPais()
                    + " | Clima: " + destinos[i].getClima()
                    + "\n";
        }

        txtReporte.setText(reporte);
    }

    private void reportePaquetes() {

        String reporte = "REPORTE DE PAQUETES\n\n";
        PaqueteTuristico[] paquetes = sistema.getPaquetes();

        for (int i = 0; i < sistema.getContPaquetes(); i++) {
            reporte += (i + 1) + ". "
                    + paquetes[i].getCodigo() + " - " + paquetes[i].getNombre()
                    + " | Precio: S/ " + paquetes[i].getPrecioPersona()
                    + " | Cupo: " + paquetes[i].getCupoDisponible()
                    + "/" + paquetes[i].getCupoMaximo()
                    + " | Estado: " + paquetes[i].getEstado()
                    + "\n";
        }

        txtReporte.setText(reporte);
    }

    private void reporteReservas() {

        String reporte = "REPORTE DE RESERVAS\n\n";
        Reserva[] reservas = sistema.getReservas();

        for (int i = 0; i < sistema.getContReservas(); i++) {
            reporte += (i + 1) + ". "
                    + reservas[i].getCodigoReserva()
                    + " | Paquete: " + reservas[i].getPaquete().getNombre()
                    + " | Total: S/ " + reservas[i].getPrecioTotal()
                    + " | Pagado: S/ " + reservas[i].calcularMontoPagado()
                    + " | Estado: " + reservas[i].getEstado()
                    + "\n";
        }

        txtReporte.setText(reporte);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnDestinos;
    private javax.swing.JButton btnPaquetes;
    private javax.swing.JButton btnReservas;
    private javax.swing.JButton btnResumen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JTextArea txtReporte;
    // End of variables declaration//GEN-END:variables
}