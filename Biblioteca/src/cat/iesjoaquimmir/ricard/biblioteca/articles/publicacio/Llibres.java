
package cat.iesjoaquimmir.ricard.biblioteca.articles.publicacio;

import cat.iesjoaquimmir.ricard.biblioteca.articles.Categoria;


public class Llibres extends Publicacio{
    
   
    //<editor-fold defaultstate="collapsed" desc="Atributs">
        private String ISBN;
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Metodes">
            //<editor-fold defaultstate="collapsed" desc="getters setters">
                    public String getISBN() {
                        return ISBN;
                    }
                    public void setISBN(String ISBN) {
                        this.ISBN = ISBN;
                    }

        
//</editor-fold>
                    
            //<editor-fold defaultstate="collapsed" desc="Contructor">
                    public Llibres(String titol, String autor, Categoria categoria, int pàgines, String isbn) {
                        super(titol, autor, categoria, pàgines);
                        this.setISBN(isbn);
                    }
//</editor-fold>
                    
            //<editor-fold defaultstate="collapsed" desc="Operadors">
                @Override
                    public String toString() {
                     return String.format("%s"
                             + "ISBN: %s", super.toString(), getISBN()); 
          }
                    
                   
//</editor-fold>
//</editor-fold>

    


    
    
    
}
