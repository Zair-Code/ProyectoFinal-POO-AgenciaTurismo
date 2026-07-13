/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import clases.DestinoTuristico;
import gestion.SistemaAgencia;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class frmMantenimientoDestinos extends JFrame {

    private SistemaAgencia sistema;
    private JTextField txtNombre, txtPais, txtCiudad, txtDescripcion, txtClima, txtIdioma, txtRutaImagen;
    private DefaultTableModel modelo;
    private JTable tabla;

    public frmMantenimientoDestinos(SistemaAgencia sistema) {
        this.sistema = sistema;
        configurarVentana();
        listar();
    }

    private void configurarVentana() {
        setTitle("Mantenimiento de Destinos");
        setSize(1000, 590);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JPanel pnlDatos = new JPanel(new GridLayout(4, 4, 5, 5));
        pnlDatos.add(new JLabel("Nombre:")); pnlDatos.add(txtNombre = new JTextField());
        pnlDatos.add(new JLabel("País:")); pnlDatos.add(txtPais = new JTextField());
        pnlDatos.add(new JLabel("Ciudad:")); pnlDatos.add(txtCiudad = new JTextField());
        pnlDatos.add(new JLabel("Descripción:")); pnlDatos.add(txtDescripcion = new JTextField());
        pnlDatos.add(new JLabel("Clima:")); pnlDatos.add(txtClima = new JTextField());
        pnlDatos.add(new JLabel("Idioma:")); pnlDatos.add(txtIdioma = new JTextField());
        pnlDatos.add(new JLabel("Ruta de imagen:")); pnlDatos.add(txtRutaImagen = new JTextField());
        
        JButton btnVerImagen = new JButton("Ver imagen");
        btnVerImagen.addActionListener(e -> verImagen());
        pnlDatos.add(btnVerImagen);
        pnlDatos.add(new JLabel("Ejemplo: imagenes/machupicchu.jpg"));

        JPanel pnlBotones = new JPanel();
        JButton btnRegistrar = new JButton("Registrar");
        JButton btnBuscar = new JButton("Buscar");
        JButton btnActualizar = new JButton("Actualizar");
        JButton btnEliminar = new JButton("Eliminar");
        JButton btnLimpiar = new JButton("Limpiar");

        btnRegistrar.addActionListener(e -> registrar());
        btnBuscar.addActionListener(e -> buscar());
        btnActualizar.addActionListener(e -> actualizar());
        btnEliminar.addActionListener(e -> eliminar());
        btnLimpiar.addActionListener(e -> limpiar());

        pnlBotones.add(btnRegistrar); pnlBotones.add(btnBuscar);
        pnlBotones.add(btnActualizar); pnlBotones.add(btnEliminar); pnlBotones.add(btnLimpiar);

        JPanel pnlSuperior = new JPanel(new BorderLayout());
        pnlSuperior.add(pnlDatos, BorderLayout.CENTER);
        pnlSuperior.add(pnlBotones, BorderLayout.SOUTH);
        add(pnlSuperior, BorderLayout.NORTH);

        modelo = new DefaultTableModel(new String[]{"Nombre", "País", "Ciudad", "Clima", "Idioma", "Ruta imagen"}, 0);
        tabla = new JTable(modelo);
        add(new JScrollPane(tabla), BorderLayout.CENTER);
    }

    // --- PEGA AQUÍ TUS MÉTODOS DE LÓGICA (crearDestino, validarCampos, registrar, buscar, actualizar, eliminar, verImagen, listar, limpiar) ---
}
