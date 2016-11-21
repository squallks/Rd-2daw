
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;


public abstract class Shape {
    
    //<editor-fold defaultstate="collapsed" desc="Atributs">
       private AlphaColor backgroundcolor;
       private AlphaColor foregroundcolor;
       private static int contador = 0;
     
//</editor-fold>

       //<editor-fold defaultstate="collapsed" desc="Metodos">
       
       //<editor-fold defaultstate="collapsed" desc="getters setters">
       
       public Color getBackgroundcolor() {
        return backgroundcolor;
    }

       public void setBackgroundcolor(AlphaColor backgroundcolor) {
            if(backgroundcolor == null) {
                throw new NullPointerException("No has puesto nada");
            }else{
            this.backgroundcolor = backgroundcolor;
          }
        }

       public Color getForegroundcolor() {
              return foregroundcolor;
          }

       public void setForegroundcolor(AlphaColor foregroundcolor) {
            if(backgroundcolor == null) {
                throw new NullPointerException("No has puesto nada");
            }else{
              this.foregroundcolor = foregroundcolor;
          }
        }
  
       
//</editor-fold>
       
       //<editor-fold defaultstate="collapsed" desc="constructor">
       
       public Shape (AlphaColor backgroundcolor, AlphaColor foregroundcolor){
           this.setBackgroundcolor(backgroundcolor);
           this.setForegroundcolor(foregroundcolor);
       }
       
//</editor-fold>
       
       //<editor-fold defaultstate="collapsed" desc="Metodos">
       
       @Override
    public String toString() {
        return String.format("Color de linia:%s%n"
                           + "Color de fons: %s%n", getForegroundcolor().toHexString(), getBackgroundcolor().toHexString()); 
    }
       
       
//</editor-fold>
       
//</editor-fold>

    
    
    
        
}
