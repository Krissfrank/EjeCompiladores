
package Problema27;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class Problema27 {
    /**
     * Calcula la tabla de multiplicar de algun numero que el usuario elija.
     */
    public static void main(String[] args) {
      int numero=0;
      Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese la tabla de multiplicar que quiere resolver");
        numero= entrada.nextInt();
        for(int i = 0; i <= 10; i++) {
            System.out.printf("%d x %d= ",i,numero);
            System.out.printf("%d\n",i * numero);
        }
        
    }
}
