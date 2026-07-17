/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import clases.Cliente;
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
public class frmMantenimientoClientes extends javax.swing.JFrame{

    private SistemaAgencia sistema;
    private DefaultTableModel modelo;

    public frmMantenimientoClientes(SistemaAgencia sistema) {
    
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
        lblDni = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        lblNombres = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        lblApellidos = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        lblTipoDocumento = new javax.swing.JLabel();
        txtTipoDocumento = new javax.swing.JTextField();
        lblFechaNacimiento = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JTextField();
        lblNacionalidad = new javax.swing.JLabel();
        txtNacionalidad = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        pnlBotones = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mantenimiento de Clientes");
        setPreferredSize(new java.awt.Dimension(1050, 600));
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));

        pnlSuperior.setLayout(new java.awt.BorderLayout(0, 5));

        pnlDatos.setLayout(new java.awt.GridLayout(4, 4, 5, 5));

        lblDni.setText("DNI:");
        pnlDatos.add(lblDni);
        pnlDatos.add(txtDni);

        lblNombres.setText("Nombres:");
        pnlDatos.add(lblNombres);
        pnlDatos.add(txtNombres);

        lblApellidos.setText("Apellidos:");
        pnlDatos.add(lblApellidos);
        pnlDatos.add(txtApellidos);

        lblTipoDocumento.setText("Tipo de documento:");
        pnlDatos.add(lblTipoDocumento);
        pnlDatos.add(txtTipoDocumento);

        lblFechaNacimiento.setText("Fecha de nacimiento:");
        pnlDatos.add(lblFechaNacimiento);
        pnlDatos.add(txtFechaNacimiento);

        lblNacionalidad.setText("Nacionalidad:");
        pnlDatos.add(lblNacionalidad);
        pnlDatos.add(txtNacionalidad);

        lblTelefono.setText("Teléfono:");
        pnlDatos.add(lblTelefono);
        pnlDatos.add(txtTelefono);

        lblCorreo.setText("Correo:");
        pnlDatos.add(lblCorreo);
        pnlDatos.add(txtCorreo);

        pnlSuperior.add(pnlDatos, java.awt.BorderLayout.CENTER);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        pnlBotones.add(btnRegistrar);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        pnlBotones.add(btnBuscar);

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        pnlBotones.add(btnActualizar);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        pnlBotones.add(btnEliminar);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        pnlBotones.add(btnLimpiar);

        pnlSuperior.add(pnlBotones, java.awt.BorderLayout.SOUTH);

        getContentPane().add(pnlSuperior, java.awt.BorderLayout.NORTH);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Nombres", "Apellidos", "Documento", "Nacionalidad", "Teléfono", "Correo", "Puntos", "Nivel"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);
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


    private Cliente crearCliente() {

        return new Cliente(
                txtDni.getText(),
                txtNombres.getText(),
                txtApellidos.getText(),
                txtTipoDocumento.getText(),
                txtFechaNacimiento.getText(),
                txtNacionalidad.getText(),
                txtTelefono.getText(),
                txtCorreo.getText()
        );
    }

    private boolean validarCampos() {

        if (txtDni.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el DNI.");
            return false;
        }

        if (txtNombres.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese los nombres.");
            return false;
        }

        if (txtApellidos.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese los apellidos.");
            return false;
        }

        return true;
    }

    private void registrar() {

        if (!validarCampos()) {
            return;
        }

        Cliente cliente = crearCliente();

        if (sistema.registrarCliente(cliente)) {
            JOptionPane.showMessageDialog(this, "Cliente registrado.");
            limpiar();
            listar();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo registrar. Revise el DNI.");
        }
    }

    private void buscar() {

        Cliente cliente = sistema.buscarClientePorDni(txtDni.getText());

        if (cliente == null) {
            JOptionPane.showMessageDialog(this, "Cliente no encontrado.");
            return;
        }

        txtNombres.setText(cliente.getNombres());
        txtApellidos.setText(cliente.getApellidos());
        txtTipoDocumento.setText(cliente.getTipoDocumento());
        txtFechaNacimiento.setText(cliente.getFechaNacimiento());
        txtNacionalidad.setText(cliente.getNacionalidad());
        txtTelefono.setText(cliente.getTelefono());
        txtCorreo.setText(cliente.getCorreo());
        txtDni.setEditable(false);

        JOptionPane.showMessageDialog(
                this,
                "Puntos: " + cliente.getPuntosFidelidad()
                        + "\nNivel: " + cliente.getNivelFidelidad().getNombreNivel()
        );
    }

    private void actualizar() {

        if (!validarCampos()) {
            return;
        }

        Cliente cliente = crearCliente();

        if (sistema.actualizarCliente(cliente)) {
            JOptionPane.showMessageDialog(this, "Cliente actualizado.");
            limpiar();
            listar();
        } else {
            JOptionPane.showMessageDialog(this, "Cliente no encontrado.");
        }
    }

    private void eliminar() {

        if (sistema.eliminarCliente(txtDni.getText())) {
            JOptionPane.showMessageDialog(this, "Cliente eliminado.");
            limpiar();
            listar();
        } else {
            JOptionPane.showMessageDialog(this, "Cliente no encontrado.");
        }
    }

    private void listar() {

        modelo.setRowCount(0);
        Cliente[] clientes = sistema.getClientes();

        for (int i = 0; i < sistema.getContClientes(); i++) {

            Cliente cliente = clientes[i];

            modelo.addRow(new Object[]{
                    cliente.getDni(),
                    cliente.getNombres(),
                    cliente.getApellidos(),
                    cliente.getTipoDocumento(),
                    cliente.getNacionalidad(),
                    cliente.getTelefono(),
                    cliente.getCorreo(),
                    cliente.getPuntosFidelidad(),
                    cliente.getNivelFidelidad().getNombreNivel()
            });
        }
    }

    private void limpiar() {

        txtDni.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtTipoDocumento.setText("");
        txtFechaNacimiento.setText("");
        txtNacionalidad.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        txtDni.setEditable(true);
        txtDni.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTipoDocumento;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlSuperior;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTipoDocumento;
    // End of variables declaration//GEN-END:variables
}