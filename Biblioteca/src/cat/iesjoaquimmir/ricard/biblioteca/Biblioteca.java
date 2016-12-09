
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
   //<editor-fold defaultstate="collapsed" desc="Comentarios">
   //Seran los menus, el progrma se cierra al salir, 
    //que tendra que devolver al biblioteca test un false para que se cierre el inici
    //en articles hay un nuevo atributo"cogido" es para identificar si 
    //dicho articulo esta cogido o no
    //es un int de 2 posibilidades 1 o 2(esta controlado en el set)
//</editor-fold>
          
    //<editor-fold defaultstate="collapsed" desc="Atributs">
     private ArrayList<Articles> articles = new ArrayList<>();
     private ArrayList<Usuaris> usuaris = new ArrayList<>();
    
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Metodes">
    
    //<editor-fold defaultstate="collapsed" desc="getters setters">
    
            public ArrayList<Articles> getArticles() {
                return articles;
            }

            public void setArticles(ArrayList<Articles> articles) {
                this.articles = articles;
            }

            public ArrayList<Usuaris> getUsuaris() {
                return usuaris;
            }

            public void setUsuaris(ArrayList<Usuaris> usuaris) {
                this.usuaris = usuaris;
            }
  
     
     
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructor">
    
          Biblioteca(ArrayList<Usuaris> usuaris, ArrayList<Articles> articles) {
             this.articles = articles;
             this.usuaris = usuaris;
          }
    
    
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Operadors">
          
        boolean inici() {
           Scanner input = new Scanner(System.in);
            
                System.out.printf("1- Agafar. 2- Retornar. 3- Mostrar Usuaris. 4- Mostrar Articles. 5- Salir");
                int resp = input.nextInt();
            
                switch(resp){
                     case 1:
                        Agafar();
                        return true;
                     case 2:
                         Retornar();
                        return true;
                     case 3:
                         Usuaris();
                         return true;
                     case 4:
                         Articles();
                         return true;
                     }
                       return false;
        }
        
          private void Agafar(){
              //Muestro todos los usuarios
              System.out.printf("1º te mostraremos los usuarios%n");
              for(int i=0; i<getUsuaris().size(); i++){
                System.out.printf("%n---Usuarios: %d---%n%s",i,getUsuaris().get(i).getNom());
              }
              //Seleccionamos usuario
              System.out.printf("Pon el numero del usuario que desea coger un articulo");
               Scanner input = new Scanner(System.in);
               int usu = input.nextInt();
             
               //Mostramos articulos disponibles
               System.out.printf("Estos son los articulos disponibles%n");
                    for(int i=0; i<getArticles().size(); i++){
                        if(getArticles().get(i).getCogido()== 0)
                      System.out.printf("%n---Articles: %d---%n%s",i,getArticles().get(i).getTitol());
                    }
              //seleccionamos el articulo
              System.out.printf("Pon el numero del articulo que desea coger");
              int art = input.nextInt();
              
               
              //1º miramos si el articulo en cuestion esta cogido mirando el atributo "cogido"
              //de articulos, si es 1 esta cogido, si es 0, se puede coger
              if (getArticles().get(art).getCogido() == 0){
                  //si no esta cogido
                if(getUsuaris().get(usu).potAgafarArticle(getArticles().get(art)) == true){
                    //si lo puede coger
                       if(getUsuaris().get(usu).teArticle(getArticles().get(art)) == false){
                           //si no lo tiene cogido ya
                           getUsuaris().get(usu).agafaArticle(getArticles().get(art));
                           System.out.printf("El usuario ha cogido el articulo%n %s%n",getArticles().get(art).toString());
                         }else{
                           //ya lo tiene
                         System.out.printf("No lo puede coger");
                       }
                   }else{
                    //no lo puede coger
                    System.out.printf("No lo puede coger");
                }
              }else{
                  //ya esta cogido
                  System.out.printf("Este articulo ya esta cogido");
              }
              
              
              
              
          }
          
          private void Retornar(){
              //Mostarmos usuarios
              System.out.printf("1º te mostraremos los usuarios%n");
              for(int i=0; i<getUsuaris().size(); i++){
                System.out.printf("%n---Usuarios: %d---%n%s",i,getUsuaris().get(i).getNom());
              }
              //Seleccionamos usuarios
              System.out.printf("Pon el numero del usuario que desea devolver un articulo");
               Scanner input = new Scanner(System.in);
               int usu = input.nextInt();
               
               //Comprobamos si el usuario no tiene ningun articulo
               if(getUsuaris().get(usu).getArticles().isEmpty()==true){
                   //El usuario no tiene ningun articulo
                    System.out.printf("El usuari no te cap article");
               }else{
                   //Si tiene algun articulo
                    System.out.printf("Te muestro los artrticulos que tiene%n");
                    for(int i=0; i<getUsuaris().get(usu).getArticles().size(); i++){
                      System.out.printf("%n---Article: %d---%n%s",i,getUsuaris().get(usu).getArticles().get(i).getTitol());
                    }
                    //seleccionamos el articulo que queremos devolver
                    System.out.printf("Pon el numero del articulo que desea devolver");
                    int art = input.nextInt();
                   //lo devolvemos
                    getUsuaris().get(usu).retornaArticle(getUsuaris().get(usu).getArticles().get(art));
                    System.out.printf("El articulo ha sido devuelto");
               }
              
          }
          
          private void Usuaris(){
              System.out.printf("Estos son los usuarios%n");
              for(int i=0; i<getUsuaris().size(); i++){
                System.out.printf("%n---Usuarios: %d---%n%s",i,getUsuaris().get(i).getNom());
              }
              
              
          }
          
          private void Articles(){
              
              Scanner input = new Scanner(System.in);
            
                System.out.printf("1- Articles Agafats. 2- Articles Disponibles. 3- Tots els Articles");
 
                int resp2 = input.nextInt();
            
                switch(resp2){
                     case 1:
                        Agafats();
                        break;
                     case 2:
                         Dispo();
                         break;
                     case 3:
                         Tots();
                         break;
              
                            }
          }
          //<editor-fold defaultstate="collapsed" desc="Menu del metodo Articles">
          
                private void Agafats(){
                    System.out.printf("Estos son los articulos cogidos%n");
                    for(int i=0; i<getArticles().size(); i++){
                        if(getArticles().get(i).getCogido() == 1){
                      System.out.printf("%n---Articles: %d---%n%s",i,getArticles().get(i).getTitol());
                    }
                  }

                }
                private void Dispo(){
                    System.out.printf("Estos son los articulos disponibles%n");
                    for(int i=0; i<getArticles().size(); i++){
                        if(getArticles().get(i).getCogido()==0)
                      System.out.printf("%n---Articles: %d---%n%s",i,getArticles().get(i).getTitol());
                    }

                }
                private void Tots(){
                    System.out.printf("2º te mostraremos los articulos%n");
                    for(int i=0; i<getArticles().size(); i++){
                      System.out.printf("%n---Articles: %d---%n%s",i,getArticles().get(i).getTitol());
                    }
                }
          
          
//</editor-fold>
          

          
          //</editor-fold>
          //</editor-fold>


    
    




    
        
}