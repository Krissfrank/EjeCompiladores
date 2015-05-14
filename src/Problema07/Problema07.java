
package Problema07;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Problema07 {
    /**
     * Programa que introduces tantas frases como queramos y contarlas.
     */
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        String frase;
        Scanner entrada2= new Scanner(System.in);
        int centinela=1, contador=0;
        while(centinela==1){
        System.out.println("Introduce la frase que quieras");
        frase=entrada.nextLine();
        System.out.println("Su frase es: "+frase);
        System.out.println("Si quieres seguir en el programa introduce 1 "
                + "y si quiere salir introduce 2");
        centinela= entrada2.nextInt();
        contador++;
        System.out.printf("Esta es la frase %d que ha introducido\n",contador);
        }
    }
}
