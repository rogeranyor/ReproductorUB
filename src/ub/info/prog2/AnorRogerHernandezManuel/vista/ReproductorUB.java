package ub.info.prog2.AnorRogerHernandezManuel.vista;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import ub.info.prog2.utils.Menu;
import java.util.Scanner;
import ub.info.prog2.AnorRogerHernandezManuel.controlador.Controlador;
import ub.info.prog2.utils.ReproException;
public class ReproductorUB {
    
    static private enum OpcionsMenuPrincipal {MENU_PRINCIPAL_OPCIO1,MENU_PRINCIPAL_OPCIO2,MENU_PRINCIPAL_OPCIO3,MENU_PRINCIPAL_OPCIO4,MENU_PRINCIPAL_SORTIR};
    static private enum OpcionsSubMenu{MENU_SUBPRINCIPAL_OPCIO1,MENU_SUBPRINCIPAL_OPCIO2,MENU_SUBPRINCIPAL_OPCIO3,MENU_SUBPRINCIPAL_OPCIO4,MENU_SUBPRINCIPAL_OPCIO5,MENU_SUBPRINCIPAL_OPCIO6,MENU_SUBPRINCIPAL_SORTIR}
    static private enum OpcionsEliminar {MENU_PRINCIPAL_OPCIO1,MENU_PRINCIPAL_OPCIO2};
    static private enum OpcionsAfegir {MENU_PRINCIPAL_OPCIO1,MENU_PRINCIPAL_OPCIO2,MENU_PRINCIPAL_SORTIR};
    static private enum OpcionsSubMenu2 {MENU_SUBPRINCIPAL_OPCIO1,MENU_SUBPRINCIPAL_OPCIO2,MENU_SUBPRINCIPAL_OPCIO3,MENU_SUBPRINCIPAL_OPCIO4,MENU_SUBPRINCIPAL_OPCIO5,MENU_SUBPRINCIPAL_OPCIO6,MENU_SUBPRINCIPAL_SORTIR};
    static private enum OpcionsActual {MENU_SUBPRINCIPAL_OPCIO1,MENU_SUBPRINCIPAL_OPCIO2,MENU_SUBPRINCIPAL_OPCIO3,MENU_SUBPRINCIPAL_OPCIO4,MENU_SUBPRINCIPAL_SORTIR};
    List<String> lista= new ArrayList<>();
    Controlador controlador = new Controlador();
    private static final String[] descMenu={        " Dona accés a un menú per a la gestió dels fitxers multimèdia en el repositori i els portafolis",
                                                    " Dona accés a un menú per al control de la reproducció de fitxers",
                                                    " Guarda les dades del reproductor a un fitxer de disc.",
                                                    " Carrega les dades del reproductor prèviament guardades d’un fitxer",
                                                    " Surt del reproductor."};
    
    private static final String[] descSubMenu={     " Demana les dades d’un nou portafoli i l’afegeix a la llista de portafolis del reproductor.",
                                                    " Mostra els portafolis disponibles al reproductor,",
                                                    " Elimina de la llista de portafolis del reproductor el portafoli corresponent a un títol demanat a l’usuari.",
                                                    " Afegeix un fitxer multimèdia al repositori o a un portafoli",
                                                    " Mostra el contingut del repositori o d’un portafoli ",
                                                    " Eliminar del repositori o d’un portafoli el fitxer multimèdia corresponent a una posició donada de la llista",
                                                    " Torna al menú principal"};
     
    private static final String[] descAfegir={      "Afegir Audio",
                                                    "Afegir imatge",
                                                    "Menu anterior"};
    
    private static final String [] desSubMenu2={    " Permet reproduir un fitxer multimèdia del repositori.",
                                                    " Permet reproduir tots els fitxers del repositori.",
                                                    " Permet reproduir tots els fitxers d’un portafoli.",
                                                    " Activa i desactiva el mode de reproducció cíclica del repositori o qualsevol portafoli",
                                                    " Activa i desactiva el mode de reproducció reverse del repositori o qualsevol portafoli.",
                                                    " Obre un menú per la gestió de la reproducció actual.",
                                                    " Torna al menú principal"};
    
    private static final String[] descActual={      " Re-activa la reproducció després d’una pausa o una parada",
                                                    " Pausa la reproducció.",
                                                    " Para la reproducció.",
                                                    " Salta del fitxer actual i passa al següent/anterior fitxer.",
                                                    " Torna al menú anterior"};
     
    public void gestioSubMenu1() throws ReproException{
        Scanner sc = new Scanner(System.in);
        Menu<OpcionsSubMenu> menu1=new Menu<OpcionsSubMenu>("SubMenu Principal",OpcionsSubMenu.values());
        menu1.setDescripcions(descSubMenu);
        OpcionsSubMenu opcio=null;
              
        String titol;
        int eliminar,option=0;
    
        do{
            menu1.mostrarMenu();
            boolean exit0=false;
            
            while(!exit0){
                try{
                        opcio=menu1.getOpcio(sc);
                        exit0=true;
                }
                 catch (Exception e){
                    System.out.println("No és una opció vàlida.");
                    sc.nextLine();
                }
            }

        switch(opcio){
           case MENU_SUBPRINCIPAL_OPCIO1:
               System.out.println("Has seleccionat crear un porfoli.");
               System.out.println("Insereix el titol del portafoli");
               titol = sc.nextLine();
               controlador.addPortafoli(titol);
               
           break;
        case MENU_SUBPRINCIPAL_OPCIO2:
               System.out.println("Has seleccionat mostrar portafolis");
               
               lista=controlador.showPortafolis();
               for(int i=0;i<lista.size();i++){
                   System.out.print(lista.get(i)); 
               }
               
           break;
        case MENU_SUBPRINCIPAL_OPCIO3:
               System.out.println("Has seleccionat eliminar portafoli."+"\n Quin vols eliminar?. Insereix el nom");
               lista=controlador.showPortafolis();
               for(int i=0;i<lista.size();i++){
                   System.out.print(lista.get(i)); 
               }
               titol = sc.nextLine();
               controlador.removePortafoli(titol);
               
           break;
        case MENU_SUBPRINCIPAL_OPCIO4:
                System.out.println("Has seleccionat afegir un fitxer multimedia");
                System.out.println("Vols afegir al repositori o a un porfoli?"+"\n 1.Repositori"+"\n 2.Porfoli");   
                
                try{
                    option = sc.nextInt();
                    switch(option){
                        case 1:
                            gestioAfegirRepositori();
                        break;
                        case 2:
                            gestioAfegiraPorfoli();
                        break;
                        default:
                            System.out.println("No existeix aquesta opcio.");
                        break;
                    }
                }
                catch(InputMismatchException e){
                    System.out.println("No es una opcio valida");
                    sc.nextLine();
                }
           break;
           case MENU_SUBPRINCIPAL_OPCIO5:
                System.out.println("Has seleccionat mostrar fitxers");
                System.out.println("Vols veure el repositori o un portafoli en concret"+"\n 1.Repositori"+"\n 2.Portafoli");
                try{
                    option = sc.nextInt();
                    switch(option){
                        case 1:
                            lista=controlador.showRepositori();
                            for(int i=0;i<lista.size();i++){
                                System.out.print(lista.get(i)); 
                            }
                        break;
                        case 2:
                            lista=controlador.showPortafolis();
                            for(int i=0;i<lista.size();i++){
                                System.out.print(lista.get(i)); 
                            }
                            System.out.println("Quin portafoli vols veure? Escriu el titol");
                            titol = sc.next();
                            lista=controlador.showPortafoli(titol);
                            for(int i=0;i<lista.size();i++){
                                System.out.print(lista.get(i)); 
                            }
                            System.out.println("\n");
                        break;
                        default:
                            System.out.println("No existeix la opcio introduïda");
                            break;
                    }  
                }
                catch(InputMismatchException e){
                    System.out.println("No es una opcio valida");
                    System.out.println(e.getCause());
                }   
           break;
           case MENU_SUBPRINCIPAL_OPCIO6:
                System.out.println("Has seleccionat eliminar fitxer");
                System.out.println("Vols eliminar del repositori o un portafoli en concret"+"\n 1.Repositori"+"\n 2.Portafoli");
                try{
                    option = sc.nextInt();
                    sc.nextLine();
                    switch(option){
                        case 1:
                            lista=controlador.showRepositori();
                            for(int i=0;i<lista.size();i++){
                                System.out.print(lista.get(i)); 
                            }
                            System.out.println("Quin vols eliminar? Escriu el numero");
                            eliminar = sc.nextInt();

                           controlador.removeFitxer(eliminar);
                          
                        break;
                        case 2:
                            lista=controlador.showPortafolis();
                            for(int i=0;i<lista.size();i++){
                                System.out.print(lista.get(i)); 
                            }
                            System.out.println("Quin portafoli vols veure? Escriu el titol");
                            titol = sc.nextLine();
                            lista=controlador.showPortafoli(titol);
                            for(int i=0;i<lista.size();i++){           
                                 System.out.print(lista.get(i));  
                                 
                            }
           
                            System.out.println("Quin vols eliminar? Escriu el numero");
                            eliminar = sc.nextInt();
                            
                            controlador.removeFitxer(titol, eliminar);
                        break;
                        default:
                            System.out.println("No existeix la opcio introduïda");
                            break;
                    }   
                }
                catch(InputMismatchException e){
                    System.out.println("No es una opcio valida");
                    System.out.println(e.getCause());
                    sc.nextLine();
                }   
           break;
             
           }
        } while(opcio!=OpcionsSubMenu.MENU_SUBPRINCIPAL_SORTIR);
        
        
        
    }
    public void gestioAfegirRepositori() throws ReproException{
        Scanner sc = new Scanner(System.in);
        Menu<OpcionsAfegir> menu2=new Menu<OpcionsAfegir>("Menu de afegir",OpcionsAfegir.values());
        menu2.setDescripcions(descAfegir);
        OpcionsAfegir opcio = null;
     
        String camiAudio,camiImatge,autor,codec;
        int kbps,alçada,amplada;
        do{
            menu2.mostrarMenu();
            boolean exit0=false;     
            while(!exit0){
                try{
                    opcio=menu2.getOpcio(sc);
                    exit0=true;
                }
                catch (Exception e){
                    System.out.println("No és una opció vàlida.");
                    sc.nextLine();
                }
        }
        switch(opcio){
            case MENU_PRINCIPAL_OPCIO1:
                try{
                    System.out.println("Has seleccionat afegir audio");
                    System.out.println("Indica el cami del fitxer");
                    camiAudio = sc.nextLine();
                    System.out.println("Indica el cami de la foto del fitxer");
                    camiImatge=sc.nextLine();
                    System.out.println("Autor");
                    autor=sc.nextLine();
                    System.out.println("Codec");
                    codec=sc.nextLine();
                    System.out.println("Kbps");
                    kbps=sc.nextInt();
                    controlador.addAudio(camiAudio, camiImatge, autor, codec, kbps);
                }
                catch(InputMismatchException e){
                    System.out.println("No es una opcio valida");
                    System.out.println(e.getCause());
                    sc.nextLine();
                }                              
            break;
            
            case MENU_PRINCIPAL_OPCIO2:
                try{
                    System.out.println("Has seleccionat afegir imatge");
                    System.out.println("Indica el cami de la foto del fitxer");
                    camiImatge=sc.nextLine();
                    System.out.println("Autor");
                    autor=sc.nextLine();
                    System.out.println("Codec");
                    codec=sc.nextLine();
                    System.out.println("Alçada");
                    alçada=sc.nextInt();
                    System.out.println("Amplada");
                    amplada=sc.nextInt();
                    controlador.addImatge(camiImatge, autor, codec, alçada, amplada);
                }
                catch(InputMismatchException e){
                    System.out.println("No es una opcio valida");
                    System.out.println(e.getCause());
                    sc.nextLine();
                }   
                
            break;
            
            case MENU_PRINCIPAL_SORTIR:
            break;   
        }
        }while(opcio!=OpcionsAfegir.MENU_PRINCIPAL_SORTIR);
     }   
    public void gestioAfegiraPorfoli() throws ReproException{
        String titol;
       
        int afegir;
        Scanner sc = new Scanner(System.in);
        try{

        System.out.println("A quin porfoli vols afegir-lo, escriu el titol");
        
        lista=controlador.showPortafolis();
        for(int i=0;i<lista.size();i++){
            System.out.print(lista.get(i)); 
        }
        titol= sc.nextLine();

        System.out.println("Quin fitxer vols afegir? Escriu el numero");
        lista=controlador.showRepositori();
        for(int i=0;i<lista.size();i++){
            System.out.print(lista.get(i)); 
        }
        afegir=sc.nextInt();

        controlador.addFitxer(titol, afegir);}
        catch(InputMismatchException e){
                    System.out.println("No es una opcio valida");
                    System.out.println(e.getCause());
                    sc.nextLine();
                }   
     }   
    public void gestioSubMenu2() throws ReproException{
        Scanner sc = new Scanner(System.in);
        Menu<OpcionsSubMenu2> menu2=new Menu<OpcionsSubMenu2>("SubMenu2 Principal",OpcionsSubMenu2.values());
        menu2.setDescripcions(desSubMenu2);
        OpcionsSubMenu2 opcio=null;
        int option=0;
        String titol;
    
        do{
            menu2.mostrarMenu();
            boolean exit0=false;
            
            while(!exit0){
                try{
                        opcio = menu2.getOpcio(sc);
                        exit0=true;
                }
                 catch (Exception e){
                    System.out.println("No és una opció vàlida.");
                    sc.nextLine();
                }
            }
            switch(opcio){
                
                case MENU_SUBPRINCIPAL_OPCIO1:
                    try{
                        controlador.openFinestraReproductor();
                        lista=controlador.showRepositori();
                        for(int i=0;i<lista.size();i++){
                            System.out.print(lista.get(i)); 
                        }
                         System.out.println("Quin fitxer vols reproduïr? Escriu el numero");
                         option=sc.nextInt();
                         controlador.playFitxer(option);
                         
                    }
                    catch(InputMismatchException e){
                        System.out.println("Opcio no possible");
                        sc.nextLine();
                    }
                    catch(IndexOutOfBoundsException e){
                        System.out.println("Opcio no possible");
                        
                    }
               
                break;
                case MENU_SUBPRINCIPAL_OPCIO2:
                    controlador.openFinestraReproductor();
                    controlador.playLlista();
                    
                break;
                case MENU_SUBPRINCIPAL_OPCIO3:
                    try{
                        controlador.openFinestraReproductor();
                        lista=controlador.showPortafolis();
                        for(int i=0;i<lista.size();i++){
                            System.out.print(lista.get(i)); 
                        }
                        System.out.println("Quin portafoli vols reproduïr? Escriu el titol");
                        titol = sc.next();
                        this.controlador.playLlista(titol);
                        
                    }
                    catch(InputMismatchException e){
                        System.out.println("Opcio no possible");
                        sc.nextLine();
                    }
                break;
                case MENU_SUBPRINCIPAL_OPCIO4:
                    if(controlador.getCiclic()){
                        controlador.setCiclic(false);
                        System.out.println("Reproduccio ciclica desactivada");
                    }
                    else{
                        controlador.setCiclic(true);
                        System.out.println("Reproducció cíclica activada");
                    }
                
                break;
                case MENU_SUBPRINCIPAL_OPCIO5:
                     if(controlador.getReverse()){
                        controlador.setReverse(false);
                        System.out.println("Reproduccio reverse desactivada");
                    }
                    else{
                        controlador.setReverse(true);
                        System.out.println("Reproducció reverse activada");
                    }            
                break;      
                case MENU_SUBPRINCIPAL_OPCIO6:
                    gestioActual();
                    
                break;
             
           }
        } while(opcio!=OpcionsSubMenu2.MENU_SUBPRINCIPAL_SORTIR);
    
    }
    public void gestioActual() throws ReproException{
        Scanner sc = new Scanner(System.in);
        Menu<OpcionsActual> menu3=new Menu<OpcionsActual>("SubMenu2 Principal",OpcionsActual.values());
        menu3.setDescripcions(descActual);
        OpcionsActual opcio=null;        
    
        do{
            menu3.mostrarMenu();
            boolean exit0=false;
            
            while(!exit0){
                try{
                        opcio = menu3.getOpcio(sc);
                        exit0=true;
                }
                 catch (Exception e){
                    System.out.println("No és una opció vàlida.");
                    sc.nextLine();
                }
            }
            switch(opcio){
                
                case MENU_SUBPRINCIPAL_OPCIO1:
                    try{
                    controlador.resumeReproduccio();}
                    catch(ReproException e){
                        System.out.println("No hi ha cap reproducció en curs.");
                    }
               
                break;
                case MENU_SUBPRINCIPAL_OPCIO2:
                   try{
                   controlador.pauseReproduccio();
                   }
                   catch(ReproException e){
                       System.out.println("No hi ha cap reproducció en curs.");
                   } 
                    
                break;
                case MENU_SUBPRINCIPAL_OPCIO3:
                   try{
                   controlador.stopReproduccio();
                   controlador.closeFinestraReproductor();
                   }
                   catch(ReproException e){
                       System.out.println("No hi ha cap reproducció en curs.");
                   } 
               
                break;
                case MENU_SUBPRINCIPAL_OPCIO4:
                    try{
                        controlador.jumpReproduccio();
                    }
                    catch(ReproException e){
                        System.out.println("No hi ha més fitxers.");
                    }
                break;            
           }
        } while(opcio!=OpcionsActual.MENU_SUBPRINCIPAL_SORTIR);
    }
    public void gestioReproductorUB() throws ReproException{ 
        Scanner sc = new Scanner(System.in);
        Menu<OpcionsMenuPrincipal> menu=new Menu<OpcionsMenuPrincipal>("Menu Principal",OpcionsMenuPrincipal.values());
        menu.setDescripcions(descMenu);
        OpcionsMenuPrincipal opcio= null; 
        
        do {           
            menu.mostrarMenu();
            
            boolean exit0=false;
            while(!exit0){
                try{
                        opcio=menu.getOpcio(sc);
                        exit0=true;
                }
                 catch (Exception e){
                    System.out.println("No és una opció vàlida.");
                    sc.nextLine();
                }
            }
                switch(opcio) {
                    case MENU_PRINCIPAL_OPCIO1:
                        gestioSubMenu1();
                        
                        break;
                        
                    case MENU_PRINCIPAL_OPCIO2:
                        gestioSubMenu2();
                        break;
                    case MENU_PRINCIPAL_OPCIO3:
                        System.out.println("Has seleccionat guardar dades");
                        controlador.saveDades("data.dat");
                        
                        break;              
                    case MENU_PRINCIPAL_OPCIO4:
                        System.out.println("Has triat la opcio recuperar dades");
                       
                        controlador.loadDades("data.dat");   
                        controlador.setMotor();
                        break; 
                        
                    case MENU_PRINCIPAL_SORTIR:
                        System.out.println("Fins aviat!");
                        break;
                    default:
                        System.out.println("No és una opció valida.");
                }
        } while(opcio!=OpcionsMenuPrincipal.MENU_PRINCIPAL_SORTIR);
    }
  }
