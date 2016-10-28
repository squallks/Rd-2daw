
package cat.iesjoaquimmir.Alumnes.model.businesslayes.entities;


public class Alumne {
    
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    //<editor-fold defaultstate="collapsed" desc="Objecte">
            private String nom;
            private String dni;
            private int edat;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Estatics">
          private static String nombre = "Anonymous";
          private static String dnii = "0000000-A";
          private static int edad = 99;
            
//</editor-fold>
        
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Metodes">
        
            //<editor-fold defaultstate="collapsed" desc="getters i setters">
        
            public String getNom() {
                return nom;
            }
            public void setNom(String nom) {
                this.nom = nom;
            }
            public String getDni() {
                return dni;
            }
            public void setDni(String dni) {
                this.dni = dni;
            }
            public int getEdat() {
                return edat;
            }
            public void setEdat(int edat) {
                this.edat = edat;
            }
        
//</editor-fold>
        
            //<editor-fold defaultstate="collapsed" desc="Constructor">
            
            public Alumne (String nom, String dni, int edat){
                this.setNom(nom);
                this.setDni(dni);
                this.setEdat(edat);
            }
            public Alumne(String nom, String dni){
                this(nom, dni, edad);
            }
            public Alumne(String nom){
                this(nom, dnii);
            }
            public Alumne(){
                this(nombre);
            }
            
            
//</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Operadores">
            
            public String getSalutacio(){
                return String.format("Hola, sóc en/la %s amb la identificació %s i tinc %d.",getNom(), getDni(), getEdat());
            }
            
//</editor-fold>
            
            
        
    //</editor-fold>
    
        


}
