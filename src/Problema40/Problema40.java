
package Problema40;

/**
 *
 * @author Cris
 */
public class Problema40 {
    /**
     * Programa que crea una tabla de 3 paginas, 4 filas y 5 columnas donde el primer
elemento vale 1, el segundo 2, el tercero 3 y asi sucesivamente, y la imprime
     */
    public static void main(String[] args) {
      new Arrays1().run();   
    }
      public static class Arrays1 implements Runnable {
 
        public static final int PAGINAS = 3;
        public static final int FILAS = 4;
        public static final int COLUMNAS = 5;
 
        private final int[][][] libro = new int[PAGINAS][FILAS][COLUMNAS];
 
        private void llenar() {
            int n = 1;
            for (int pagina = 0; pagina < PAGINAS; pagina++) {
                for (int fila = 0; fila < FILAS; fila++) {
                    for (int columna = 0; columna < COLUMNAS; columna++) {
                        this.libro[pagina][fila][columna] = n++;
                    }
                }
            }
        }
 
        private void imprimir() {
            for (int pagina = 0; pagina < PAGINAS; pagina++) {
                System.out.println("Pagina: " + (pagina + 1));
                for (int fila = 0; fila < FILAS; fila++) {
                    for (int columna = 0; columna < COLUMNAS; columna++) {
                        System.out.printf("%d\t", this.libro[pagina][fila][columna]);
                    }
                    System.out.println();
                }
            }
        }
 
        @Override
        public void run() {
            this.llenar();
            this.imprimir();
        }
    }
 
}
