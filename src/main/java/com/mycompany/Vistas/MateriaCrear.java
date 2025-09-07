package com.mycompany.Vistas;
import java.awt.BorderLayout;
import com.mycompany.Logica.*;
import java.util.ArrayList;

public class MateriaCrear extends javax.swing.JPanel {

    GestionUniversitaria GU;
    Carrera carrera;
    Materia materia;
    
    public MateriaCrear(GestionUniversitaria GU) {
        initComponents();
        this.GU = GU;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Content = new javax.swing.JPanel();
        CodigoTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        NombreTextField = new javax.swing.JTextField();
        CuatrimestreTextField = new javax.swing.JTextField();
        GuardarCambiosButton = new javax.swing.JButton();
        TipoMateriaComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        VolverButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CorrelativasjList = new javax.swing.JList<>();
        AgregarCorrelativaButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        Content.setBackground(new java.awt.Color(51, 51, 51));
        Content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CodigoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoTextFieldActionPerformed(evt);
            }
        });
        Content.add(CodigoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 220, -1));

        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setText("Nombre");
        Content.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        NombreTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreTextFieldActionPerformed(evt);
            }
        });
        Content.add(NombreTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 220, -1));

        CuatrimestreTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuatrimestreTextFieldActionPerformed(evt);
            }
        });
        Content.add(CuatrimestreTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 220, -1));

        GuardarCambiosButton.setText("Guardar Cambios");
        GuardarCambiosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarCambiosButtonActionPerformed(evt);
            }
        });
        Content.add(GuardarCambiosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 550, 136, 40));

        TipoMateriaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Obligatoria", "Optativa" }));
        TipoMateriaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoMateriaComboBoxActionPerformed(evt);
            }
        });
        Content.add(TipoMateriaComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 160, -1));

        jLabel5.setForeground(new java.awt.Color(242, 242, 242));
        jLabel5.setText("Codigo");
        Content.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        jLabel6.setForeground(new java.awt.Color(242, 242, 242));
        jLabel6.setText("Cuatrimestre");
        Content.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        jLabel8.setForeground(new java.awt.Color(242, 242, 242));
        jLabel8.setText("Tipo");
        Content.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));

        VolverButton.setText("< Volver");
        VolverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverButtonActionPerformed(evt);
            }
        });
        Content.add(VolverButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 87, 40));

        jScrollPane1.setViewportView(CorrelativasjList);

        Content.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 360, 210));

        AgregarCorrelativaButton.setText("Agregar Correlativa");
        AgregarCorrelativaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarCorrelativaButtonActionPerformed(evt);
            }
        });
        Content.add(AgregarCorrelativaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 380, 350, 22));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CREAR MATERIA");
        Content.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Materias Disponibles");
        Content.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Content, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Content, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CodigoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoTextFieldActionPerformed

    private void NombreTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreTextFieldActionPerformed

    private void CuatrimestreTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuatrimestreTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CuatrimestreTextFieldActionPerformed

    private void GuardarCambiosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarCambiosButtonActionPerformed
        
        Materia materia = new Materia();
    
        materia.setCodigo(CodigoTextField.getText());
        materia.setNombre(NombreTextField.getText());
        Integer cuatrimestre = Integer.parseInt((String)CuatrimestreTextField.getText());
        materia.setCuatrimestre(cuatrimestre);
        
         String tipo = (String) TipoMateriaComboBox.getSelectedItem();
         if (tipo != null && tipo.startsWith("Tipo")) {
            materia.setTipo(tipo);
          }

    

    ArrayList<Materia> materiasContenidas = carrera.getMateriasContenidas();
    materiasContenidas.add(materia);
        
    }//GEN-LAST:event_GuardarCambiosButtonActionPerformed

    private void TipoMateriaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoMateriaComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoMateriaComboBoxActionPerformed

    private void VolverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverButtonActionPerformed
       Inicio panel = new Inicio(GU);
        panel.setSize(800, 600);
        panel.setLocation(0,0);
        Content.removeAll();
        Content.setLayout(new BorderLayout());
        Content.add(panel, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint(); 
    }//GEN-LAST:event_VolverButtonActionPerformed

    private void AgregarCorrelativaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarCorrelativaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarCorrelativaButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarCorrelativaButton;
    private javax.swing.JTextField CodigoTextField;
    private javax.swing.JPanel Content;
    private javax.swing.JList<String> CorrelativasjList;
    private javax.swing.JTextField CuatrimestreTextField;
    private javax.swing.JButton GuardarCambiosButton;
    private javax.swing.JTextField NombreTextField;
    private javax.swing.JComboBox<String> TipoMateriaComboBox;
    private javax.swing.JButton VolverButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
