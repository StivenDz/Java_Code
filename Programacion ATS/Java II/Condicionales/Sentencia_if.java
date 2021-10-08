import java.util.Scanner;
import javax.swing.JOptionPane;

public class Sentencia_if {
    public static void main(String[] args) {
        /*
        
        if(condition){
            Instruction1;
        }else{
            Instruction2;
        }
        
        */
        Scanner input = new Scanner(System.in);
        int numero,dato = 5;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        if(numero == dato){ // == igualdad , != diferente/distinto, > mayor, >= mayor o igual, < menor, <= menor o igual
            JOptionPane.showMessageDialog(null,"El numero es 5");
        }else{
            JOptionPane.showMessageDialog(null,"El numero es diferente de 5");
        }

        


        input.close();
    }
}
