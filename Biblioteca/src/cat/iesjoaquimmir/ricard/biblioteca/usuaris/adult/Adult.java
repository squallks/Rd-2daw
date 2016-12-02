
package cat.iesjoaquimmir.ricard.biblioteca.usuaris.adult;

import cat.iesjoaquimmir.ricard.biblioteca.usuaris.Usuaris;


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
    
    @Override
    protected boolean isVIP() {
        return isPremium();
    }
  
    
    @Override
    protected boolean isAdult() {
        return true;
    }
    
    
    
    
//</editor-fold>
  
    

    
    
//</editor-fold>

    

    






    
    
}
