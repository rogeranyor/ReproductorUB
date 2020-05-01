package ub.info.prog2.AnorRogerHernandezManuel.model;
import java.io.File;
import java.util.Date;
import ub.info.prog2.AnorRogerHernandezManuel.controlador.Motor;
import ub.info.prog2.utils.InFile;
import ub.info.prog2.utils.ReproException;
public abstract  class FitxerMultimedia extends File implements InFile{
    String autor;
    String codec;
    private transient Motor motor;
    /**
     * Crea un FitxerMultimedia amb la direccio del arxiu
     * @param cami ubicacio del arxiu
     */
    protected FitxerMultimedia(String cami, String nom, String codec, Motor motor){
        super(cami);
        this.autor=nom;
        this.codec=codec;
        this.motor=motor;
     
    }
    /**
     * Retorna la ultima modificacio del arxiu
     * @return retorna un Date amb la ultima modificaio que s'ha fet al arxiu
     */
    @Override
    public Date getUltimaModificacio() {
        Date data = new Date(this.lastModified());       
        return data;
    }
    /**
     * Retorna la ubicacio del arxiu
     * @return un String amb la ubicacio del arxiu
     */
    @Override
    public String getCamiAbsolut() {    
        return this.getAbsolutePath();
    }
    /**
     *  Retorna el nom del fitxer
     * @return retorna el nom del fitxer
     */
    @Override
    public String getNomFitxer() {
            return this.getName();
    }
    /**
     * Retorna l'autor del fitxer
     * @return retorna l'autor del fitxer
     */
    @Override
    public String getAutor() {
        return this.autor;
    }
    /**
     * Declara el autor del fitxer
     * @param nom Fa un set del Autor al fitxer
     */
    @Override
    public void setAutor(String nom) {
        
        this.autor=nom;
    }
    /**
     *  Comprova si dos fitxers son iguals
     * @param fitxerMultimedia un objeta fitxerMultimedia 
     * @return  un boolea de si son iguales
     */
    @Override
    public boolean equals(Object fitxerMultimedia){
        
        if (fitxerMultimedia instanceof FitxerMultimedia ){  //comprueba que el objeto pasado es una instancia de la clase Fitxer multimedia                   
                FitxerMultimedia auxiliar = (FitxerMultimedia) fitxerMultimedia;               
                return  (auxiliar.getAutor().equals(this.getAutor())) && this.getAbsoluteFile().equals(auxiliar.getAbsoluteFile());           
        }
        else{      
            return false;
        }     
    }
    /**
     * Obte la informacio del fitxer en un string
     * @return  retorna un string amb la informacio del fitxer
     */
    @Override
    public String toString(){       
        String fitxer="";       
        if(this instanceof Audio){
        Audio f= (Audio) this;
        fitxer+= "\n AUDIO: " + "\n  Nom: "+f.getNomFitxer() +"\n  Autor: "+ f.getAutor()+ 
                 "\n  Camí: "+ f.getCamiAbsolut()+ "\n  Ultima modificació: "+ 
                 f.getUltimaModificacio()+ "\n  Codec: "+ 
                 f.codec+ "\n  Cami foto: "+f.getFitxerImatge()+ "\n  Kbps: " +f.getKbps();
        }
        else if(this instanceof Imatge){
        Imatge f= (Imatge) this;
        fitxer+= "IMATGE: " + "\n  Nom: "+f.getNomFitxer() +"\n  Autor: "+ f.getAutor()+ 
                 "\n  Camí: "+ f.getCamiAbsolut()+ "\n  Ultima modificació: "+ 
                 f.getUltimaModificacio()+ "\n  Codec: "+ 
                 f.codec+ "\n  Alçada: "+f.getAlçada()+"\n  Amplada: "+f.getAmplada();
        }
    return fitxer;
    
    
    }
    public Motor getMotor(){
        return motor;
    }
    public void setMotor(Motor motor){
        this.motor=motor;
    }
    /**
     * Metode abstracte que canviara segons l'herencia.
     * @throws ReproException 
     */
    
    public abstract void reproduir() throws ReproException;
   
     /**
     * Metode que retorna el codec
     * @return Codec Codec del arxiu
     */
    public String getCodec(){
        return this.codec;
    }
    
    /**
     * Assigna el codec
     * @param string Codec del arxiu
     */
    public void setCodec(String string){
        this.codec=string;
    }
}  


