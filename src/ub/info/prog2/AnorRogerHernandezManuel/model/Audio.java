/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ub.info.prog2.AnorRogerHernandezManuel.model;

import java.io.File;
import ub.info.prog2.AnorRogerHernandezManuel.controlador.Motor;
import ub.info.prog2.utils.ReproException;

/**
 *
 * @author roger
 */
public class Audio extends FitxerMultimedia{
    private File fitxerImatge;
    private int kbps;
    
    
   /**
    * Constructor de la classe audio.
    * @param cami Demana el cami del audio
    * @param fitxerImatge Demana el fitxer
    * @param autor Demana el autor del audio
    * @param codec Demana el codec del audio
    * @param kbps Demana els "kilobits per second" del audio
    * @param motor Demana el motor amb el qual es reprodueix l'audio
    */ 
    public Audio(String cami, File fitxerImatge, String autor, String codec, int kbps, Motor motor){
        
        super(cami,autor,codec,motor);
        this.fitxerImatge=fitxerImatge;
        this.kbps=kbps;
    
    }
    /**
     * Metode no disponible todavia
     * @throws ReproException 
     */
    @Override
    public void reproduir() throws ReproException {
        this.getMotor().reprodueix(this, getFitxerImatge());
    }

    /**
     * @return fitxerImatge retorna la imatge del audio
     */
    public File getFitxerImatge() {
        return fitxerImatge;
    }

    /**
     * @param fitxerImatge Assigna una imatge al audio
     */
    public void setFitxerImatge(File fitxerImatge) {
        this.fitxerImatge = fitxerImatge;
    }

    /**
     * @return kbps Retorna els kbps del audio
     */
    public int getKbps() {
        return kbps;
    }

    /**
     * @param kbps Assigna els kbps
     */
    public void setKbps(int kbps) {
        this.kbps = kbps;
    }
    
}
