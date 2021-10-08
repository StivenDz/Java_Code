import java.util.Scanner;

public class C_For {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        
        Ciclo for
        

        for (inicialization; condition; aument or decrement){
            Instructions;

        }
        
        */

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.print("Digite la cantidad de terminos: ");
        int contador = input.nextInt();

        for (int i = 0; i < contador; i++) {
            System.out.println(i);
        }
        
        for (int i = 0; i < contador; i+= 2) {
            System.out.println(i);
        }


        input.close();
    }
}
