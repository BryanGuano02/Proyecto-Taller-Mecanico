/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package consulta;

import com.registro.*;
import com.principal.principalRegistro;

import com.mycompany.crudsqlserver.java.ConexionSQLServer;
import com.principal.principalConsulta;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class ConsultarEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form registroCliente
     */
    public ConsultarEmpleado() {
        initComponents();
        
    }
    public void mostrarEmpleados(String tabla, String nombre) {
        String sql = "select * from " + tabla;
       if (!nombre.isEmpty()) {
            sql += " WHERE Nombre_empleado = '" + nombre + "'";
        }
        Statement st;

        ConexionSQLServer con = new ConexionSQLServer();
        Connection conexion = con.obtenerConexion();

        System.out.println(sql);

        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("id_Empleado");
        model.addColumn("id_taller");
        model.addColumn("nombre_Empleado");
        model.addColumn("cedula");
        model.addColumn("Fecha_comienzo");
        model.addColumn("Salario");
        visor.setModel(model);

        String[] datos = new String[6];

        try {
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(4);
                datos[5] = rs.getString(5);

                model.addRow(datos);
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
        lbl_titulocliente = new javax.swing.JLabel();
        botonAtras = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        visor = new javax.swing.JTable();
        botonConsultarEmpleado = new javax.swing.JTextField();
        lbl_tlf = new javax.swing.JLabel();
        txtField_nombre = new java.awt.TextField();

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

        lbl_titulocliente.setBackground(new java.awt.Color(0, 0, 0));
        lbl_titulocliente.setFont(new java.awt.Font("Roboto", 1, 25)); // NOI18N
        lbl_titulocliente.setText("DATOS DEL EMPLEADO");

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

        visor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(visor);

        botonConsultarEmpleado.setEditable(false);
        botonConsultarEmpleado.setBackground(new java.awt.Color(231, 231, 231));
        botonConsultarEmpleado.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        botonConsultarEmpleado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        botonConsultarEmpleado.setText("CONSULTAR");
        botonConsultarEmpleado.setAutoscrolls(false);
        botonConsultarEmpleado.setBorder(null);
        botonConsultarEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonConsultarEmpleado.setFocusable(false);
        botonConsultarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonConsultarEmpleadoMouseClicked(evt);
            }
        });
        botonConsultarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarEmpleadoActionPerformed(evt);
            }
        });

        lbl_tlf.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbl_tlf.setText("Nombre");

        txtField_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtField_nombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_titulocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_tlf)
                                .addGap(40, 40, 40)
                                .addComponent(txtField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(botonConsultarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonAtras)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_titulocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lbl_tlf))
                            .addComponent(txtField_nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addComponent(botonConsultarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasMouseClicked
        principalConsulta framePrincipal = new principalConsulta();

        framePrincipal.setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_botonAtrasMouseClicked

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        // TODO ad your handling code here:
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void botonConsultarEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConsultarEmpleadoMouseClicked
        /*Window[] windows = Window.getWindows();
        for (Window window : windows) {
            window.dispose();
        }*/
        String nombre = txtField_nombre.getText();
        
        mostrarEmpleados("Empleado_Guayaquil", nombre);
    }//GEN-LAST:event_botonConsultarEmpleadoMouseClicked

    private void botonConsultarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarEmpleadoActionPerformed

    }//GEN-LAST:event_botonConsultarEmpleadoActionPerformed

    private void txtField_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtField_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtField_nombreActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField botonAtras;
    public javax.swing.JTextField botonConsultarEmpleado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_titulocliente;
    private javax.swing.JLabel lbl_tlf;
    private java.awt.TextField txtField_nombre;
    public javax.swing.JTable visor;
    // End of variables declaration//GEN-END:variables
}
