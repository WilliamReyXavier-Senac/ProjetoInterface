/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegrafica;

import javax.swing.JOptionPane;

/**
 *
 * @author willian.xavier
 */
public class frm_Principal extends javax.swing.JFrame {

    /**
     * Creates new form frm_Principal
     */
    public frm_Principal() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumA = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtNumB = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        rbSomar = new javax.swing.JRadioButton();
        rbMultiplicar = new javax.swing.JRadioButton();
        rbSubtrair = new javax.swing.JRadioButton();
        rbDividir = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Senac");

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 26)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Senac");
        jLabel1.setToolTipText("");

        jLabel2.setText("Var A");

        txtNumA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumAActionPerformed(evt);
            }
        });

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel4.setText("Var B");

        txtNumB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumBActionPerformed(evt);
            }
        });

        jLabel5.setText("Var Resultado");

        txtResultado.setEnabled(false);
        txtResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbSomar);
        rbSomar.setText("Somar");
        rbSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSomarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbMultiplicar);
        rbMultiplicar.setText("Multiplicar");

        buttonGroup1.add(rbSubtrair);
        rbSubtrair.setText("Subtrair");

        buttonGroup1.add(rbDividir);
        rbDividir.setText("Dividir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNumA, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txtNumB)
                                    .addComponent(txtResultado)))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbMultiplicar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rbSubtrair, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 189, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCalcular)
                                .addGap(67, 67, 67)
                                .addComponent(rbDividir))
                            .addComponent(rbSomar))))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(rbSomar)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbSubtrair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNumB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbMultiplicar))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbDividir)
                    .addComponent(btnCalcular))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumAActionPerformed

    private void txtNumBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumBActionPerformed

    private void txtResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        String a = txtNumA.getText();
        String b = txtNumB.getText();

        int n1 = Integer.parseInt(a);
        int n2 = Integer.parseInt(b);

        if (rbSomar.isSelected()) {
            int calculo = n1 + n2;
            String c = String.valueOf(calculo);
            txtResultado.setText(c);
        } else if (rbSubtrair.isSelected()) {
            int calculo = n1 - n2;
            String c = String.valueOf(calculo);
            txtResultado.setText(c);
        } else if (rbMultiplicar.isSelected()) {
            int calculo = n1 * n2;
            String c = String.valueOf(calculo);
            txtResultado.setText(c);
        } else if (rbDividir.isSelected()) {
            int calculo = n1 / n2;
            String c = String.valueOf(calculo);
            txtResultado.setText(c);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma operação");
        }


    }//GEN-LAST:event_btnCalcularActionPerformed

    private void rbSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSomarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbSomarActionPerformed

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
            java.util.logging.Logger.getLogger(frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton rbDividir;
    private javax.swing.JRadioButton rbMultiplicar;
    private javax.swing.JRadioButton rbSomar;
    private javax.swing.JRadioButton rbSubtrair;
    private javax.swing.JTextField txtNumA;
    private javax.swing.JTextField txtNumB;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
