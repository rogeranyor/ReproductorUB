/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ub.info.prog2.AnorRogerHernandezManuel.controlador;

import java.io.File;
import ub.info.prog2.AnorRogerHernandezManuel.model.Audio;
import ub.info.prog2.AnorRogerHernandezManuel.model.Imatge;
import ub.info.prog2.utils.EscoltadorReproduccioBasic;
import ub.info.prog2.utils.MotorBasic;
import ub.info.prog2.utils.ReproException;

/**
 *
 * @author roger
 */
public class Motor extends MotorBasic{
    public Motor(EscoltadorReproduccioBasic controlador) {
        super(controlador);
    }

    public void reprodueix(Imatge im){
        try {
            super.show(im);
        } catch (ReproException ex) {
            System.out.println(ex.getCause()+"\n No s'ha pogut reproduïr");
        }
        
        
    
    }
    
    public void reprodueix(Audio audio, File fitxerImatge){
        try {
            super.play(audio, fitxerImatge);
        } catch (ReproException ex) {
            System.out.println(ex.getCause()+"\n No s'ha pogut reproduïr");
        }
    
    }
    
    
}
