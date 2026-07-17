/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import clases.Cliente;
import clases.NivelFidelidad;
import gestion.SistemaAgencia;

import javax.swing.JButton;
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

/**
 * Formulario de la agencia de viajes.
 */
public class frmFidelidad extends javax.swing.JFrame {

    private SistemaAgencia sistema;
    private DefaultTableModel modelo;

    public frmFidelidad(SistemaAgencia sistema) {
    
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
        lblDni = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnBeneficios = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtReglas = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Programa de Fidelidad");
        setPreferredSize(new java.awt.Dimension(850, 520));
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));

        pnlSuperior.setLayout(new java.awt.FlowLayout(1, 5, 5));
        lblDni.setText("DNI del cliente:");
        pnlSuperior.add(lblDni);
        txtDni.setColumns(15);
        pnlSuperior.add(txtDni);
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);
        pnlSuperior.add(btnBuscar);
        btnBeneficios.setText("Ver beneficios");
        btnBeneficios.addActionListener(this::btnBeneficiosActionPerformed);
        pnlSuperior.add(btnBeneficios);
        btnActualizar.setText("Actualizar tabla");
        btnActualizar.addActionListener(this::btnActualizarActionPerformed);
        pnlSuperior.add(btnActualizar);
        getContentPane().add(pnlSuperior, java.awt.BorderLayout.NORTH);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"DNI", "Cliente", "Puntos", "Nivel", "Descuento"}
        ));
        jScrollPane1.setViewportView(tabla);
        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        txtReglas.setEditable(false);
        txtReglas.setText("REGLAS DEL PROGRAMA\\n1 punto por cada S/ 10 pagados.\\nBronce: desde 0 puntos - 0% de descuento.\\nPlata: desde 500 puntos - 5% de descuento.\\nOro: desde 1500 puntos - 10% de descuento.");
        jScrollPane2.setViewportView(txtReglas);
        getContentPane().add(jScrollPane2, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBeneficiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeneficiosActionPerformed
        verBeneficios();
    }//GEN-LAST:event_btnBeneficiosActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        listar();
    }//GEN-LAST:event_btnActualizarActionPerformed


    private Cliente obtenerCliente() {

        return sistema.buscarClientePorDni(txtDni.getText());
    }

    private void buscar() {

        Cliente cliente = obtenerCliente();

        if (cliente == null) {
            JOptionPane.showMessageDialog(this, "Cliente no encontrado.");
            return;
        }

        NivelFidelidad nivel = cliente.getNivelFidelidad();

        JOptionPane.showMessageDialog(
                this,
                "Cliente: " + cliente.getNombres() + " " + cliente.getApellidos()
                        + "\nPuntos: " + cliente.getPuntosFidelidad()
                        + "\nNivel: " + nivel.getNombreNivel()
                        + "\nDescuento: " + nivel.getPorcentajeDescuento() + "%"
        );
    }

    private void verBeneficios() {

        Cliente cliente = obtenerCliente();

        if (cliente == null) {
            JOptionPane.showMessageDialog(this, "Cliente no encontrado.");
            return;
        }

        JOptionPane.showMessageDialog(
                this,
                cliente.getNivelFidelidad().mostrarBeneficios()
        );
    }

    private void listar() {

        modelo.setRowCount(0);
        Cliente[] clientes = sistema.getClientes();

        for (int i = 0; i < sistema.getContClientes(); i++) {

            NivelFidelidad nivel = clientes[i].getNivelFidelidad();

            modelo.addRow(new Object[]{
                    clientes[i].getDni(),
                    clientes[i].getNombres() + " " + clientes[i].getApellidos(),
                    clientes[i].getPuntosFidelidad(),
                    nivel.getNombreNivel(),
                    nivel.getPorcentajeDescuento() + "%"
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBeneficios;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDni;
    private javax.swing.JPanel pnlSuperior;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextArea txtReglas;
    // End of variables declaration//GEN-END:variables
}