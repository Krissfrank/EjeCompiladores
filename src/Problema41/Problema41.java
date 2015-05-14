
package Problema41;

import java.util.Random;

/**
 *
 * @author Cris
 */
public class Problema41 {
    /**
     *  Programa en el que se dispone de una tabla de 5 p ginas, 10 filas y 20 columnas, que se
refieren al centro, al curso y al numero de alumnos de un colegio
respectivamente. Imprime la nota media por curso y la nota media maxima y
su centro de pertenencia.
     */
    public static void main(String[] args) {
         new Arrays2().run();
    }
     public static class Arrays2 implements Runnable {
 
        public static final int CENTROS = 5;
        public static final int CURSOS = 10;
        public static final int ALUMNOS = 20;
 
        private final int[][][] escuela = new int[CENTROS][CURSOS][ALUMNOS];
 
        private int random() {
            return new Random().nextInt(10);
        }
 
        private void llenar() {
            for (int centro = 0; centro < CENTROS; centro++) {
                for (int curso = 0; curso < CURSOS; curso++) {
                    for (int alumno = 0; alumno < ALUMNOS; alumno++) {
                        this.escuela[centro][curso][alumno] = this.random();
                    }
                }
            }
        }
 
        private void imprimir() {
            for (int centro = 0; centro < CENTROS; centro++) {
                System.out.println("Centro #" + (centro + 1));
                for (int curso = 0; curso < CURSOS; curso++) {
                    System.out.println("Curso #" + (curso + 1));
                    for (int alumno = 0; alumno < ALUMNOS; alumno++) {
                        System.out.printf("%d\t", this.escuela[centro][curso][alumno]);
                    }
                    System.out.println();
                }
            }
            int mediaCentro = 0;
            int mediaCurso = 0;
            int mediaMaxima = 0;
            for (int centro = 0; centro < CENTROS; centro++) {
                System.out.println("Centro #" + (centro + 1));
                for (int curso = 0; curso < CURSOS; curso++) {
                    int media = 0;
                    for (int alumno = 0; alumno < ALUMNOS; alumno++) {
                        int calificacion = this.escuela[centro][curso][alumno];
                        media += calificacion;
                    }
                    media /= ALUMNOS;
                    if (mediaMaxima < media) {
                        mediaCentro = centro;
                        mediaCurso = curso;
                        mediaMaxima = media;
                    }
                    System.out.printf("Curso #%d, Nota media: %d\n", curso + 1, media);
                }
            }
            System.out.printf("Nota media maxima: %d en el curso: %d del centro: %d\n", mediaMaxima, mediaCurso, mediaCentro);
        }
 
        @Override
        public void run() {
            this.llenar();
            this.imprimir();
        }
    }
}
