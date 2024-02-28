/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema2Formulario;

import javax.swing.JOptionPane;

/**
 *
 * @author Jordan
 */
public class ModalCancelarAceptar {

    public static void ModalCancelar(Form formulario) {
        int opcion = JOptionPane.showConfirmDialog(formulario, "¿Quieres cancelar?", "Confirmación", JOptionPane.WARNING_MESSAGE);

        if (opcion == JOptionPane.YES_OPTION) {
            formulario.dispose();
        }

    }

    public static void ModalAceptarIncorrecto(Form formulario) {
        int opcion = JOptionPane.showConfirmDialog(formulario, "Faltan parámetros", "Alerta", JOptionPane.PLAIN_MESSAGE);
    }
    
    public static void ModalAceptarCorrecto(Form formulario) {
        int opcion = JOptionPane.showConfirmDialog(formulario, "Todo correcto y enviado", "Alerta", JOptionPane.PLAIN_MESSAGE);
        formulario.dispose();
    }
}
