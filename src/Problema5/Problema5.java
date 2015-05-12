
package Problema5;

/**
 *
 * @author Cristian
 */
public class Problema5 {
 /**
  * Programa que imprima los numeros impares hasta el 100 y los cuente.
  */
    public static void main(String []args){
    int contador=0, contador2=0;
    int aux=0;
    while(contador<100){
        contador++;
        aux=contador%2;
        if(aux==1){
        System.out.printf("Impar: %d \t",contador);
        contador2++;
        System.out.printf("El contador va en: %d\n",contador2);
    }
   }
    
    
    }
    
}
