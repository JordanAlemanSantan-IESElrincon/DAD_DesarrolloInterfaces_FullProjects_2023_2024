/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Tema2GestorClientes.gui;

import Tema2GestorClientes.dto.Cliente;
import java.awt.Color;
import java.util.Date;

/**
 *
 * @author Jordan
 */
public class DialogoAlta extends javax.swing.JDialog {

    private PantallaPrincipal pantallaPrincipal;

    /**
     * Creates new form DialogoAlta
     */
    public DialogoAlta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        pantallaPrincipal = (PantallaPrincipal) parent;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jPanelSection1 = new javax.swing.JPanel();
        jPanelCategory1_1 = new javax.swing.JPanel();
        jLabel1_1_Nombre = new javax.swing.JLabel();
        jTextField1_1_Nombre = new javax.swing.JTextField();
        jPanelCategory1_2 = new javax.swing.JPanel();
        jLabel1_2_Apellidos = new javax.swing.JLabel();
        jTextField1_2_Apellidos = new javax.swing.JTextField();
        jPanelCategory1_3 = new javax.swing.JPanel();
        jLabel1_3_Fecha = new javax.swing.JLabel();
        jSpinner1_3_Fecha = new javax.swing.JSpinner();
        jPanelCategory1_4 = new javax.swing.JPanel();
        jLabel1_4_Provincia = new javax.swing.JLabel();
        jComboBox1_4_Provincia = new javax.swing.JComboBox<>();
        jPanelSection2 = new javax.swing.JPanel();
        jLabel2_MensajeError = new javax.swing.JLabel();
        jButton2_Alta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1_1_Nombre.setLabelFor(jTextField1_1_Nombre);
        jLabel1_1_Nombre.setText("Nombre:");

        jTextField1_1_Nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1_1_NombreMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelCategory1_1Layout = new javax.swing.GroupLayout(jPanelCategory1_1);
        jPanelCategory1_1.setLayout(jPanelCategory1_1Layout);
        jPanelCategory1_1Layout.setHorizontalGroup(
            jPanelCategory1_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCategory1_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1_1_Nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1_1_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelCategory1_1Layout.setVerticalGroup(
            jPanelCategory1_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCategory1_1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCategory1_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1_1_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1_1_Nombre))
                .addContainerGap())
        );

        jLabel1_2_Apellidos.setLabelFor(jTextField1_2_Apellidos);
        jLabel1_2_Apellidos.setText("Apellidos:");

        jTextField1_2_Apellidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1_2_ApellidosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelCategory1_2Layout = new javax.swing.GroupLayout(jPanelCategory1_2);
        jPanelCategory1_2.setLayout(jPanelCategory1_2Layout);
        jPanelCategory1_2Layout.setHorizontalGroup(
            jPanelCategory1_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCategory1_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1_2_Apellidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1_2_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelCategory1_2Layout.setVerticalGroup(
            jPanelCategory1_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCategory1_2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCategory1_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1_2_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1_2_Apellidos))
                .addContainerGap())
        );

        jLabel1_3_Fecha.setText("Fecha de alta:");

        jSpinner1_3_Fecha.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1698081606790L), null, null, java.util.Calendar.DAY_OF_MONTH));
        jSpinner1_3_Fecha.setOpaque(true);

        javax.swing.GroupLayout jPanelCategory1_3Layout = new javax.swing.GroupLayout(jPanelCategory1_3);
        jPanelCategory1_3.setLayout(jPanelCategory1_3Layout);
        jPanelCategory1_3Layout.setHorizontalGroup(
            jPanelCategory1_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCategory1_3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1_3_Fecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jSpinner1_3_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelCategory1_3Layout.setVerticalGroup(
            jPanelCategory1_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCategory1_3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCategory1_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1_3_Fecha)
                    .addComponent(jSpinner1_3_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1_4_Provincia.setText("Provincia:");

        jComboBox1_4_Provincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Asturias", "Las Palmas", "Santa Cruz de Tenerife" }));

        javax.swing.GroupLayout jPanelCategory1_4Layout = new javax.swing.GroupLayout(jPanelCategory1_4);
        jPanelCategory1_4.setLayout(jPanelCategory1_4Layout);
        jPanelCategory1_4Layout.setHorizontalGroup(
            jPanelCategory1_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCategory1_4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1_4_Provincia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1_4_Provincia, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelCategory1_4Layout.setVerticalGroup(
            jPanelCategory1_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCategory1_4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCategory1_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1_4_Provincia)
                    .addComponent(jComboBox1_4_Provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelSection1Layout = new javax.swing.GroupLayout(jPanelSection1);
        jPanelSection1.setLayout(jPanelSection1Layout);
        jPanelSection1Layout.setHorizontalGroup(
            jPanelSection1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSection1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSection1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCategory1_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCategory1_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCategory1_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCategory1_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelSection1Layout.setVerticalGroup(
            jPanelSection1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSection1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanelCategory1_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelCategory1_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelCategory1_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelCategory1_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jLabel2_MensajeError.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2_MensajeError.setText("Campos sin completar");
        jLabel2_MensajeError.setVisible(false);

        jButton2_Alta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2_Alta.setText("Alta");
        jButton2_Alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_AltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSection2Layout = new javax.swing.GroupLayout(jPanelSection2);
        jPanelSection2.setLayout(jPanelSection2Layout);
        jPanelSection2Layout.setHorizontalGroup(
            jPanelSection2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSection2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2_MensajeError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2_Alta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelSection2Layout.setVerticalGroup(
            jPanelSection2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSection2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSection2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2_Alta, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(jLabel2_MensajeError))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelSection2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelSection1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanelSection1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanelSection2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2_AltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_AltaActionPerformed
        String nombre = jTextField1_1_Nombre.getText();
        String apellidos = jTextField1_2_Apellidos.getText();
        Date fechaAlta = (Date) jSpinner1_3_Fecha.getValue();
        String provincia = (String) jComboBox1_4_Provincia.getSelectedItem();

        if (nombre.isBlank()) 
            jTextField1_1_Nombre.setBackground(Color.red);
        
        if (apellidos.isBlank()) 
            jTextField1_2_Apellidos.setBackground(Color.red);
        
        if (nombre.isBlank() || apellidos.isBlank()) {
            jLabel2_MensajeError.setVisible(true);
            return;
        }

        Cliente cliente = new Cliente(nombre, apellidos, fechaAlta, provincia);
        pantallaPrincipal.aniadirCliente(cliente);
        dispose();
    }//GEN-LAST:event_jButton2_AltaActionPerformed

    private void jTextField1_2_ApellidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1_2_ApellidosMouseClicked
        // TODO add your handling code here:
        jTextField1_2_Apellidos.setBackground(Color.WHITE);
    }//GEN-LAST:event_jTextField1_2_ApellidosMouseClicked

    private void jTextField1_1_NombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1_1_NombreMouseClicked
        // TODO add your handling code here:
        jTextField1_1_Nombre.setBackground(Color.WHITE);
    }//GEN-LAST:event_jTextField1_1_NombreMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DialogoAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogoAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogoAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogoAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogoAlta dialog = new DialogoAlta(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2_Alta;
    private javax.swing.JComboBox<String> jComboBox1_4_Provincia;
    private javax.swing.JLabel jLabel1_1_Nombre;
    private javax.swing.JLabel jLabel1_2_Apellidos;
    private javax.swing.JLabel jLabel1_3_Fecha;
    private javax.swing.JLabel jLabel1_4_Provincia;
    private javax.swing.JLabel jLabel2_MensajeError;
    private javax.swing.JPanel jPanelCategory1_1;
    private javax.swing.JPanel jPanelCategory1_2;
    private javax.swing.JPanel jPanelCategory1_3;
    private javax.swing.JPanel jPanelCategory1_4;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelSection1;
    private javax.swing.JPanel jPanelSection2;
    private javax.swing.JSpinner jSpinner1_3_Fecha;
    private javax.swing.JTextField jTextField1_1_Nombre;
    private javax.swing.JTextField jTextField1_2_Apellidos;
    // End of variables declaration//GEN-END:variables
}