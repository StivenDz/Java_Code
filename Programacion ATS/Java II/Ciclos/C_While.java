import java.util.Scanner;

public class C_While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*

        Ciclo while
        
        while(condition){
            Instructions;
        }

        */

        int i = 1;

        while(i<=10){
            System.out.println(i);      // Ascendente
            i++;
        }
        
        int j = 10;

        while(j>=1){
            System.out.println(i);      // Descendente
            j--;
        }

        //<------------------------------------------------------------------------------------->//

        int x = 1, contador ;
        System.out.println("Digite cuantos numeros quere en pantalla: "); 

        contador = input.nextInt();

        while(x<=contador){
            System.out.println(x); 
            x++;
        }


        input.close();
    }
}
