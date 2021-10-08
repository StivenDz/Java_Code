import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //// Raiz \\\\

        double raiz = Math.sqrt(9);
        int raiz2 = (int)Math.sqrt(36);
        double suma = raiz + raiz2;

        System.out.printf("%,.0f + %d = %,.0f%n",raiz,raiz2,suma);

        //// Potencia \\\\

        double base = 5, exponente = 2;
        double resultado = Math.pow(base,exponente);

        System.out.printf("%,.0f ^ %,.0f = %,.0f%n",base,exponente,resultado);

        //// Redondear \\\\

        double numero = 4.56;
        long result = Math.round(numero);

        System.out.println(result);

        float number = 3.1416f;
        int x = Math.round(number);

        System.out.println(x);

        //// Numero random \\\\

        double y = Math.random(); //Genera un numero random del 0 al 1 de tipo double

        int s = (int)Math.random()*100; // Genera un numero random del 0 al 100 de tipo entero

        System.out.println("|"+y+ "|--|--|" +s+"|");


        input.close();
    }
}
