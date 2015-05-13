
package Problema32;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class Problema32 {
    /**
     * Programa en el que se introduce un numero por el teclado y determine si es
     * primo, factorial o imprimir su tabla de multiplicar
     */
    public static void main(String[] args) {
        int numero=0,opcion=0,facto=0,aux=0,primo=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero a evaluar.");
        numero= entrada.nextInt();
        
        System.out.println("Para determinar si es primo ingrese 1\n"
                + "para determinar su factorial ingrese 2\n"
                + "para hacer su tabla de multiplicar ingrese 3");
        opcion= entrada.nextInt();
        switch(opcion){
            
            case 1:
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
                break;
                
            case 2:
                  while(numero<1){
     System.out.println("Ingrese su numero entero positivo");
    numero= entrada.nextInt();
    
    }
    aux=numero;
    while(numero !=1){
    numero=numero-1;
    aux=aux*numero;
    }
        System.out.printf("El factorial de su numero es: %d\n",aux);
                break;
                
            case 3:
        
                
                 for(int i = 0; i <= 10; i++) {
            System.out.printf("%d x %d= ",i,numero);
            System.out.printf("%d\n",i * numero);
        }
                break;
        
            
            
            default:
                System.out.println("No ingreso una opcion valida");
                break;
        }
        
    }
}
