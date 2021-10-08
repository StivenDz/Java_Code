import java.util.Scanner;

public class Compania_Ventas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float mensual = 1000f,comision = 150f;

        System.out.println("\n+-----Calcularemos el salario mensual de un vendedor-----+\n");
        System.out.print("-Digite el nombre del empleado: ");
        String nombre = input.nextLine();
        System.out.print("-Digite la cantidad de coches que vendio: ");
        int n = input.nextInt();
        System.out.print("\n");

        float costo,porcentaje,total;
        float valor [] = new float[n];

        for (int i = 0; i < n; i++) {
            System.out.print("-Digite el valor del coche #" + (i + 1) +" : " );
            costo = input.nextFloat();
            porcentaje = (costo*5) /100;
            total = comision + porcentaje;
            valor[i] = total;
        }

        float salario = 0;

        for (int i = 0; i < valor.length; i++) {
            salario += valor[i];
        }

        salario += mensual;
        salario = (int)salario;

        if (salario<7000){
            System.out.printf("\nEl salario total a pagar a el empleado %s es de € %,.0f\n---- %s Intenta mejorar tus ventas para obtener un mejor salario ----%n",nombre,salario,nombre);
        }else{
            salario = (float)salario;
            System.out.printf("\nEl salario total a pagar a el empleado %s es de € %,.0f\n---- %s Excelente Trabajo, sigue asi ----%n",nombre,salario,nombre);
        }
            
        

        input.close();
    }
}
