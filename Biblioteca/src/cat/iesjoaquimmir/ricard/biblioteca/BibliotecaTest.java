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

public class BibliotecaTest {
    public static void main(String[] args) {
        
        ArrayList<Usuaris> usuaris =  carregaUsuaris();
	ArrayList<Articles> articles = carregaArticles();
		
	Biblioteca biblioteca = new Biblioteca(usuaris, articles);
		
	while(biblioteca.inici());    
    }
    
    private static ArrayList<Usuaris> carregaUsuaris() {
        Adult usuariPremium = new Adult("Pepe", "Carrasco", "Coronado", "498878974K", true);
	Adult usuariNormal = new Adult("Paco", "Soler", "Picasso", "498878214M", false);
        Menor usuariMenorPremium = new Menor("Pedro", "Garcia", "Saez", usuariPremium);
	Menor usuariMenorNormal = new Menor("Paulo", "Lopez", "Moliere", usuariNormal);		
	
        ArrayList<Usuaris> usuaris = new ArrayList<Usuaris>();
        usuaris.add(usuariPremium);
        usuaris.add(usuariNormal);
        usuaris.add(usuariMenorPremium);
        usuaris.add(usuariMenorNormal);
        
        return usuaris;
    }
	
    private static ArrayList<Articles> carregaArticles() {
        
	Cd a0 = new Cd("Mis grandes éxitos", "Luis Miguel",Categoria.C, 65, "04900009");
	DvD a1 = new DvD("Bamby", "Walt Disney", Categoria.A, 89, "90843089");
	DvD a2 = new DvD("Crepusculo", "Warner", Categoria.B, 129 ,"480980983");
	Llibres a3 = new Llibres("Ulises", "James Joyce", Categoria.C, 456, "940943322");
	Llibres a4 = new Llibres("Tina Super Bruixa", "Enid Blyton", Categoria.B, 456, "342090233");
	Revista a5 = new Revista("Patufet", "Ed. Infantil", Categoria.A, 87,"80002122");

	ArrayList<Articles> articles = new ArrayList<Articles>();
        
	articles.add(a0);
        articles.add(a1);
	articles.add(a2);
        articles.add(a3);
        articles.add(a4);
        articles.add(a5);
        
	return articles;
    }
}
