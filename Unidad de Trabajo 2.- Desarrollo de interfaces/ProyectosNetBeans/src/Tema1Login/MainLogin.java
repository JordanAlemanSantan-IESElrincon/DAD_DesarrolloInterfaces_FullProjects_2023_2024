package Tema1Login;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Rectangle2D;
import java.util.Arrays;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class MainLogin extends javax.swing.JFrame {

    /**
     * Creates new form MainLogin
     */
    public MainLogin() {
        initComponents();
        jLabelUserPasswordWrong.setVisible(false);
    }
    
    class jPanelGradient extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D  g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();
            
            Color color1 = new Color(94, 99, 252);
            Color color2 = new Color(58, 68, 188);
            Color color3 = new Color(35, 48, 130);
            
            int distanciaColor2 = width / 2 + width / 4;
            
            // Punto de inicio y finalización del primer gradiente (color1 a color2)
            Point startPoint1 = new Point(0, 0);
            Point endPoint1 = new Point(distanciaColor2, 0);

            // Punto de inicio y finalización del segundo gradiente (color2 a color3)
            Point startPoint2 = new Point(distanciaColor2, height);
            Point endPoint2 = new Point(width, height);

            // Crea un gradiente lineal desde el punto de inicio al punto de finalización
            GradientPaint gradient1 = new GradientPaint(startPoint1, color1, endPoint1, color2);
            GradientPaint gradient2 = new GradientPaint(startPoint2, color2, endPoint2, color3);
            
            // Crea un rectángulo del tamaño del panel
            Rectangle2D.Double background = new Rectangle2D.Double(0, 0, width, height);
            Rectangle2D.Double background2 = new Rectangle2D.Double(distanciaColor2, 0, width, height);

            // Dibuja el primer gradiente
            g2d.setPaint(gradient1);
            g2d.fill(background);
        
            // Dibuja el segundo gradiente
            g2d.setPaint(gradient2);
            g2d.fill(background2);
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new jPanelGradient();
        jLabelIconUserLogin = new javax.swing.JLabel();
        jPanelLogin = new javax.swing.JPanel();
        jPanelUser = new javax.swing.JPanel();
        jLabelIconUser = new javax.swing.JLabel();
        jTextFieldUser = new javax.swing.JTextField();
        jPanelPassword = new javax.swing.JPanel();
        jLabelIconPassword = new javax.swing.JLabel();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jPanelLoginExtras = new javax.swing.JPanel();
        jCheckBoxRemember = new javax.swing.JCheckBox();
        jLabelUserPasswordWrong = new javax.swing.JLabel();
        jLabelForgot = new javax.swing.JLabel();
        jPanelButtonLogin = new javax.swing.JPanel();
        jButtonLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanelPrincipal.setPreferredSize(new java.awt.Dimension(710, 430));

        jLabelIconUserLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tema1Login/img/AccesoUsuario.png"))); // NOI18N

        jPanelLogin.setOpaque(false);

        jPanelUser.setBackground(new java.awt.Color(102, 255, 102));
        jPanelUser.setForeground(new java.awt.Color(255, 102, 0));
        jPanelUser.setOpaque(false);

        jLabelIconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tema1Login/img/User.png"))); // NOI18N
        jLabelIconUser.setLabelFor(jTextFieldUser);

        jTextFieldUser.setText("admin");
        jTextFieldUser.setToolTipText("User");

        javax.swing.GroupLayout jPanelUserLayout = new javax.swing.GroupLayout(jPanelUser);
        jPanelUser.setLayout(jPanelUserLayout);
        jPanelUserLayout.setHorizontalGroup(
            jPanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelIconUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldUser)
                .addContainerGap())
        );
        jPanelUserLayout.setVerticalGroup(
            jPanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUserLayout.createSequentialGroup()
                .addGroup(jPanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelUserLayout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(jLabelIconUser))
                    .addComponent(jTextFieldUser))
                .addContainerGap())
        );

        jPanelPassword.setOpaque(false);

        jLabelIconPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tema1Login/img/Password.png"))); // NOI18N

        jPasswordFieldPassword.setText("password");
        jPasswordFieldPassword.setToolTipText("Password");

        javax.swing.GroupLayout jPanelPasswordLayout = new javax.swing.GroupLayout(jPanelPassword);
        jPanelPassword.setLayout(jPanelPasswordLayout);
        jPanelPasswordLayout.setHorizontalGroup(
            jPanelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPasswordLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabelIconPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelPasswordLayout.setVerticalGroup(
            jPanelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPasswordLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPasswordFieldPassword)
                    .addComponent(jLabelIconPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelLoginExtras.setOpaque(false);

        jCheckBoxRemember.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxRemember.setText("Remember me");
        jCheckBoxRemember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxRememberActionPerformed(evt);
            }
        });

        jLabelUserPasswordWrong.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelUserPasswordWrong.setForeground(new java.awt.Color(255, 51, 51));
        jLabelUserPasswordWrong.setText("User or password wrong");
        jLabelUserPasswordWrong.setToolTipText("Error messages");
        jLabelUserPasswordWrong.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelUserPasswordWrong.setFocusable(false);

        jLabelForgot.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabelForgot.setForeground(new java.awt.Color(255, 255, 255));
        jLabelForgot.setText("Forgot Password?");

        javax.swing.GroupLayout jPanelLoginExtrasLayout = new javax.swing.GroupLayout(jPanelLoginExtras);
        jPanelLoginExtras.setLayout(jPanelLoginExtrasLayout);
        jPanelLoginExtrasLayout.setHorizontalGroup(
            jPanelLoginExtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginExtrasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBoxRemember)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelUserPasswordWrong, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabelForgot)
                .addContainerGap())
        );
        jPanelLoginExtrasLayout.setVerticalGroup(
            jPanelLoginExtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginExtrasLayout.createSequentialGroup()
                .addGroup(jPanelLoginExtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxRemember)
                    .addComponent(jLabelForgot)
                    .addComponent(jLabelUserPasswordWrong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addComponent(jPanelLoginExtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanelUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelLoginExtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelButtonLogin.setOpaque(false);

        jButtonLogin.setBackground(new java.awt.Color(56, 51, 71));
        jButtonLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin.setText("LOGIN");
        jButtonLogin.setBorder(null);
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelButtonLoginLayout = new javax.swing.GroupLayout(jPanelButtonLogin);
        jPanelButtonLogin.setLayout(jPanelButtonLoginLayout);
        jPanelButtonLoginLayout.setHorizontalGroup(
            jPanelButtonLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanelButtonLoginLayout.setVerticalGroup(
            jPanelButtonLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonLoginLayout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanelButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIconUserLogin))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabelIconUserLogin)
                .addGap(18, 18, 18)
                .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxRememberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxRememberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxRememberActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        if(jTextFieldUser.getText().equals("admin") && Arrays.equals(jPasswordFieldPassword.getPassword(), "password".toCharArray())) {
            
            dispose();
            WelcomeLogin frameWelcomeLogin = new WelcomeLogin(this, true);
            frameWelcomeLogin.setVisible(true);
        } else 
            jLabelUserPasswordWrong.setVisible(true);
    }//GEN-LAST:event_jButtonLoginActionPerformed

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
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JCheckBox jCheckBoxRemember;
    private javax.swing.JLabel jLabelForgot;
    private javax.swing.JLabel jLabelIconPassword;
    private javax.swing.JLabel jLabelIconUser;
    private javax.swing.JLabel jLabelIconUserLogin;
    private javax.swing.JLabel jLabelUserPasswordWrong;
    private javax.swing.JPanel jPanelButtonLogin;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPanel jPanelLoginExtras;
    private javax.swing.JPanel jPanelPassword;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelUser;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables
}