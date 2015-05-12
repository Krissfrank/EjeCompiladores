package Problema10;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Problema10 {
    /**
     * Programa que determine si un numero es par o impar
     */
    public static void main(String[] args) {
        int aux=0;
        int resul=0;
        System.out.println("Introduce un numero para deterinar si es par o"
                + "impar");
        Scanner entrada = new Scanner(System.in);
        aux=entrada.nextInt();
        
        if(aux!=0){
          resul=aux%2;
          if(resul==0){
              System.out.println("Su numero es par");
          }else {
              System.out.println("Su numero es impar");
          }
        
        }
    }
}
