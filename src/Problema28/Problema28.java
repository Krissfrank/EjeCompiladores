
package Problema28;
import java.util.Random;
/**
 *
 * @author Cris
 */
public class Problema28 {
    ;
    /**
     * Programa que simula el lanzamiento de una moneda.
     */
    public static void main(String[]args){
    Random  rnd = new Random();
       int moneda;
       moneda= rnd.nextInt(2);
        if(moneda==0){
            System.out.println("Cruz");
        }
        else{
            System.out.println("Cara");
            
        }
    }
}
