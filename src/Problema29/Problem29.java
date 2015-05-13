
package Problema29;

import java.util.Random;

/**
 *
 * @author Cris
 */
public class Problem29 {
    /**
     * Programa que simula 100 tiradas de dado y cuenta las veces que entre los 2 suma 10
     */
    
    public static void main(String []args){
        int dado1,dado2,suma,contador=0,contarSum=0;
        Random Rnd = new Random();
       
        
       
        
        while(contador<100){
        contador++;
        dado1 = Rnd.nextInt(6);
        dado1=dado1+1;
        
        dado2=Rnd.nextInt(6);
        dado2=dado2+1;
        
        suma=dado1+dado2;
        if(suma==10){
        contarSum++;
        }
        }
        System.out.printf("Las veces que la suma de los 10 dados tirados fue %d\n"
        ,contarSum);
    }
}
