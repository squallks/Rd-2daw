package cat.iesjoaquimmir.geoapp.views.console;

import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Square;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Cercle;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Sphere;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Rectangle;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Color;
import java.util.Scanner;

public class  Application {
   
//<editor-fold defaultstate="collapsed" desc="Menu">
    public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            
                System.out.printf("1- Cuadrat. 2- Cercle. 3- Esfera. 4- Rectangle 5- Color");
                int resp = input.nextInt();
            
                switch(resp){
                    case 1:
                     Square();
                     break;
                    case 2:
                      Cercle();
                      break;
                    case 3:
                     Sphere();
                     break;
                    case 4:
                      Rectangle();
                      break;
                    case 5:
                      Color();
                      break;
        }
            
    }         
    
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Operadores 1º menu">
            private static void Square(){
                 Square c1 = new Square(10.0);
             
                 System.out.printf("El costat de c1: %.2f %n", c1.getSide());
                 System.out.printf("El Area de c1: %.2f %n", c1.getArea());
                 System.out.printf("El Perimetre de c1: %.2f %n", c1.getPerimeter());
                
                
            }
            private static void Cercle(){
            
            Cercle c2 = new Cercle(10.0);
            
            System.out.printf("El radi de c2: %.2f %n", c2.getRadio());
            System.out.printf("El Area de c2: %.2f %n", c2.getAreac());
            System.out.printf("El Perimetre de c2: %.2f %n", c2.getPerimeterc());
    }
            private static void Sphere(){
            Sphere s1 = new Sphere(8.5);    
                
            System.out.printf("El radi de s1: %.2f %n", s1.getRadio());
            System.out.printf("El Area de s1: %.2f %n", s1.getAreas());
            System.out.printf("El Volumen de s1: %.2f %n", s1.getVolumens());
            
            }
            private static void Rectangle(){
                
            Rectangle r1 = new Rectangle(5.0 , 8.0);
              
            System.out.printf("La base de s1: %.2f %n", r1.getBase());
            System.out.printf("La Altura de s1: %.2f %n", r1.getAltura());
            System.out.printf("El Area de s1: %.2f %n", r1.getArea());
            System.out.printf("El Perimetro de s1: %.2f %n", r1.getPerimetro());
                
            }
            //<editor-fold defaultstate="collapsed" desc="Menu color">
        
            private static void Color(){
                 System.out.printf("1- Valores red, blue, green. 2- Hexadecimal. 3- Random");
                 Scanner input = new Scanner(System.in);
                 int resp2 = input.nextInt();
                        
                switch(resp2){  
                
                case 1:
                     Normal();
                     break;
                    case 2:
                      Hex();
                      break;
                    case 3:
                     Random();
                     break;
                    case 4:
                       System.out.printf("El numero de colors es: %d %n", Color.getCounter());
                       break;
                    case 5:
                        System.out.printf("EL numero en RGB es: %s %n", Color.toRGBString());
                        break;
                }
          }
               //</editor-fold>   
            private static void Normal(){
                 Color col1 = new Color(125,125,Color.MAX_VALUE);
                 System.out.printf("col1 -> r: %d g: %d b: %d %n", col1.getRed(), col1.getGreen(), col1.getBlue());
                }
            private static void Hex(){
                 Color col2 = Color.fromHexString("#FFFFFF");
                   System.out.printf("Col2 red: %d green: %d blue: %d %n");
                   System.out.printf("col -> %s %n", col2.toHexString(false));           
                   System.out.printf("col -> %s %n%n", col2.toHexString(true));  
                }
            private static void Random(){
                   Color col3 = Color.getRandom();
                   System.out.printf("El color random es: %d %d %d %n", col3.getRed(), col3.getGreen(), col3.getBlue());
               }
            private static void RGB(){
                String col4 = Color.toRGBString();
            }
            
            
            }

//</editor-fold>*/
