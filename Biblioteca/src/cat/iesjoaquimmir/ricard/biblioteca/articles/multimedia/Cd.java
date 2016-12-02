
package cat.iesjoaquimmir.ricard.biblioteca.articles.multimedia;

import cat.iesjoaquimmir.ricard.biblioteca.articles.Categoria;


public class Cd extends Multimedia{
    
    //<editor-fold defaultstate="collapsed" desc="Atributs">
        private String ISMN;
  
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Metodes">
        //<editor-fold defaultstate="collapsed" desc="getters setters">
            
                public String getISMN() {
                    return ISMN;
                }
                public void setISMN(String ISMN) {
                    this.ISMN = ISMN;
                }
//</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Contructor">
               public Cd(String titol, String autor, Categoria categoria, int durada, String ismn) {
                    super(titol, autor, categoria, durada);
                    this.setISMN(ismn);
                 } 
                
//</editor-fold>
               
        //<editor-fold defaultstate="collapsed" desc="Operadors">
               
        @Override
        public String toString() {
         return String.format("%s %n"
         + "ISMN: %s%n", super.toString(), getISMN()); 
          }   
               
//</editor-fold>
                
//</editor-fold>


}
