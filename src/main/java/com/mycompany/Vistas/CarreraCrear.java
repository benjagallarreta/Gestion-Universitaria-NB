/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.Vistas;

import java.awt.BorderLayout;
import com.mycompany.Logica.*;
import javax.swing.JOptionPane;


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
        CarreraNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        AgregarMateriaButton = new javax.swing.JButton();
        PlanEstudioComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        VolverButton = new javax.swing.JButton();
        GuardarCambiosButton = new javax.swing.JButton();
        CuatrimestresComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        Content.setBackground(new java.awt.Color(51, 51, 51));
        Content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre de la carrera");
        Content.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 120, -1));
        Content.add(CarreraNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 146, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Plan de Estudio");
        Content.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 90, -1));

        AgregarMateriaButton.setText("Agregar Materia");
        AgregarMateriaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarMateriaButtonActionPerformed(evt);
            }
        });
        Content.add(AgregarMateriaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 350, -1));

        PlanEstudioComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plan A", "Plan B", "Plan C", "Plan D", "Plan E" }));
        PlanEstudioComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlanEstudioComboBoxActionPerformed(evt);
            }
        });
        Content.add(PlanEstudioComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 140, -1));

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
        Content.add(VolverButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 100, 40));

        GuardarCambiosButton.setText("Guardar Cambios");
        GuardarCambiosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarCambiosButtonActionPerformed(evt);
            }
        });
        Content.add(GuardarCambiosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 500, 140, 50));

        CuatrimestresComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuatrimestre 1", "Cuatrimestre 2", "Cuatrimestre 3", "Cuatrimestre 4", "Cuatrimestre 5", "Cuatrimestre 6" }));
        Content.add(CuatrimestresComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 140, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cuatrimiestres Totales");
        Content.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Content, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarMateriaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarMateriaButtonActionPerformed
        MateriaCrear panel = new MateriaCrear(GU);
        panel.setSize(800, 600);
        panel.setLocation(0,0);
        Content.removeAll();
        Content.setLayout(new BorderLayout());
        Content.add(panel, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();         
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
       
    Carrera carrera = new Carrera();
    
    carrera.setNombre(CarreraNombre.getText());
    
    // Setear los Cuatrimestres
    String cuatri = (String) CuatrimestresComboBox.getSelectedItem();
    if (cuatri != null && cuatri.startsWith("Cuatrimestre")) {
        int numero = Integer.parseInt(cuatri.split(" ")[1]); 
        carrera.setCuatrimestresTotales(numero);
    }

    // Setear los planes de Estudio
    String planSeleccionado = (String) PlanEstudioComboBox.getSelectedItem();
    switch (planSeleccionado) {
        case "Plan A" -> carrera.setPlanEstudio(new PlanA()); // Asignar Plan A
        case "Plan B" -> carrera.setPlanEstudio(new PlanB()); // Asignar Plan B
        case "Plan C" -> carrera.setPlanEstudio(new PlanC()); // Asignar Plan C
        case "Plan D" -> carrera.setPlanEstudio(new PlanD()); // Asignar Plan D
        case "Plan E" -> carrera.setPlanEstudio(new PlanE()); // Asignar Plan E
        default -> {
            // En caso de que no se seleccione un plan válido (aunque no debería pasar)
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un plan de estudio válido.");
            return;
               }
    }

    
    GU.getCarreras().add(carrera);
    
 
    }//GEN-LAST:event_GuardarCambiosButtonActionPerformed

    private void PlanEstudioComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlanEstudioComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlanEstudioComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarMateriaButton;
    private javax.swing.JTextField CarreraNombre;
    private javax.swing.JPanel Content;
    private javax.swing.JComboBox<String> CuatrimestresComboBox;
    private javax.swing.JButton GuardarCambiosButton;
    private javax.swing.JComboBox<String> PlanEstudioComboBox;
    private javax.swing.JButton VolverButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
