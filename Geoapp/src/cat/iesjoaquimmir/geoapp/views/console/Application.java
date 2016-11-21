package cat.iesjoaquimmir.geoapp.views.console;

import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Square;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Cercle;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Sphere;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Rectangle;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Color;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.AlphaColor;
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
                Scanner input = new Scanner(System.in);
                System.out.printf("Dime tu tamaño");
                int side = input.nextInt();
                System.out.printf("Dime tu red del backgroun");
                int red = input.nextInt();
                 System.out.printf("Dime tu green del backgroun");
                int green = input.nextInt();
                System.out.printf("Dime tu blue del backgroun");
                int blue = input.nextInt();
                AlphaColor co1 = new AlphaColor(red,green,blue);
                System.out.printf("Dime tu red del foregroundcolor");
                int red2 = input.nextInt();
                 System.out.printf("Dime tu green del foregroundcolor");
                int green2 = input.nextInt();
                System.out.printf("Dime tu blue del foregroundcolor");
                int blue2 = input.nextInt();
                AlphaColor co2 = new AlphaColor(red2,green2,blue2);
                Square c1 = new Square(side,co1,co2);
             
//                 System.out.printf("El costat de c1: %.2f %n", c1.getSide());
//                 System.out.printf("El Area de c1: %.2f %n", c1.getArea());
//                 System.out.printf("El Perimetre de c1: %.2f %n", c1.getPerimeter());
//                 System.out.printf("El background es: %s %n", c1.getBackgroundcolor().toHexString());
//                 System.out.printf("El foreground es: %s %n", c1.getForegroundcolor().toHexString());
//                 System.out.printf("La opacidad de tu cuadrado es de: %.2f %n", co1.getAlpha());
                 System.out.printf("%s", c1.toString());
            }
            private static void Cercle(){
              Scanner input = new Scanner(System.in);
                System.out.printf("Dime tu red del backgroun");
                int red = input.nextInt();
                System.out.printf("Dime tu green del backgroun");
                int green = input.nextInt();
                System.out.printf("Dime tu blue del backgroun");
                int blue = input.nextInt();
                AlphaColor co1 = new AlphaColor(red,green,blue);
                System.out.printf("Dime tu red del foregroundcolor");
                int red2 = input.nextInt();
                 System.out.printf("Dime tu green del foregroundcolor");
                int green2 = input.nextInt();
                System.out.printf("Dime tu blue del foregroundcolor");
                int blue2 = input.nextInt();
                AlphaColor co2 = new AlphaColor(red2,green2,blue2);
                Cercle c2 = new Cercle(10.0, co1, co2);
            
            System.out.printf("El radi de c2: %.2f %n", c2.getRadio());
            System.out.printf("El Area de c2: %.2f %n", c2.getAreac());
            System.out.printf("El Perimetre de c2: %.2f %n", c2.getPerimeterc());
            System.out.printf("El bacground es: %s %n", c2.getBackgroundcolor().toHexString());
            System.out.printf("El bacground es: %s %n", c2.getForegroundcolor().toHexString());
            System.out.printf("La opacidad de tu cuadrado es de: %.2f %n", co1.getAlpha());
            }
            private static void Sphere(){
             Scanner input = new Scanner(System.in);
                System.out.printf("Dime tu red del backgroun");
                int red = input.nextInt();
                System.out.printf("Dime tu green del backgroun");
                int green = input.nextInt();
                System.out.printf("Dime tu blue del backgroun");
                int blue = input.nextInt();
                AlphaColor co1 = new AlphaColor(red,green,blue);
                System.out.printf("Dime tu red del foregroundcolor");
                int red2 = input.nextInt();
                 System.out.printf("Dime tu green del foregroundcolor");
                int green2 = input.nextInt();
                System.out.printf("Dime tu blue del foregroundcolor");
                int blue2 = input.nextInt();
                AlphaColor co2 = new AlphaColor(red2,green2,blue2);
                Sphere s1 = new Sphere(8.0,co1,co2);
                    
            System.out.printf("El radi de s1: %.2f %n", s1.getRadio());
            System.out.printf("El Area de s1: %.2f %n", s1.getAreas());
            System.out.printf("El Volumen de s1: %.2f %n", s1.getVolumens());
            System.out.printf("El bacground es: %s %n", s1.getBackgroundcolor().toHexString());
            System.out.printf("El bacground es: %s %n", s1.getForegroundcolor().toHexString());
            System.out.printf("La opacidad de tu cuadrado es de: %.2f %n", co1.getAlpha());
            
            }
            private static void Rectangle(){
            Scanner input = new Scanner(System.in);
            System.out.printf("Dime tu red del backgroun");
                int red = input.nextInt();
                 System.out.printf("Dime tu green del backgroun");
                int green = input.nextInt();
                System.out.printf("Dime tu blue del backgroun");
                int blue = input.nextInt();
                AlphaColor co1 = new AlphaColor(red,green,blue);
                System.out.printf("Dime tu red del foregroundcolor");
                int red2 = input.nextInt();
                 System.out.printf("Dime tu green del foregroundcolor");
                int green2 = input.nextInt();
                System.out.printf("Dime tu blue del foregroundcolor");
                int blue2 = input.nextInt();
                AlphaColor co2 = new AlphaColor(red2,green2,blue2);
                Rectangle r1 = new Rectangle(5.0 , 8.0, co1, co2);
            System.out.printf("La base de s1: %.2f %n", r1.getBase());
            System.out.printf("La Altura de s1: %.2f %n", r1.getAltura());
            System.out.printf("El Area de s1: %.2f %n", r1.getArea());
            System.out.printf("El Perimetro de s1: %.2f %n", r1.getPerimetro());
            System.out.printf("El background es: %s %n", r1.getBackgroundcolor().toHexString());
            System.out.printf("El foreground es: %s %n", r1.getForegroundcolor().toHexString());
            System.out.printf("La opacidad de tu cuadrado es de: %.2f %n", co1.getAlpha());
                
            }
            //<editor-fold defaultstate="collapsed" desc="Menu color">
        
            private static void Color(){
                 System.out.printf("1- Valores red, blue, green. 2- Hexadecimal. 3- Random. 4-RGB.");
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
                        RGB();
                        break;
                }
          }
               //</editor-fold>   
            private static void Normal(){
                 Color col1 = new AlphaColor(125,125,Color.MAX_VALUE);
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
                AlphaColor col4 = new AlphaColor(25,5,10);
                System.out.printf("El Alphacolor en RGB es: %s %n",col4.toRGBString());
                 
            }
            
            
            }

//</editor-fold>
