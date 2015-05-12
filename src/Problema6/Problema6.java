
package Problema6;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Problema6 {
    /**
     * Programa que  imprima todos los numeros naturales que hay
desde la unidad hasta un numero que introducimos por teclado.
     */
    public static void main(String []args){
    int contador=1;
    int fin=0;
        System.out.println("Ingrese hasta que numero quiere imprimir");
        Scanner entrada = new Scanner(System.in);
        fin = entrada.nextInt();
        while(contador<=fin){
       
            System.out.printf("Numero: %d\n",contador);
            contador++;
        }
        
    
    
    
    }
    
    
}
