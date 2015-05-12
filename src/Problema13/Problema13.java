
package Problema13;

/**
 *
 * @author Cristian
 */
public class Problema13 {
   /**
    * Programa que imprime y cuenta  los numeros que son multiplos 
    * de 2 o de 3 que hay entre 1 y 100.
    */ 
    public static void main(String[] args) {
        int mul2=0;
        int mul3=0;
        int contador=0;
     int con2=0, con3=0;
        while(contador<100){
        contador++;
        mul2=contador%2;
        mul3=contador%3;
        if(mul2==0){
            System.out.printf("El numero %d es multiplo de 2\n",contador);    
        con2++;
         
        }
        if(mul3==0){
              System.out.printf("El numero %d es multiplo de 3\n",contador);    
        con3++;
          
        }
         
       
        
        }
        System.out.printf("Multiplos de 2 %d\n",con2);  
        System.out.printf("Multiplos de 3 %d\n",con3);
    }
}
