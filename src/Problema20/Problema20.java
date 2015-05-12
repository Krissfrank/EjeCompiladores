
package Problema20;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class Problema20 {
  /**
   * Programa para calcular el factoria del algun numero
   */  
    public static void main(String []args){
    long factoria=0, aux=0;
    Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese su numero entero positivo");
    factoria= entrada.nextLong();
    while(factoria<1){
     System.out.println("Ingrese su numero entero positivo");
    factoria= entrada.nextLong();
    
    }
    aux=factoria;
    while(factoria !=1){
    factoria=factoria-1;
    aux=aux*factoria;
    }
        System.out.printf("El factorial de su numero es: %d\n",aux);
    
    }
}
