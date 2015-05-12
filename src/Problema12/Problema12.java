package Problema12;

/**
 *
 * @author Cristian
 */
public class Problema12 {
  /**
   * Programa que  imprima los numeros del 1 al 100. Que calcule la
suma de todos los numeros pares por un lado, y por otro, la de todos los
impares.
   */
    
    public static void main(String[] args) {
        int contador=0;
        int aux=0;
        int conPar=0, conImp = 0;
        int auxPar = 0, auxImp = 0;
        while(contador<100){
            contador++;
           
            aux=contador%2;
            if(aux==0){
                System.out.printf("El numero %d es par\n",contador);
                conPar++;
                auxPar=conPar+auxPar;
            }
            else{
            System.out.printf("El numero %d es impar\n",contador);
                conImp++;
                auxImp=conImp+auxImp;
            }
            
            
        
        }
        System.out.printf("La cantidad de pares es: %d\n",auxPar);
        System.out.printf("La cantidad de impares es: %d\n",auxImp);
        
    }
    
}
