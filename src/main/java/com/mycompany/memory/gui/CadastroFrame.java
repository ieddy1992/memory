package com.mycompany.memory.gui;

import com.mycompany.memory.dao.UserDAO;
import javax.swing.JOptionPane;
import com.mycompany.memory.util.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ederson
 */
public class CadastroFrame extends javax.swing.JFrame {

    /**
     * Creates new form CadastroFrame
     */
    public CadastroFrame() {
        initComponents();
    }

    /**
     * Método para adicionar um novo usuário ao banco de dados.
     */
    private void cadastrarNovoUsuario() {
        // Obtém os valores dos campos de texto
        String nome = NometField.getText();
        String login = LoginTextField.getText();
        String senha = SenhaTextField.getText();
        String email = EmailTextField.getText();
        String telefone = TelefoneTextField.getText();
        String cpf = CPFTextField.getText();
        String answer1 = AnswerTextField.getText();
        String answer2 = AnswerTextField2.getText();
        boolean isAdmin = adminToggleButton.isSelected();

        // Verifica se todos os campos estão preenchidos
        if (nome.isEmpty() || login.isEmpty() || senha.isEmpty() || email.isEmpty() || telefone.isEmpty() || cpf.isEmpty() || answer1.isEmpty() || answer2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Adiciona as informações ao banco de dados
        UserDAO userDAO = new UserDAO();
        boolean cadastradoComSucesso = userDAO.adicionarNovoUsuario(nome, login, senha, email, telefone, cpf, answer1, answer2, isAdmin);

        // Exibe mensagem de sucesso ou falha
        if (cadastradoComSucesso) {
            JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Falha ao cadastrar usuário.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
        private void encerrarAplicacao() {
        System.exit(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NometField = new javax.swing.JTextField();
        LoginTextField = new javax.swing.JTextField();
        SenhaTextField = new javax.swing.JTextField();
        EmailTextField = new javax.swing.JTextField();
        TelefoneTextField = new javax.swing.JTextField();
        CPFTextField = new javax.swing.JTextField();
        AnswerTextField = new javax.swing.JTextField();
        AnswerTextField2 = new javax.swing.JTextField();
        cadastrarButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        NomeLabel = new javax.swing.JLabel();
        LoginLabel = new javax.swing.JLabel();
        SenhaLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        Telefone = new javax.swing.JLabel();
        CPFLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        AnswerLabel2 = new javax.swing.JLabel();
        adminToggleButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LoginTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginTextFieldActionPerformed(evt);
            }
        });

        AnswerTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerTextFieldActionPerformed(evt);
            }
        });

        AnswerTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerTextField2ActionPerformed(evt);
            }
        });

        cadastrarButton.setText("Cadastrar");
        cadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonActionPerformed(evt);
            }
        });

        CancelButton.setText("Cancelar");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        NomeLabel.setText("Nome");

        LoginLabel.setText("Login");

        SenhaLabel.setText("Senha");

        EmailLabel.setText("Email");

        Telefone.setText("Telefone");

        CPFLabel6.setText("CPF");

        jLabel7.setText("Answer");

        AnswerLabel2.setText("Answer 2");

        adminToggleButton.setText("Admin");
        adminToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminToggleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NomeLabel)
                            .addComponent(SenhaLabel)
                            .addComponent(LoginLabel)
                            .addComponent(EmailLabel)
                            .addComponent(Telefone)
                            .addComponent(CPFLabel6)
                            .addComponent(jLabel7)
                            .addComponent(AnswerLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AnswerTextField2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AnswerTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CPFTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TelefoneTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmailTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SenhaTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LoginTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NometField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(adminToggleButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cadastrarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CancelButton)))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NometField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SenhaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SenhaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Telefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPFTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CPFLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AnswerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AnswerTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AnswerLabel2))
                .addGap(18, 18, 18)
                .addComponent(adminToggleButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelButton)
                    .addComponent(cadastrarButton))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginTextFieldActionPerformed

    private void adminToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminToggleButtonActionPerformed

    private void cadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarButtonActionPerformed
String nome = nomeField.getText();
        String login = loginField.getText();
        String senha = senhaField.getText();
        String email = emailField.getText();
        String telefone = telefoneField.getText();
        String cpf = cpfField.getText();
        String pergunta1 = pergunta1Field.getText();
        String pergunta2 = pergunta2Field.getText();
        boolean isAdmin = adminToggleButton.isSelected();

        // Criar um novo usuário com os dados fornecidos
        User user = new User();
        user.setNome(nome);
        user.setLogin(login);
        user.setSenhaHash(senha); // Substituir por BCrypt.hashpw(senha, BCrypt.gensalt());
        user.setEmail(email);
        user.setTelefone(telefone);
        user.setCpf(cpf);
        user.setPerguntaSecreta1(pergunta1);
        user.setPerguntaSecreta2(pergunta2);
        user.setAdmin(isAdmin);

        // Adicionar o usuário ao banco de dados
        UserDAO userDAO = new UserDAO();
        boolean cadastradoComSucesso = userDAO.adicionarUsuario(user);

        if (cadastradoComSucesso) {
            JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Falha ao cadastrar usuário - Contate o administrador do sistema", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cadastrarButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void AnswerTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnswerTextField2ActionPerformed

    private void AnswerTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnswerTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnswerLabel2;
    private javax.swing.JTextField AnswerTextField;
    private javax.swing.JTextField AnswerTextField2;
    private javax.swing.JLabel CPFLabel6;
    private javax.swing.JTextField CPFTextField;
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JTextField LoginTextField;
    private javax.swing.JLabel NomeLabel;
    private javax.swing.JTextField NometField;
    private javax.swing.JLabel SenhaLabel;
    private javax.swing.JTextField SenhaTextField;
    private javax.swing.JLabel Telefone;
    private javax.swing.JTextField TelefoneTextField;
    private javax.swing.JToggleButton adminToggleButton;
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
