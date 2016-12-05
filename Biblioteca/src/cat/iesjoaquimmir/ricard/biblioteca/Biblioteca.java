
package cat.iesjoaquimmir.ricard.biblioteca;

import cat.iesjoaquimmir.ricard.biblioteca.articles.Articles;
import cat.iesjoaquimmir.ricard.biblioteca.articles.Categoria;
import cat.iesjoaquimmir.ricard.biblioteca.articles.multimedia.Multimedia;
import cat.iesjoaquimmir.ricard.biblioteca.articles.multimedia.Cd;
import cat.iesjoaquimmir.ricard.biblioteca.articles.multimedia.DvD;
import cat.iesjoaquimmir.ricard.biblioteca.articles.publicacio.Revista;
import cat.iesjoaquimmir.ricard.biblioteca.articles.publicacio.Llibres;
import cat.iesjoaquimmir.ricard.biblioteca.articles.publicacio.Publicacio;
import cat.iesjoaquimmir.ricard.biblioteca.articles.Articles;
import cat.iesjoaquimmir.ricard.biblioteca.usuaris.adult.Adult;
import cat.iesjoaquimmir.ricard.biblioteca.usuaris.menor.Menor;
import java.util.ArrayList;
import java.util.Scanner;


public class Biblioteca {

 
    public static void main(String[] args) {
  
        Scanner input = new Scanner(System.in);
            
            System.out.printf("1- Crear usuarios. 2- Crear Articulos. 3- Prestamos");
            int resp = input.nextInt();
            
                switch(resp){
                    case 1:
                         Usuarios();
                         break;
                    case 2:
                          Articulos();
                          break;
                    case 3:
                          Prestamos();
                          break;
                   
        }
            
    }
        
        
        
        
        
        
  public static void Usuarios(){
      
        Adult usuariPremium = new Adult("Pepe", "Carrasco", "Coronado","498878974K", true);
        Adult usuariNormal = new Adult("Paco", "Soler", "Picasso","498878214M", false);
        Menor usuariMenorPremium = new Menor("Pedro", "Garcia", "Saez", usuariPremium);
        Menor usuariMenorNormal = new Menor("Paulo", "Lopez", "Moliere", usuariNormal);
        System.out.printf("%s", usuariPremium.toString());
        System.out.printf("%s", usuariNormal.toString());
        System.out.printf("%s", usuariMenorPremium.toString());
        System.out.printf("%s", usuariMenorNormal.toString());
  }
        
 
 public static void Articulos(){
    Cd a0 = new Cd("Mis grandes éxitos", "Luis Miguel", Categoria.B, 65,"04900009");
    System.out.printf("%s %n", a0.toString());
    DvD a1 = new DvD("Bamby","Walt Disney", Categoria.A, 89,"90843089");
    System.out.printf("%s %n", a1.toString());
    DvD a2 = new DvD("Crepusculo","Warner", Categoria.B, 129,"480980983");
    System.out.printf("%s %n", a2.toString());
    Llibres a3 = new Llibres("Ulises","James Joyce", Categoria.C, 456,"940943322");
    System.out.printf("%s %n", a3.toString());
    Llibres a4 = new Llibres("Tina Super Bruixa","Enid Blyton", Categoria.B, 456,"342090233");
    System.out.printf("%s %n", a4.toString());
    Revista a5 = new Revista("Patufet","Ed. Infantil", Categoria.A, 87,"80002122");
    System.out.printf("%s %n", a5.toString());
  
  
  
  
  }
        
        
 public static void Prestamos() {
     
     Scanner input = new Scanner(System.in);
            
            System.out.printf("1-Prestamo. 2-Retorno del Prestamo");
            int resp2 = input.nextInt();
            
                switch(resp2){
                    case 1:
                         Prestam();
                         break;
                    case 2:
                          Retorno();
                          break;
                } 
}
     
                
 public static void Prestam(){
                         
     
     
                    
                }
     
     
public static void Retorno(){
                    
                    
                }
     

        
        
}
        
    
    

