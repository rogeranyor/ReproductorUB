package ub.info.prog2.AnorRogerHernandezManuel.model;
import java.io.File;
import java.io.Serializable;
import ub.info.prog2.utils.InFileList;
import ub.info.prog2.utils.ReproException;
import java.util.ArrayList;


public class LlistaFitxers implements InFileList,Serializable {
    
    public ArrayList <File> llistaFitxers;
    public int max;

    public LlistaFitxers(){   
       llistaFitxers =new ArrayList <>(100);
        this.max=100;      
    }
    public LlistaFitxers(int max){ 
       llistaFitxers =new ArrayList <>(max);
        this.max=max;    
    }
    /**
     *  Retorna el tamany de la llista
     * @return retorna un int del tamany de la llista
     */
    
    @Override
    public int getSize() {
        
        return llistaFitxers.size();

    }
    /**
     * Afegeix l'arxiu a la llista
     * @param file Rep parametre File que es vol afegir
     * @throws ReproException  Si no existeix l'arxiu envia el throw
     */
    @Override
    public void addFitxer(File file) throws ReproException {
            
            if(file.exists()&& !this.isFull()){
                llistaFitxers.add(file);                               
            }
            else{
                if(this.isFull() || llistaFitxers.size()==100){ 
                    throw new ReproException("Has arribat a la capacitat maxima"); 
                }
                else{throw new ReproException("No existeix l'arxiu");
                }
            }

    }
    /**
     *  Elimina un fitxer de la llista
     * @param file Rep el file que es vol borrar
     */
    @Override
    public void removeFitxer(File file){        
        if(this.llistaFitxers.remove(file)){      
        }
        else{  
            System.out.println("NO SE BORRO");
        } 
    }
    /**
     * Retorna un fitxer de la llista
     * @param i rep la posicio de la llista
     * @return retorna el fitxer
     */
    @Override
    public File getAt(int i) {        
        try{
            return llistaFitxers.get(i);      
        }
        catch(IndexOutOfBoundsException e){
            throw new IndexOutOfBoundsException();
        }
    }
    /**
     * Neteja la llista sencera
     */
    @Override
    public void clear() {    
        llistaFitxers.clear();
    }
    /**
     * Comprova si la llista esta plena
     * @return  un boolean si la llista esta plena
     */
    @Override
    public boolean isFull() {       
        return llistaFitxers.size()==max;
    }
    /**
     *  Fa un toString de tots els fitxers de la llista
     * @return un string de tots els fitxers
     */
    @Override
    public String toString(){   
        String fitxers="";       
        for(int i=0; i<llistaFitxers.size();i++){       
            fitxers+= (i+1)+ llistaFitxers.get(i).toString();
    }
    return fitxers;
    
    }
    
}
