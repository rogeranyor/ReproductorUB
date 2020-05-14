/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ub.info.prog2.AnorRogerHernandezManuel.model;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import ub.info.prog2.AnorRogerHernandezManuel.controlador.Motor;
import ub.info.prog2.utils.ReproException;

/**
 *
 * @author roger
 */
public class Dades implements Serializable{
    
    private final RepositoriFitxersMultimedia repositori=new RepositoriFitxersMultimedia();
    private final ArrayList<PortafoliFitxersMultimedia> portafolis= new ArrayList<>(); 
    boolean ciclic=false,reverse=false;
   
    
    /**
     * Afegeix un audio al repositori multimedia
     * @param camiAudio Demana el cami del audio
     * @param camiImatge Demana el cami de la imatge
     * @param autor Demana el autor del audio
     * @param codec Demana el codec del audio
     * @param kbps Demana els kilo bits per second del audio
     * @throws ReproException Llença un error en el cas de una excepció
     */
    public void addAudio(String camiAudio,String camiImatge,String autor,String codec,int kbps,Motor motor) throws ReproException{
        try{
        File imatge = new File(camiImatge);  
        Audio audio = new Audio(camiAudio, imatge, autor, codec,kbps,motor);
        repositori.addFitxer(audio);  }
         catch(ReproException e){
           System.out.println("No existeix l'arxiu");
           System.out.println(e.getCause());
       }
    }
    
    /**
     * Afegeix una imatge al repositori multimedia
     * @param cami Demana el cami de la imatge
     * @param autor Demana el autor de la imatge
     * @param codec Demana el codec de la imatge
     * @param alçada Demana l'alçada de la imatge
     * @param amplada Demana l'amplada de la imatge
     * @throws ReproException Llença un error en el cas de una excepció
     */
    public void addImatge(String cami, String autor, String codec, int alçada, int amplada,Motor motor) throws ReproException{
       try{
        Imatge imatge= new Imatge(cami,autor,codec,alçada,amplada,motor);
        repositori.addFitxer(imatge);   }
       catch(ReproException e){
           System.out.println("No existeix l'arxiu");
           System.out.println(e.getCause());
       }
    }
     
    /**
     * Mostra el repositori multimedia
     * @return retorna una lista de strings amb el repositori
     */
    public List<String> mostrarRepositori(){
        List<String>lista = new ArrayList<>();
        String temp=" ";
        for (int i=0;i<repositori.getSize();i++){
            temp= (i+1)+". "+repositori.getAt(i).toString()+"\n";
            lista.add(temp);      
        }
        return lista;
    }
    /**
     * Elimina un fitxer del repositori multimedia
     * @param i Demana l'index del fitxer
     * @throws ReproException Llença un error en el cas de una excepció
     */
    public void eliminarfitxer(int i) throws ReproException{
     
        try{
            for (int x=0;x<portafolis.size();x++){
                if(this.portafolis.get(x).llistaFitxers.contains(this.repositori.getAt(i))){   
                        System.out.println("Borrat del portafoli "+ this.portafolis.get(x).getTitol());    
			this.portafolis.get(x).llistaFitxers.remove(this.repositori.getAt(i));
                        x--;
                }                                       
            }
            this.repositori.removeFitxer(this.repositori.getAt(i)); 
            
            
        }
        catch(ArrayIndexOutOfBoundsException e ){
            throw new ReproException("Indice no valido");
            
        }  
        catch(IndexOutOfBoundsException ex){
            System.out.println("Indice no valido");
        }
    }
    
    /**
     * Afegeix un portafoli
     * @param titol Demana el titol del portafoli
     * @throws ReproException Llença un error en el cas de una excepció
     */
    public void addPorfoli(String titol) throws ReproException{    
        for(PortafoliFitxersMultimedia i: portafolis){
            if(i.getTitol().equals(titol)){
                throw new ReproException("Portafolio repetido");           
            }
        }
        PortafoliFitxersMultimedia folis= new PortafoliFitxersMultimedia(titol);
        this.portafolis.add(folis);
    }
     
    /**
     * Mostra els portafolis
     * @return Retorna una llista de strings amb els portafolis
     */
    public List<String> mostrarPortafolis(){
        List<String>lista = new ArrayList<>();
        String temp=" ";
         
        for(int i=0; i<this.portafolis.size();i++){
            temp=(i+1)+". "+this.portafolis.get(i).getTitol()+"\n";
            lista.add(temp);       
        }        
        return lista;
    }
     
    /**
     * Elimina un portafoli de la llista
     * @param titol Demana el titol del portafoli
     * @throws ReproException Llença un error en el cas de una excepció
     */
    public void eliminarporfoli(String titol) throws ReproException{
        boolean deleted=false;
        int i=0;
        try{
             
            while(i<this.portafolis.size() && !deleted){
                
                if(this.portafolis.get(i).getTitol().equals(titol)){
                    this.portafolis.remove(i);
                    deleted=true;                 
                }
                else{i++;}
             
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            throw new ReproException("No existeix el porfoli");
             
        } 
    }
     
    /**
     * Comprova si existeix un portafoli
     * @param titol Demana el titol del portafoli
     * @return Retorna un booleano amb el resultat de l'operacio
     */
    public boolean existeixport(String titol){
         boolean exist=false;
         int i=0;
            
            while(i<this.portafolis.size() && !exist){
                if(this.portafolis.get(i).getTitol().equals(titol)){
                    exist=true;
                
                }
                else{i++;}
            
            }
         
        return exist;   
            
     }
     
    /**
     * Afegeix un fitxer a un portafoli
     * @param titol Demana el titol del portafoli
     * @param x Demana l'index dins del portafoli
     * @throws ReproException Llença un error en el cas de una excepció
     */
    public void addFitxerPortafoli(String titol,int x) throws ReproException{
        boolean afegit = false;
        int i =0;
        
        while(i<this.portafolis.size() && !afegit){
            if(this.portafolis.get(i).getTitol().equals(titol)){           
                try {
                    this.portafolis.get(i).addFitxer(this.repositori.getAt(x));
                    afegit = true;
                } catch (ReproException ex) {
                    ex.getCause();
                    throw new ReproException("No s'ha afegit l'arxiu");
                }
            }
            else{i++;}
        }     
    }
     
    /**
     * Mostra el contingut d'un portafoli
     * @param titol Demana el titol del portafoli
     * @return Retorna una llista de strings amb els portafolis
     */
    public List<String> showPortafoli (String titol){
        List<String> p= new ArrayList<>();
        int i= 0;
        boolean trobat=false;
        while(i<portafolis.size() && !trobat){
            if(this.portafolis.get(i).getTitol().equals(titol)){
                p.add(this.portafolis.get(i).toString());
                trobat=true;
            
            }
            else{i++;}
        }
        return p;
    }
    
    /**
     * Elimina un fitxer d'un portafoli
     * @param titol Demana el titol del portafoli
     * @param x Demanaa l'index del fitxer
     * @throws ReproException Llença un error en el cas de una excepció
     */
    public void removeFitxerPortafoli(String titol,int x) throws ReproException{
        try{
            boolean eliminat = false;
            int i =0;

            while(i<this.portafolis.size() && !eliminat){
                if(this.portafolis.get(i).getTitol().equals(titol)){           
                    this.portafolis.get(i).llistaFitxers.remove(x);
                    eliminat = true;
                }
                else{i++;}
            }     
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Indice no valido");
        
        }
        catch(IndexOutOfBoundsException ex){
            System.out.println("Indice no valido");
        }
    }
    public File getFitxer(int i){
        return repositori.getFitxer(i);  
    }
    
    public void setMotor (Motor motor){
        FitxerMultimedia f;
        for (int i=0;i<repositori.getSize();i++){
            f = (FitxerMultimedia)repositori.llistaFitxers.get(i);
            f.setMotor(motor);       
        }
    }
      
    public boolean getCiclic(){
        return ciclic;
    
    }
    public boolean getReverse(){
        return reverse;
    }
    public void setCiclic(boolean b){
        this.ciclic=b;
    }
    public void setReverse(boolean b){
        this.reverse=b;
    }
    public RepositoriFitxersMultimedia getRepositori(){
        return repositori;
    
    }
    public PortafoliFitxersMultimedia getPortafoli(String titol){
         
        PortafoliFitxersMultimedia ll =null;
        for(PortafoliFitxersMultimedia i: portafolis){
            if(i.getTitol().equals(titol)){
                return ll=i;
            }
         }
        return ll;
    
    }
}

