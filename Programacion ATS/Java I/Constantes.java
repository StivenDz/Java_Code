public class Constantes {
    public static void main(String[] args){

        final int numero = 10; //Constante, es un valor inmutable

        // numero = 15; // Me marca error, porque ese valor no puede cambiar

        int number = 10; /*aqui si se puede porque son variables, no tienen el final*/
        number = 11; // variables
        number = 15; // variables

        System.out.println(numero +" : " + number);

    }
}
