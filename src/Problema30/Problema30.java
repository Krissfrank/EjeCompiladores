
package Problema30;

import java.util.Random;

/**
 *
 * @author Cris
 */
public class Problema30 {
    /**
     * Programa que simula la carrera de dos caballos y muestra cual gano
     */
    
    public static void main(String[]args){
    Random Rnd = new Random();
    int carrera;
    carrera = Rnd.nextInt(2);
        
    if(carrera==0){
        System.out.println("Caballo 1 gano!");
    }
    else{
    System.out.println("Caballo 2 gano!");
    }
    }
}
