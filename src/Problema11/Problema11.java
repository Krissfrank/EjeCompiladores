
package Problema11;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Problema11 {
   /**
    * Programa que imprime y cuenta los multiplos de 3 de la unidad hasta el que
    * se introduce por el teclado
    */ 
    public static void main(String[]args){
    Scanner entrada= new Scanner(System.in);
    int aux;
    int num = 0;
    int contador=0, centinela=0;
    System.out.println("Introduce hasta que numero quieres llegar");
                centinela= entrada.nextInt();
    while(centinela!=contador){
               
                contador++;
                aux=contador%3;
                if(aux==0){
                    System.out.printf("El numero %d es multiplo de 3\n",contador);
                    num++;
                    
                }
       
        
       
        
    }
        System.out.printf("El total de los multiplos de 3 es %d\n", num);
    
    }
}
