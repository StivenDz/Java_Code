import java.util.Scanner;

public class Productos_Notables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float x;
        String valores [] = {"a","b"};

        System.out.println("\n+----- Calcularemos el producto notable -----+\n          (a+b)^2 = a^2 + b^2 + 2ab ");
        System.out.println("Para eso necesitaremos el valor para (a) y (b)");
        System.out.println();

        float v [] = new float[2];

        for (int i = 0; i < 2; i++) {
            System.out.print("Digite el valor "+valores[i]+" : ");
            x = input.nextFloat();

            v [i] = x;
        }

        float producto = (((float)Math.pow(v[0], 2)) + ((float)Math.pow(v[1], 2))+ (2*v[0]*v[1]));

        System.out.printf("\nEl producto notable de (%,.0f + %,.0f)^2 = %,.2f ",v[0], v[1],producto);
        System.out.println();

        

        input.close();
    }
}
