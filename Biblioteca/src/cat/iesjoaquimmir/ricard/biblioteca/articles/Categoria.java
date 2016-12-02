
package cat.iesjoaquimmir.ricard.biblioteca.articles;


public enum Categoria {
     
    A("INFANTIL", false),
    B("JUVENIL", false),
    C("ADULT", true);
    
    private final String mensaje;
    private final boolean adult;
    
    Categoria (String mensaje, boolean adult){
        this.mensaje = mensaje;
        this.adult = adult;
    }

    public String getMensaje() {
        return mensaje;
    }

    public boolean isAdult() {
        return adult;
    }
    
   
    
}
