
package cat.iesjoaquimmir.Alumnes.model.businesslayes.entities;


public class Domicili {
 
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    //<editor-fold defaultstate="collapsed" desc="objeto">
        private String carrer;
        private int numero;
        private int pis;
        private String codipostal;
        private String poblacio;
        private String provincia;
    
    
//</editor-fold>
    
  
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Metodes">
 
    //<editor-fold defaultstate="collapsed" desc="geters y setters">
    
        public String getCarrer() {
        return carrer;
    }

        public void setCarrer(String carrer) {
        this.carrer = carrer;
    }

        public int getNumero() {
        return numero;
    }

        public void setNumero(int numero) {
        this.numero = numero;
    }

        public int getPis() {
        return pis;
    }

        public void setPis(int pis) {
        this.pis = pis;
    }

        public String getCodipostal() {
        return codipostal;
    }

        public void setCodipostal(String codipostal) {
        this.codipostal = codipostal;
    }

        public String getPoblacio() {
        return poblacio;
    }

        public void setPoblacio(String poblacio) {
        this.poblacio = poblacio;
    }

        public String getProvincia() {
        return provincia;
    }

        public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructor">
        
        public Domicili(String carrer, int numero, int pis, String codipostal, String poblacio, String provincia)   {
        this.setCarrer(carrer);
        this.setNumero(numero);
        this.setPis(pis);
        this.setCodipostal(codipostal);
        this.setPoblacio(poblacio);
        this.setProvincia(provincia);
        }
        public Domicili(String carrer, int numero, int pis, String codipostal, String poblacio)   {
        this.setCarrer(carrer);
        this.setNumero(numero);
        this.setPis(pis);
        this.setCodipostal(codipostal);
        this.setPoblacio(poblacio);
        }
        public Domicili(String carrer, int numero, String codipostal, String poblacio, String provincia)   {
         this.setCarrer(carrer);
         this.setNumero(numero);
         this.setCodipostal(codipostal);
         this.setPoblacio(poblacio);
         this.setProvincia(provincia);
     }
        public Domicili(String carrer, int numero, String codipostal, String poblacio)   {
         this.setCarrer(carrer);
         this.setNumero(numero);
         this.setCodipostal(codipostal);
         this.setPoblacio(poblacio);
        
     }
     
     
     
        
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Operadores">
        
        public String getDomicilio(){
            return String.format("Mi domicilio es: '%s', '%d', '%d', '%s', '%s', '%s' ", getCarrer(), getNumero(), getPis(), getCodipostal(), getPoblacio(), getProvincia());
        }
        
        
//</editor-fold>
    
    
    
//</editor-fold>

   
     
}