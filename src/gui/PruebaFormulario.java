/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import gestion.SistemaAgencia;

/**
 *
 * @author Phillipe
 */
public class PruebaFormulario {
    public static void main(String[] args) {
    // 1. Instancias tu sistema (la lógica de backend)
    SistemaAgencia sistema = new SistemaAgencia();
    
    // 2. Lanzas el login (que es la primera pantalla)
    java.awt.EventQueue.invokeLater(() -> {
        new frmLogin(sistema).setVisible(true);
    });
}
}
