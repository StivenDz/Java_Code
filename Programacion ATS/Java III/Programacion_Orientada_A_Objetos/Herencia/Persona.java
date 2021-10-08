package Programacion_Orientada_A_Objetos.Herencia;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;

    public Persona(String nombre,String apellido,int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }
    
}
