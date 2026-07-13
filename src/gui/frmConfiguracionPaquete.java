/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import clases.*;
import gestion.SistemaAgencia;
import javax.swing.*;
import java.awt.*;

public class frmConfiguracionPaquete extends JFrame {

    private SistemaAgencia sistema;
    private JComboBox<String> cboPaquete, cboDestino, cboItinerario, cboPromocion;
    private JTextField txtTipoServicio, txtDescripcionServicio, txtCupoDisponible;
    private JTextArea txtDetalle;

    public frmConfiguracionPaquete(SistemaAgencia sistema) {
        this.sistema = sistema;
        configurarVentana();
        cargarListas();
    }

    private void configurarVentana() {
        setTitle("Configuración de Paquetes");
        setSize(950, 620);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JPanel pnlDatos = new JPanel(new GridLayout(7, 2, 5, 5));
        pnlDatos.add(new JLabel("Paquete:")); pnlDatos.add(cboPaquete = new JComboBox<>());
        pnlDatos.add(new JLabel("Destino:")); pnlDatos.add(cboDestino = new JComboBox<>());
        pnlDatos.add(new JLabel("Itinerario:")); pnlDatos.add(cboItinerario = new JComboBox<>());
        pnlDatos.add(new JLabel("Promoción:")); pnlDatos.add(cboPromocion = new JComboBox<>());
        pnlDatos.add(new JLabel("Tipo de servicio:")); pnlDatos.add(txtTipoServicio = new JTextField());
        pnlDatos.add(new JLabel("Descripción del servicio:")); pnlDatos.add(txtDescripcionServicio = new JTextField());
        pnlDatos.add(new JLabel("Nuevo cupo disponible:")); pnlDatos.add(txtCupoDisponible = new JTextField());

        JPanel pnlBotones = new JPanel(new GridLayout(2, 4, 5, 5));
        JButton btnAgregarDestino = new JButton("Agregar destino");
        JButton btnAgregarItinerario = new JButton("Agregar itinerario");
        JButton btnAgregarServicio = new JButton("Agregar servicio");
        JButton btnAsignarPromocion = new JButton("Asignar promoción");
        JButton btnActualizarCupo = new JButton("Actualizar cupo");
        JButton btnCancelarPaquete = new JButton("Cancelar paquete");
        JButton btnReactivarPaquete = new JButton("Reactivar paquete");
        JButton btnRecargar = new JButton("Recargar listas");

        // Eventos
        cboPaquete.addActionListener(e -> mostrarDetalle());
        btnAgregarDestino.addActionListener(e -> agregarDestino());
        btnAgregarItinerario.addActionListener(e -> agregarItinerario());
        btnAgregarServicio.addActionListener(e -> agregarServicio());
        btnAsignarPromocion.addActionListener(e -> asignarPromocion());
        btnActualizarCupo.addActionListener(e -> actualizarCupo());
        btnCancelarPaquete.addActionListener(e -> cancelarPaquete());
        btnReactivarPaquete.addActionListener(e -> reactivarPaquete());
        btnRecargar.addActionListener(e -> cargarListas());

        pnlBotones.add(btnAgregarDestino); pnlBotones.add(btnAgregarItinerario);
        pnlBotones.add(btnAgregarServicio); pnlBotones.add(btnAsignarPromocion);
        pnlBotones.add(btnActualizarCupo); pnlBotones.add(btnCancelarPaquete);
        pnlBotones.add(btnReactivarPaquete); pnlBotones.add(btnRecargar);

        JPanel pnlSuperior = new JPanel(new BorderLayout());
        pnlSuperior.add(pnlDatos, BorderLayout.CENTER);
        pnlSuperior.add(pnlBotones, BorderLayout.SOUTH);
        add(pnlSuperior, BorderLayout.NORTH);

        txtDetalle = new JTextArea();
        txtDetalle.setEditable(false);
        add(new JScrollPane(txtDetalle), BorderLayout.CENTER);
    }

    // --- PEGA AQUÍ TU LÓGICA ORIGINAL ---
    // (obtenerPaqueteSeleccionado, cargarListas, agregarDestino, agregarItinerario, 
    // agregarServicio, asignarPromocion, actualizarCupo, cancelarPaquete, 
    // reactivarPaquete, mostrarDetalle)
}
