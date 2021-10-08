//package Programacion_Orientada_A_Objetos;

import java.util.Scanner;

public class Operacion {
    Scanner input = new Scanner(System.in);
    // Atributos
    int numero1,numero2,suma,resta,multiplicacion,division;

    // Metodos
    public void pedirnumeros(){
        System.out.print("Digite el primer numero: ");
        numero1 = input.nextInt();
        System.out.print("Digite el segundo numero: ");
        numero2 = input.nextInt();
    }

    public void sumar(){
        suma = numero1 + numero2;
    }

    public void restar(){
        resta = numero1 - numero2;
    }

    public void multiplicar(){
        multiplicacion = numero1 * numero2;
    }

    public void dividir(){
        division = numero1 / numero2;
    }

    public void showresults(){
        System.out.printf("La suma es: %d%nLa resta es: %d%nLa multiplicacion es igual a: %d%nLa division es igual a: %d%n",suma,resta,multiplicacion,division);
    }

}
