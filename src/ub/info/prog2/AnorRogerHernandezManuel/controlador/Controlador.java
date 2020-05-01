/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ub.info.prog2.AnorRogerHernandezManuel.controlador;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import ub.info.prog2.AnorRogerHernandezManuel.model.Dades;
import ub.info.prog2.AnorRogerHernandezManuel.model.FitxerMultimedia;
import ub.info.prog2.AnorRogerHernandezManuel.model.LlistaFitxers;
import ub.info.prog2.utils.InControlador;
import ub.info.prog2.utils.ReproException;

/**
 *
 * @author roger
 */
public class Controlador implements InControlador  {
    Dades data = new Dades();
    EscoltadorReproduccio escoltador = new EscoltadorReproduccio();
    Motor motor=new Motor(escoltador);
    
    /**
     * Llama al metode addAudio de dades.
     * @param camiAudio Demana el cami del audio
     * @param camiImatge Demana el cami de la imatge
     * @param autor Demana el autor del fitexr
     * @param codec Demana el codec del audio
     * @param kbps Demana els kilo bits per seconds del audio
     * @throws ReproException Llença un error en el cas de una excepció
     */
    @Override
    public void addAudio(String camiAudio, String camiImatge, String autor, String codec, int kbps) throws ReproException {
        data.addAudio(camiAudio, camiImatge, autor, codec, kbps,motor);      
    }
    /**
     * Llama al metode addImatge de dades.
     * @param cami Demana el cami de la imatge
     * @param autor Demana el autor de la imatge
     * @param codec Demana el codec de la imatge
     * @param alçada Demana l'alçada de la imatge
     * @param amplada Demana l'amplada de la imatge
     * @throws ReproException Llença un error en el cas de una excepció
     */
    @Override
    public void addImatge(String cami, String autor, String codec, int alçada, int amplada) throws ReproException {
        data.addImatge(cami, autor, codec, alçada, amplada,motor);
    }

    /**
     * Llama al metode showRepositori de dades.
     * @return Retorna una lista de strings
     */
    @Override
    public List<String> showRepositori() {
       return data.mostrarRepositori();
    }

    /**
     * Llama al metode eliminarfitxer de dades
     * @param i Index del fitxer
     * @throws ReproException Llença un error en el cas de una excepció
     */
    @Override
    public void removeFitxer(int i) throws ReproException {
        try{
            data.eliminarfitxer(i-1);}
        catch(ArrayIndexOutOfBoundsException e ){}
    }

    /**
     * Guarda les dades en un fitxer
     * @param string demana el string de dades
     * @throws ReproException Llença un error en el cas de una excepció
     */
    @Override
    public void saveDades(String string) throws ReproException {           
        File fitxers = new File(string);                         
        try {
            FileOutputStream fout = new FileOutputStream(fitxers);
            ObjectOutputStream oos= new ObjectOutputStream (fout);
            oos.writeObject(data);
            oos.close();
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }            
    }

    /**
     * Carrega les dades de un fitxer
     * @param string demana un string de path
     * @throws ReproException Llença un error en el cas de una excepció
     */
    @Override
    public void loadDades(String string) throws ReproException {                 
        File fitxers1 = new File(string);     
        try {
            FileInputStream fin = new FileInputStream(fitxers1);
            ObjectInputStream ois = new ObjectInputStream(fin);
            data= (Dades) ois.readObject();  
            ois.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Llama al metode addPortafoli de dades.
     * @param titol Demana el titol del portafoli
     * @throws ReproException Llença un error en el cas de una excepció
     */
    @Override
    public void addPortafoli(String titol) throws ReproException {
        try{
        data.addPorfoli(titol);
        }catch(ReproException ex){
            
        }
    }

    /**
     * Llama al metode mostrarPortafolis de dades
     * @return Retorna una lista de strings del portafoli
     */
    @Override
    public List<String> showPortafolis() {
        return data.mostrarPortafolis();
       
    }

    /**
     * Llama al metode eliminarPortafoli de dades
     * @param string demana el nom del portafoli
     * @throws ReproException Llença un error en el cas de una excepció
     */
    @Override
    public void removePortafoli(String string) throws ReproException {
        data.eliminarporfoli(string);
    }

    /**
     * Llama al metode existeixport de dades
     * @param string Demana el nom del portafoli
     * @return Retorna un booleano con la respuesta
     */
    @Override
    public boolean existPortafoli(String string) {
       return data.existeixport(string);
    }

    /**
     * Llama al metode addFitxerPortafoli de dades
     * @param titol demana el titol del portafoli
     * @param i Demana l'index del Fitxer
     * @throws ReproException Llença un error en el cas de una excepció
     * @throws IndexOutOfBoundsException Llença un error de index en el cas de una excepció amb aquest
     */
    @Override
    public void addFitxer(String titol, int i) throws ReproException,IndexOutOfBoundsException {
        try{data.addFitxerPortafoli(titol, (i-1));}
        catch(ReproException  ex){
            System.out.println(ex.getCause());   
        }
        catch(IndexOutOfBoundsException  ex){
            System.out.println("Index Out of Range");
            System.out.println(ex.getCause());   
        }
    }

    /**
     * Llama al metode showPortafoli de dades 
     * @param string Demana el titol del portafoli
     * @return Retorna una lista de strings amb el portafoli
     * @throws ReproException Llença un error en el cas de una excepció
     */
    @Override
    public List<String> showPortafoli(String string) throws ReproException {
        return data.showPortafoli(string);
    }

    /**
     * Llama al metode removeFitxerPortafoli de dades
     * @param string Demana el titol del portafoli
     * @param i Demana el index del fitxer
     * @throws ReproException Llença un error en el cas de una excepció
     */
    @Override
    public void removeFitxer(String string, int i) throws ReproException {
        data.removeFitxerPortafoli(string, (i-1));    
    }
    
    /**
     * Reprodueix un fitxer de la llista amb un index
     * @param i index del fitxer
     * @throws ReproException Llença un error en el cas de una excepció
     */
    @Override
    public void playFitxer(int i) throws ReproException {  
        FitxerMultimedia f= (FitxerMultimedia) data.getFitxer(i-1);
        LlistaFitxers llista_temp=new LlistaFitxers();
        llista_temp.addFitxer(f);  
        escoltador.iniciarReproduccio(llista_temp, this.getCiclic(), this.getReverse());
    }
    
    /**
     * Obre el reproductor.
     */
    @Override
    public void openFinestraReproductor() {
        this.motor.open();
    }

    /**
     * Tanca el reproductor.
     * @throws ReproException Llença un error en el cas de una excepció 
     */
    @Override
    public void closeFinestraReproductor() throws ReproException {
        this.motor.close();  
    }

    /**
     * Comença la reproducció de la llista.
     * @throws ReproException Llença un error en el cas de una excepció
     */
    @Override
    public void playLlista() throws ReproException { 
        escoltador.iniciarReproduccio(this.data.getRepositori(), this.getCiclic(), this.getReverse());
    }

    /**
     * Comença la reproducció d'un portafoli
     * @param string nom del portafoli
     * @throws ReproException Llença un error en el cas de una excepció
     */
    @Override
    public void playLlista(String string) throws ReproException {
        escoltador.iniciarReproduccio(this.data.getPortafoli(string), this.getCiclic(), this.getReverse());
    }

    /**
     * Resume la reproducció de la llista.
     * @throws ReproException Llença un error en el cas de una excepció
     */
    @Override
    public void resumeReproduccio() throws ReproException {
        motor.resume();
    }
    
    /**
     * Pausa la reproducció de la llista.
     * @throws ReproException Llença un error en el cas de una excepció
     */
    @Override
    public void pauseReproduccio() throws ReproException {
         motor.pause();
    }

    /**
     * Atura la reproducció de la llista.
     * @throws ReproException Llença un error en el cas de una excepció
     */
    @Override
    public void stopReproduccio() throws ReproException {
        motor.stop();
    }

    /**
     * Salta al següent audio.
     * @throws ReproException Llença un error en el cas de una excepció
     */
    @Override
    public void jumpReproduccio() throws ReproException {
        escoltador.next();
    }
    
    /**
     * Assigna el motor
     */
    public void setMotor(){
        data.setMotor(motor);
    
    }
    
    /**
     * Assigna el valor de ciclic.
     * @param b Valor del boolean
     */
    public void setCiclic(boolean b){
        data.setCiclic(b);
        escoltador.setCiclic(b);
    }
    
    /**
     * Assigna el valor del reverse.
     * @param b 
     */
    public void setReverse(boolean b){
        data.setReverse(b);
        escoltador.setReverse(b);
    }
    
    /**
     * Retorna el valor de ciclic
     * @return Valor de ciclic
     */
    public boolean getCiclic(){
        return data.getCiclic();
    }
    
    /**
     * Retorna el valor de reverse
     * @return Valor de reverse
     */
    public boolean getReverse(){
        return data.getReverse();
    }
}
