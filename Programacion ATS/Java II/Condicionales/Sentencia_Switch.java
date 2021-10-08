import java.util.Scanner;
import javax.swing.JOptionPane;


public class Sentencia_Switch {
    public static void main(String[] args) {
        /*

        switch (dato) {
            case 1: Instructions1;
                
                break;
            case 2: Instructions2;
                
                break;
            ...    
            case n: InstructionsN;
                
                break;
        
            default: Caso Contrario;
                break;
        }

        */
        Scanner input = new Scanner(System.in);

        int dato;

        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero entre 1-5: "));

        switch (dato) {
            case 1: JOptionPane.showMessageDialog(null,"Es el numero 1");
                
                break;
            case 2: JOptionPane.showMessageDialog(null,"Es el numero 2");
                
                break;    
            case 3: JOptionPane.showMessageDialog(null,"Es el numero 3");
                
                break;
            case 4: JOptionPane.showMessageDialog(null,"Es el numero 4");
                
                break;
            case 5: JOptionPane.showMessageDialog(null,"Es el numero 5");
                
                break;
            default: JOptionPane.showMessageDialog(null,"El numero no está en el rango de 1-5");
                break;

        }
        input.close();
    }
}
