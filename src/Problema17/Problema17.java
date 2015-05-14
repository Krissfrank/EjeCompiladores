
package Problema17;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class Problema17 {
    /**
     * Programa que imprime, cuenta y suma los multiplos de 2 que hay 
     * entre una serie de numeros tal que el segundo sea mayor o igual que 
     * el primero
     * 
     */
    public static void main(String[] args) {
        int num1=0, num2=0;
        int cont1 = 0,aux,suma=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese desde que numero quiere iniciar la serie");
        num1=entrada.nextInt();
        
        System.out.println("Ingrese hasta que numero quiere que llegue la serie");
        num2=entrada.nextInt();
        
        if(num1>num2){
            System.out.println("El primer numero no puede ser mayor");
        while(num1>num2){
         System.out.println("Ingrese desde que numero quiere iniciar la serie");
        num1=entrada.nextInt();
        
        System.out.println("Ingrese hasta que numero quiere que llegue la serie");
        num2=entrada.nextInt();
        
        
        }
        
        }
       
        while(num1<=num2){
       
            aux=num2%2;
        if(aux==0){
           System.out.printf("Multiplo de 2: %d\n",num2); 
        cont1++;
        suma=num2+suma;
        }
         num2--; 
          
        
        }        
                
                
                
        
        System.out.printf("Los multimos de dos son : %d\n",cont1);
        System.out.printf("La suma de los numeros es: %d\n",suma);
        
        
    }
}
