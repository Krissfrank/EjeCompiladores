
package Problema21;

/**
 *
 * @author Cris
 */
public class Problema21 {
    /**
     * Programa que calcule la suma de los pares y los impares del 1 al 1000
     */
    public static void main(String[]args){
    
        int aux=0, par = 0,impar=0,num=0;
        
        while(num<=1000){
            num++;
            aux=num%2;
        switch(aux){
        
            
            case 0:
                par=num+par;
                break;
                
            case 1:
                impar=num+impar;
                break;
                    }
        
        
        
        }
        System.out.printf("La suma de los numeros pares es: %d\n", par);
        System.out.printf("La suma de los numeros impares es: %d\n", impar);
    
    }
}
