/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problema04;

/**
 *
 * @author Cristian
 */
public class Problema04 {
    /**
     * Programa que imprime la suma de los 100 primeros numeros.
     */
    public static void main(String[]args){
    int contador=0;
    int aux=0;
    
    while(contador<100){
    contador++;
    aux=aux+contador;
        System.out.printf("Contador: %d\t",contador);
        System.out.printf("Numero: %d\n",aux);
        
    }
    
    }
    
}
