
package cat.iesjoaquimmir.Alumnes.model.businesslayes.entities;
import java.util.ArrayList;

public class Alumne {
    
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    //<editor-fold defaultstate="collapsed" desc="Objecte">
            private String nom;
            private String dni;
            private int edat;
            private String cognom1;
            private String cognom2;
            private ArrayList<String> telefon = new ArrayList<String>();
            private Domicili domicilio;
            private ArrayList<Moduls> modul;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Estatics">
          private static final String nombre = "Anonymous";
          private static final String dnii = "0000000-A";
          private static final int edad = 99;
          private static final String Telefon ="000000001";
            
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
            public String getCognom1() {
        return cognom1;
    }
            public void setCognom1(String cognom1) {
        this.cognom1 = cognom1;
    }
            public String getCognom2() {
        return cognom2;
    }
            public void setCognom2(String cognom2) {
        this.cognom2 = cognom2;
    }
            public void setTelefon(ArrayList<String> telefon) {
               this.telefon = telefon;
            }
            public void setModul(ArrayList<Moduls> modul) {
               this.modul = modul;
            }
            public ArrayList getTelefon(){
                return telefon;
            }
            public ArrayList getModul() {
                return modul;
            }
            public Domicili getDomicilio() {
        return domicilio;
    }
            public void setDomicilio(Domicili domicilio) {
        this.domicilio = domicilio;
    }
           
            
        
//</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Constructor">
                public Alumne (String nom, String dni, int edat, String cognom1, String cognom2, Domicili domicilio){
                    this.setNom(nom);
                    this.setDni(dni);
                    this.setEdat(edat);
                    this.setCognom1(cognom1);
                    this.setCognom2(cognom2);
                    //telefon.add("telefon");
                    this.setDomicilio(domicilio);
                }
                public Alumne(String nom, String cognom1, String cognom2){
                   this.setNom(nom);
                   this.setCognom1(cognom1);
                   this.setCognom2(cognom2);
                }
                public Alumne(String nom, String dni, int edat){
                    this.setNom(nom);
                    this.setDni(dni);
                    this.setEdat(edat);
                }
                public Alumne(String nom, int edat, String dni){
                    this.setNom(nom);
                    this.setDni(dni);
                    this.setEdat(edat);
                }
                public Alumne(String nom, String dni){
                    this(nom, dni, edad);
                }
                public Alumne(String nom, int edat){
                    this(nom, edat, dnii);
                }
                public Alumne(String nom){
                    this(nom, dnii);
                }
                        
//</editor-fold>
            
        //<editor-fold defaultstate="collapsed" desc="Operadores">
            
                    public String getSalutacio(){
                        return String.format("Hola, sóc en/la %s amb la identificació %s i tinc %d.",getNom(), getDni(), getEdat());
                    }
                    public String getNombrecompleto(){
                        return String.format("El meu 1º cognom es %s el 2º es %s i em dic %s.", getCognom1(), getCognom2(), getNom());

                    }
                    public Boolean Mayores(){
                        if (getEdat() >= 18){
                            return true;
                        }else{
                            return false;
                        }
                    }
                    
                    
//</editor-fold>
            
            
        
    //</editor-fold>

    
 }
