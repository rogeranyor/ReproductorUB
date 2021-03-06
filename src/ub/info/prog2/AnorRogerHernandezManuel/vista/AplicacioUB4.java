/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ub.info.prog2.AnorRogerHernandezManuel.vista;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import ub.info.prog2.AnorRogerHernandezManuel.controlador.Controlador;
import ub.info.prog2.utils.ReproException;

/**
 *
 * @author Roger Pc
 */
public class AplicacioUB4 extends javax.swing.JFrame {

    /**
     * Creates new form AplicacioUB4
     */
    Errors err;
    Controlador controlador;
    public AplicacioUB4() {
        initComponents();
        controlador=new Controlador();
        this.setLocationRelativeTo(null);
        err=new Errors(this,true);
        err.setTitle("Error");
        err.pack();
        err.setLocationRelativeTo(null);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        llistaRepositori = new javax.swing.JList<>();
        btnAfegitFitxer = new javax.swing.JButton();
        btnEliminarFitxer = new javax.swing.JButton();
        btnReproduirTot = new javax.swing.JButton();
        btnReproduirFitxer = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnPausa = new javax.swing.JButton();
        btnResume = new javax.swing.JButton();
        btnParar = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnCiclic = new javax.swing.JToggleButton();
        btnReverse = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        btnCrearPortafoli = new javax.swing.JButton();
        btnEliminarPortafoli = new javax.swing.JButton();
        btnAfegirFitxerPortafoli = new javax.swing.JButton();
        btnEliminarFitxerPortafoli = new javax.swing.JButton();
        btnReprodou??rRepositori1 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnRecuperar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        llistaFitxersPorfatoli = new javax.swing.JList<>();
        llistaPortafolis = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jScrollPane1.setViewportView(llistaRepositori);

        btnAfegitFitxer.setText("Afegir Fitxer");
        btnAfegitFitxer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfegitFitxerActionPerformed(evt);
            }
        });

        btnEliminarFitxer.setText("Eliminar Fitxer");
        btnEliminarFitxer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFitxerActionPerformed(evt);
            }
        });

        btnReproduirTot.setText("Reproduir Tot");
        btnReproduirTot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReproduirTotActionPerformed(evt);
            }
        });

        btnReproduirFitxer.setText("Reproduir");
        btnReproduirFitxer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReproduirFitxerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAfegitFitxer, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(btnReproduirFitxer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminarFitxer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnReproduirTot, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarFitxer)
                    .addComponent(btnAfegitFitxer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReproduirFitxer)
                    .addComponent(btnReproduirTot))
                .addGap(25, 25, 25))
        );

        btnPausa.setText("Pausa");
        btnPausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPausaActionPerformed(evt);
            }
        });

        btnResume.setText("Resume");
        btnResume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumeActionPerformed(evt);
            }
        });

        btnParar.setText("Parar la reproducci??");
        btnParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPararActionPerformed(evt);
            }
        });

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnCiclic.setText("Activa/desactiva C??clic");
        btnCiclic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCiclicActionPerformed(evt);
            }
        });

        btnReverse.setText("Activa/desactiva Reverse");
        btnReverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReverseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnParar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnResume, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPausa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCiclic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReverse, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPausa)
                    .addComponent(btnResume))
                .addGap(18, 18, 18)
                .addComponent(btnParar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCiclic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(btnReverse))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        btnCrearPortafoli.setText("Crear portafoli");
        btnCrearPortafoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPortafoliActionPerformed(evt);
            }
        });

        btnEliminarPortafoli.setText("Eliminar Portafoli");
        btnEliminarPortafoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPortafoliActionPerformed(evt);
            }
        });

        btnAfegirFitxerPortafoli.setText("Afegir fitxer a un portafoli");
        btnAfegirFitxerPortafoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfegirFitxerPortafoliActionPerformed(evt);
            }
        });

        btnEliminarFitxerPortafoli.setText("Eliminar fitxer d'un portafoli");
        btnEliminarFitxerPortafoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFitxerPortafoliActionPerformed(evt);
            }
        });

        btnReprodou??rRepositori1.setText("Reprodu??r tot un portafoli");
        btnReprodou??rRepositori1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReprodou??rRepositori1ActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar Dades");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnRecuperar.setText("Recuperar Dades");
        btnRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuperarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAfegirFitxerPortafoli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCrearPortafoli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminarFitxerPortafoli, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarPortafoli, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRecuperar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnReprodou??rRepositori1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearPortafoli, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarPortafoli, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAfegirFitxerPortafoli, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarFitxerPortafoli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReprodou??rRepositori1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 32, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRecuperar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        jScrollPane2.setViewportView(llistaFitxersPorfatoli);

        llistaPortafolis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llistaPortafolisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(llistaPortafolis, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(llistaPortafolis, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReproduirFitxerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReproduirFitxerActionPerformed
        try {
            controlador.openFinestraReproductor();
            controlador.playFitxer(this.llistaRepositori.getSelectedIndex()+1);
        } catch (ArrayIndexOutOfBoundsException ex) {
           err.setText("Array buida");
           err.setVisible(true);
            try {
                controlador.closeFinestraReproductor();
            } catch (ReproException ex1) {
                err.setText(ex.getMessage());
                err.setVisible(true);
            }
        } catch (ReproException ex) {
            err.setText(ex.getMessage());
            err.setVisible(true);
        }
        
    }//GEN-LAST:event_btnReproduirFitxerActionPerformed

    private void btnAfegitFitxerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfegitFitxerActionPerformed
        FrmAfegirFitxerMultimedia dialog =new FrmAfegirFitxerMultimedia(this,true,controlador,err);
        dialog.setTitle("Afegir Arxiu");
        dialog.pack();
        dialog.setVisible(true);   
        omplirLlistaRepositori();
        
    }//GEN-LAST:event_btnAfegitFitxerActionPerformed

    private void btnEliminarFitxerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFitxerActionPerformed
        try {
            controlador.removeFitxer(this.llistaRepositori.getSelectedIndex()+1);
            omplirLlistaRepositori();
            this.omplirLlistaPortafoliFitxers();
        } catch (ReproException ex) {
            err.setText(ex.getMessage());
            err.setVisible(true);
        }
        catch (IndexOutOfBoundsException ex) {
           err.setText(ex.getMessage());
           err.setVisible(true);
        }
               
         
    }//GEN-LAST:event_btnEliminarFitxerActionPerformed

    private void btnReproduirTotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReproduirTotActionPerformed
         try {
            controlador.openFinestraReproductor();
            controlador.playLlista();
             } 
         catch (IndexOutOfBoundsException ex) {
           err.setText("Array buida");
           err.setVisible(true);
            try {
                controlador.closeFinestraReproductor();
            } catch (ReproException ex1) {
                err.setText(ex.getMessage());
                err.setVisible(true);
            }
        } catch (ReproException ex) {
            err.setText(ex.getMessage());
            err.setVisible(true);
        }
    }//GEN-LAST:event_btnReproduirTotActionPerformed

    private void btnRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperarActionPerformed
        try {
            controlador.loadDades("data.dat");
            controlador.setMotor();
            omplirLlistaRepositori();
            omplirLlistaPorfatolis();
            this.omplirLlistaPortafoliFitxers();
            this.btnCiclic.setSelected(controlador.getCiclic());
            this.btnReverse.setSelected(controlador.getReverse());
        } catch (ReproException ex) {
            err.setText(ex.getMessage());
            err.setVisible(true);
        }
    }//GEN-LAST:event_btnRecuperarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            controlador.saveDades("data.dat");
        } catch (ReproException ex) {
            err.setText(ex.getMessage());
            err.setVisible(true);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnPausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPausaActionPerformed
        try {
            controlador.pauseReproduccio();
        } catch (ReproException ex) {
            err.setText(ex.getMessage());
            err.setVisible(true);
        }
    }//GEN-LAST:event_btnPausaActionPerformed

    private void btnResumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumeActionPerformed
        try {
            controlador.resumeReproduccio();
        } catch (ReproException ex) {
            err.setText(ex.getMessage());
            err.setVisible(true);
        }
    }//GEN-LAST:event_btnResumeActionPerformed

    private void btnReverseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReverseActionPerformed
        if(controlador.getReverse()){
            controlador.setReverse(false);
        }
        else{
            controlador.setReverse(true);
        }
    }//GEN-LAST:event_btnReverseActionPerformed

    private void btnCiclicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCiclicActionPerformed
        if(controlador.getCiclic()){
            controlador.setCiclic(false);
        }
        else{
            controlador.setCiclic(true);
        }
    }//GEN-LAST:event_btnCiclicActionPerformed

    private void btnPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPararActionPerformed
        try {      
            controlador.stopReproduccio();
        } catch (ReproException ex) {
            err.setText(ex.getMessage());
            err.setVisible(true);
        }
    }//GEN-LAST:event_btnPararActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        try {
            controlador.jumpReproduccio();
        } catch (ReproException|NullPointerException ex) {
            err.setText("Llista acabada, torna a comen??ar o activa el ciclic");
            err.setVisible(true);
        }
        catch(IndexOutOfBoundsException e){
            err.setText("Llista acabada, torna a comen??ar o activa el ciclic");
            err.setVisible(true);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnEliminarPortafoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPortafoliActionPerformed
        try {
            controlador.removePortafoli(this.llistaPortafolis.getSelectedItem().toString());
            omplirLlistaPorfatolis();
        } catch (ReproException ex) {
            err.setText(ex.getMessage());
            err.setVisible(true);
        }
        catch (NullPointerException ex) {
            err.setText("Opci?? no valida");
            err.setVisible(true);
        }
    }//GEN-LAST:event_btnEliminarPortafoliActionPerformed

    private void btnCrearPortafoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPortafoliActionPerformed
        AfegirPortafoli af = new AfegirPortafoli(this,true,controlador);
        af.setTitle("Afegir Portafoli");
        af.pack();
        af.setVisible(true);
        omplirLlistaPorfatolis();
        
        
    }//GEN-LAST:event_btnCrearPortafoliActionPerformed

    private void btnAfegirFitxerPortafoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfegirFitxerPortafoliActionPerformed
        try {
            controlador.addFitxer(this.llistaPortafolis.getSelectedItem().toString(), this.llistaRepositori.getSelectedIndex()+1);
            omplirLlistaPortafoliFitxers();
        } catch (ReproException ex) {
            err.setText(ex.getMessage());
            err.setVisible(true);
        } catch (NullPointerException ex) {
            err.setText("Fitxer no seleccionat");
            err.setVisible(true);
        }
    }//GEN-LAST:event_btnAfegirFitxerPortafoliActionPerformed

    private void btnReprodou??rRepositori1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReprodou??rRepositori1ActionPerformed
        try {
            controlador.openFinestraReproductor();
            controlador.playLlista(this.llistaPortafolis.getSelectedItem().toString());
        } catch (ReproException|NullPointerException ex) {
            err.setText("Portafoli buit");
            err.setVisible(true);
            try {
                controlador.closeFinestraReproductor();
            } catch (ReproException ex1) {
                err.setText("Porfoli no disponible");
                err.setVisible(true);
            }
        }
        catch(IndexOutOfBoundsException e){
            err.setText("Porfoli no disponible");
            err.setVisible(true);
            try {
                controlador.closeFinestraReproductor();
            } catch (ReproException ex) {
                err.setText(ex.getMessage());
                err.setVisible(true);
            }
        
        }
    }//GEN-LAST:event_btnReprodou??rRepositori1ActionPerformed
    private void llistaPortafolisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llistaPortafolisActionPerformed
        this.omplirLlistaPortafoliFitxers();
    }//GEN-LAST:event_llistaPortafolisActionPerformed
    private void btnEliminarFitxerPortafoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFitxerPortafoliActionPerformed
        try {
            controlador.removeFitxer(this.llistaPortafolis.getSelectedItem().toString(), this.llistaFitxersPorfatoli.getSelectedIndex()+1);
            omplirLlistaPortafoliFitxers();
            
        } catch (ReproException ex) {
            err.setText(ex.getMessage());
            err.setVisible(true);    
        } catch (NullPointerException ex) {
            err.setText("Fitxer no valid o no existeix");
            err.setVisible(true);
        }
    }//GEN-LAST:event_btnEliminarFitxerPortafoliActionPerformed
    public void omplirLlistaRepositori(){ //repositori
        DefaultListModel model = new DefaultListModel();
        model.clear();
        for(String item:controlador.showRepositoriChiquito()){
            
            model.addElement(item);     
        }
        llistaRepositori.setModel(model);
    }
    public void omplirLlistaPorfatolis(){ //llista portafolis
        this.llistaPortafolis.removeAllItems();
        for(String i:controlador.showPortafolis()){
            this.llistaPortafolis.addItem(i.toString());
        }     
    }
    public void omplirLlistaPortafoliFitxers(){  //llista de un portafoli    
        try {
            DefaultListModel model = new DefaultListModel();
            model.clear();
            for(String item:controlador.showPortafoli(this.llistaPortafolis.getSelectedItem().toString())){
                    model.addElement(item);
                }         
            this.llistaFitxersPorfatoli.setModel(model);
        } catch (ReproException |NullPointerException ex) {
            
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
            java.util.logging.Logger.getLogger(AplicacioUB4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplicacioUB4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplicacioUB4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplicacioUB4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplicacioUB4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAfegirFitxerPortafoli;
    private javax.swing.JButton btnAfegitFitxer;
    private javax.swing.JToggleButton btnCiclic;
    private javax.swing.JButton btnCrearPortafoli;
    private javax.swing.JButton btnEliminarFitxer;
    private javax.swing.JButton btnEliminarFitxerPortafoli;
    private javax.swing.JButton btnEliminarPortafoli;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnParar;
    private javax.swing.JButton btnPausa;
    private javax.swing.JButton btnRecuperar;
    private javax.swing.JButton btnReprodou??rRepositori1;
    private javax.swing.JButton btnReproduirFitxer;
    private javax.swing.JButton btnReproduirTot;
    private javax.swing.JButton btnResume;
    private javax.swing.JToggleButton btnReverse;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> llistaFitxersPorfatoli;
    private javax.swing.JComboBox<String> llistaPortafolis;
    private javax.swing.JList<String> llistaRepositori;
    // End of variables declaration//GEN-END:variables
}
