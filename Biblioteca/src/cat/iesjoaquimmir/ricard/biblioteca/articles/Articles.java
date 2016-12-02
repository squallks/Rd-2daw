
package cat.iesjoaquimmir.ricard.biblioteca.articles;


public abstract class Articles {
    
    //<editor-fold defaultstate="collapsed" desc="Atributs">
        private String titol;
        private String autor;
        private Categoria categoria;
      
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Metodes">
        
        //<editor-fold defaultstate="collapsed" desc="getters setters">        
                public String getTitol() {
                    return titol;
                }
                private void setTitol(String titol) {
                    this.titol = titol;
                }
                public String getAutor() {
                    return autor;
                }
                private void setAutor(String autor) {
                    this.autor = autor;
                }
                public Categoria getCategoria() {
                    return categoria;
                }
                private void setCategoria(Categoria categoria) {
                    this.categoria = categoria;
                }
              

//</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Constructor">
                
         public Articles(String titol, String autor, Categoria categoria) {
             this.setTitol(titol);
             this.setAutor(autor);
             this.setCategoria(categoria);
         }
                
        //</editor-fold>
         
        //<editor-fold defaultstate="collapsed" desc="Operadores">
         
          @Override
          public String toString() {
             return String.format("Titol: %s"
                                + "Autor: %s"
                                + "Categoria: %s", getTitol(), getAutor(), getCategoria()); 
          }
         
         
        //</editor-fold>
        
//</editor-fold>

      
}
