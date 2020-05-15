/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ub.info.prog2.AnorRogerHernandezManuel.vista;

import java.io.File;
import javax.swing.JFileChooser;
import ub.info.prog2.AnorRogerHernandezManuel.controlador.Controlador;
import ub.info.prog2.utils.ReproException;

/**
 *
 * @author Roger Pc
 */
public class FrmAfegirFitxerMultimedia extends javax.swing.JDialog {

    /**
     * Creates new form FrmAfegirFitxerMultimedia
     */
    Controlador controlador;
    Errors err;
    public FrmAfegirFitxerMultimedia(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.btnSelectAudio.setEnabled(true);
        this.btnSelectImatge.setEnabled(true);
       
    }
    public FrmAfegirFitxerMultimedia(java.awt.Frame parent, boolean modal,Controlador controlador,Errors err) {
        super(parent, modal);
        initComponents();
        this.btnSelectAudio.setEnabled(true);
        this.btnSelectImatge.setEnabled(true);
        this.controlador=controlador;
        this.setLocationRelativeTo(null);
        this.err=err;
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
        jLabel1 = new javax.swing.JLabel();
        txtFitxerAudio = new javax.swing.JTextField();
        btnSelectAudio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtFitxerImatge = new javax.swing.JTextField();
        btnSelectImatge = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnAcceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("  Fitxer Imatge");

        txtFitxerAudio.setEditable(false);

        btnSelectAudio.setText("Seleccionar");
        btnSelectAudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectAudioActionPerformed(evt);
            }
        });

        jLabel2.setText("  FitxerAudio");

        txtFitxerImatge.setEditable(false);

        btnSelectImatge.setText("Seleccionar");
        btnSelectImatge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectImatgeActionPerformed(evt);
            }
        });

        jLabel3.setText("       Autor");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Audio", "Imatge" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        btnAcceptar.setText("Acceptar");
        btnAcceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addGap(45, 45, 45)
                        .addComponent(btnAcceptar)
                        .addGap(45, 45, 45)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtFitxerAudio, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFitxerImatge, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSelectImatge, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(btnSelectAudio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFitxerAudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSelectAudio)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFitxerImatge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSelectImatge))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAcceptar)
                            .addComponent(btnCancelar))))
                .addContainerGap(78, Short.MAX_VALUE))
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

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if(this.jComboBox1.getSelectedIndex()==1){
            this.btnSelectAudio.setEnabled(false);
        }
        else{
            this.btnSelectAudio.setEnabled(true);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnAcceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptarActionPerformed
        if(this.btnSelectAudio.isEnabled()){
            try {
                controlador.addAudio(this.txtFitxerAudio.getText(),this.txtFitxerImatge.getText(),this.txtAutor.getText(),".mp3",123);
                this.dispose();
            } catch (ReproException ex) {
                err.setText(ex.getMessage());
                err.setVisible(true);
            }
        }
        else{
            try {
                controlador.addImatge(this.txtFitxerImatge.getText(),this.txtAutor.getText(),".jpg", 10, 10);
                this.dispose();
            } catch (ReproException ex) {
                err.setText(ex.getMessage());
                err.setVisible(true);
            }       
                    
        }    
    }//GEN-LAST:event_btnAcceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSelectAudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectAudioActionPerformed
        File fitxer;
        JFileChooser select= new JFileChooser();
        int resultat=select.showOpenDialog(this);
        if(resultat==JFileChooser.APPROVE_OPTION){
            fitxer=select.getSelectedFile();
            this.txtFitxerAudio.setText(fitxer.toString());
        }
    }//GEN-LAST:event_btnSelectAudioActionPerformed

    private void btnSelectImatgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectImatgeActionPerformed
        File fitxer;
        JFileChooser select= new JFileChooser();
        int resultat=select.showOpenDialog(this);
        if(resultat==JFileChooser.APPROVE_OPTION){
            fitxer=select.getSelectedFile();
            this.txtFitxerImatge.setText(fitxer.toString());
        }
    }//GEN-LAST:event_btnSelectImatgeActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAfegirFitxerMultimedia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAfegirFitxerMultimedia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAfegirFitxerMultimedia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAfegirFitxerMultimedia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmAfegirFitxerMultimedia dialog = new FrmAfegirFitxerMultimedia(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSelectAudio;
    private javax.swing.JButton btnSelectImatge;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtFitxerAudio;
    private javax.swing.JTextField txtFitxerImatge;
    // End of variables declaration//GEN-END:variables
}
