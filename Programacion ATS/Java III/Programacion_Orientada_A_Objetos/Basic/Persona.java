//package Programacion_Orientada_A_Objetos;

public class Persona {
    // Atributos

    String nombre;
    int edad;

    // Metodos


    // Metodo constructor
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void showdata(){
        System.out.printf("El nombre es: %s\nLa edad es: %d",nombre,edad);
    }
}
