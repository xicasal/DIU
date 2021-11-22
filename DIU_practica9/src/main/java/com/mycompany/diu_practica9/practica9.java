/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.diu_practica9;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Xavier Iglesias
 */
public class practica9 extends javax.swing.JFrame {
    int n = 1;
    DefaultListModel modeloTablas = new DefaultListModel();
    DefaultListModel modeloCampos = new DefaultListModel();
    Connection con;
    DatabaseMetaData md;
    /**
     * Creates new form practica9
     */
    public practica9() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonesSeleccion = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textoUsuario = new javax.swing.JTextField();
        botonLogin = new javax.swing.JButton();
        textoContraseña = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        botonSeleccionSimple = new javax.swing.JButton();
        botonSeleccionIntervalo = new javax.swing.JButton();
        botonIntervaloMultiple = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTablas = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaCampos = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mostrarCamposTabla = new javax.swing.JButton();
        deseleccionar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña");

        botonLogin.setText("Login");
        botonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(textoContraseña))
                .addGap(41, 41, 41)
                .addComponent(botonLogin)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(textoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(textoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(botonLogin)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Modos de selección:");

        botonSeleccionSimple.setText("Simple");
        botonesSeleccion.add(botonSeleccionSimple);
        botonSeleccionSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionSimpleActionPerformed(evt);
            }
        });

        botonSeleccionIntervalo.setText("Intervalo");
        botonesSeleccion.add(botonSeleccionIntervalo);
        botonSeleccionIntervalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionIntervaloActionPerformed(evt);
            }
        });

        botonIntervaloMultiple.setText("Múltiple");
        botonesSeleccion.add(botonIntervaloMultiple);
        botonIntervaloMultiple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIntervaloMultipleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonSeleccionIntervalo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonSeleccionSimple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonIntervaloMultiple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addComponent(botonSeleccionSimple)
                .addGap(31, 31, 31)
                .addComponent(botonSeleccionIntervalo)
                .addGap(31, 31, 31)
                .addComponent(botonIntervaloMultiple)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jScrollPane1.setViewportView(listaTablas);

        jScrollPane2.setViewportView(listaCampos);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Lista de Tablas");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Lista de Campos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        mostrarCamposTabla.setText("Mostrar Campos de la Tabla");
        mostrarCamposTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarCamposTablaActionPerformed(evt);
            }
        });

        deseleccionar.setText("Deseleccionar");
        deseleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deseleccionarActionPerformed(evt);
            }
        });

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(mostrarCamposTabla))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(deseleccionar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(botonSalir)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mostrarCamposTabla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deseleccionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLoginActionPerformed
        char[] contraseña = textoContraseña.getPassword();
        String pass = String.valueOf(contraseña);
        String user = textoUsuario.getText();
        
        this.conectarDatabase(user, pass);
        try {
            this.mostrarTablas();
        } catch (SQLException ex) {
            Logger.getLogger(practica9.class.getName()).log(Level.SEVERE, null, ex);
        }
        textoContraseña.setText("");
        textoUsuario.setText("");
    }//GEN-LAST:event_botonLoginActionPerformed

    private void mostrarCamposTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarCamposTablaActionPerformed
         try {
            // TODO add your handling code here:
            modeloCampos.clear();
            //System.out.println(listaTablas.getSelectedValuesList());
            ArrayList<String> aux;
            aux = (ArrayList<String>) listaTablas.getSelectedValuesList();
            for(String s : aux){
                mostrarCampos(s);
            }
           
            
        } catch (SQLException ex) {
            Logger.getLogger(practica9.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mostrarCamposTablaActionPerformed

    private void botonSeleccionSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionSimpleActionPerformed
        listaTablas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }//GEN-LAST:event_botonSeleccionSimpleActionPerformed

    private void botonSeleccionIntervaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionIntervaloActionPerformed
        listaTablas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
    }//GEN-LAST:event_botonSeleccionIntervaloActionPerformed

    private void botonIntervaloMultipleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIntervaloMultipleActionPerformed
        listaTablas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }//GEN-LAST:event_botonIntervaloMultipleActionPerformed

    private void deseleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deseleccionarActionPerformed
        listaTablas.clearSelection();
    }//GEN-LAST:event_deseleccionarActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        // TODO add your handling code here:
        formWindowClosing();
    }//GEN-LAST:event_botonSalirActionPerformed

    
    public void conectarDatabase(String user,String pass){
        try{
           Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://i7-lab5.dis.ulpgc.es/DIU_BD?useSSL=true",user,pass); 
        }catch(ClassNotFoundException | SQLException exc){
            
            JOptionPane.showMessageDialog(null, "Base de datos no conectada");
        }
    }
    
    public void mostrarTablas() throws SQLException{
        md = con.getMetaData();
        String[] types = {"TABLE"};
        ResultSet rs = md.getTables(null, null, "%", types);
        modeloTablas.addElement("TABLAS");
        while (rs.next()) {
            String nombreTabla = rs.getString("TABLE_NAME");
            modeloTablas.addElement("  " + nombreTabla);
           
        }

    }
     public void mostrarCampos(String nombreTabla) throws SQLException{
        ResultSet rs2 = md.getColumns(null, null, nombreTabla, null);
            while (rs2.next()) {
                String nombreCampo = rs2.getString("COLUMN_NAME");
                modeloCampos.addElement(nombreTabla+".Campo: " + nombreCampo);
            }
    }
     private void formWindowClosing() {                                   
        int confirm = JOptionPane.showConfirmDialog(rootPane, "¿Desea salir de la aplicación?", "Salir aplicación", JOptionPane.YES_NO_OPTION);
        
        if(confirm == JOptionPane.YES_OPTION){
            this.dispose();
        }
     }
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
            java.util.logging.Logger.getLogger(practica9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(practica9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(practica9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(practica9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new practica9().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIntervaloMultiple;
    private javax.swing.JButton botonLogin;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonSeleccionIntervalo;
    private javax.swing.JButton botonSeleccionSimple;
    private javax.swing.ButtonGroup botonesSeleccion;
    private javax.swing.JButton deseleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaCampos;
    private javax.swing.JList<String> listaTablas;
    private javax.swing.JButton mostrarCamposTabla;
    private javax.swing.JPasswordField textoContraseña;
    private javax.swing.JTextField textoUsuario;
    // End of variables declaration//GEN-END:variables
}