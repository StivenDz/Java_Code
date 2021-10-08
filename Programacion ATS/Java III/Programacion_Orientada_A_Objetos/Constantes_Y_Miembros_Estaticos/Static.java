package Programacion_Orientada_A_Objetos.Constantes_Y_Miembros_Estaticos;

public class Static {
    
    private static String frase = "Primera Frase";
    //private  String frase = "Primera Frase";

    public static int sumar(int a, int b){
        int suma = a + b;
        return suma;
    }

    public static void main(String[] args) {
        //Static ob1 = new Static();
       // Static ob2 = new Static();


        //ob2.frase = "Segunda Frase";

        //System.out.println(ob1.frase);// Si no fuera estatico cada objeto hace una copia distina del atributo
        //System.out.println(ob2.frase);// pero como es estatico cada cambio que se le realice va a repercutir en todos los objetos que accedan a este atributo

        // tampco necesitan que instanciemos un objeto

        System.out.println(Static.frase);

        // metodos static

        System.out.println(Static.sumar(15, 14));

    }
}
