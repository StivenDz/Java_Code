import java.util.Scanner;

public class Operadores_Aritmeticos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float numero ,numero2,suma,resta,multiplicacion,division,residuo;
         

        System.out.print("Digite 2 numeros: ");

        numero  = Float.parseFloat(input.nextLine());  //input.nextFloat();
        System.out.print("Digite el otro numero: ");
        numero2 = Float.parseFloat(input.nextLine()); //input.nextFloat();

        suma = numero + numero2;
        resta = numero - numero2;
        multiplicacion = numero * numero2;
        division = numero / numero2;
        residuo = numero % numero2;
        String p = "=";
        String m = "%";

        System.out.printf("%,.0f + %,.0f %s %,.0f%n",numero,numero2,p,suma);
        System.out.printf("%,.0f - %,.0f %s %,.0f%n",numero,numero2,p,resta);
        System.out.printf("%,.0f * %,.0f %s %,.0f%n",numero,numero2,p,multiplicacion);
        System.out.printf("%,.0f / %,.0f %s %,.0f%n",numero,numero2,p,division);
        System.out.printf("%,.0f %s %,.0f %s %,.0f  %s == Residuo de la division%n",numero,m,numero2,p,residuo,m);


        //////  Operadores Simplificados ///////

        suma += 5;                    // suma = suma + 5; \\                  
        resta -= 5;                  // resta = resta - 5; \\
        multiplicacion *= numero;   // multiplicacion = multiplicacion * numero;
        division /= 2;             // division = division / 2;\\
        residuo %= multiplicacion;// residuo = residuo % multiplicacion;
                                 //                             \\

        
        //////  Operadores De Incremento Y Decremento ///////

        int x = 5;

        x++;    //Incremento  x = x + 1, Le Aumenta un valor, le suma 1
        x--;    //Decremento  x = x - 1, Le Disminuye un valor, le resta 1

        int i = 5 ,j;

        j = i++; //(primero hace la asignacion y despues el aumento)-j vale 5 e i valdría 6, le asignamos a j x y despues le aumentamos el valor a x
        j = ++i; //(primero hace el aumento y despues la asignacion)-j vale 7 e i valdría 7, a j le añadimos el aumento de x
        // Igual con el Decremento --;

        x = --j; // = x = 6 & j = 6
        x = j--;//  = x = 6 & j = 5

        j = ++x; // j = 7 & x = 7
        
        input.close();

    }
}
