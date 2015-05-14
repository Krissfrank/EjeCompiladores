
package Problema40;

/**
 *
 * @author Cris
 */
public class Problema40 {
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
