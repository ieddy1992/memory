
package com.mycompany.memory.gui;

import com.mycompany.memory.model.User;


public class WelcomeFrame extends javax.swing.JFrame {

    private User user;

    public WelcomeFrame(User user) {
        this.user = user;
        initComponents();
    }
    private boolean isAdmin() {
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        visualizarButton = new javax.swing.JButton();
        credencialButton = new javax.swing.JButton();
        cadastrarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        visualizarButton.setText("Visualizar credenciais");
        visualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarButtonActionPerformed(evt);
            }
        });

        credencialButton.setText("Cadastrar credenciais");
        credencialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                credencialButtonActionPerformed(evt);
            }
        });

        cadastrarButton.setText("Cadastrar usuário");
        cadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(visualizarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(credencialButton, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                    .addComponent(cadastrarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(visualizarButton)
                .addGap(33, 33, 33)
                .addComponent(credencialButton)
                .addGap(34, 34, 34)
                .addComponent(cadastrarButton)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void visualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarButtonActionPerformed
        CredenciaisFrame credenciaisFrame = new CredenciaisFrame();
        credenciaisFrame.setVisible(true);
    }//GEN-LAST:event_visualizarButtonActionPerformed

    private void credencialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_credencialButtonActionPerformed
        if (isAdmin()) {
            AdicionarFrame adicionarFrame = new AdicionarFrame();
            adicionarFrame.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Apenas administradores podem cadastrar credenciais.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_credencialButtonActionPerformed

    private void cadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarButtonActionPerformed
        if (isAdmin()) {
            CadastroFrame cadastroFrame = new CadastroFrame();
            cadastroFrame.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Apenas administradores podem cadastrar usuários.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_cadastrarButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    java.awt.EventQueue.invokeLater ( new Runnable() {
            

    public void run() {
        new WelcomeFrame().setVisible(true);
    }
});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JButton credencialButton;
    private javax.swing.JButton visualizarButton;
    // End of variables declaration//GEN-END:variables
}
