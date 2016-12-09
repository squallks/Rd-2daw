
package cat.iesjoaquimmir.ricard.biblioteca.usuaris.menor;
import cat.iesjoaquimmir.ricard.biblioteca.usuaris.Usuaris;
import cat.iesjoaquimmir.ricard.biblioteca.usuaris.adult.Adult;
import java.util.Objects;


public class Menor extends Usuaris{
    
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    
    private Adult tutor;

   //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Metodes">
    
    //<editor-fold defaultstate="collapsed" desc="getters setters">
    
    public Adult getTutor() {
        return tutor;
    }
    private void setTutor(Adult tutor) {
        this.tutor = tutor;
    }
    

    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Contructor">
    
    
    public Menor(String nom, String cognom1, String cognom2, Adult tutor) {
        super(nom, cognom1, cognom2);
        this.setTutor(tutor);
    }
    
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Operadors">
    

    protected boolean isAdult() {
        return false;
    }

    
    protected boolean isVIP() {
        return tutor.isPremium();
    }
    
    
    
    @Override
    public String toString() {
        return String.format("%s Tutor: %s%n", super.toString(), tutor.getNom());
    }
    
   
    @Override
    public boolean equals(Object obj) {
      if(obj instanceof Menor){
           Menor tmpMenor = (Menor) obj;
        if(super.equals(tmpMenor) && this.tutor.equals(tmpMenor.tutor)){
                    return true;
                }else{
                    return false;
                     }
             }else{
                return false;
                 }
            }  
 
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.tutor);
        return hash;
    }
    
//</editor-fold>
    
 //</editor-fold>   

    
}
