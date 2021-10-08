package Programacion_Orientada_A_Objetos.Modificadores_De_Acceso.Paquete2;

import Programacion_Orientada_A_Objetos.Modificadores_De_Acceso.Paquete1.Clase1;

public class Clase3 {
    public static void main(String[] args) {
        Clase1 objeto1 = new Clase1();

        objeto1.atributo1 = 10;
        //objeto1.atributo2 = 13; No me deja acceder a ese atributo porque es privado
    }
}
