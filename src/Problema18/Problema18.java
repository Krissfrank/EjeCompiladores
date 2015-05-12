/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema18;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class Problema18 {
    /**
     * Programa que cuenta las veces que de repite la letra A en una palagra 
     * que se ingrese desde el teclado
     */
    
    public static void main(String[] args) {
        char a='a';
        int contador=0;
        int contado2=0;
        int cuenta=0;
        char nueva;
        String word;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase");
       word= entrada.nextLine();
       
     while(contador<word.length()){
         contador++;
  nueva= word.charAt(contado2);
  if(a==nueva){
  cuenta++;
  
  }
  contado2++;
     
      
    }
            System.out.println(cuenta);
    }
}
