package com.mycompany.Vistas;

import com.mycompany.Logica.GestionUniversitaria;
import com.mycompany.Logica.Carrera;
import com.mycompany.Logica.Materia;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class MateriaPrincipal extends javax.swing.JPanel {

    GestionUniversitaria GU;
    Carrera carrera;
    
    public MateriaPrincipal(GestionUniversitaria GU, Carrera carrera) {
        initComponents();
        this.GU = GU;
        this.carrera = carrera;
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Content = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        TerminarButton = new javax.swing.JButton();
        AgregarMateriaButton = new javax.swing.JButton();

        Content.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PLAN DE ESTUDIO DE LA CARRERA");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Cuatrimestre", "Tipo", "Correlativas"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        TerminarButton.setText("Terminar");
        TerminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TerminarButtonActionPerformed(evt);
            }
        });

        AgregarMateriaButton.setText("Agregar Materias");
        AgregarMateriaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarMateriaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(ContentLayout.createSequentialGroup()
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jLabel1))
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(AgregarMateriaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(TerminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(122, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AgregarMateriaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TerminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cargarTabla() {
        
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{
            "Nombre", "Cuatrimestres Totales", "Plan de Estudio", "Materias", "Alumnos Inscriptos"
        });

        ArrayList<Materia> listaMaterias = carrera.getMateriasContenidas();
        for (Materia materia : listaMaterias) {
            model.addRow(new Object[]{
            materia.getNombre(),
            materia.getCuatrimestre(),
            materia.getTipo(),
            //materia.getCorrelativasString(),
        });
        }   
        
        jTable1.setModel(model);
        
    }
    
    private void TerminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TerminarButtonActionPerformed
        CarreraPrincipal panel = new CarreraPrincipal(GU);
        panel.setSize(800, 600);
        panel.setLocation(0,0);
        Content.removeAll();
        Content.setLayout(new BorderLayout());
        Content.add(panel, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();          
    }//GEN-LAST:event_TerminarButtonActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarMateriaButton;
    private javax.swing.JPanel Content;
    private javax.swing.JButton TerminarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
