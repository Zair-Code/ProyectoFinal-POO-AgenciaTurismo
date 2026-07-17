/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import clases.DestinoTuristico;
import clases.ItinerarioDetallado;
import clases.PaqueteTuristico;
import clases.Promocion;
import clases.ServicioIncluido;
import gestion.SistemaAgencia;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;

/**
 * Formulario de la agencia de viajes.
 */
public class frmConfiguracionPaquete extends javax.swing.JFrame {

    private SistemaAgencia sistema;

    public frmConfiguracionPaquete(SistemaAgencia sistema) {
    
            this.sistema = sistema;
            initComponents();
            setLocationRelativeTo(null);
            cargarListas();
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSuperior = new javax.swing.JPanel();
        pnlDatos = new javax.swing.JPanel();
        lblPaquete = new javax.swing.JLabel();
        cboPaquete = new javax.swing.JComboBox();
        lblDestino = new javax.swing.JLabel();
        cboDestino = new javax.swing.JComboBox();
        lblItinerario = new javax.swing.JLabel();
        cboItinerario = new javax.swing.JComboBox();
        lblPromocion = new javax.swing.JLabel();
        cboPromocion = new javax.swing.JComboBox();
        lblTipoServicio = new javax.swing.JLabel();
        txtTipoServicio = new javax.swing.JTextField();
        lblDescripcionServicio = new javax.swing.JLabel();
        txtDescripcionServicio = new javax.swing.JTextField();
        lblCupoDisponible = new javax.swing.JLabel();
        txtCupoDisponible = new javax.swing.JTextField();
        pnlBotones = new javax.swing.JPanel();
        btnAgregarDestino = new javax.swing.JButton();
        btnAgregarItinerario = new javax.swing.JButton();
        btnAgregarServicio = new javax.swing.JButton();
        btnAsignarPromocion = new javax.swing.JButton();
        btnActualizarCupo = new javax.swing.JButton();
        btnCancelarPaquete = new javax.swing.JButton();
        btnReactivarPaquete = new javax.swing.JButton();
        btnRecargar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDetalle = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuración de Paquetes");
        setPreferredSize(new java.awt.Dimension(950, 620));
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));

        pnlSuperior.setLayout(new java.awt.BorderLayout(0, 5));

        pnlDatos.setLayout(new java.awt.GridLayout(7, 2, 5, 5));

        lblPaquete.setText("Paquete:");
        pnlDatos.add(lblPaquete);

        cboPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPaqueteActionPerformed(evt);
            }
        });
        pnlDatos.add(cboPaquete);

        lblDestino.setText("Destino:");
        pnlDatos.add(lblDestino);
        pnlDatos.add(cboDestino);

        lblItinerario.setText("Itinerario:");
        pnlDatos.add(lblItinerario);
        pnlDatos.add(cboItinerario);

        lblPromocion.setText("Promoción:");
        pnlDatos.add(lblPromocion);
        pnlDatos.add(cboPromocion);

        lblTipoServicio.setText("Tipo de servicio:");
        pnlDatos.add(lblTipoServicio);
        pnlDatos.add(txtTipoServicio);

        lblDescripcionServicio.setText("Descripción del servicio:");
        pnlDatos.add(lblDescripcionServicio);
        pnlDatos.add(txtDescripcionServicio);

        lblCupoDisponible.setText("Nuevo cupo disponible:");
        pnlDatos.add(lblCupoDisponible);
        pnlDatos.add(txtCupoDisponible);

        pnlSuperior.add(pnlDatos, java.awt.BorderLayout.CENTER);

        pnlBotones.setLayout(new java.awt.GridLayout(2, 4, 5, 5));

        btnAgregarDestino.setText("Agregar destino");
        btnAgregarDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDestinoActionPerformed(evt);
            }
        });
        pnlBotones.add(btnAgregarDestino);

        btnAgregarItinerario.setText("Agregar itinerario");
        btnAgregarItinerario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarItinerarioActionPerformed(evt);
            }
        });
        pnlBotones.add(btnAgregarItinerario);

        btnAgregarServicio.setText("Agregar servicio");
        btnAgregarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarServicioActionPerformed(evt);
            }
        });
        pnlBotones.add(btnAgregarServicio);

        btnAsignarPromocion.setText("Asignar promoción");
        btnAsignarPromocion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarPromocionActionPerformed(evt);
            }
        });
        pnlBotones.add(btnAsignarPromocion);

        btnActualizarCupo.setText("Actualizar cupo");
        btnActualizarCupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCupoActionPerformed(evt);
            }
        });
        pnlBotones.add(btnActualizarCupo);

        btnCancelarPaquete.setText("Cancelar paquete");
        btnCancelarPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPaqueteActionPerformed(evt);
            }
        });
        pnlBotones.add(btnCancelarPaquete);

        btnReactivarPaquete.setText("Reactivar paquete");
        btnReactivarPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReactivarPaqueteActionPerformed(evt);
            }
        });
        pnlBotones.add(btnReactivarPaquete);

        btnRecargar.setText("Recargar listas");
        btnRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarActionPerformed(evt);
            }
        });
        pnlBotones.add(btnRecargar);

        pnlSuperior.add(pnlBotones, java.awt.BorderLayout.SOUTH);

        getContentPane().add(pnlSuperior, java.awt.BorderLayout.NORTH);

        txtDetalle.setEditable(false);
        jScrollPane1.setViewportView(txtDetalle);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    private void cboPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPaqueteActionPerformed
        mostrarDetalle();
    }//GEN-LAST:event_cboPaqueteActionPerformed

    private void btnAgregarDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDestinoActionPerformed
        agregarDestino();
    }//GEN-LAST:event_btnAgregarDestinoActionPerformed

    private void btnAgregarItinerarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarItinerarioActionPerformed
        agregarItinerario();
    }//GEN-LAST:event_btnAgregarItinerarioActionPerformed

    private void btnAgregarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarServicioActionPerformed
        agregarServicio();
    }//GEN-LAST:event_btnAgregarServicioActionPerformed

    private void btnAsignarPromocionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarPromocionActionPerformed
        asignarPromocion();
    }//GEN-LAST:event_btnAsignarPromocionActionPerformed

    private void btnActualizarCupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCupoActionPerformed
        actualizarCupo();
    }//GEN-LAST:event_btnActualizarCupoActionPerformed

    private void btnCancelarPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPaqueteActionPerformed
        cancelarPaquete();
    }//GEN-LAST:event_btnCancelarPaqueteActionPerformed

    private void btnReactivarPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReactivarPaqueteActionPerformed
        reactivarPaquete();
    }//GEN-LAST:event_btnReactivarPaqueteActionPerformed

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed
        cargarListas();
    }//GEN-LAST:event_btnRecargarActionPerformed


    private PaqueteTuristico obtenerPaqueteSeleccionado() {

        String codigo = String.valueOf(cboPaquete.getSelectedItem());

        if (codigo.equals("null")) {
            return null;
        }

        return sistema.buscarPaquetePorCodigo(codigo);
    }

    private void cargarListas() {

        cboPaquete.removeAllItems();
        cboDestino.removeAllItems();
        cboItinerario.removeAllItems();
        cboPromocion.removeAllItems();

        PaqueteTuristico[] paquetes = sistema.getPaquetes();
        DestinoTuristico[] destinos = sistema.getDestinos();
        ItinerarioDetallado[] itinerarios = sistema.getItinerarios();
        Promocion[] promociones = sistema.getPromociones();

        for (int i = 0; i < sistema.getContPaquetes(); i++) {
            cboPaquete.addItem(paquetes[i].getCodigo());
        }

        for (int i = 0; i < sistema.getContDestinos(); i++) {
            cboDestino.addItem(destinos[i].getNombre());
        }

        for (int i = 0; i < sistema.getContItinerarios(); i++) {
            cboItinerario.addItem(
                    (i + 1) + " - Día " + itinerarios[i].getNumeroDia()
                            + ": " + itinerarios[i].getDescripcion()
            );
        }

        cboPromocion.addItem("Sin promoción");

        for (int i = 0; i < sistema.getContPromociones(); i++) {
            cboPromocion.addItem(promociones[i].getCodigo());
        }

        mostrarDetalle();
    }

    private void agregarDestino() {

        PaqueteTuristico paquete = obtenerPaqueteSeleccionado();

        if (paquete == null) {
            JOptionPane.showMessageDialog(this, "Seleccione un paquete.");
            return;
        }

        String nombreDestino = String.valueOf(cboDestino.getSelectedItem());
        DestinoTuristico destino = sistema.buscarDestinoPorNombre(nombreDestino);

        if (destino == null) {
            JOptionPane.showMessageDialog(this, "Seleccione un destino.");
            return;
        }

        if (paquete.agregarDestino(destino)) {
            JOptionPane.showMessageDialog(this, "Destino agregado al paquete.");
            mostrarDetalle();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo agregar el destino.");
        }
    }

    private void agregarItinerario() {

        PaqueteTuristico paquete = obtenerPaqueteSeleccionado();

        if (paquete == null) {
            JOptionPane.showMessageDialog(this, "Seleccione un paquete.");
            return;
        }

        int posicion = cboItinerario.getSelectedIndex();
        ItinerarioDetallado itinerario = sistema.buscarItinerarioPorPosicion(posicion);

        if (itinerario == null) {
            JOptionPane.showMessageDialog(this, "Seleccione un itinerario.");
            return;
        }

        if (paquete.agregarItinerario(itinerario)) {
            JOptionPane.showMessageDialog(this, "Itinerario agregado al paquete.");
            mostrarDetalle();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo agregar el itinerario.");
        }
    }

    private void agregarServicio() {

        PaqueteTuristico paquete = obtenerPaqueteSeleccionado();

        if (paquete == null) {
            JOptionPane.showMessageDialog(this, "Seleccione un paquete.");
            return;
        }

        if (txtTipoServicio.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el tipo de servicio.");
            return;
        }

        ServicioIncluido servicio = new ServicioIncluido(
                txtTipoServicio.getText(),
                txtDescripcionServicio.getText()
        );

        if (paquete.agregarServicio(servicio)) {
            JOptionPane.showMessageDialog(this, "Servicio agregado al paquete.");
            txtTipoServicio.setText("");
            txtDescripcionServicio.setText("");
            mostrarDetalle();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo agregar el servicio.");
        }
    }

    private void asignarPromocion() {

        PaqueteTuristico paquete = obtenerPaqueteSeleccionado();

        if (paquete == null) {
            JOptionPane.showMessageDialog(this, "Seleccione un paquete.");
            return;
        }

        String codigo = String.valueOf(cboPromocion.getSelectedItem());

        if (codigo.equals("Sin promoción")) {
            paquete.setPromocion(null);
            JOptionPane.showMessageDialog(this, "Promoción retirada del paquete.");
            mostrarDetalle();
            return;
        }

        Promocion promocion = sistema.buscarPromocionPorCodigo(codigo);
        paquete.setPromocion(promocion);
        JOptionPane.showMessageDialog(this, "Promoción asignada al paquete.");
        mostrarDetalle();
    }

    private void actualizarCupo() {

        PaqueteTuristico paquete = obtenerPaqueteSeleccionado();

        if (paquete == null) {
            JOptionPane.showMessageDialog(this, "Seleccione un paquete.");
            return;
        }

        try {
            int cupo = Integer.parseInt(txtCupoDisponible.getText());
            paquete.setCupoDisponible(cupo);
            JOptionPane.showMessageDialog(this, "Cupo disponible actualizado.");
            mostrarDetalle();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El cupo debe ser un número entero.");
        }
    }

    private void cancelarPaquete() {

        PaqueteTuristico paquete = obtenerPaqueteSeleccionado();

        if (paquete == null) {
            JOptionPane.showMessageDialog(this, "Seleccione un paquete.");
            return;
        }

        paquete.cancelarPaquete();
        JOptionPane.showMessageDialog(this, "Paquete cancelado.");
        mostrarDetalle();
    }

    private void reactivarPaquete() {

        PaqueteTuristico paquete = obtenerPaqueteSeleccionado();

        if (paquete == null) {
            JOptionPane.showMessageDialog(this, "Seleccione un paquete.");
            return;
        }

        paquete.reactivarPaquete();
        JOptionPane.showMessageDialog(this, "Paquete reactivado.");
        mostrarDetalle();
    }

    private void mostrarDetalle() {

        PaqueteTuristico paquete = obtenerPaqueteSeleccionado();

        if (paquete == null) {
            txtDetalle.setText("No hay paquetes registrados.");
            return;
        }

        String detalle = paquete.mostrarInformacion();
        detalle += "\n\nDESTINOS:\n" + paquete.mostrarDestinos();
        detalle += "\n\nSERVICIOS:\n" + paquete.mostrarServicios();
        detalle += "\n\nITINERARIO:\n" + paquete.mostrarItinerario();

        txtDetalle.setText(detalle);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCupo;
    private javax.swing.JButton btnAgregarDestino;
    private javax.swing.JButton btnAgregarItinerario;
    private javax.swing.JButton btnAgregarServicio;
    private javax.swing.JButton btnAsignarPromocion;
    private javax.swing.JButton btnCancelarPaquete;
    private javax.swing.JButton btnReactivarPaquete;
    private javax.swing.JButton btnRecargar;
    private javax.swing.JComboBox cboDestino;
    private javax.swing.JComboBox cboItinerario;
    private javax.swing.JComboBox cboPaquete;
    private javax.swing.JComboBox cboPromocion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCupoDisponible;
    private javax.swing.JLabel lblDescripcionServicio;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblItinerario;
    private javax.swing.JLabel lblPaquete;
    private javax.swing.JLabel lblPromocion;
    private javax.swing.JLabel lblTipoServicio;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlSuperior;
    private javax.swing.JTextField txtCupoDisponible;
    private javax.swing.JTextField txtDescripcionServicio;
    private javax.swing.JTextArea txtDetalle;
    private javax.swing.JTextField txtTipoServicio;
    // End of variables declaration//GEN-END:variables
}