/*porcentaxe descontada*/
package boletin2.pkg6;

import java.util.Scanner;

/**
 *
 * @author aferreiradominguez
 */
public class Boletin26 {
    
    public static void main(String[] args) {
      float tarifa, pagado , porcentaxe ;
      System.out.println("tarifa=");
      Scanner dato=new Scanner(System.in);
      tarifa=dato.nextFloat();
      System.out.println("pagado=");
      Scanner dato2=new Scanner(System.in);
      pagado=dato2.nextFloat();
      porcentaxe=((pagado-tarifa)/pagado)*100;
      System.out.println("porcentaxe descontado="+porcentaxe+"%");
      
      
      
    }
    
}
