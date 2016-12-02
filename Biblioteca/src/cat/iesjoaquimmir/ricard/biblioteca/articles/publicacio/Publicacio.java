
package cat.iesjoaquimmir.ricard.biblioteca.articles.publicacio;

import cat.iesjoaquimmir.ricard.biblioteca.articles.Articles;
import cat.iesjoaquimmir.ricard.biblioteca.articles.Categoria;


public abstract class Publicacio extends Articles {
    
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    
        private int pàgines;
        
    
//</editor-fold>
        
    //<editor-fold defaultstate="collapsed" desc="Metodes">
        //<editor-fold defaultstate="collapsed" desc="getter setters">
                public int getPàgines() {
                    return pàgines;
                }
                public void setPàgines(int pàgines) {
                    this.pàgines = pàgines;
                }

        
//</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="Contstructor">
            public Publicacio(String titol, String autor, Categoria categoria, int pàgines) {
                     super(titol, autor, categoria);
                     this.setPàgines(pàgines);
            }
//</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="Operadors">
             @Override
                    public String toString() {
                     return String.format("%s"
                             + "Pàgines: %d", super.toString(), getPàgines()); 
          }
            
//</editor-fold>
//</editor-fold>

   

   
    
    
}
