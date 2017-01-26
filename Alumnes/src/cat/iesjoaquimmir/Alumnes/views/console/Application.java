
package cat.iesjoaquimmir.Alumnes.views.console;

import cat.iesjoaquimmir.Alumnes.model.businesslayes.entities.Alumne;
import cat.iesjoaquimmir.Alumnes.model.businesslayes.entities.Domicili;
import cat.iesjoaquimmir.Alumnes.model.businesslayes.entities.Moduls;
import cat.iesjoaquimmir.Alumnes.model.businesslayes.entities.LaException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Application {
        
//<editor-fold defaultstate="collapsed" desc="Menu">
    
     public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException{
            Scanner input = new Scanner(System.in);
            
                System.out.printf("1- NombreyEdad. 2- Nombre. 3- Nombre+Dni. 4- Nombre completo. 5- Todo. 6-Telefonos. 7-Modulos. 8-Fichero. 9-Fichero++");
                int resp = input.nextInt();
             
                  switch(resp){
                    case 1:
                                try{
                                   NombreyEdad();
                                } catch (LaException a){
                                    System.out.printf("Error :" ,a.getMessage());
                                    a.printStackTrace();
                                }finally{
                                     break;
                                }
                    case 2:
                      Nombre();
                      break;
                    case 3:
                     NombreyDni();
                     break;
                    case 4:
                      NCOMPLETO();
                      break;
                    case 5:
                        ALL();
                        break;
                    case 6:
                        NUMEROS();
                        break;
                    case 7:
                        MODULS();
                        break;
                    case 8:
                        FICHERO();
                        break;
                    case 9:
                        FICHERO2();
                        break;
                    
                  }
    
        }
    
    
//</editor-fold>
         
//<editor-fold defaultstate="collapsed" desc="Metodes">
     
         
    private static void NombreyEdad() throws LaException{
        
                Scanner input = new Scanner(System.in);
                  System.out.printf("Dime tu nombre");
                  String nom = input.nextLine();
                  if(nom.isEmpty()){
                      throw new LaException(nom);
                  }else{
                  System.out.printf("Dime tu edad");
                  int edat = input.nextInt();
                  if(edat <= 0){
                      throw new LaException(edat);
                  }else{
                    Alumne al1 = new Alumne(nom, edat);
                    System.out.printf("%n %s %n ", al1.getSalutacio());
                  }
                 }
       
    }
    private static void Nombre(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Dime tu nombre");
        String nom = input.nextLine();
        Alumne al2 = new Alumne(nom);
        System.out.printf("%n %s %n ", al2.getSalutacio());
    }
    private static void NombreyDni(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Dime tu nombre");
        String nom = input.nextLine();
        System.out.printf("Dime tu dni");
        String dni = input.nextLine();
        Alumne al3 = new Alumne(nom, dni);
        System.out.printf("%n %s %n ", al3.getSalutacio());
    }
    private static void NCOMPLETO(){ 
        Scanner input = new Scanner(System.in);
        System.out.printf("Dime tu nombre");
        String nom = input.nextLine();
        System.out.printf("Dime tu 1ºCognom");
        String cog1 = input.nextLine();
        System.out.printf("Dime tu 2ºCognom");
        String cog2 = input.nextLine();
        Alumne al4 = new Alumne(nom, cog1, cog2);
        System.out.printf("%s %n ", al4.getNombrecompleto());
    }
    private static void ALL(){
       Scanner input = new Scanner(System.in);
       System.out.printf("Dime tu nombre");
       String nom = input.nextLine();
       System.out.printf("Dime tu edad");
       int edat = input.nextInt();
       System.out.printf("Dime tu dni");
       String dni = input.nextLine();
       System.out.printf("Dime tu 1ºCognom");
       String cog1 = input.nextLine();
       System.out.printf("Dime tu 2ºCognom");
       String cog2 = input.nextLine();
       System.out.printf("Dime tu Calle");
       String calle = input.nextLine();
       System.out.printf("Dime tu Piso si tienes");
       int pis = input.nextInt();
       System.out.printf("Dime tu Numero");
       int numero = input.nextInt();
       System.out.printf("Dime tu Codigo Postal");
       String copo = input.nextLine();
       System.out.printf("Dime tu Poblacion");
       String pob = input.nextLine();
       System.out.printf("Dime tu Provincia");
       String pro = input.nextLine();
       Domicili dom1 = new Domicili(calle,pis,numero,copo,pob,pro);
       Alumne al5 = new Alumne(nom, dni, edat, cog1, cog2, dom1);
       System.out.printf("%s %n ", al5.getNombrecompleto());
       System.out.printf("%s %n ", dom1.getDomicilio());
    }
    private static void NUMEROS(){
       ArrayList<String> telefon = new ArrayList<String>();
       Scanner input = new Scanner(System.in);
       System.out.printf("Dime tu nombre");
       String nom = input.nextLine();
       Alumne al8 = new Alumne(nom);
       System.out.printf("Dime tu numero");
       telefon.add(input.nextLine());
       int resp2;
      do{
              System.out.printf("Quieres introducir mas numeros? 1.Si 2.No");
              resp2 = input.nextInt();
              if(resp2 == 1){
                    System.out.printf("Dime tu numero");
                    telefon.add(input.next());
                }else{
                  al8.setTelefon(telefon);
                  System.out.printf("Tu/s telefono/s es/son: %s %n", al8.getTelefon());
                }
              }while(resp2 ==  1);
     
      
        
    }
    private static void MODULS(){
         ArrayList<Moduls> modul = new ArrayList<Moduls>();
         Scanner input = new Scanner(System.in);
         System.out.printf("Dime tu nombre");
         String nom = input.next();
         Alumne al9 = new Alumne(nom);
         System.out.printf("Dime tu modulo");
         String nomm = input.next();
         System.out.printf("Dime su desc");
         String desc = input.next();
         System.out.printf("Dime sus horas");
         int h = input.nextInt();
         Moduls m1 = new Moduls(nomm, desc, h);
         modul.add(m1);
         al9.setModul(modul);
          int resp2;
      do{
              System.out.printf("Quieres introducir mas numeros? 1.Si 2.No");
              resp2 = input.nextInt();
              if(resp2 == 1){
                    System.out.printf("Dime tu modulo");
                    String nomm2 = input.next();
                    System.out.printf("Dime su desc");
                    String desc2 = input.next();
                    System.out.printf("Dime sus horas");
                    int h2 = input.nextInt();
                    Moduls m2 = new Moduls(nomm2, desc2, h2);
                    modul.add(m2);
              } else{
                  
              }  al9.setModul(modul);
              int i;
                   for (i = 0; i < modul.size(); i++){
                  System.out.printf("Tu modulo es: %s %n ", al9.getModul().get(i).getNom());
                   }
                
              }while(resp2 ==  1);
      }
    private static void FICHERO() throws IOException{
        File file = new File("/home/alumne/DatosAlumno.txt");
         Scanner input = new Scanner(System.in);
        
        if (!file.exists()){
            file.createNewFile();
          }
        
        System.out.printf("alumnos?");
        int tamaño = input.nextInt();
        int i;
        
        for(i=0; i<tamaño; i++){
        
             System.out.printf("Nombre del alumno?");
             String nom = input.next();
             System.out.printf("1ºCognom?");
             String cog1 = input.next();
             System.out.printf("2ºCognom?");
             String cog2 = input.next();
             System.out.printf("Dni");
             String dni = input.next();
        
             //<editor-fold defaultstate="collapsed" desc="writer">
            FileWriter writer = null;
          
            writer = new FileWriter ("/home/alumne/DatosAlumno.txt",true);
                        
               writer.write(nom);
               writer.write(cog1);
               writer.write(cog2);
               writer.write(dni);
               writer.close();
        }
             
             
//</editor-fold>
             //<editor-fold defaultstate="collapsed" desc="reader">

        FileReader reader = null;
        
        reader = new FileReader("/home/alumne/DatosAlumno.txt");
            
            int charsLlegits;
            char [] buffer = new char[1024];
            do{
                charsLlegits = reader.read(buffer);
                
                for(i=0; i<charsLlegits; i++){
                    System.out.print(buffer[i]);
                }
                
            }while (charsLlegits != -1);
            reader.close();



//</editor-fold>
               
               
               
            
        
        
        
    }
    private static void FICHERO2() throws IOException, FileNotFoundException, ClassNotFoundException{
  
         Scanner input = new Scanner(System.in);
         int resp;

         //<editor-fold defaultstate="collapsed" desc="Creacion de carpeta/fichero">
          
          System.out.printf("%n Como quieres nombrar al fichero? %n");
         String filename = input.nextLine();
         
         System.out.printf("%n En que carpeta lo quieres crear? %n");
         String directorior = input.nextLine();
         directorior = (File.separator + "home" + File.separator + "alumne" + File.separator + directorior);
         
         String filefinal = (directorior + File.separator + filename + ".txt");
                
        File directorio = new File(directorior);
        
        if(!directorio.exists()){
            directorio.mkdir();   
            System.out.printf("%n El directorio deseado acaba de nacer %n");
        }else{
            if(directorio.isDirectory()){
                System.out.printf("%n El directorio ya estaba creado %n");
            }else{
                 System.out.printf("%n Ese nombre ya esta en uso para un fichero %n Usa otro porfavor %n");
            }
            
        }
           
        File file = new File(filefinal);
        if (!file.exists()){
                file.createNewFile();
                System.out.printf("%n El Fichero deseado acaba de nacer %n");
        }else{
                if(directorio.isFile()){
                    System.out.printf("%n El fichero ya estaba creado %n");
                }else{
                     System.out.printf("%n Deseas sobrescribir el fichero deseado? %n");
                     System.out.printf("%n Si / No%n");
                     if(input.next().equalsIgnoreCase("S")){
                         file.delete();
                     }
                }
          }
         
        
        
        
         
         
//</editor-fold>
             //<editor-fold defaultstate="collapsed" desc="menu">
           do {
             System.out.printf("%n 1- Introducir Alumnos. 2-Lectura %n");
                 resp = input.nextInt();
               
                  switch(resp){ 
                      case 1:
                          AltaMasiva(filefinal);
                          break;
                      case 2:
                          LecturaMasiva(filefinal);
                          break;
                  }
            
            } while (resp != 0);
            
            
            
//</editor-fold>
       
    }
    
//</editor-fold>

    
   public static void AltaMasiva(String filename) throws FileNotFoundException, IOException, ClassNotFoundException {
    
        String FILE_NAME = filename;
        ArrayList<Alumne> list = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);
        int i;
        
        
        System.out.printf("Dime cuantos quieres?");
         int tamaño = input.nextInt();
         
        for(i=0; i<tamaño; i++){
       
               System.out.printf("%nDime tu nombre%n");
               String nom = input.next();
               System.out.printf("%nDime tu edad%n");
               int edat = input.nextInt();
               System.out.printf("%nDime tu dni%n");
               String dni = input.next();
               System.out.printf("%nDime tu 1ºCognom%n");
               String cog1 = input.next();
               System.out.printf("%nDime tu 2ºCognom%n");
               String cog2 = input.next();
               System.out.printf("%nDime tu Calle%n");
               String calle = input.next();
               System.out.printf("%nDime tu Piso si tienes%n");
               int pis = input.nextInt();
               System.out.printf("%nDime tu Numero%n");
               int numero = input.nextInt();
               System.out.printf("%nDime tu Codigo Postal%n");
               String copo = input.next();
               System.out.printf("%nDime tu Poblacion%n");
               String pob = input.next();
               System.out.printf("%nDime tu Provincia%n");
               String pro = input.next();
               Domicili dom1 = new Domicili(calle,pis,numero,copo,pob,pro);
               Alumne al5 = new Alumne(nom, dni, edat, cog1, cog2, dom1);
               System.out.printf("%s %n ", al5.getNombrecompleto());
               System.out.printf("%s %n ", dom1.getDomicilio());
               list.add(al5);
        }
            
        ObjectOutputStream ObjectOutput = null;
        
        
            ObjectOutput = new ObjectOutputStream(new FileOutputStream(FILE_NAME, true));
       
            ObjectOutput.writeObject(list);
            
            System.out.printf("S'ha generat el ficher d'alumnes");
            ObjectOutput.close();
      
           
            
            
            
           
             
   }
   
   public static void LecturaMasiva(String filename) throws IOException, ClassNotFoundException{
       
        String FILE_NAME = filename;
       
        ObjectInputStream ObjectInput = null;
       
        ObjectInput = new ObjectInputStream (new FileInputStream(FILE_NAME));
        
        ArrayList<Alumne> list = (ArrayList<Alumne>) ObjectInput.readObject();
        
        
        
        for(int i=0;i<list.size();++i){
            System.out.printf("%n %s --> ", list.get(i));
        }
       ObjectInput.close();
       
       
   }
   

}