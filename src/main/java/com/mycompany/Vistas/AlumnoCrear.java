/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.Vistas;

import com.mycompany.Logica.Alumno;
import java.awt.BorderLayout;
import com.mycompany.Logica.GestionUniversitaria;
/**
 *
 * @author benja
 */
public class AlumnoCrear extends javax.swing.JPanel {
    
    GestionUniversitaria gu;
    
    public AlumnoCrear(GestionUniversitaria gu) {
        this.gu=gu;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        Content = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Apellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        DNI = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Legajo = new javax.swing.JTextField();
        GuardarCambiosBoton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(800, 600));

        Content.setBackground(new java.awt.Color(51, 51, 51));
        Content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");
        Content.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 54, -1));
        Content.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 146, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellido");
        Content.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 54, -1));
        Content.add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 146, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DNI");
        Content.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 54, -1));
        Content.add(DNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 146, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Legajo");
        Content.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 54, -1));
        Content.add(Legajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 146, -1));

        GuardarCambiosBoton.setText("Guardar Cambios");
        GuardarCambiosBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarCambiosBotonActionPerformed(evt);
            }
        });
        Content.add(GuardarCambiosBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 520, 146, 40));

        jButton4.setText("< Volver");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Content.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 87, 40));

        jLabel6.setFont(new java.awt.Font("Perpetua Titling MT", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CREAR ALUMNO");
        Content.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Content, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarCambiosBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarCambiosBotonActionPerformed
        Alumno alumno = new Alumno();
        alumno.setNombre( Nombre.getText());
        alumno.setApellido(Apellido.getText());
        alumno.setDNI(Integer.parseInt(DNI.getText()));
        alumno.setLegajo(Integer.parseInt(Legajo.getText()));
        gu.validarAlumno(alumno);
        jButton4ActionPerformed(null);
    }//GEN-LAST:event_GuardarCambiosBotonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        AlumnoPrincipal panel = new AlumnoPrincipal(gu);
        panel.setSize(800, 600);
        panel.setLocation(0,0);
        Content.removeAll();
        Content.setLayout(new BorderLayout());
        Content.add(panel, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JPanel Content;
    private javax.swing.JTextField DNI;
    private javax.swing.JButton GuardarCambiosBoton;
    private javax.swing.JTextField Legajo;
    private javax.swing.JTextField Nombre;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
