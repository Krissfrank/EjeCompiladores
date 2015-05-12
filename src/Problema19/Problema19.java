
package Problema19;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class Problema19 {
    /**
     * Programa que simula un relij digital y da la opcion de elegir la hora incial
     */
    public static void main(String[]args) throws InterruptedException{
        Scanner entrada = new Scanner(System.in);
        int minutos=0;
        int segundos=0;
        int horas=0;
        
        System.out.println("Ingrese la hora");
        horas=entrada.nextInt();
        while(horas>=24)
       {
            System.out.println("Lo siento el dia solo tiene 24 horas"
                    + " porfavor intente de nuevo.\n");
            System.out.println("Ingrese la hora");
        horas=entrada.nextInt();
        }     
        
        System.out.println("Ingrese los minutos");
        minutos=entrada.nextInt();
        while(minutos>=60){
            System.out.println("Lo siento los horas solo tienes 60 minutos"
                    + "porfavor intente de nuevo.\n");
             System.out.println("Ingrese los minutos");
        minutos=entrada.nextInt();
        }
        
        System.out.println("Ingrese los segundos");
        segundos=entrada.nextInt();
       while(segundos>=60){
            System.out.println("Lo siento los minutos solo tienes 60 segundos"
                    + "porfavor intente de nuevo.\n");
             System.out.println("Ingrese los segundos");
        segundos=entrada.nextInt();
        }
        
        while(true){
           Thread.sleep(500);
          
           System.out.printf("Hora %d:%d:%d\n", horas, minutos, segundos);
       
           segundos++;
           if(segundos==60){
           minutos++;
           segundos=0;
           }
           if(minutos==60){
           horas++;
           minutos=0;
           }
           if(horas==24)
            horas=0;
            
        }
        
        
    
    }
}
