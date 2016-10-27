/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;


public class Cercle {
    
//<editor-fold defaultstate="collapsed" desc="Atributs">
    private double radio;
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Metodos">
    
    //<editor-fold defaultstate="collapsed" desc="geters y seters">
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }   
    
//</editor-fold>
   
    //<editor-fold defaultstate="collapsed" desc="Contructor">
    
    public Cercle(double radio){
    this.setRadio(radio);
}
    public Cercle(){
        this(1.0);
    }
    
    
    
    
//</editor-fold>
       
    //<editor-fold defaultstate="collapsed" desc="Operadores">
      public double getAreac(){
            return Math.PI * Math.pow(getRadio(),2);
    }
    
    public double getPerimeterc(){
            return 2 * Math.PI * getRadio();
    }
    
//</editor-fold>
   
//</editor-fold>
 
}
