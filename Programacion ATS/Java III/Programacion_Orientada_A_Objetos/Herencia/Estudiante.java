package Programacion_Orientada_A_Objetos.Herencia;

public class Estudiante extends Persona { // va a heredar todos los atributos y metodos de la clase persona

    private int codigoEstudiante;
    private float notaFinal;

    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante,float notaFinal){
        super(nombre,apellido,edad); // atributos heredados de la super class
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    public void showData(){
        System.out.printf("\nNombre: %s\nAppelido: %s\nEdad: %d\nCodigo Del Estudiante: %d\nNota del Estudiante: %,.2f",nombre,apellido,edad,codigoEstudiante,notaFinal);
        // si los atributos no fueran protected tendrai que utilizar los getters
        // getNombre(),etc, excepto los que son de la propia clase
    }


}
