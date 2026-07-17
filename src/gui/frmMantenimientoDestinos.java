/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import clases.DestinoTuristico;
import gestion.SistemaAgencia;

import javax.swing.ImageIcon;
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
import java.awt.Image;
import java.awt.GridLayout;
import java.io.File;

/**
 * Formulario de la agencia de viajes.
 */
public class frmMantenimientoDestinos extends javax.swing.JFrame{

    private SistemaAgencia sistema;
    private DefaultTableModel modelo;

    public frmMantenimientoDestinos(SistemaAgencia sistema) {
    
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
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblPais = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        lblCiudad = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        lblClima = new javax.swing.JLabel();
        txtClima = new javax.swing.JTextField();
        lblIdioma = new javax.swing.JLabel();
        txtIdioma = new javax.swing.JTextField();
        lblRutaImagen = new javax.swing.JLabel();
        txtRutaImagen = new javax.swing.JTextField();
        btnVerImagen = new javax.swing.JButton();
        lblEjemploRuta = new javax.swing.JLabel();
        pnlBotones = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mantenimiento de Destinos");
        setPreferredSize(new java.awt.Dimension(1000, 590));
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));

        pnlSuperior.setLayout(new java.awt.BorderLayout(0, 5));
        pnlDatos.setLayout(new java.awt.GridLayout(4, 4, 5, 5));
        lblNombre.setText("Nombre:");
        pnlDatos.add(lblNombre);
        pnlDatos.add(txtNombre);
        lblPais.setText("País:");
        pnlDatos.add(lblPais);
        pnlDatos.add(txtPais);
        lblCiudad.setText("Ciudad:");
        pnlDatos.add(lblCiudad);
        pnlDatos.add(txtCiudad);
        lblDescripcion.setText("Descripción:");
        pnlDatos.add(lblDescripcion);
        pnlDatos.add(txtDescripcion);
        lblClima.setText("Clima:");
        pnlDatos.add(lblClima);
        pnlDatos.add(txtClima);
        lblIdioma.setText("Idioma:");
        pnlDatos.add(lblIdioma);
        pnlDatos.add(txtIdioma);
        lblRutaImagen.setText("Ruta de imagen:");
        pnlDatos.add(lblRutaImagen);
        pnlDatos.add(txtRutaImagen);
        btnVerImagen.setText("Ver imagen");
        btnVerImagen.addActionListener(this::btnVerImagenActionPerformed);
        pnlDatos.add(btnVerImagen);
        lblEjemploRuta.setText("Ejemplo: imagenes/machupicchu.jpg");
        pnlDatos.add(lblEjemploRuta);
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
            new String [] {"Nombre", "País", "Ciudad", "Clima", "Idioma", "Ruta imagen"}
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

    private void btnVerImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerImagenActionPerformed
        verImagen();
    }//GEN-LAST:event_btnVerImagenActionPerformed


    private DestinoTuristico crearDestino() {

        return new DestinoTuristico(
                txtNombre.getText(),
                txtPais.getText(),
                txtCiudad.getText(),
                txtDescripcion.getText(),
                txtClima.getText(),
                txtIdioma.getText(),
                txtRutaImagen.getText()
        );
    }

    private boolean validarCampos() {

        if (txtNombre.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el nombre del destino.");
            return false;
        }

        if (txtPais.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el país.");
            return false;
        }

        return true;
    }

    private void registrar() {

        if (!validarCampos()) {
            return;
        }

        DestinoTuristico destino = crearDestino();

        if (sistema.registrarDestino(destino)) {
            JOptionPane.showMessageDialog(this, "Destino registrado.");
            limpiar();
            listar();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo registrar. Revise el nombre.");
        }
    }

    private void buscar() {

        DestinoTuristico destino = sistema.buscarDestinoPorNombre(txtNombre.getText());

        if (destino == null) {
            JOptionPane.showMessageDialog(this, "Destino no encontrado.");
            return;
        }

        txtPais.setText(destino.getPais());
        txtCiudad.setText(destino.getCiudad());
        txtDescripcion.setText(destino.getDescripcion());
        txtClima.setText(destino.getClima());
        txtIdioma.setText(destino.getIdiomaPrincipal());
        txtRutaImagen.setText(destino.getRutaImagen());
        txtNombre.setEditable(false);
    }

    private void actualizar() {

        if (!validarCampos()) {
            return;
        }

        DestinoTuristico destino = crearDestino();

        if (sistema.actualizarDestino(destino)) {

            DestinoTuristico encontrado = sistema.buscarDestinoPorNombre(destino.getNombre());

            if (encontrado != null) {
                encontrado.setRutaImagen(destino.getRutaImagen());
            }

            JOptionPane.showMessageDialog(this, "Destino actualizado.");
            limpiar();
            listar();
        } else {
            JOptionPane.showMessageDialog(this, "Destino no encontrado.");
        }
    }

    private void eliminar() {

        if (sistema.eliminarDestino(txtNombre.getText())) {
            JOptionPane.showMessageDialog(this, "Destino eliminado.");
            limpiar();
            listar();
        } else {
            JOptionPane.showMessageDialog(this, "Destino no encontrado.");
        }
    }

    private void verImagen() {

        String ruta = txtRutaImagen.getText();
        File archivo = new File(ruta);

        if (!archivo.exists()) {
            JOptionPane.showMessageDialog(this, "La imagen no existe en esa ruta.");
            return;
        }

        ImageIcon icono = new ImageIcon(ruta);
        Image imagen = icono.getImage().getScaledInstance(500, 300, Image.SCALE_SMOOTH);
        JLabel etiqueta = new JLabel(new ImageIcon(imagen));

        JOptionPane.showMessageDialog(this, etiqueta, "Imagen del destino", JOptionPane.PLAIN_MESSAGE);
    }

    private void listar() {

        modelo.setRowCount(0);
        DestinoTuristico[] destinos = sistema.getDestinos();

        for (int i = 0; i < sistema.getContDestinos(); i++) {
            modelo.addRow(new Object[]{
                    destinos[i].getNombre(),
                    destinos[i].getPais(),
                    destinos[i].getCiudad(),
                    destinos[i].getClima(),
                    destinos[i].getIdiomaPrincipal(),
                    destinos[i].getRutaImagen()
            });
        }
    }

    private void limpiar() {

        txtNombre.setText("");
        txtPais.setText("");
        txtCiudad.setText("");
        txtDescripcion.setText("");
        txtClima.setText("");
        txtIdioma.setText("");
        txtRutaImagen.setText("");
        txtNombre.setEditable(true);
        txtNombre.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVerImagen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblClima;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblEjemploRuta;
    private javax.swing.JLabel lblIdioma;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblRutaImagen;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlSuperior;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtClima;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtIdioma;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtRutaImagen;
    // End of variables declaration//GEN-END:variables
}