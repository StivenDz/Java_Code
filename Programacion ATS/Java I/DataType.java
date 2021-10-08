public class DataType {
    public static void main(String[] args){

        ///////////// Tipos de datos Enteros  /////////////
        byte entero = 12; /* Ocupa 8 de espcaio y puede almacenar valores
        entre (-128) a (127)
        */

        System.out.println("Numero entero: " +entero);

        short entero2 = 12456; /* Ocupa 16 de espcaio y puede almacenar valores
        entre (-32,768) a (32,767)
        */

        System.out.println("Numero entero: " +entero2);

        int entero3 = 1245656; /* Ocupa 32 de espcaio y puede almacenar valores
        entre (-2,147,473,648) a (2,147,486,647)
        */
       
        System.out.println("Numero entero: " +entero3);

        long entero4 = 12456789; /* Ocupa 8 de espcaio y puede almacenar valores
        entre (-9,223,372,036,854,775,808) a (9,223,372,036,854,775,807)
        */

        System.out.println("Numero entero: " +entero4);

        ///////////// Tipos de dato Punto decimal  /////////////

        float decimal = 3.1416f;
        float dec = (float) 3.1416;

        /* Ocupa 32 de espcaio y puede almacenar valores
        entre 1.9e-045 a 3.4e+038     */

        System.out.println("Numero decimal: " +decimal + " y " + dec);

        double decimal2= 3.4161817715 ;
        /* Ocupa 64 de espcaio y puede almacenar valores
        entre 4.9e-324 a 1.8e+308     */

        System.out.println("Numero decimal: " +decimal2);


        /////////////  Caractéres " "  /////////////

        char caracter = 'a' ;

        System.out.println("Caractér: " +caracter);

        /////////////  Booleano (true or false) en minusculas  /////////////

        boolean sw = true;

        System.out.println("La decision es: " +sw);

    }
}
