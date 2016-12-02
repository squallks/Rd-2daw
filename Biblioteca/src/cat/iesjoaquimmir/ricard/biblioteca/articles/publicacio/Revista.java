
package cat.iesjoaquimmir.ricard.biblioteca.articles.publicacio;
import cat.iesjoaquimmir.ricard.biblioteca.articles.Categoria;

public class Revista extends Publicacio{



//<editor-fold defaultstate="collapsed" desc="Atributs">
    
    private String ISSN;
    
    
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Metodes">
    //<editor-fold defaultstate="collapsed" desc="getters setters">
                public String getISSN() {
                    return ISSN;
                }
                public void setISSN(String ISSN) {
                    this.ISSN = ISSN;
                }

    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructor">
                public Revista(String titol, String autor, Categoria categoria, int pàgines, String issn) {
                        super(titol, autor, categoria, pàgines);
                        this.setISSN(ISSN);
                    } 
                
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Operadors">
     @Override
      public String toString() {
        return String.format("Revista:%n-----------%n%s"
        + "ISSN: %s", super.toString(), getISSN()); 
       }       
                
                
//</editor-fold>
    
//</editor-fold>


    



    
}
