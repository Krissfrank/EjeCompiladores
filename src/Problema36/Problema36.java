/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema36;

import java.util.Random;

/**
 *
 * @author Cris
 */
public class Problema36 {
    /**
     * Programa que genera una matriz de 4 filas y 5 columnas con numeros 
     * aleatorios entre 1 y 100, y las imprime
     */
    public static void main(String[] args) {
        Random Rnd = new Random();
        int  num=0,con1=0,con2=0;
        int arreglo[][];
       
         arreglo = new int[4][5];
          
         
        
         
         for(int i=0;i<4;i++){
             
             for(int j=0;j<5;j++){
                  num=Rnd.nextInt(100);
                 arreglo[i][j]=num;
              
              
                 System.out.println(arreglo[i][j]);
             }
         }
             
         
         
         
         
         
        /* while(cont2<3){
             num=Rnd.nextInt(100);
          arreglo[cont1][cont2]= num ;
         cont2++;
         } 
         
         while(cont1<4){
             num=Rnd.nextInt(100);
          arreglo[cont1][cont2]= num ;
         cont1++;
         
         }
           */
         
         
        
    }
}
