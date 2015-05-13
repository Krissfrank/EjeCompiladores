
package Problema34;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class Problema34 {
    /**
     * Programa que lee las calificaciones de un alumno en 10
asignaturas,y las almacena en un vector y calcula e imprima su media.
     */
    public static void main(String[] args) {
        int cont=0,suma=0,promedio=0;
        Scanner entrada=new Scanner(System.in);
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
        int cont2=0;
        while(cont2<10){
            System.out.println("Calificacion:" +arreglo[cont2]);
            suma=suma+arreglo[cont2];
            cont2++;
        }
        promedio=suma/10;
        System.out.printf("El promedio es %d\n",promedio);
    }
}
