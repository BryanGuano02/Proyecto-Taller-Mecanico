/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.registro;

import com.mycompany.crudsqlserver.java.ConexionSQLServer;
import com.principal.principalRegistro;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.UUID;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class registroReparacion extends javax.swing.JFrame {
    private String id_reparacion;
    /**
     * Creates new form registroCliente
     */
    public registroReparacion() {
        initComponents();
        
        
    }
public void insertarReparacion(String numMatricula, String idArticulo,
       String tipoReparacion, String observacion, String precio, String idTaller) {
    String sql = "INSERT INTO Reparacion_Quito (num_matricula, id_reparacion, id_articulo, "
            + "fecha_reparacion, tipo_reparacion, observacion, precio, id_taller) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        id_reparacion = UUID.randomUUID().toString();
         ConexionSQLServer con = new ConexionSQLServer();
        Connection conexion = con.obtenerConexion();
    
        LocalDateTime fechaActual = LocalDateTime.now();

        // Convierte LocalDateTime a Date
        Date fechaConvertida = (Date) Date.from(fechaActual.atZone(ZoneId.systemDefault()).toInstant());

    try {
       
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setString(1, numMatricula);
        ps.setString(2, id_reparacion);
        ps.setString(3, idArticulo);
        ps.setDate(4, fechaConvertida);
        ps.setString(5, tipoReparacion);
        ps.setString(6, observacion);
        ps.setString(7, precio);
        ps.setString(8, idTaller);

        int rows = ps.executeUpdate();

        if (rows > 0) {
            System.out.println("Reparación insertada con éxito");
        } else {
            System.out.println("Error al insertar reparación");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error" + e.toString());
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        botonIngresar = new javax.swing.JTextField();
        botonAtras = new javax.swing.JTextField();
        txtField_tipo = new java.awt.TextField();
        txtField_matricula = new java.awt.TextField();
        txtField_articulo = new java.awt.TextField();
        txtField_precio = new java.awt.TextField();
        txtField_observacion = new java.awt.TextField();
        lbl_titulo = new javax.swing.JLabel();
        lbl_matricula = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbl_articulo = new javax.swing.JLabel();
        lbl_precio = new javax.swing.JLabel();
        lbl_observacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("EPN CAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(341, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(314, 314, 314))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        botonIngresar.setEditable(false);
        botonIngresar.setBackground(new java.awt.Color(231, 231, 231));
        botonIngresar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        botonIngresar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        botonIngresar.setText("REGISTRAR");
        botonIngresar.setAutoscrolls(false);
        botonIngresar.setBorder(null);
        botonIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonIngresar.setFocusable(false);
        botonIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonIngresarMouseClicked(evt);
            }
        });
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });

        botonAtras.setEditable(false);
        botonAtras.setBackground(new java.awt.Color(231, 231, 231));
        botonAtras.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        botonAtras.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        botonAtras.setText("ATRÁS");
        botonAtras.setAutoscrolls(false);
        botonAtras.setBorder(null);
        botonAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAtras.setFocusable(false);
        botonAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAtrasMouseClicked(evt);
            }
        });
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        txtField_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtField_precioActionPerformed(evt);
            }
        });

        lbl_titulo.setBackground(new java.awt.Color(0, 0, 0));
        lbl_titulo.setFont(new java.awt.Font("Roboto", 1, 25)); // NOI18N
        lbl_titulo.setText("DATOS DE LA REPARACIÓN");

        lbl_matricula.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbl_matricula.setText("MATRÍCULA");

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel16.setText("TIPO");

        lbl_articulo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbl_articulo.setText("ARTÍCULO");

        lbl_precio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbl_precio.setText("PRECIO");

        lbl_observacion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbl_observacion.setText("OBSERVACIONES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtField_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(lbl_matricula)
                    .addComponent(txtField_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtField_observacion, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_observacion)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbl_precio, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtField_precio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtField_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(124, 124, 124))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonAtras)))
                .addGap(33, 33, 33)
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_matricula)
                        .addGap(7, 7, 7)
                        .addComponent(txtField_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addGap(11, 11, 11)
                        .addComponent(txtField_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(txtField_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(lbl_precio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtField_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addComponent(lbl_observacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtField_observacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIngresarMouseClicked
       String numMatricula =txtField_matricula.getText();
        String idArticulo = txtField_articulo.getText();
        //String fechaReparacion = txtField_fecha.getText();
        String tipoReparacion = txtField_tipo.getText();
        String observacion = txtField_observacion.getText();
        String precio = txtField_precio.getText();

    
        insertarReparacion(numMatricula, idArticulo,tipoReparacion, observacion, precio, "2");
    }//GEN-LAST:event_botonIngresarMouseClicked

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        // TODO ad your handling code here:
    }//GEN-LAST:event_botonIngresarActionPerformed

    private void botonAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasMouseClicked
        principalRegistro framePrincipal = new principalRegistro();

        framePrincipal.setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_botonAtrasMouseClicked

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        // TODO ad your handling code here:
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void txtField_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtField_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtField_precioActionPerformed

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
            java.util.logging.Logger.getLogger(registroReparacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registroReparacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registroReparacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registroReparacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registroReparacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField botonAtras;
    private javax.swing.JTextField botonIngresar;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_articulo;
    private javax.swing.JLabel lbl_matricula;
    private javax.swing.JLabel lbl_observacion;
    private javax.swing.JLabel lbl_precio;
    private javax.swing.JLabel lbl_titulo;
    private java.awt.TextField txtField_articulo;
    private java.awt.TextField txtField_matricula;
    private java.awt.TextField txtField_observacion;
    private java.awt.TextField txtField_precio;
    private java.awt.TextField txtField_tipo;
    // End of variables declaration//GEN-END:variables
}
