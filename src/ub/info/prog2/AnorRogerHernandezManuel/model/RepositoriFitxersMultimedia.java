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
public class RepositoriFitxersMultimedia extends LlistaFitxers {

/**
 * Afegeix un fitxer al repositori.
 * @param fitxer Demana un fitxer.
 * @throws ReproException Retorna una excepció si aqueest fitxer no existeix.
 */
    public void addFitxer(File fitxer) throws ReproException {
  
        if(!this.llistaFitxers.contains(fitxer)&& fitxer.exists()){
                super.addFitxer(fitxer);  //metode que crida el de LlistaFitxers
        }
        else{
            if(this.llistaFitxers.contains(fitxer)){ 
                    throw new ReproException("L'arxiu ja esta al repositori"); 
            }
            else{throw new ReproException("No existeix l'arxiu");}
            }
        }
    
    public File getFitxer(int i){
        return this.llistaFitxers.get(i);
    
    }
}
