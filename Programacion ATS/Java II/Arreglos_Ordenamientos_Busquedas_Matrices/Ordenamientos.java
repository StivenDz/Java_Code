import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ordenamientos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ordenamientos
        // First Class

            // Metodo Burbuja

        // if (numeroActual > numeroSiguiente) Cambio

        int arreglo[],nElementos,aux;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la longitud del arreglo: "));

        arreglo = new int [nElementos];
        for (int i = 0; i < arreglo.length; i++) {
            if (i == 0){
                System.out.print((i+1)+"-Digite un numero: ");
            }else{System.out.print((i+1)+"-Digite otro numero: ");}
            arreglo[i]=input.nextInt();
        }

        // Metodo Burbuja

        for (int i = 0; i < arreglo.length-1; i++) { // -1 para que no trabaje demasiado el programa, no se demore dando vueltas
            for (int j = 0; j < arreglo.length-1; j++) { // sirve para ir ordenando
                if (arreglo[j]>arreglo[j+1]){
                    aux =arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                }
            }
        }

        System.out.print("\nArreglo Ordenado de forma creciente\n[");
        for (int i = 0; i < arreglo.length; i++) {
            if (i >=0 &&  i< arreglo.length-1){
                System.out.print(arreglo[i]+", ");
            }else{System.out.print(arreglo[i]+" ");}
        }System.out.print("]\n");

        System.out.print("\nArreglo Ordenado de forma decreciente\n[");
        for (int i = arreglo.length-1; i >= arreglo.length-arreglo.length; i--) {
            if (i <=arreglo.length-1 &&  i>= (arreglo.length)-(arreglo.length)+1){
                System.out.print(arreglo[i]+", ");
            }else{System.out.print(arreglo[i]+" ");}
        }System.out.print("]\n");




        // Ordenamiento por inserción

        int longitud,Arreglo[],pos,Aux;

        longitud = Integer.parseInt(JOptionPane.showInputDialog("Digite la longitud del arreglo: "));

        Arreglo = new int [longitud];
        for (int i = 0; i < Arreglo.length; i++) {
            if (i == 0){
                System.out.print((i+1)+".Digite un numero: ");
            }else{System.out.print((i+1)+".Digite otro numero: ");}
            Arreglo[i]=input.nextInt();
        }

        // Aplicacion del metodo inserción

        for (int i = 0; i < Arreglo.length; i++) {
            pos = i;
            Aux = Arreglo[i];

            while( pos>0 && Arreglo[pos-1] > Aux){
                Arreglo[pos] = Arreglo[pos-1];
                pos--;
            }
            Arreglo[pos] = Aux;
        }

        System.out.print("\nArreglo ordenado de forma creciente\n[");
        for (int i = 0; i < Arreglo.length; i++) {
            if (i>=0 && i<Arreglo.length-1){
                System.out.print(Arreglo[i]+", ");
            }else{System.out.print(Arreglo[i]+" ");}
        }System.out.print("]\n");

        System.out.print("\nArreglo ordenado de forma decreciente\n[");
        for (int i =  Arreglo.length-1; i >= Arreglo.length-Arreglo.length; i--) {
            if (i<=Arreglo.length-1 && i>=(Arreglo.length)-(Arreglo.length)+1){
                System.out.print(Arreglo[i]+", ");
            }else{System.out.print(Arreglo[i]+" ");}
        }System.out.print("]\n");



        System.out.println("\n");
        input.close();    
    }
}
