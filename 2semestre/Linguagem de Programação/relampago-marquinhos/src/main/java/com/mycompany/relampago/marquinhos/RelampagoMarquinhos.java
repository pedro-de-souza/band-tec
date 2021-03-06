/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relampago.marquinhos;



/**
 *
 * @author pedro
 */
public class RelampagoMarquinhos extends javax.swing.JFrame {
    Carro relampago = new Carro();
    /**
     * Creates new form RelampagoMarquinhos
     */
    public RelampagoMarquinhos() {
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

        jPanel1 = new javax.swing.JPanel();
        objCombustivel = new javax.swing.JProgressBar();
        btnAbastecer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblVelocidade = new javax.swing.JLabel();
        lblVelocidade1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btnCambioVoltar = new javax.swing.JButton();
        btnCambioPassar = new javax.swing.JButton();
        lblCambio = new javax.swing.JLabel();
        btnStatus = new javax.swing.JButton();
        btnEmbreajar = new javax.swing.JButton();
        btnAcelerar = new javax.swing.JButton();
        btnFreirar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(209, 18, 18));

        objCombustivel.setBackground(new java.awt.Color(198, 198, 198));
        objCombustivel.setBorderPainted(false);
        objCombustivel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        objCombustivel.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        btnAbastecer.setText("Abastecer");
        btnAbastecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbastecerActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Combustível");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Velocimetro ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Câmbio");

        lblVelocidade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblVelocidade.setForeground(new java.awt.Color(255, 255, 255));
        lblVelocidade.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblVelocidade.setText("0.0");

        lblVelocidade1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblVelocidade1.setForeground(new java.awt.Color(255, 255, 255));
        lblVelocidade1.setText("KM/H");

        btnCambioVoltar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCambioVoltar.setText("↓");
        btnCambioVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambioVoltarActionPerformed(evt);
            }
        });

        btnCambioPassar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCambioPassar.setText("↑");
        btnCambioPassar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambioPassarActionPerformed(evt);
            }
        });

        lblCambio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCambio.setForeground(new java.awt.Color(255, 255, 255));
        lblCambio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCambio.setText("Ponto morto");

        btnStatus.setText("Desligado");
        btnStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatusActionPerformed(evt);
            }
        });

        btnEmbreajar.setText("Embreagem");
        btnEmbreajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmbreajarActionPerformed(evt);
            }
        });

        btnAcelerar.setText("Acelerador");
        btnAcelerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcelerarActionPerformed(evt);
            }
        });

        btnFreirar1.setText("Freio");
        btnFreirar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFreirar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(lblCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCambioVoltar)
                                    .addComponent(btnCambioPassar)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(63, 63, 63))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnStatus)
                                .addComponent(btnAbastecer, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(objCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(19, 19, 19)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(lblVelocidade, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVelocidade1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 37, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEmbreajar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFreirar1)
                                .addGap(3, 3, 3)
                                .addComponent(btnAcelerar)
                                .addGap(25, 25, 25))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(96, 96, 96))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVelocidade, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVelocidade1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(objCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCambioPassar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbastecer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAcelerar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmbreajar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFreirar1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCambioVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStatus)
                .addGap(46, 46, 46)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbastecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbastecerActionPerformed
        relampago.abastecerCarro();
        objCombustivel.setValue(relampago.getCombustivel());
    }//GEN-LAST:event_btnAbastecerActionPerformed

    private void btnCambioPassarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambioPassarActionPerformed
        relampago.passandoMaisUmaMasha();
        if(relampago.getCambio()==0){
            lblCambio.setText("Ponto morto");
        }else{
            lblCambio.setText((relampago.getCambio()).toString());
        }
    }//GEN-LAST:event_btnCambioPassarActionPerformed

    private void btnCambioVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambioVoltarActionPerformed
        relampago.voltandoUmaMarcha();
        if(relampago.getCambio()==0){
            lblCambio.setText("Ponto morto");
        }else{
            lblCambio.setText((relampago.getCambio()).toString());
        }
    }//GEN-LAST:event_btnCambioVoltarActionPerformed

    private void btnStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusActionPerformed
        relampago.statusCarro();
        if(relampago.getStatus()){
            btnStatus.setText("Ligado");
        }
        else{            
            btnStatus.setText("Desligado");
        }
    }//GEN-LAST:event_btnStatusActionPerformed

    private void btnEmbreajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmbreajarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmbreajarActionPerformed

    private void btnAcelerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcelerarActionPerformed
      
       relampago.acelerarCarro();
       lblVelocidade.setText(relampago.getVelocidade().toString());
      
    }//GEN-LAST:event_btnAcelerarActionPerformed

    private void btnFreirar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFreirar1ActionPerformed
        relampago.freiarCarro();
        lblVelocidade.setText(relampago.getVelocidade().toString());
    }//GEN-LAST:event_btnFreirar1ActionPerformed

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
            java.util.logging.Logger.getLogger(RelampagoMarquinhos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelampagoMarquinhos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelampagoMarquinhos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelampagoMarquinhos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelampagoMarquinhos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbastecer;
    private javax.swing.JButton btnAcelerar;
    private javax.swing.JButton btnCambioPassar;
    private javax.swing.JButton btnCambioVoltar;
    private javax.swing.JButton btnEmbreajar;
    private javax.swing.JButton btnFreirar1;
    private javax.swing.JButton btnStatus;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCambio;
    private javax.swing.JLabel lblVelocidade;
    private javax.swing.JLabel lblVelocidade1;
    private javax.swing.JProgressBar objCombustivel;
    // End of variables declaration//GEN-END:variables
}
