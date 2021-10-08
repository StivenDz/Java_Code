import java.util.Scanner;

public class Horas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int horas , semanas , dias , horas_totales;

        System.out.print("Digite el numero de horas: ");
        horas_totales = input.nextInt();

        semanas = horas_totales /168 ;
        dias = horas_totales % 168 /24;
        horas = horas_totales%24;

        System.out.println("\nEl equivalente es: ");
        System.out.println("-Semanas: "+semanas);
        System.out.println("-Dias: "+dias);
        System.out.println("-Horas: "+horas);

        input.close();
    }
}
