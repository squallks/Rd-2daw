/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.model.businesslayer.entities;
import java.util.Random;

public abstract class Color {
    
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    
    //<editor-fold defaultstate="collapsed" desc="Dinamicos">
    
        private int red;
        private int green;
        private int blue;   
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Estaticos">
        
        public static final int MAX_VALUE=255;
        public static final int MIN_VALUE=0;
        private static int counter=0;
        private Random rnd = new Random();
        
//</editor-fold>
   
    
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Metodos">
        
    //<editor-fold defaultstate="collapsed" desc="seters y geters">
  
    public int getRed() {
        return red;
    }
    public void setRed(int red) {
        if (red < 0 || red > 125){
            throw new IllegalArgumentException(
            String.format("valor %d no valido para el color" , red));
        }
        this.red = red;
    }
    public int getGreen() {
        return green;
    }
    public void setGreen(int green) {
        if (green < 0 || green > 125){
            throw new IllegalArgumentException(
            String.format("valor %d no valido para el color" , green));
        }
        this.green = green;
    }
    public int getBlue() {
        return blue;
    }
    public void setBlue(int blue) {
        if (blue < 0 || blue > 255){
            throw new IllegalArgumentException(
            String.format("valor %d no valido para el color" , blue));
        }
        this.blue = blue;
    } 
    public static int getCounter(){
            return counter;
        }
        
        
        
        
        
//</editor-fold>
        
    //<editor-fold defaultstate="collapsed" desc="Constructores">
        
        public Color(int red, int blue, int green) {
            counter++;
            this.setRed(red);
            this.setGreen(green);
            this.setBlue(blue);
        }
         public String toHexString(){
            return toHexString(true);
        }
        
         
        
//</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Operadores">
        
        
        
        public String toRGBString(boolean upper){
           return String.format(upper ? "RGB: %d" : " rgb: %d", getRed(),getGreen(),getBlue());
        }
        public String toRGBString(){
            return toRGBString(true);
        }
        
        public String toHexString(boolean upper){
            return String.format(upper ? "#%02X%02X%02X" : "#%02X%02X%02X" , getRed(), getGreen(), getBlue());
        }
       
        public static Color fromHexString(String color){
            if (color == null){
                throw new NullPointerException("Es obligatori indicar una cadena de text");
            }
            if (!color.matches("^#[0-9A-Fa-f]{6}$")){
                    throw new IllegalArgumentException(
                            String.format("El text %s no te format hexadecimal", color));
            }
         return new AlphaColor (Integer.parseInt(color.substring(1,3) , 16),
                           Integer.parseInt(color.substring(3,5) , 16) ,
                           Integer.parseInt(color.substring(5,7) , 16))   ;
        }
        
        public static Color getRandom(){
            Random rnd = new Random();
            return new AlphaColor (rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        }
        
        

       //</editor-fold>
        
              
//</editor-fold>

    

}
