/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.memory.gui;

import com.mycompany.memory.model.User;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class CredenciaisFrame extends javax.swing.JFrame {

    private final User loggedUser;

    public CredenciaisFrame(User loggedUser) {
        this.loggedUser = loggedUser;
        initComponents();
        loadSystems();
    }

    private void loadSystems() {
        UserDAO userDAO = new UserDAO();
        List<System> systems = userDAO.getSystemsByUser(loggedUser);
        DefaultListModel<String> model = new DefaultListModel<>();
        for (System system : systems) {
            model.addElement(system.getName());
        }
        sistemasList.setModel(model);
        sistemasList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int index = sistemasList.locationToIndex(e.getPoint());
                    String selectedSystem = sistemasList.getModel().getElementAt(index);
                    String password = getPasswordForSystem(selectedSystem);
                    JOptionPane.showMessageDialog(CredenciaisFrame.this, "Senha para " + selectedSystem + ": " + password);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
