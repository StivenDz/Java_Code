import java.util.Scanner;

import javax.swing.JOptionPane;

public class Busqueda_Secuencial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int arreglo[] = {1,5,3,4,2};
        int dato;

        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a buscar: "));

        // Busqueda secuencial

        int i = 0;
        boolean flag = false;

        while(i<5 && flag == false){
            if(arreglo[i]==dato){
                flag = true;
            }
            i++;
        }

        if (flag == false){
            JOptionPane.showMessageDialog(null,"El numero no se encuentra en el arreglo");
        }else{JOptionPane.showMessageDialog(null,"El numero ha sido encontrado, Está el la posicion "+(i-1));}

        System.out.print("\nArreglo\n[");
        for (int j = 0; j < arreglo.length; j++) {
            if (j >=0 &&  j< arreglo.length-1){
                System.out.print(arreglo[j]+", ");
            }else{System.out.print(arreglo[j]+" ");}
        }System.out.print("]\n");


        System.out.println();
        input.close();
    }
}
