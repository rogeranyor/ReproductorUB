/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ub.info.prog2.AnorRogerHernandezManuel.model;

import java.io.File;
import ub.info.prog2.utils.ReproException;

/**
 *
 * @author roger
 */
public class PortafoliFitxersMultimedia extends LlistaFitxers {
   
    public String autoraux;
    public final String titol;
    /**
     * Constructor del portafoli
     * @param titol Demana el titol
     */
    public PortafoliFitxersMultimedia(String titol){
        super();
        this.titol=titol;
    } 
    
    /**
     * Constructor del portafoli amb max
     * @param titol Demana el titol
     * @param max Demana el maxim de fitxers
     */
    public PortafoliFitxersMultimedia(String titol,int max){
        super(max);
        this.titol=titol;
    }
    
    /**
     * Afegeix un fitxer al portafoli
     * @param fitxer Demana el fitxer
     * @throws ReproException Llença un error en el cas d'una excepció
     */
    public void addFitxer(File fitxer) throws ReproException{

        if(fitxer instanceof FitxerMultimedia){
            FitxerMultimedia f = (FitxerMultimedia) fitxer;
            if (this.llistaFitxers.isEmpty()){
                super.addFitxer(fitxer); //metode que crida el de LlistaFitxers
                this.autoraux= f.autor;
                
            }
            else if((f.getAutor().equals(this.autoraux))){
                if(this.isFull()){
                    throw new ReproException("Esta ple");
                }
                else{
                    super.addFitxer(fitxer);
                }      
            }
        }
        else{
            throw new ReproException("El autor no coincide con el del portafolio");
        }   
    }
    /**
     * Metode que retorna el titol
     * @return Retorna el titol
     */
    public String getTitol(){
        return this.titol;
    }
    
}    
    

