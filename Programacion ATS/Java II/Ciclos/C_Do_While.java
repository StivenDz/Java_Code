import java.util.Scanner;

public class C_Do_While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*

        Ciclo do-while

        do{

            Instructions;

        }while(condition);

        */

        int i = 1;

        do{
            System.out.println(i);
            i++;

        }while(i<=10);

        int j = 10 ;

        do{
            System.out.println(j);
            j--;

        }while(i>=1);

        //<---------------------------------------------------------------------------------------------->//

        int x = 1, contador;
        contador = input.nextInt();

        do{
            System.out.println(x);
            x++;

        }while(x<=contador);


        input.close();
    }
}
