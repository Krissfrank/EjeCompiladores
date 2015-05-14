
package Problema03;

/**
 *
 * @author Cristian
 */
public class Problema03 {
    /**
     * Programa que muestra todos los numeros pares del 0 al 100
     */
    public static void main(String []args){
    int contador=0;
    float eva;
    while(contador<100){
    contador++;
    eva = contador%2;
    if(eva==0){
        System.out.printf("Numero par %d\n",contador);
    }
        
    }
    
    
    }
    
}
