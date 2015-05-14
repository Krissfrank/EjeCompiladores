
package Problema26;

/**
 *
 * @author Cris
 */
public class Problema26 {
    /**
     * Programa que imprime una frase en el centro de la pantalla
     */
    public static void main(String[] args) {
      
      int size = 10;
int left = size/2;
int right = size - left;
String format = "%" + left + "c%-" + right + "c";
// would produce: "%5c%-5c"
System.out.printf(format,' ', '#');
// output: "     #    " (without the quotes)
       
    }
    
}
