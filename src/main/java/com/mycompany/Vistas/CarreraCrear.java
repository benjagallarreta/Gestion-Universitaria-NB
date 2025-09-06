/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.Vistas;

import java.awt.BorderLayout;
import com.mycompany.Logica.GestionUniversitaria;

public class CarreraCrear extends javax.swing.JPanel {

       GestionUniversitaria GU;
    public CarreraCrear(GestionUniversitaria GU) {
        initComponents();
        this.GU = GU;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Content = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        AgregarMateriaButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        VolverButton = new javax.swing.JButton();
        GuardarCambiosButton = new javax.swing.JButton();
        CuatrimestresComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        Content.setBackground(new java.awt.Color(51, 51, 51));
        Content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre de la carrera");
        Content.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 120, -1));
        Content.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 146, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Plan de Estudio");
        Content.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 90, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Materia", "Tipo"
            }
        ));
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        Content.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 350, 225));

        AgregarMateriaButton.setText("Agregar Materia");
        AgregarMateriaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarMateriaButtonActionPerformed(evt);
            }
        });
        Content.add(AgregarMateriaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 170, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        Content.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 140, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Agregar Correlativas");
        Content.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 120, 20));

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CREAR CARRERA");
        jLabel2.setPreferredSize(new java.awt.Dimension(50, 50));
        Content.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 110, 20));

        VolverButton.setText("< Volver");
        VolverButton.setMinimumSize(new java.awt.Dimension(72, 23));
        VolverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverButtonActionPerformed(evt);
            }
        });
        Content.add(VolverButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 100, 40));

        GuardarCambiosButton.setText("Guardar Cambios");
        GuardarCambiosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarCambiosButtonActionPerformed(evt);
            }
        });
        Content.add(GuardarCambiosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, 140, 50));

        CuatrimestresComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Content.add(CuatrimestresComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 140, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cuatrimestre");
        Content.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 70, -1));

        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Materia Opcional");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        Content.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Content, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarMateriaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarMateriaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarMateriaButtonActionPerformed

    private void VolverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverButtonActionPerformed
        CarreraPrincipal panel = new CarreraPrincipal(GU);
        panel.setSize(800, 600);
        panel.setLocation(0,0);
        Content.removeAll();
        Content.setLayout(new BorderLayout());
        Content.add(panel, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();                     
    }//GEN-LAST:event_VolverButtonActionPerformed

    private void GuardarCambiosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarCambiosButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GuardarCambiosButtonActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarMateriaButton;
    private javax.swing.JPanel Content;
    private javax.swing.JComboBox<String> CuatrimestresComboBox;
    private javax.swing.JButton GuardarCambiosButton;
    private javax.swing.JButton VolverButton;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
