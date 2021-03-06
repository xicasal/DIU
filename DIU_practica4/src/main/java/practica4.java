
import java.awt.Color;
import static java.awt.Color.pink;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xavier Iglesias
 */
public class practica4 extends javax.swing.JFrame {
    /**
     * Creates new form practica4
     * @param bgColor
     */

    @Override
    public void setBackground(Color bgColor) {
        super.setBackground(bgColor); //To change body of generated methods, choose Tools | Templates.
    }

    public practica4() {
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

        comboBoxLienzo = new javax.swing.JComboBox<>();
        lienzo1 = new Lienzo();
        textoColorLienzo = new javax.swing.JLabel();
        textoColorPincel = new javax.swing.JLabel();
        comboBoxPincel = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Práctica4_Estela_Con_Cursor");
        setBackground(new java.awt.Color(255, 204, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 102, 102));

        comboBoxLienzo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blanco", "Naranja", "Verde", "Magenta" }));
        comboBoxLienzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxLienzoActionPerformed(evt);
            }
        });

        lienzo1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lienzo1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lienzo1MouseMoved(evt);
            }
        });

        javax.swing.GroupLayout lienzo1Layout = new javax.swing.GroupLayout(lienzo1);
        lienzo1.setLayout(lienzo1Layout);
        lienzo1Layout.setHorizontalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );
        lienzo1Layout.setVerticalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        textoColorLienzo.setBackground(new java.awt.Color(153, 255, 255));
        textoColorLienzo.setText("Seleccione color para el fondo del lienzo");

        textoColorPincel.setText("Seleccione color para el pincel del lienzo");

        comboBoxPincel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negro", "Rojo", "Amarillo", "Azul" }));
        comboBoxPincel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPincelActionPerformed(evt);
            }
        });

        jLabel1.setText("Estela de circulos usando el ratón");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lienzo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textoColorPincel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(15, 15, 15))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textoColorLienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(comboBoxPincel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxLienzo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoColorLienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboBoxLienzo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoColorPincel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboBoxPincel))
                .addGap(18, 18, 18)
                .addComponent(lienzo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxLienzoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxLienzoActionPerformed
        int indice1 = comboBoxLienzo.getSelectedIndex();
        cambioColorLienzo(indice1);
          
    }//GEN-LAST:event_comboBoxLienzoActionPerformed

    private void comboBoxPincelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPincelActionPerformed
        int indice2 = comboBoxPincel.getSelectedIndex();
        cambioColorPincel(indice2);
    }//GEN-LAST:event_comboBoxPincelActionPerformed

    private void lienzo1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzo1MouseMoved
        lienzo1.setPoint(evt.getX(),evt.getY());
        repaint();
    }//GEN-LAST:event_lienzo1MouseMoved

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
            java.util.logging.Logger.getLogger(practica4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(practica4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(practica4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(practica4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new practica4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxLienzo;
    private javax.swing.JComboBox<String> comboBoxPincel;
    private javax.swing.JLabel jLabel1;
    private Lienzo lienzo1;
    private javax.swing.JLabel textoColorLienzo;
    private javax.swing.JLabel textoColorPincel;
    // End of variables declaration//GEN-END:variables



public void cambioColorLienzo(int i){
    System.out.println("\n");
        if(i == 0){
            Color r = Color.WHITE;
            lienzo1.setBackground(r);
            System.out.println("Ahora el lienzo es blanco");
        }
        if(i == 1){
            Color r = Color.ORANGE;
            lienzo1.setBackground(r);
            System.out.println("Ahora el lienzo es naranja");
        }
        if(i == 2){
            Color r = Color.GREEN;
            lienzo1.setBackground(r);
            System.out.println("Ahora el lienzo es verde");
        }
        if(i == 3){
            Color r = Color.MAGENTA;
            lienzo1.setBackground(r);
            System.out.println("Ahora el lienzo es magenta");
        }
        
    }

public void cambioColorPincel(int i){
    System.out.println("\n");
        if(i == 0){
            Color r = Color.BLACK;
            lienzo1.setForeground(r);
            System.out.println("Ahora el pincel es negro");
        }
        if(i == 1){
            Color r = Color.RED;
            lienzo1.setForeground(r);
            System.out.println("Ahora el pincel es rojo");
        }
        if(i == 2){
            Color r = Color.YELLOW;
            lienzo1.setForeground(r);
            System.out.println("Ahora el pincel es amarillo");
        }
        if(i == 3){
            Color r = Color.BLUE;
            lienzo1.setForeground(r);
            System.out.println("Ahora el pincel es azul");
        }

}

    
}










