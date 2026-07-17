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
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;

/**
 * Formulario de la agencia de viajes.
 */
public class frmPrincipal extends javax.swing.JFrame{

    private SistemaAgencia sistema;
    private Empleado usuarioLogueado;

    public frmPrincipal(SistemaAgencia sistema, Empleado empleado) {
    
            this.sistema = sistema;
            this.usuarioLogueado = empleado;
            initComponents();
            lblBienvenida.setText(
                    "  Bienvenido: " + usuarioLogueado.getNombres()
                            + " " + usuarioLogueado.getApellidos()
                            + " - Rol: " + usuarioLogueado.getRol()
            );
            crearMenu();
            setLocationRelativeTo(null);
            aplicarPermisos();
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBienvenida = new javax.swing.JLabel();
        pnlBotones = new javax.swing.JPanel();
        btnEmpleados = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnDestinos = new javax.swing.JButton();
        btnItinerarios = new javax.swing.JButton();
        btnPaquetes = new javax.swing.JButton();
        btnConfigurarPaquete = new javax.swing.JButton();
        btnPromociones = new javax.swing.JButton();
        btnReservas = new javax.swing.JButton();
        btnPagos = new javax.swing.JButton();
        btnFidelidad = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Agencia de Viajes");
        setPreferredSize(new java.awt.Dimension(900, 620));
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));

        lblBienvenida.setText("Bienvenido al sistema");
        getContentPane().add(lblBienvenida, java.awt.BorderLayout.NORTH);

        pnlBotones.setLayout(new java.awt.GridLayout(4, 3, 10, 10));
        btnEmpleados.setText("Empleados");
        btnEmpleados.addActionListener(this::btnEmpleadosActionPerformed);
        pnlBotones.add(btnEmpleados);
        btnClientes.setText("Clientes");
        btnClientes.addActionListener(this::btnClientesActionPerformed);
        pnlBotones.add(btnClientes);
        btnDestinos.setText("Destinos");
        btnDestinos.addActionListener(this::btnDestinosActionPerformed);
        pnlBotones.add(btnDestinos);
        btnItinerarios.setText("Itinerarios");
        btnItinerarios.addActionListener(this::btnItinerariosActionPerformed);
        pnlBotones.add(btnItinerarios);
        btnPaquetes.setText("Paquetes");
        btnPaquetes.addActionListener(this::btnPaquetesActionPerformed);
        pnlBotones.add(btnPaquetes);
        btnConfigurarPaquete.setText("Configurar Paquete");
        btnConfigurarPaquete.addActionListener(this::btnConfigurarPaqueteActionPerformed);
        pnlBotones.add(btnConfigurarPaquete);
        btnPromociones.setText("Promociones");
        btnPromociones.addActionListener(this::btnPromocionesActionPerformed);
        pnlBotones.add(btnPromociones);
        btnReservas.setText("Reservas");
        btnReservas.addActionListener(this::btnReservasActionPerformed);
        pnlBotones.add(btnReservas);
        btnPagos.setText("Pagos");
        btnPagos.addActionListener(this::btnPagosActionPerformed);
        pnlBotones.add(btnPagos);
        btnFidelidad.setText("Fidelidad");
        btnFidelidad.addActionListener(this::btnFidelidadActionPerformed);
        pnlBotones.add(btnFidelidad);
        btnReportes.setText("Reportes");
        btnReportes.addActionListener(this::btnReportesActionPerformed);
        pnlBotones.add(btnReportes);
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.addActionListener(this::btnCerrarSesionActionPerformed);
        pnlBotones.add(btnCerrarSesion);
        getContentPane().add(pnlBotones, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void itemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCerrarSesionActionPerformed
        cerrarSesion();
    }//GEN-LAST:event_itemCerrarSesionActionPerformed

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemSalirActionPerformed

    private void itemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemUsuarioActionPerformed
        mostrarUsuario();
    }//GEN-LAST:event_itemUsuarioActionPerformed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        new frmMantenimientoEmpleados(sistema).setVisible(true);
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        new frmMantenimientoClientes(sistema).setVisible(true);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnDestinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDestinosActionPerformed
        new frmMantenimientoDestinos(sistema).setVisible(true);
    }//GEN-LAST:event_btnDestinosActionPerformed

    private void btnItinerariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItinerariosActionPerformed
        new frmMantenimientoItinerarios(sistema).setVisible(true);
    }//GEN-LAST:event_btnItinerariosActionPerformed

    private void btnPaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaquetesActionPerformed
        new frmMantenimientoPaquetes(sistema).setVisible(true);
    }//GEN-LAST:event_btnPaquetesActionPerformed

    private void btnConfigurarPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigurarPaqueteActionPerformed
        new frmConfiguracionPaquete(sistema).setVisible(true);
    }//GEN-LAST:event_btnConfigurarPaqueteActionPerformed

    private void btnPromocionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromocionesActionPerformed
        new frmMantenimientoPromociones(sistema).setVisible(true);
    }//GEN-LAST:event_btnPromocionesActionPerformed

    private void btnReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservasActionPerformed
        new frmMantenimientoReservas(sistema).setVisible(true);
    }//GEN-LAST:event_btnReservasActionPerformed

    private void btnPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagosActionPerformed
        new frmMantenimientoPagos(sistema).setVisible(true);
    }//GEN-LAST:event_btnPagosActionPerformed

    private void btnFidelidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFidelidadActionPerformed
        new frmFidelidad(sistema).setVisible(true);
    }//GEN-LAST:event_btnFidelidadActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        new frmReportes(sistema).setVisible(true);
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        cerrarSesion();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed


    private void crearMenu() {

        JMenuBar barra = new JMenuBar();

        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem itemCerrarSesion = new JMenuItem("Cerrar sesión");
        JMenuItem itemSalir = new JMenuItem("Salir");

        menuArchivo.add(itemCerrarSesion);
        menuArchivo.add(itemSalir);

        JMenu menuAyuda = new JMenu("Ayuda");
        JMenuItem itemUsuario = new JMenuItem("Datos del usuario");
        menuAyuda.add(itemUsuario);

        barra.add(menuArchivo);
        barra.add(menuAyuda);
        setJMenuBar(barra);

        itemCerrarSesion.addActionListener(this::itemCerrarSesionActionPerformed);
        itemSalir.addActionListener(this::itemSalirActionPerformed);
        itemUsuario.addActionListener(this::itemUsuarioActionPerformed);
    }

    private void configurarEventos() {

        btnEmpleados.addActionListener(this::btnEmpleadosActionPerformed);

        btnClientes.addActionListener(this::btnClientesActionPerformed);

        btnDestinos.addActionListener(this::btnDestinosActionPerformed);

        btnItinerarios.addActionListener(this::btnItinerariosActionPerformed);

        btnPaquetes.addActionListener(this::btnPaquetesActionPerformed);

        btnConfigurarPaquete.addActionListener(this::btnConfigurarPaqueteActionPerformed);

        btnPromociones.addActionListener(this::btnPromocionesActionPerformed);

        btnReservas.addActionListener(this::btnReservasActionPerformed);

        btnPagos.addActionListener(this::btnPagosActionPerformed);

        btnFidelidad.addActionListener(this::btnFidelidadActionPerformed);

        btnReportes.addActionListener(this::btnReportesActionPerformed);

        btnCerrarSesion.addActionListener(this::btnCerrarSesionActionPerformed);
    }

    private void aplicarPermisos() {

        String rol = usuarioLogueado.getRol();

        if (rol.equalsIgnoreCase("Administrador")) {
            return;
        }

        if (rol.equalsIgnoreCase("Asesor de Viaje")) {
            btnEmpleados.setEnabled(false);
            btnDestinos.setEnabled(false);
            btnItinerarios.setEnabled(false);
            btnPaquetes.setEnabled(false);
            btnConfigurarPaquete.setEnabled(false);
            btnPromociones.setEnabled(false);
            return;
        }

        if (rol.equalsIgnoreCase("Operador")) {
            btnEmpleados.setEnabled(false);
            btnClientes.setEnabled(false);
            btnDestinos.setEnabled(false);
            btnPromociones.setEnabled(false);
            btnReservas.setEnabled(false);
            btnPagos.setEnabled(false);
            btnFidelidad.setEnabled(false);
        }
    }

    private void cerrarSesion() {

        frmLogin login = new frmLogin(sistema);
        login.setVisible(true);
        dispose();
    }

    private void mostrarUsuario() {

        javax.swing.JOptionPane.showMessageDialog(
                this,
                usuarioLogueado.mostrarInformacion()
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnConfigurarPaquete;
    private javax.swing.JButton btnDestinos;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnFidelidad;
    private javax.swing.JButton btnItinerarios;
    private javax.swing.JButton btnPagos;
    private javax.swing.JButton btnPaquetes;
    private javax.swing.JButton btnPromociones;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnReservas;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JPanel pnlBotones;
    // End of variables declaration//GEN-END:variables
}