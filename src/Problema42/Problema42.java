 
package Problema42;

import java.util.Random;

/**
 *
 * @author Cris
 */
public class Problema42 {
    /**
     * Programa de una empresa guarda en una tabla de 3x12x4 las ventas realizadas por sus
tres representantes a lo largo de doce meses de sus cuatro productos,
VENTAS[ representante, mes, producto ].
     */
    public static void main(String[] args) {
          new Arrays3().run();
    }
    public static class Arrays3 implements Runnable {
 
        public static final int MAXIMO_VENTAS = 1000;
 
        public static final int REPRESENTANTES = 3;
        public static final int MESES = 12;
        public static final int PRODUCTOS = 4;
 
        private final int[][][] ventas = new int[REPRESENTANTES][MESES][PRODUCTOS];
        private final int[][] total = new int[MESES][PRODUCTOS];
 
        private int random() {
            return new Random().nextInt(MAXIMO_VENTAS);
        }
 
        private void llenar() {
            for (int representante = 0; representante < REPRESENTANTES; representante++) {
                for (int mes = 0; mes < MESES; mes++) {
                    for (int producto = 0; producto < PRODUCTOS; producto++) {
                        this.ventas[representante][mes][producto] = this.random();
                    }
                }
            }
        }
 
        private void generar() {
            for (int producto = 0; producto < PRODUCTOS; producto++) {
                for (int mes = 0; mes < MESES; mes++) {
                    int suma = 0;
                    for (int representante = 0; representante < REPRESENTANTES; representante++) {
                        suma += this.ventas[representante][mes][producto];
                    }
                    this.total[mes][producto] = suma;
                }
            }
        }
 
        private void imprimir() {
            System.out.println("Ventas:");
            for (int representante = 0; representante < REPRESENTANTES; representante++) {
                System.out.println("Representante #" + (representante + 1));
                for (int mes = 0; mes < MESES; mes++) {
                    System.out.println("Mes #" + (mes + 1));
                    for (int producto = 0; producto < PRODUCTOS; producto++) {
                        System.out.printf("Producto #%d: %d\t", producto + 1, this.ventas[representante][mes][producto]);
                    }
                    System.out.println();
                }
            }
            System.out.println("Total:");
            for (int producto = 0; producto < PRODUCTOS; producto++) {
                System.out.println("Producto #" + (producto + 1));
                for (int mes = 0; mes < MESES; mes++) {
                    System.out.printf("Mes #%d: %d\n", mes + 1, this.total[mes][producto]);
                }
            }
        }
 
        @Override
        public void run() {
            this.llenar();
            this.generar();
            this.imprimir();
        }
    }
}
