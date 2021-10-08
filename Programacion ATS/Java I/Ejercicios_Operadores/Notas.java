import java.util.Scanner;

public class Notas{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float nota1,nota2,nota3;

        System.out.print("\nDigite 3 Calificaiones: ");

        nota1 = input.nextFloat();
        nota2 = input.nextFloat();
        nota3 = input.nextFloat();

        float suma = nota1 + nota2 + nota3;

        System.out.printf("\nLa suma de sus 3 calicifaciones %,.1f + %,.1f + %,.1f = %,.2f%n",nota1,nota2,nota3,suma);
        System.out.println();
        
        input.close();
    }
}