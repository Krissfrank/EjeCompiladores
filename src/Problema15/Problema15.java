
package Problema15;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Problema15 {
    /**
     * Programa que al introducir dos numeros por teclado imprimir los numeros 
     * naturales que hay entre ambos numeros empezando por el m s pequeño, contar cuantos hay y
cuantos de ellos son pares. Calcular la suma de los impares.
     */
    
    public static void main(String []args){
    int num1=0, num2=0, mayor=0,menor=0, contador=0,par=0,impar=0,contPar=0,contImpar = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        num1=entrada.nextInt();
        System.out.println("Introduzca el primer numero");
        num2=entrada.nextInt();
        if(num1<num2){
        mayor =num2;
        menor=num1;}
        
        else{ mayor=num1; 
        menor=num2;}
        System.out.printf("Los numeros iran de %d a %d\n", menor, mayor);
        while(menor<=mayor){
            System.out.println(menor);
           
            contador++;
            par=menor%2;
            if(par==0){
            contPar++;
            }
            impar=menor%2;
            if(impar!=0){
                contImpar=menor+contImpar;
            }
         menor++;
        }
        
        System.out.printf("%d numeros totales\n", contador );
        System.out.printf("%d numeros Pares\n", contPar );
        System.out.printf("%d Suma de los impares\n", contImpar );
        
    
    }
}
