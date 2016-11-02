
package cat.iesjoaquimmir.Alumnes.views.console;

import cat.iesjoaquimmir.Alumnes.model.businesslayes.entities.Alumne;
import java.util.Scanner;

public class Application {
        
    //<editor-fold defaultstate="collapsed" desc="Menu">
    
     public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            
                System.out.printf("1- NombreyEdad. 2- Nombre. 3- Nombre+Dni. 4- Todo.");
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
                      Todo();
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
    private static void Todo(){ 
        Scanner input = new Scanner(System.in);
        System.out.printf("Dime tu nombre");
        String nom = input.next();
        System.out.printf("Dime tu dni");
        String dni = input.next();
        System.out.printf("Dime tu edat");
        int edat = input.nextInt();
        Alumne al3 = new Alumne(nom, dni, edat);
        System.out.printf("%n %s %n ", al3.getSalutacio());
    }
     
     
     
     
     
     
     
     
     
     
     
     
     
//</editor-fold>

    
    

}