
package cat.iesjoaquimmir.Alumnes.views.console;

import cat.iesjoaquimmir.Alumnes.model.businesslayes.entities.Alumne;
import cat.iesjoaquimmir.Alumnes.model.businesslayes.entities.Domicili;
import cat.iesjoaquimmir.Alumnes.model.businesslayes.entities.Moduls;
import java.util.Scanner;
import java.util.ArrayList;

public class Application {
        
    //<editor-fold defaultstate="collapsed" desc="Menu">
    
     public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            
                System.out.printf("1- NombreyEdad. 2- Nombre. 3- Nombre+Dni. 4- Nombre completo. 5- Todo");
                int resp = input.nextInt();
            
                       switch(resp){
                    case 1:
                     NombreyEdad();
                     break;
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
                    
                  }
    
        }
    
    
//</editor-fold>
         
//<editor-fold defaultstate="collapsed" desc="Metodes">
     
         
    private static void NombreyEdad(){
      Scanner input = new Scanner(System.in);
        System.out.printf("Dime tu nombre");
        String nom = input.next();
        System.out.printf("Dime tu edad");
        int edat = input.nextInt();
        Alumne al1 = new Alumne(nom, edat);
       System.out.printf("%n %s %n ", al1.getSalutacio());
    }
    private static void Nombre(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Dime tu nombre");
        String nom = input.next();
        Alumne al2 = new Alumne(nom);
        System.out.printf("%n %s %n ", al2.getSalutacio());
    }
    private static void NombreyDni(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Dime tu nombre");
        String nom = input.next();
        System.out.printf("Dime tu dni");
        String dni = input.next();
        Alumne al3 = new Alumne(nom, dni);
        System.out.printf("%n %s %n ", al3.getSalutacio());
    }
    private static void NCOMPLETO(){ 
        Scanner input = new Scanner(System.in);
        System.out.printf("Dime tu nombre");
        String nom = input.next();
        System.out.printf("Dime tu 1ºCognom");
        String cog1 = input.next();
        System.out.printf("Dime tu 2ºCognom");
        String cog2 = input.next();
        Alumne al4 = new Alumne(nom, cog1, cog2);
        System.out.printf("%s %n ", al4.getNombrecompleto());
    }
    private static void ALL(){
       Scanner input = new Scanner(System.in);
       System.out.printf("Dime tu nombre");
       String nom = input.next();
       System.out.printf("Dime tu edad");
       int edat = input.nextInt();
       System.out.printf("Dime tu dni");
       String dni = input.next();
       System.out.printf("Dime tu 1ºCognom");
       String cog1 = input.next();
       System.out.printf("Dime tu 2ºCognom");
       String cog2 = input.next();
       System.out.printf("Dime tu Calle");
       String calle = input.next();
       System.out.printf("Dime tu Piso si tienes");
       int pis = input.nextInt();
       System.out.printf("Dime tu Numero");
       int numero = input.nextInt();
       System.out.printf("Dime tu Codigo Postal");
       String copo = input.next();
       System.out.printf("Dime tu Poblacion");
       String pob = input.next();
       System.out.printf("Dime tu Provincia");
       String pro = input.next();
       Domicili dom1 = new Domicili(calle,pis,numero,copo,pob,pro);
       Alumne al5 = new Alumne(nom, dni, edat, cog1, cog2, dom1);
       System.out.printf("%s %n ", al5.getNombrecompleto());
       System.out.printf("%s %n ", dom1.getDomicilio());
    }
    private static void NUMEROS(){
       ArrayList<String> telefon = new ArrayList<String>();
       Scanner input = new Scanner(System.in);
       System.out.printf("Dime tu nombre");
       String nom = input.next();
       Alumne al8 = new Alumne(nom);
       System.out.printf("Dime tu numero");
       telefon.add(input.next());
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
                  System.out.printf("Tu/s telefono/s es/son: %s %n", al9.getModul());
                
              }while(resp2 ==  1);
      }
    
//</editor-fold>

    
    

}