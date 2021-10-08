import java.util.Scanner;

public class Salario_Horas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double horas,diaria,dias, salario;


        System.out.println("\nCalcularemos tu salario semanal en base a tus horas de trabajo");
        System.out.print("\nIngrese su salario por hora: $ ");

        horas = input.nextDouble();

        System.out.print("Ingrese sus horas diarias trabajadas: ");

        diaria = input.nextDouble();

        System.out.print("Ingrese cuantos dias trabaja: ");
        dias = input.nextDouble();

        double semanal = diaria * dias;

        salario = horas * semanal;

        float s = (float)salario;

        System.out.printf("\nSu salario semanal es de $ %,.3f Pesos Colombianos\n", s);
        System.out.println();


        input.close();
    }
}
