package Programacion_Orientada_A_Objetos.Constantes_Y_Miembros_Estaticos;

public class Final{
    private final String nombre;
    private int edad;
    
    public Final(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void showdata(){
        System.out.printf("\nEl nombre es %s y la edad %d",nombre,edad);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}