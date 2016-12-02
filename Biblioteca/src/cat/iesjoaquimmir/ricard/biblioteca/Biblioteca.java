
package cat.iesjoaquimmir.ricard.biblioteca;

import cat.iesjoaquimmir.ricard.biblioteca.articles.Articles;
import cat.iesjoaquimmir.ricard.biblioteca.articles.Categoria;
import cat.iesjoaquimmir.ricard.biblioteca.articles.multimedia.Multimedia;
import cat.iesjoaquimmir.ricard.biblioteca.articles.multimedia.Cd;
import cat.iesjoaquimmir.ricard.biblioteca.articles.multimedia.DvD;
import cat.iesjoaquimmir.ricard.biblioteca.articles.publicacio.Revista;
import cat.iesjoaquimmir.ricard.biblioteca.articles.publicacio.Llibres;
import cat.iesjoaquimmir.ricard.biblioteca.articles.publicacio.Publicacio;


public class Biblioteca {

 
    public static void main(String[] args) {
  
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
    
}
