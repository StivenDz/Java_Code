import java.util.Scanner;

public class Input_And_Output {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        //////// Como guardar numeros ///////
        int numero;
        float number;
        double num;

        System.out.print("Digite un numero: ");
        numero = input.nextInt();

        System.out.println("El numero es: " +numero);

        System.out.print("Digite un numero con decimales: ");
        number = input.nextFloat(); //Los datos de tipo float se escriben 3,1416 con coma

        System.out.println("El numero es: " +number);

        System.out.print("Digite otro numero con decimales: ");
        num = input.nextDouble(); //Los datos de tipo double se escriben 3,1416 con coma

        System.out.println("El numero es: " +num);

        //////// Como Guardar Cadenas Y caracter ///////

        String cadena;
        String cadenaC;

        System.out.print("Digite una Cadena: ");
        cadena = input.next(); //// Solo con el next guarda la cadena hasta que encuentre un espacio

        System.out.println("La cadena es: " + cadena);

        System.out.print("Digite una Cadena: ");
        cadenaC = input.nextLine(); ////  con el nextLine guarda la cadena Completa, con espacios y signos, todo lo que este a su paso

        System.out.println("La cadena es: " + cadenaC);


        /////Caracter////////

        char letra;

        System.out.print("Digite una letra: ");
        letra = input.next().charAt(0); 
        /*
        -el charAt me guarda el primer caracter que encuentre
        -si es hola, guarda la h
        -recuerda que el next guarda lo que encuentre hasta que halle un espacio
        */
        System.out.println("La letra es: " + letra);


        input.close();
    }
}
