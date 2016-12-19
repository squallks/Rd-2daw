package cat.iesjoaquimmir.Alumnes.model.businesslayes.entities;

import java.lang.Number;

public class LaException extends Exception{
    
    //<editor-fold defaultstate="collapsed" desc="Atributs">
    
        private int n;
        private String algo;
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Metodes">
    
    //<editor-fold defaultstate="collapsed" desc="getters setters">
        
            public int getN() {
                return n;
            }
            public void setN(int n) {
                this.n = n;
            }
            public String getAlgo() {
                return algo;
            }
            public void setAlgo(String algo) {
                this.algo = algo;
            }
   
    
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructor">
       
         public LaException(int n){
             this.setN(n);
         }
         
         public LaException(String algo){
             this.setAlgo(algo);
         }
            
            
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Operadors">
    
         
         public String controlNum(){
            
            return String.format("%nException de ints%n Has puesto este valor:%n %d" ,getN());
         }
         
         public String controlStr(){
             
           return String.format("%nNo has puesto ninguna cadena%n");
         }
         
         
   
         
//</editor-fold>
    
    
    
//</editor-fold>

    @Override
    public String getMessage() {
        if(algo.isEmpty()){
          return controlStr();
        }
        if(n <= 0){
            return controlNum();
        }
        return String.format("El programa a finalizado correctamente");
    }

    


 
    
    
}
