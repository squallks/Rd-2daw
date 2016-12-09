
package cat.iesjoaquimmir.ricard.biblioteca.usuaris.adult;

import cat.iesjoaquimmir.ricard.biblioteca.usuaris.Usuaris;
import java.util.Objects;


public class Adult extends Usuaris{
    
    //<editor-fold defaultstate="collapsed" desc="Atributs">
   
    private String dni;
    private boolean premium;

    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Metodes">
    
    //<editor-fold defaultstate="collapsed" desc="getters setters">
    
    public String getDni() {
        return dni;
    }
    private void setDni(String dni) {
        if(dni != null){
            this.dni = dni;
        }
    }
    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public boolean isPremium() {
        return premium;
    }
    
    
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructor">
    
    public Adult(String nom, String cognom1, String cognom2, String dni, boolean premium) {
        super(nom, cognom1, cognom2);
        this.setDni(dni);
        this.setPremium(premium);
    }
    
    
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Metodes">
    public String Vipre(){
        if(isPremium() == true){
          return String.format("Si, es premium");
        }else{
           return String.format("No, no es premium");
        }
    }
    
    @Override
    protected boolean isVIP() {
        return isPremium();
    }
  
    
    @Override
    protected boolean isAdult() {
        return true;
    }
    
    
    @Override
    public String toString() {
        return String.format("%s Dni: %s Premium: %s ", super.toString(), getDni(), Vipre());
    }  
    

    @Override
    public boolean equals(Object obj) { 
        if(obj instanceof Adult){
           Adult tmpAdult = (Adult) obj;
        if(super.equals(tmpAdult) && this.dni.equals(tmpAdult.dni)){
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
            int hash = 3;
            hash = 19 * hash + Objects.hashCode(this.dni);
            return hash;
        }
    
    
//</editor-fold>
  
    

    
    
//</editor-fold>



   
    
}
