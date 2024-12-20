package com.mycompany.ejercicioarbolesbinarios;

import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    Arbol arbol = new Arbol();
    
    public Menu() {
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

        jLabel1 = new javax.swing.JLabel();
        insertarArbol = new javax.swing.JButton();
        preorden = new javax.swing.JButton();
        inorden = new javax.swing.JButton();
        postorden = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("EJERCICIO, ARBOL BINARIO NOMBRE EDAD Y SEXO");

        insertarArbol.setText("Agregar al arbol");
        insertarArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarArbolActionPerformed(evt);
            }
        });

        preorden.setText("Recorrer Pre-orden");
        preorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preordenActionPerformed(evt);
            }
        });

        inorden.setText("Recorrer In-orden");
        inorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inordenActionPerformed(evt);
            }
        });

        postorden.setText("Recorrer Post-orden");
        postorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postordenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(insertarArbol)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(preorden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(postorden)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(inorden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(85, 85, 85))
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(preorden)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertarArbol)
                    .addComponent(inorden))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(postorden)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertarArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarArbolActionPerformed
        // TODO add your handling code here:
        arbol.insertar();
    }//GEN-LAST:event_insertarArbolActionPerformed

    private void preordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preordenActionPerformed
        // TODO add your handling code here:
        String resultado = arbol.dispararPreorden();
        JOptionPane.showMessageDialog(null, resultado);
    }//GEN-LAST:event_preordenActionPerformed

    private void inordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inordenActionPerformed
        // TODO add your handling code here:
        String resultado = arbol.dispararInorden();
        JOptionPane.showMessageDialog(null, resultado);
    }//GEN-LAST:event_inordenActionPerformed

    private void postordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postordenActionPerformed
        // TODO add your handling code here:
        String resultado = arbol.dispararPostorden();
        JOptionPane.showMessageDialog(null, resultado);
    }//GEN-LAST:event_postordenActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton inorden;
    private javax.swing.JButton insertarArbol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton postorden;
    private javax.swing.JButton preorden;
    // End of variables declaration//GEN-END:variables
}
