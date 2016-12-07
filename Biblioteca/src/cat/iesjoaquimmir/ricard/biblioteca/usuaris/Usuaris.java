
package cat.iesjoaquimmir.ricard.biblioteca.usuaris;
import cat.iesjoaquimmir.ricard.biblioteca.articles.Articles;
import cat.iesjoaquimmir.ricard.biblioteca.usuaris.adult.Adult;
import cat.iesjoaquimmir.ricard.biblioteca.usuaris.menor.Menor;
import java.util.ArrayList;

public abstract class Usuaris {
    
    //<editor-fold defaultstate="collapsed" desc="Atributs">
        private String nom;
        private String cognom1;
        private String cognom2;
        private ArrayList<Articles> articles;
        
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Metodes">
        
        //<editor-fold defaultstate="collapsed" desc="getters setters">
        
            public String getNom() {
                return nom;
            }
            private void setNom(String nom) {
                 if(nom != null){
                     this.nom = nom;
                 }
            }
            public String getCognom1() {
                return cognom1;
            }
            private void setCognom1(String cognom1) {
                  if(cognom1 != null){
                this.cognom1 = cognom1;
                }
            }
            public String getCognom2() {
                return cognom2;
            }
            private void setCognom2(String cognom2) {
               if(cognom2 != null){
                this.cognom2 = cognom2;
               }
            }
            public ArrayList<Articles> getArticles(){
                return articles;
            }
            private void setArticles(ArrayList<Articles> articles){
                this.articles = articles;
            }
        
//</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="Constructor">
        
         private Usuaris(String nom, String cognom1, String cognom2, ArrayList<Articles> article){
              this.setNom(nom);
              this.setCognom1(cognom1);
              this.setCognom2(cognom2);
              this.setArticles(articles);
              
          }   
            
            
            
          public Usuaris(String nom, String cognom1, String cognom2)  {
              this.setNom(nom);
              this.setCognom1(cognom1);
              this.setCognom2(cognom2);
              
          }
            
            
//</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="Operadors">
             //<editor-fold defaultstate="collapsed" desc="Firmas">
        
         protected abstract boolean isVIP();
         protected abstract boolean isAdult();
//</editor-fold>
             public boolean potAgafarArticle(Articles art){
                    if(isAdult() == true){
                                //es adulto
                                if(isVIP() == true){
                                        //adulto y es premium
                                        if(articles.size()<4){
                                            //no tiene 4
                                            return true;
                                        }else{
                                            //tiene 4
                                            return false;
                                          }
                                }else{
                                        //adulto y no es premium
                                        if(articles.size()<2){
                                           //no tiene 2
                                             return true;
                                       }else{
                                            //tiene 2
                                            return false;
                                           }
                                     }
                    }else{
                    //no es adulto
                            if(isVIP() == true){
                                 //menor y tutor premium
                                                if(articles.size()<4){
                                                    //si no tiene 4 articulos pero si tiene el articulo la categoria adulta
                                                    if(art.getCategoria().isAdult() == true){
                                                        return false;
                                                    }else{
                                                         //no tiene 4 y no tiene la categoria adulta
                                                            return true;
                                                    }
                                                }else{
                                                    //tiene 4
                                                    return false;
                                                  }
                                        }else{
                                                //menor y tutor normal
                                                if(articles.size()<2){
                                                   //no tiene 2 pero la categoria es de adulto
                                                   if(art.getCategoria().isAdult() == true){
                                                        return false;
                                                   }else{
                                                     return true;
                                                   }
                                               }else{
                                                    //tiene 2
                                                    return false;
                                                   }
                                             }
             }
             
             }
            
             public boolean teArticle(Articles art){
                 if(getArticles().contains(art)){
                     return true;
                 }else{
                     return false;
                 }
                 
             }
             
             public void agafaArticle(Articles art){
                 if(teArticle(art) == false){
                        getArticles().add(art);
                    }else{
                     String.format("Ya tienes ese producto");
                 }
             }
             
             public void retornaArticle(Articles art){
                 
                 if(articles.contains(art)){
                        articles.remove(art);
                }
             }
          
             
             @Override
             public String toString() {
                return String.format("Nom: %s%n Cognom: %s%n Cognom2: %s%n", getNom(), getCognom1(), getCognom2());
            }
             
            
                          
            @Override
            public boolean equals(Object obj) {
              if(obj instanceof Usuaris){
                  Usuaris tmpUsuaris = (Usuaris) obj;
                    if(this.nom.equals(tmpUsuaris.nom) && this.cognom1.equals(tmpUsuaris.cognom1) && this.cognom2.equals(tmpUsuaris.cognom2)){
                        return true;
                    }else{
                        return false;
                    }
                }else{
                    return false;}
                }
            
            
            
//</editor-fold>
        
//</editor-fold>

    



      
}
             

