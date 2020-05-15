/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ub.info.prog2.AnorRogerHernandezManuel.controlador;

import java.io.File;
import ub.info.prog2.AnorRogerHernandezManuel.model.FitxerMultimedia;
import ub.info.prog2.AnorRogerHernandezManuel.model.LlistaFitxers;
import ub.info.prog2.utils.EscoltadorReproduccioBasic;
import ub.info.prog2.utils.ReproException;
/**
 *
 * @author Roger Pc
 */
public class EscoltadorReproduccio extends EscoltadorReproduccioBasic {
    private LlistaFitxers llistaReproduint;
    private boolean reproduccioCiclica, reproduccioReverse;
    private int index;

    /**
     * Metode per continuar al seguent audio al acabar el actual.
     */
    @Override
    protected void onEndFile() {
        if(this.hasNext()){
            this.next();
        }
       
    }

    /**
     * Metode per reproduir el seguent audio. Depen del tipus de reproduccio
     * escogida.
     */
    @Override
    protected void next() {
        try {
            if(this.reproduccioReverse){
                if(index==0 && this.reproduccioCiclica){
                    index=this.llistaReproduint.getSize()-1;
                    File f= this.llistaReproduint.getAt(index);
                    ((FitxerMultimedia) f).reproduir();         
                }
                else{
                    index--;
                    File f= this.llistaReproduint.getAt(index);
                    ((FitxerMultimedia) f).reproduir();
                    
                }  
            }
            else{  
                if(index==this.llistaReproduint.getSize()-1 && this.reproduccioCiclica){
                    index=0;
                    File f= this.llistaReproduint.getAt(index);
                    ((FitxerMultimedia) f).reproduir();
                    
                }
                else{
                    index++;
                    File f= this.llistaReproduint.getAt(index);
                    ((FitxerMultimedia) f).reproduir();
                     
                }
            }       
        } 
        catch (ReproException ex) {
             throw new IndexOutOfBoundsException("No s'ha pogut reproduïr");
        }  
        catch(IndexOutOfBoundsException e){
            throw new IndexOutOfBoundsException("No s'ha pogut reproduïr");
        }
    }

    /**
     * Comprova si n'hi ha un audio següent.
     * Depen del tipus de reproduccio escogida.
     * @return Retorna true si te un audio seguent.
     */
    @Override
    protected boolean hasNext() {
        return (this.reproduccioCiclica) || (this.reproduccioReverse && index>0) || (this.index!=this.llistaReproduint.getSize()-1);
    }
    
    /**
     * Metode per iniciar la reproduccio d'una llista per reproduir.
     * @param llistaReproduint Llista per reproduir.
     * @param reproduccioCilcica Opcio per fer la reproducció de la llista ciclica.
     * @param reproduccioReverse Opcio per fer la reproducció de la llista en reverse.
     */
    public void iniciarReproduccio(LlistaFitxers llistaReproduint, boolean reproduccioCilcica, boolean reproduccioReverse) throws ReproException{ 
        this.llistaReproduint   = llistaReproduint;
        this.reproduccioCiclica = reproduccioCilcica;
        this.reproduccioReverse = reproduccioReverse;
        File f=null;
        try{
            if(this.reproduccioReverse){
                index=this.llistaReproduint.getSize()-1;
                 f = this.llistaReproduint.getAt(index);
            }
            else{
                index=0;
                 f = this.llistaReproduint.getAt(index);
            }   
            ((FitxerMultimedia) f).reproduir();  
        }
        catch(NullPointerException e){
            throw new NullPointerException("No es pot reproduïr");       
        }
        catch (ReproException ex ) {
            throw new ReproException("No es pot reproduïr");       
        }
        catch(ArrayIndexOutOfBoundsException e){
            throw new ArrayIndexOutOfBoundsException("No es pot reproduïr");       
        }

        
    }
    
    /**
     * Metode per assignar un valor a ReproduccióCiclica
     * @param b Valor del boolean
     */
    public void setCiclic(boolean b){
        this.reproduccioCiclica=b;
    }
    /**
     * Metode per assignar un valor a ReproduccióReverse
     * @param b Valor del boolean
     */
    public void setReverse(boolean b){
        this.reproduccioReverse=b;
    }
}
