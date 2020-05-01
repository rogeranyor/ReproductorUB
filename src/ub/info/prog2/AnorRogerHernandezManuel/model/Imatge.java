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
public class Imatge extends FitxerMultimedia{
    
    private int alçada;
    private int amplada;
    /**
     * Constructor de la classe imatge.
     * @param cami Demana el cami de la imatge
     * @param autor Demana el autor de la imatge
     * @param codec Demana el codec de la imatge
     * @param alçada Demana l'alçada de la imatge
     * @param amplada Demana l'amplada de la imatge
     * @param motor Demana el motor amb el qual reproduir l'imatge
     */
    public Imatge(String cami, String autor, String codec, int alçada, int amplada,Motor motor){
        
        super(cami,autor,codec,motor);
        this.alçada=alçada;
        this.amplada=amplada;

    }

    /**
     * Reprodueix el arxiu.
     * @throws ReproException Llença un error en el cas de una excepció 
     */
    @Override
    public void reproduir() throws ReproException {
        this.getMotor().reprodueix(this);
        
    }
    
    /**
     * Retorna la alcaada
     * @return 
     */
    public int getAlçada(){
         return alçada;
     }
    /**
     * @param alçada the alçada to set
     */
    public void setAlçada(int alçada) {
        this.alçada = alçada;
    }
    /**
     * @return the amplada
     */
    public int getAmplada() {
        return amplada;
    }
    /**
     * @param amplada the amplada to set
     */
    public void setAmplada(int amplada) {
        this.amplada = amplada;
    }
     
     
}
