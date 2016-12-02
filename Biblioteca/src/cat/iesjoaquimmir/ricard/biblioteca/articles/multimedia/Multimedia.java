package cat.iesjoaquimmir.ricard.biblioteca.articles.multimedia;

import cat.iesjoaquimmir.ricard.biblioteca.articles.Articles;
import cat.iesjoaquimmir.ricard.biblioteca.articles.Categoria;

    public abstract class Multimedia extends Articles {
    
    //<editor-fold defaultstate="collapsed" desc="Atributs">
        
            private int durada;
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Metodes">
            //<editor-fold defaultstate="collapsed" desc="getters setters">
            
                 public int getDurada() {
                      return durada;
                 }
                 private void setDurada(int durada) {
                    this.durada = durada;
                }
//</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="Constructor">
                public Multimedia(String titol, String autor, Categoria categoria, int durada) {
                      super(titol, autor, categoria);
                      this.setDurada(durada);
                } 
                 
                 
//</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="Operadors">
                  @Override
                    public String toString() {
                     return String.format("%s %n"
                                + "Durada: %d", super.toString(), getDurada()); 
          }
  
//</editor-fold>
//</editor-fold>



   
       
     
}
