
package Problema22;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class Problema22 {
  /**
   * Programa en el que se introduce una frase por el teclado para luego imprimirla
   * cinco veces en filas consecutivas y en cada impresion deplazarla cuatro colimnas a la derecha
   */  
    public static void main(String[] args) {
        String frase = null;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese su frase");
        frase= entrada.nextLine();
        System.out.println("    "+frase);
        System.out.println("        "+frase);
        System.out.println("            " +frase);
        System.out.println("                "+frase);
        System.out.println("                    "+frase);
        
        
        
        
    }
}
