
package Problema31;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class Problema31 {
  /**
   * Programa que realiza la suma, resta, multiplicacion y division de dos 
   * numeros ingresados por medio del teclado
   */  
    public static void main(String[]args){
    int numero1=0,numero2=0,resultado=0,opcion=0;
    Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        numero1=entrada.nextInt();
        System.out.println("Ingrese el segundo numero");
        numero2=entrada.nextInt();
        System.out.println("Ingrese 1 para realizar una suma\n"
                            + "Ingrese 2 para realizar una resta\n"
                                + "Ingrese 3 para realizar la multiplicacion\n"
                                   + "ingrese 4 para realizar la division");
        opcion= entrada.nextInt();
        switch(opcion){
            case 1:
                resultado=numero1+numero2;
                break;
                
            case 2:
                resultado=numero1-numero2;
                break;
        
            case 3:
                resultado=numero1*numero2;
                break;
                
            case 4:
                resultado=numero1/numero2;
                break;
            default:
                System.out.println("No ingreso una opcion valida");
                break;
        }
        
        System.out.printf("El resultado es %d\n",resultado);
        
        
    }
}
