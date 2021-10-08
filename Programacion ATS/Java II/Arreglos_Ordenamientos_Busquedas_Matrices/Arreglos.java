import java.util.Scanner;
import javax.swing.JOptionPane;

public class Arreglos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //  Arreglos - Arrays - Vectores - Listas

        /* 
        
        En java es una estructura de datos que nos permite almacenar un conjunto de datos de un mismo tipo.
        el tamaño de los arrays se declara en un primer momento y no puede cambiar luego durante la ejecucion
        del programa
        
        Arreglos Unidimensionales:

        es una lista de una sola dimension
        - La sintaxis para declarar e inicializar un array será:

            Tipo_de_variable Nombre_del_array[] = new Tipo_de_variable[dimension];
            ||
            Tipo_de_variable[] Nombre_del_array = new Tipo_de_variable[dimension]; 

            Ejemplos:
                -int[] edad = new int [4];
                ||
                -int edad [] = new int[4];
                
                float[] estatura = new float[5];
                ||
                float estatura [] = new float[5];

                en un arreglo las posiciones siempre empiezan en cero

                int [] numeros = new int [3]; // [3] == Longituid/Capacidad del vector
                                              // por ende tendria 3 posiciones 0-1-2
                                              // En vectores siempre se cuenta desde cero

                                        como agragar un valor manualmente:

                numeros[0] = 5;  // numeros en la posicion/indice 0 va a tener el valor de 5
                numeros[1] = 7;  // numeros en la posicion/indice 1 va a tener el valor de 7
                numeros[2] = 15; // numeros en la posicion/subindice 2 que es su utlima, va a tener el valor de 15

        */

        int numeros[] = new int[3];

        numeros[0] = 7;
        numeros[1] = 10;
        numeros[2] = 13;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        int[] numbers = {5,7,13,17}; // 2 forma, para crear el arreglo lleno
                                     // sin necesidad de añadir valores uno por uno

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


        // --------- Clase 2 --------- //

        //-Llenar un arreglo por consola

        int Nelementos;
        Nelementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la longitud del vector: "));

        char letras[] = new char[Nelementos];

        System.out.print("\nDigite los elementos del arreglo");
        System.out.println();
        for (int i = 0; i < letras.length; i++) {
            System.out.print("Digite la letra N°"+(i+1)+": ");
            letras[i] = input.next().charAt(0);
        }
        System.out.println("\nLos caracteres del arreglo son: \n");

        for (int i = 0; i < letras.length; i++) {
            System.out.println("El caracter N°"+(i+1)+" es: "+letras[i]);
        }

        // --------- Clase 3 --------- //

        //-foreach

        String nombres[] = {"Alejandro","Maria","Luisa","Juan","Stiven","Juliana"};

        for (int i = 0; i < nombres.length; i++) { // length = longitud del arreglo
            System.out.println(nombres[i]);
        }

        for (String nombre : nombres) { // foreach
            System.out.println(nombre);
        }


        input.close();
    }
}
