
package Problema24;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class Problema24 {
       /**
     * Programa que calcula el numero primo de un numero
     */
     public static void main(String[] args) {
        int numero=0, primo=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero a calcular");
        numero=entrada.nextInt();
    if(numero>=1){
        if(numero==2){ System.out.printf("Su numero %d es primo\n",numero);}
    primo=numero%2;
       if(primo==1){
           System.out.printf("Su numero %d es primo\n",numero);
       }
      if(primo!=1){
       System.out.printf("Su numero %d NO es primo\n",numero);
      }
        
        
    }else{
        System.out.println("Los numeros negativos no pueden ser primos");
    }
        
    
    }
}
