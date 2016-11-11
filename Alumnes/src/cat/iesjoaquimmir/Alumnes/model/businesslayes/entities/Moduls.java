package cat.iesjoaquimmir.Alumnes.model.businesslayes.entities;


public class Moduls {
    
//<editor-fold defaultstate="collapsed" desc="Atributs">
    
    private String nom;
    private String descripcio;
    private int hores;
      
    
//</editor-fold>
    
    
//<editor-fold defaultstate="collapsed" desc="Metodes">
   
   //<editor-fold defaultstate="collapsed" desc="getters setters">
    
                public String getNom() {
                    return nom;
                }
                public void setNom(String nom) {
                    this.nom = nom;
                }
                public String getDescripcio() {
                    return descripcio;
                }
                public void setDescripcio(String descripcio) {
                    this.descripcio = descripcio;
                }
                public int getHores() {
                    return hores;
                }
                public void setHores(int hores) {
                    this.hores = hores;
                }
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="constructors">
     
      public Moduls(String nom, String descripcio, int hores)          {
          this.setNom(nom);
          this.setDescripcio(descripcio);
          this.setHores(hores);
          
      }
              
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Metodes">
      
      
      
      
      
//</editor-fold>
   
    
//</editor-fold>

    
}
