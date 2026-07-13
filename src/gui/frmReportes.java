/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import gestion.SistemaAgencia;
import javax.swing.*;
import java.awt.*;

public class frmReportes extends JFrame { // Al extender JFrame, ya es una ventana
    private SistemaAgencia sistema;
    private JTextArea txtReporte; // Declaras tus componentes
    private JButton btnGenerar;

    public frmReportes(SistemaAgencia sistema) {
        this.sistema = sistema;
        configurarVentana(); // Llamas al método que dibuja
    }

    private void configurarVentana() {
        setTitle("Reportes");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout()); // Diseñas usando código

        txtReporte = new JTextArea();
        btnGenerar = new JButton("Generar Reporte");

        add(new JScrollPane(txtReporte), BorderLayout.CENTER);
        add(btnGenerar, BorderLayout.SOUTH);

        // Aquí conectas el evento sin necesidad de "Design"
        btnGenerar.addActionListener(e -> generar());
    }

    private void generar() {
        // Tu lógica aquí
        txtReporte.setText("Reporte generado con éxito.");
    }
}
