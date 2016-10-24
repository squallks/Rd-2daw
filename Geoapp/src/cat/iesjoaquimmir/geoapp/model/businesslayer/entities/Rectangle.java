package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;


public class Rectangle {

//<editor-fold defaultstate="collapsed" desc="Atributs">
   private double base = 10.0;
   private double altura = 4.0;
     
//</editor-fold>
   
//<editor-fold defaultstate="collapsed" desc="Metodos">
    
//<editor-fold defaultstate="collapsed" desc="geters y seters">
   
    public double getBase() {
            return base;
    }
        
    public void setBase(double base){
        this.base = base;
    }
    
    public double getAltura(){
            return altura;
    }
    public void setAltura(double altura){
             this.base = base;
    }
      
     
//</editor-fold>
   
//<editor-fold defaultstate="collapsed" desc="Constructor">
    
    public Rectangle (double base, double altura){
        this.setBase(base);
        this.setAltura(altura);
               
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Operadores">
    
 public double getPerimetro(){
        return Math.pow(getBase(),2) * Math.pow(getAltura(), 2);
   }
    
 public double getArea(){
       return getBase() * getAltura();
   }   
    
    
//</editor-fold>
    //</editor-fold>
   
}
