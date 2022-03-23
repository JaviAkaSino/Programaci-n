package pokino.javierparodipinero;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Utilidades {

    public static int escanearInt() {

        int numero = 0;

        Scanner sc = new Scanner(System.in);
        boolean solicitarDatos = true;

        do {

            try {

                numero = sc.nextInt();
                solicitarDatos = false;

            } catch (InputMismatchException ime) {

                System.out.println("Introduce un dato numérico");
                sc.nextLine();
            }

        } while (solicitarDatos);

        return numero;

    }

    public static int numeroAleatorioEntre(int valorMin, int valorMax) {

        Random numeroAleatorio = new Random();
        int aleatorio;

        try {

            aleatorio = numeroAleatorio.nextInt(valorMax - valorMin + 1) + valorMin;

        } catch (IllegalArgumentException iae) {

            aleatorio = numeroAleatorio.nextInt(valorMin - valorMax + 1) + valorMax;

        }

        return aleatorio;

    }

    public static void guardarDatosArray(int array[]) {

        for (int i = 0; i < array.length; i++) {

            System.out.println("Introduce el valor número " + (i + 1));

            array[i] = Utilidades.escanearInt();

        }

    }

    public static void mostrarArray(int array[]) {

        for (int i = 0; i < array.length; i++) {

            System.out.println("Número " + (i + 1) + ": " + array[i]);
        }

    }

    public static void mostrarArrayLineal(int array[]) {

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");

            System.out.println("");
        }

    }

    public static void mostrarArrayLinealDouble(double array[]) {

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");

            System.out.println("");
        }

    }

    public static void mostrarArrayLinealChar(char array[]) {

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");

            System.out.println("");
        }

    }

    public static void guardarDatosArrayRandom(int array[], int min, int max) {

        for (int i = 0; i < array.length; i++) {

            array[i] = Utilidades.numeroAleatorioEntre(min, max);

        }

    }

    public static void mostrarArrayString(String array[]) {

        for (int i = 0; i < array.length; i++) {

            System.out.println("Número " + (i + 1) + ": " + array[i]);
        }

    }

    public static void guardarDatosArrayString(String array[]) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            System.out.println("Introduce el valor número " + (i + 1));

            array[i] = sc.nextLine();

        }

    }

    public static void imprimirMatrizInt(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + "\t");
            }

            System.out.println("");
        }
        System.out.println("");
    }

    public static void recorrerFila(int fila, int[][] matriz) {

        System.out.println("Fila " + fila + ": ");

        for (int j = 0; j < matriz[fila].length; j++) {

            System.out.print(matriz[fila][j] + "\t");

        }

        System.out.println("\n");
    }

    public static void recorrerColumna(int columna, int[][] matriz) {

        System.out.println("Columna " + columna + ": ");

        for (int i = 0; i < matriz.length; i++) {

            System.out.print(matriz[i][columna] + "\n");

        }
        System.out.println("");
    }

    public static void recorrerVecinas(int i, int j, int[][] matriz) {
        //Va de una posición antes a una después en la fila y en la columna
        for (int k = (i - 1); k <= (i + 1); k++) {
            for (int l = (j - 1); l <= (j + 1); l++) {

                if (!(k == i && l == j)) { //Descarta el valor de la posición en sí

                    //Sólo cuenta los valores que están dentro de la matriz
                    if (0 <= k && k < matriz.length && 0 <= l && l < matriz[0].length) {

                        System.out.print(matriz[k][l] + "\t");

                    } else {

                        System.out.print("\t"); //Si está fuera, deja un espacio
                    }

                } else {

                    System.out.print("X\t"); //Señaliza cuál era el valor
                }
            }

            System.out.println(""); //Salto de línea
        }

        System.out.println(""); //Salto de línea
    }

    public static void rellenarMatrizIntRandomEntre(int[][] matriz, int min, int max) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = Utilidades.numeroAleatorioEntre(min, max);
            }
        }
    }

    public static double mediaIntMatriz(int[][] matriz) {

        int total = matriz.length * matriz[0].length; //El total de números será FILAS*COLUMNAS        
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                suma += matriz[i][j];
            }
        }

        return (double) (suma / total);
    }

    public static int valorMinimoMatriz(int[][] matriz) {

        int minimo = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (minimo > matriz[i][j]) {

                    minimo = matriz[i][j];
                }
            }
        }
        return minimo;
    }

    public static int valorMaximoMatriz(int[][] matriz) {

        int maximo = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (maximo < matriz[i][j]) {

                    maximo = matriz[i][j];
                }
            }
        }
        return maximo;
    }

    public static int numeroAleatorioEntreExcepto(int min, int max, int excepcion) {

        int numero = numeroAleatorioEntre(min, max);

        if (numero == excepcion) {

            return numeroAleatorioEntreExcepto(min, max, excepcion);
        } else {

            return numero;
        }

    }
    
    public static int numeroAleatorioEntreExcepto2(int min, int max, int excepcion1, int excepcion2) {

        int numero = numeroAleatorioEntre(min, max);

        if (numero == excepcion1 || numero == excepcion2) {

            return numeroAleatorioEntreExcepto2(min, max, excepcion1, excepcion2);
        } else {

            return numero;
        }

    }

    public static void llenarArrayPosicionAleatoria(Object[] array) {

        int longitud = array.length;

        Object[] aux = array;
        
        
        
//        int pareja = Utilidades.numeroAleatorioEntre(contador + 1, 12); //Establece el valor de la pareja
//
//        int trio = Utilidades.numeroAleatorioEntreExcepto(contador + 1, 12, pareja); //Establece el valor del trío
//
//        for (int i = 0; i < 2; i++) { //Rellenam la fila con la pareja
//
//            this.carton[1][i] = b.cartaPorNumero(pareja);
//        }
//
//        for (int i = 2; i < 5; i++) { //Y con el trío
//
//            this.carton[1][i] = b.cartaPorNumero(trio);
//        }

    }

}
