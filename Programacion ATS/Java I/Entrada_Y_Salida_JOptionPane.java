import javax.swing.JOptionPane;

public class Entrada_Y_Salida_JOptionPane {
    public static void main(String[] args) {
        ////// Entradas Con JOptionPane \\\\\\

        String cadena;
        int entero;
        char letra;
        double decimal;

        cadena = JOptionPane.showInputDialog("Digite una cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite una Entero: "));
        letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));

        System.out.println();

        ////// Salidas Con JOptionPane \\\\\\

        JOptionPane.showMessageDialog(null,"El numero entero es: " + entero);
        JOptionPane.showMessageDialog(null,"La cadena es: " + cadena);
        JOptionPane.showMessageDialog(null,"La letra es: " + letra);
        JOptionPane.showMessageDialog(null,"El numero decimal es: " + decimal);
    }


}
