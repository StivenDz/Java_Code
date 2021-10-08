package Programacion_Orientada_A_Objetos.Ejercicios_Softwares.Ejercicio_9;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();  // Arreglo de tipo Dinamico
    static Scanner input = new Scanner (System.in);

    public static void main(String[] args) {
        // Llenar un poligono
        LlenaPoligono();

        // mostrar los datos y el area de cada poligono
        showResults();

    }

    public static void LlenaPoligono(){
        char answer;
        int opcion;
        do{
            do{
                System.out.print("\nDigite Que Poligono Desea\n1. Triangulo\n2. Rectangulo\nOpcion:  ");
                opcion = input.nextInt();
            }while(opcion <1 || opcion >2);
            
            switch (opcion) {
                case 1: // Llenar un triangulo
                        llenarTriangulo();
                        break;
            
                case 2: // Llenar un Rectangulo
                        llenarRectangulo();
                        break;
            }

            System.out.print("\nDesea introducir otro Poligono (S/N): ");
            answer = input.next().charAt(0);
        }while(answer == 's' || answer == 'S');
    }

    public static void llenarTriangulo(){
        double lado1,lado2,lado3;

        System.out.print("\nDigite el lado 1 del Triangulo: ");
        lado1 = input.nextDouble();
        System.out.print("Digite el lado 2 del Triangulo: ");
        lado2 = input.nextDouble();
        System.out.print("Digite el lado 3 del Triangulo: ");
        lado3 = input.nextDouble();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        // Guardamos un triangulo dentro de nuestro arreglo de poligonos
        poligono.add(triangulo);
    }

    public static void llenarRectangulo(){
        double lado1,lado2;

        System.out.print("\nDigite el lado 1 del Rectangulo: ");
        lado1 = input.nextDouble();
        System.out.print("Digite el lado 2 del Rectangulo: ");
        lado2 = input.nextDouble();

        Rectangulo rectangulo = new Rectangulo(lado1,lado2);

        poligono.add(rectangulo);
    }

    public static void showResults(){
        for (Poligono p : poligono) {
            System.out.println(p.toString());
            System.out.println("Area = "+p.getArea());
            System.out.println("");
        }
    }
}
