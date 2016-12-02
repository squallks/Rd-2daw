
package cat.iesjoaquimmir.ricard.biblioteca.usuaris.menor;
import cat.iesjoaquimmir.ricard.biblioteca.usuaris.Usuaris;
import cat.iesjoaquimmir.ricard.biblioteca.usuaris.adult.Adult;


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
    
    protected boolean isAdult() {
        return false;
    }

    
    protected boolean isVIP() {
        return tutor.isPremium();
    }
    
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Contructor">
    
    
    public Menor(String nom, String cognom1, String cognom2, Adult tutor) {
        super(nom, cognom1, cognom2);
        this.setTutor(tutor);
    }
    
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Operadors">
    
    
    
//      @Override
//    protected boolean isPremium() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    
    
    
    
//</editor-fold>
    
 //</editor-fold>   

    

  


    
}
