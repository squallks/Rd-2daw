
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
import cat.iesjoaquimmir.ricard.biblioteca.usuaris.Usuaris;
import java.util.ArrayList;
import java.util.Scanner;


public class Biblioteca {

 
    public static void main(String[] args) {
  
  
 
        ArrayList<Usuaris> usuarios = new ArrayList<>();
               
        Adult usuariPremium = new Adult("Pepe", "Carrasco", "Coronado","498878974K", true);
        usuarios.add(usuariPremium);
        Adult usuariNormal = new Adult("Paco", "Soler", "Picasso","498878214M", false);
        usuarios.add(usuariNormal);
        Menor usuariMenorPremium = new Menor("Pedro", "Garcia", "Saez", usuariPremium);
        usuarios.add(usuariMenorPremium);
        Menor usuariMenorNormal = new Menor("Paulo", "Lopez", "Moliere", usuariNormal);
        usuarios.add(usuariMenorNormal);
        System.out.printf("%s", usuariPremium.toString());
        System.out.printf("%s", usuariNormal.toString());
        System.out.printf("%s", usuariMenorPremium.toString());
        System.out.printf("%s", usuariMenorNormal.toString());
       
       
        
       
        Prestam(usuariPremium,usuariMenorPremium);
        
        
  }
        
 
      
 
     
                
 public static void Prestam(Usuaris usuariPremium, Usuaris usuariMenorPremium){
             
       ArrayList<Articles> articles = new ArrayList<>();
     
        Cd a0 = new Cd("Mis grandes éxitos", "Luis Miguel", Categoria.B, 65,"04900009");
        articles.add(a0);
        System.out.printf("%s %n", a0.toString());
        DvD a1 = new DvD("Bamby","Walt Disney", Categoria.A, 89,"90843089");
        articles.add(a1);
        System.out.printf("%s %n", a1.toString());
        DvD a2 = new DvD("Crepusculo","Warner", Categoria.B, 129,"480980983");
        articles.add(a2);
        System.out.printf("%s %n", a2.toString());
        Llibres a3 = new Llibres("Ulises","James Joyce", Categoria.C, 456,"940943322");
        articles.add(a3);
        System.out.printf("%s %n", a3.toString());
        Llibres a4 = new Llibres("Tina Super Bruixa","Enid Blyton", Categoria.B, 456,"342090233");
        articles.add(a4);
        System.out.printf("%s %n", a4.toString());
        Revista a5 = new Revista("Patufet","Ed. Infantil", Categoria.A, 87,"80002122");
        articles.add(a5);
        System.out.printf("%s %n", a5.toString());

        
        
        
        System.out.printf("Estamos mirando si lo puedes coger %s%n", usuariPremium.potAgafarArticle(a5));
        if(usuariPremium.potAgafarArticle(a5) == true){
            if(usuariPremium.teArticle(a5) == false){
                usuariPremium.agafaArticle(a5);
                System.out.printf("El usuario ha cogido el articulo%n %s%n",a5.toString());
                System.out.printf("El usuario $s$n tiene lso siegientes articulos %s", usuariPremium.getNom(), usuariPremium.getArticles());
            }
        }
        
        System.out.printf("Estamos mirando si lo puedes coger %s%n", usuariMenorPremium.potAgafarArticle(a3));
            if(usuariMenorPremium.potAgafarArticle(a3) == true){
                   if(usuariMenorPremium.teArticle(a3) == false){
                       usuariMenorPremium.agafaArticle(a3);
                       System.out.printf("El usuario ha cogido el articulo%n %s%n",a3.toString());
                       System.out.printf("El usuario $s$n tiene lso siegientes articulos %s", usuariMenorPremium.getNom(), usuariMenorPremium.getArticles());
                   }
               }else{
                System.out.printf("No lo puede coger");
            }
        }
     
     
public static void Retorno(){
                    
                    
                }
     

        
        
}
        
    
    

