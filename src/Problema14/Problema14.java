
package Problema14;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Problema14 {
 /**
  * Programa que determina de 5 numeros introducidos por el teclado cual es el 
  * menor y cual es el mayor
  */   
    public static void main(String[] args) {
        float mayor=0, menor=0,aux1=0,aux2;
        float numero1=0,numero2=0;
        int contador=1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero");
        numero1 = entrada.nextFloat();
       mayor=numero1;
        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Introduce un numero");
        numero2 = entrada1.nextFloat();
        menor=numero2;
        if(menor>mayor){
           aux1=menor;
           aux2=mayor;
           mayor=aux1;
           menor=aux2;
        }
        
      while(contador<=3){
            contador++;
       System.out.println("Introduce un numero");
        numero1 = entrada.nextFloat();
        if(numero1>mayor){
        mayor=numero1;
        }
        if(numero1<menor){
        menor = numero1;
        }
      
        }
        System.out.printf("Mayor: %f\n",mayor);
        System.out.printf("Menor: %f\n",menor);
    }
}
