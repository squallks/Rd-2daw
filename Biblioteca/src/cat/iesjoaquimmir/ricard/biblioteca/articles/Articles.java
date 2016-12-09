
package cat.iesjoaquimmir.ricard.biblioteca.articles;


public abstract class Articles {
    
    //<editor-fold defaultstate="collapsed" desc="Atributs">
        private String titol;
        private String autor;
        private Categoria categoria;
        private int cogido;
      
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
                public int getCogido() {
                    return cogido;
                }
                public void setCogido(int cogido) {
                    if(cogido < 0 || cogido > 1){
                        System.out.printf("Solo se puede poner 0 o 1");
                    }else{
                    this.cogido = cogido;
                    }
                }


//</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Constructor">
                
         public Articles(String titol, String autor, Categoria categoria) {
             this.setTitol(titol);
             this.setAutor(autor);
             this.setCategoria(categoria);
             this.setCogido(0);
         }
                
        //</editor-fold>
         
        //<editor-fold defaultstate="collapsed" desc="Operadores">
         
          @Override
          public String toString() {
             return String.format("Titol: %s"
                                + "Autor: %s"
                                + "Categoria: %s", getTitol(), getAutor(), getCategoria()); 
          }
         
          public void pilloart(int a){
               this.cogido = a;
         }
         
        //</editor-fold>
        
//</editor-fold>

 

      
}
