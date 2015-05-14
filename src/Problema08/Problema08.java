
package Problema08;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Problema08 {
 /**
  * Programa que solo nos permita introducir S o N
  */   
    
    public static void main(String []args){
    String si ="S";
    String no ="N";
    String aux;
    Scanner entrada= new Scanner(System.in);
        System.out.println("Introduce S o N\n");
        aux= entrada.nextLine();
       
    if(si.equals(aux)){
        System.out.println("Usted introdujo S");
    
    }
    
    if(no.equals(aux)){
        System.out.println("Usted introdujo N");
    
    }
    if(!si.equals(aux) && !no.equals(aux) ){
        System.out.println("Ustesd no introdujo ni S ni N");
    
    }
        
    }
}
