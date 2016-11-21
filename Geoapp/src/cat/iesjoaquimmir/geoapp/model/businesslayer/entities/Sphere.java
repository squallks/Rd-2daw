package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;


public class Sphere extends Shape{
    //<editor-fold defaultstate="collapsed" desc="Atributs">
      private double radio;
       
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Metodes">
      
    //<editor-fold defaultstate="collapsed" desc="geters y seters">
      
      public double getRadio() {
        return radio;
    }
       public void setRadio(double radio) {
        this.radio = radio;
    }
      
      
//</editor-fold>
      
    //<editor-fold defaultstate="collapsed" desc="Constructor">
       
    public Sphere(double radio, AlphaColor backgroundcolor, AlphaColor foregroundcolor) {
        super(backgroundcolor, foregroundcolor);
        this.setRadio(radio);
    }   
    public Sphere(double radio){
        this(radio,null,null);
    }
    public Sphere(){
        this(1.0);
    }
    
//</editor-fold>
          
    //<editor-fold defaultstate="collapsed" desc="Operadores">
      public double getAreas(){
            return 4 * Math.PI * Math.pow(getRadio(), 2);
    }
    
    public double getVolumens(){
            return 4 / 3 * Math.PI * Math.pow(getRadio(), 3);
    }
    
//</editor-fold>
      
      
      
//</editor-fold>
     

    
}
