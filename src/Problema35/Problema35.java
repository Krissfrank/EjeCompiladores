
package Problema35;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class Problema35 {
    /**
     * Programa que llena un arreglo de 10 calificaciones y realiza una busqueda
     */
    public static void main(String[] args) {
          Scanner entrada=new Scanner(System.in);
          int cont=0;
          int[] arreglo = new int[10];
        while(cont<10){
           
        System.out.println("Ingrese la calificacion");
        arreglo[cont]=entrada.nextInt();
        if(arreglo[cont]>0 && arreglo[cont]<11){
            cont++;
        }
        else{
        System.out.println("La calificacion ingresada no es valida");
            }
        }
        int pos=0;
        System.out.println("Ingrese la posicion de la calificacion que quiere ver");
        pos= entrada.nextInt();
        int cont3=0;
      
        while(pos!=arreglo[cont3]){
        if(pos==arreglo[cont3]){
            System.out.println("La calificacion de la posicion ingresada es" +arreglo[cont3]);
        
        }
        cont3++;
        
        }
        System.out.println(arreglo[pos]);
    }
}
