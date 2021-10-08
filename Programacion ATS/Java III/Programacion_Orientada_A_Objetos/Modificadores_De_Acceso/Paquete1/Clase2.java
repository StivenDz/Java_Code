package Programacion_Orientada_A_Objetos.Modificadores_De_Acceso.Paquete1;

public class Clase2 {
    public static void main(String[] args) {
        Clase1 objeto1 = new Clase1();

        objeto1.atributo1 = 15;
        //objeto1.atributo2 = 10; No me deja acceder a ese atributo porque es private
    }
}
