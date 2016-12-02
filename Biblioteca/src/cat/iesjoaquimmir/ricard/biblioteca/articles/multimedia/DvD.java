
package cat.iesjoaquimmir.ricard.biblioteca.articles.multimedia;

import cat.iesjoaquimmir.ricard.biblioteca.articles.Categoria;


public class DvD extends Multimedia{
    
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    
    private String ISAN;
  
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Metodes">
            //<editor-fold defaultstate="collapsed" desc="getters setters">
        
        public String getISAN() {
            return ISAN;
        }
        public void setISAN(String ISAN) {
            this.ISAN = ISAN;
        }
//</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="Constructor">
            public DvD(String titol, String autor, Categoria categoria, int Durada, String isan) {
                 super(titol, autor, categoria, Durada);
                 this.setISAN(isan);
            }
//</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="Operadors">
               
        @Override
        public String toString() {
         return String.format("%s"
         + "ISAN: %s", super.toString(), getISAN()); 
          }   
               
//</editor-fold>
//</editor-fold>

        
        
}