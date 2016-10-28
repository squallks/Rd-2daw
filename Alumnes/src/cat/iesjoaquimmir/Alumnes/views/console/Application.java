
package cat.iesjoaquimmir.Alumnes.views.console;

import cat.iesjoaquimmir.Alumnes.model.businesslayes.entities.Alumne;
import java.util.Scanner;

public class Application {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            
                System.out.printf("1- Nada. 2- Nombre. 3- Nombre+Dni. 4- Todo.");
                int resp = input.nextInt();
            
                       switch(resp){
                    case 1:
                     Nada();
                     break;
                    case 2:
                      Nombre();
                      break;
                    case 3:
                     Nombre+Dni();
                     break;
                    case 4:
                      Todo();
                      break;
                  }
    
}


