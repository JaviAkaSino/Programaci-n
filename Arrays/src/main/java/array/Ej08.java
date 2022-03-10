package array;

import java.util.Arrays;

/**
 *
 * @author javiakasino
 */
public class Ej08 {

    public static void main(String[] args) {

        /*Realizar un programa que lea de la entrada un número y utilice ese 
        número para crear un array de enteros de ese tamaño. A continuación, el 
        programa inicializa el array con los valores que el usuario introduzca 
        por teclado. Finalmente, se deberá recorrer el array e imprimir tantos 
        caracteres ‘*’ como indique el valor de cada elemento del array. 
        Ejemplo: los valores 5,4,3,2 producirán la siguiente salida:

        *****
        ****
        ***
        **
 */
        System.out.println("Introduce un entero");

        int tamanio = Utilidades.escanearInt();

        int[] array = new int[tamanio];

        Utilidades.guardarDatosArray(array);

        for (int i = 0; i < tamanio; i++) {
            
            String tmp = "";
            
            for (int j = 0; j < array[i]; j++) {

                tmp += "*";

            }

            System.out.println(tmp);

        }

    }

}
