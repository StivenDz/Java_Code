import java.util.Scanner;

public class Dolares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double Guillermo,Luis,Juan;

        System.out.print("\n¿Cuanto dinero posee Guillermo? : ");
        Guillermo = input.nextDouble();

        Luis = Guillermo / 2;
        Juan = (Guillermo / 2)+(Luis/2);
        double total = Guillermo + Luis + Juan;

        System.out.printf("\n-Guillermo posee $ %,.0f\n-Luis posee $ %,.0f\n-Juan posee $ %,.0f\n",Guillermo,Luis,Juan);
        System.out.print("-------El total es de: $ " +total+ "--------");

        input.close();
    }
}
