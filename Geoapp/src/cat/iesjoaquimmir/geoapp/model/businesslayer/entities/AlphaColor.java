
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;


public class AlphaColor extends Color{
    
    //<editor-fold defaultstate="collapsed" desc="Atributes">
    private double alpha;    
    //<editor-fold defaultstate="collapsed" desc="estatics">
    
    private static final double MAX_ALPH = 1.0;
    private static final double MIN_ALPH = 0.0;
  //</editor-fold>
   //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    
    //<editor-fold defaultstate="collapsed" desc="getters setters">
    
     public double getAlpha() {
        return alpha;
    }

 
    public void setAlpha(double alpha) {
        if(alpha <= 1.0 && alpha >= 0.0){
            this.alpha = alpha;            
        }else{
        throw new IllegalArgumentException("TT nite y pruba otra vez");
        }
    }
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructor">
    
    public AlphaColor(int red, int green, int blue, double alpha) {
        super(red, green, blue);
        this.setAlpha(alpha);
    } 
    public AlphaColor(int red, int green, int blue) {
         this(red, green, blue,MAX_ALPH);
    } 
    
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    
      @Override
    public String toHexString(boolean upper) {
        return String.format("%s i alpha: %.2f", super.toHexString(upper), getAlpha()); 
    }
    
    @Override
    public String toHexString() {
        return String.format("%s i alpha: %.2f", super.toHexString(true), getAlpha());
    }
    
    @Override
    public String toRGBString(boolean upper){
        return String.format("%s i alpha: %.2f", super.toRGBString(upper),getAlpha());
    }
    
//     @Override
//    public String toRGBString() {
//        return String.format("%s i alpha: %.2f", super.toRGBString(true),getAlpha());
//    }
//    
//    @Override
//    public String toString() {
//        return String.format("La opacidad es de: %.2f", getAlpha());
//    }
    
//</editor-fold>
    
//</editor-fold>

    

   

    

  

   
    
}
