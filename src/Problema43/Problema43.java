
package Problema43;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Cris
 */
public class Problema43 {
    /**
     * Programa que nos permita dar altas en el fichero secuencial
DATOS.DAT, cuyos campos son: DNI, NOMBRE, APELLIDOS, DIRECCION y
PROVINCIA.
     */
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        String dni;
        String nombre;
        String apellidos;
        String direccion;
        String provincia;
       
        File file = new File("Datos.dat");
        if(!file.exists()){
            try{
            file.createNewFile();
                System.out.println(file.getName()+" Ha sido creado");
            }catch(IOException ex){ex.printStackTrace();}
            
            
        } else{
            try{
            FileWriter fw= new FileWriter(file,true);
             System.out.println("Ingrese su dni");
        dni = entrada.nextLine();
        
        System.out.println("Ingrese su nombre");
        nombre=entrada.nextLine();
        
        System.out.println("Ingrese sus apellidos");
        apellidos=entrada.nextLine();
        
        System.out.println("Ingrese su direccion");
        direccion=entrada.nextLine();
        
        System.out.println("Ingrese su provincia");
        provincia=entrada.nextLine();
            fw.append("DNI:" +dni+"\n");
            fw.append("Nombre:" +nombre+"\n");
            fw.append("Apellidos:" +apellidos+"\n");
            fw.append("Direccion:" +direccion+"\n");
            fw.append("Provincia:" +provincia+"\n");
            fw.close();
            }catch(IOException ex){ex.printStackTrace(); }
     
            
            
}
    }
}
