import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Matrices
            // Llenado de forma manual

        int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i < 3; i++) { // Numero de filas
            for (int j = 0; j < matriz.length; j++) { // Numero de columnas
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }

            // Llenado de forma consolica

        int Matriz[][],filas,columnas;

        System.out.print("Digite el numero de filas: ");
        filas = input.nextInt();
        System.out.print("Digite el numero de columnas: ");
        columnas = input.nextInt();

        Matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Digite el un valor para la posicion ["+i+"]"+"["+j+"]: ");
                Matriz[i][j] = input.nextInt();
            }
        }

        System.out.print("\n[");
        for (int i = 0; i < filas; i++) {
            System.out.print("[");
            for (int j = 0; j < columnas; j++) {
                if (j+1 != columnas){
                    System.out.print(Matriz[i][j]+", ");
                }
                if (j+1 == columnas){
                    System.out.print(Matriz[i][j]+" ");
                }
            }
            System.out.print("]");
            if (i+1 != filas){System.out.println();}
        }System.out.print("]\n");

        System.out.println("\nForma de impresion #2");
        System.out.println("");
        for (int i = 0; i < filas; i++) {
            System.out.print("| ");
            for (int j = 0; j < columnas; j++) {
                if (Matriz[i][j]<10){
                    System.out.print(Matriz[i][j]+" | ");
                }else{System.out.print(Matriz[i][j]+"| ");}
            }
            if (i+1 != filas){System.out.println();}
        }


        System.out.println("\n");
        input.close();
    }
}
