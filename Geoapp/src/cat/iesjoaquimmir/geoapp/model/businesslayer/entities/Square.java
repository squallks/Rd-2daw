/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;



public class Square extends Shape {

//<editor-fold defaultstate="collapsed" desc="Atributs">
   
     private double side = 1.0;

//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Metodes">
    
//<editor-fold defaultstate="collapsed" desc="Constructor">
  
    public Square(double side, AlphaColor backgroundcolor, AlphaColor foregroundcolor) {
        super(backgroundcolor, foregroundcolor);
        this.setSide(side);
    }
    
    public Square(double side){
        this(side,null,null);
    }
   
    
    
//</editor-fold>
 
//<editor-fold defaultstate="collapsed" desc="geters y seters">
    
  public double getSide() {
        return side;
    }

  public void setSide(double side) {
        this.side = side;
       
    }
    
  

    
//</editor-fold>
 
//<editor-fold defaultstate="collapsed" desc="Operadores">
      public double getArea(){
            return Math.pow(getSide(),2);
    }
    
    public double getPerimeter(){
            return getSide() * 4;
    }
    
    @Override
    public String toString() {
        return String.format("Costat del quadrat: %.2f %n" 
                              + "Area del cuadrat %.2f %n"
                              + "Perimetre del quadrat: %.2f %n %s %n", getSide(), getArea(), getPerimeter(),super.toString());
    }
    
//</editor-fold>
  
  //</editor-fold>

 

}
