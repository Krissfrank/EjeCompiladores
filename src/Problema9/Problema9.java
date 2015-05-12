

package Problema9;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Problema9 {
/**
 * Programa que determina si un numero es positivo o negativo
 */  
    public static void main(String[]args){
    float aux=0;
    Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero para determinar si es "
                + "postivio o negativo");
        aux= entrada.nextFloat();
      if(aux!=0){
        if(aux<=1){
            System.out.println("Es negativo");
        }
        
        else{
            System.out.println("Es positivo");
        }
      }else {System.out.println("Su numero es cero");}
    }
    
}
