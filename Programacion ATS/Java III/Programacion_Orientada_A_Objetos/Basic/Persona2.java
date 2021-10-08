//package Programacion_Orientada_A_Objetos;

public class Persona2 {
    int age;
    String name;
    String dni;

    public Persona2(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Persona2(String dni) {
        this.dni = dni;
    }
    public void correr(){
        System.out.printf("Soy %s, tengo %d años y estoy corriendo una maratón",name,age);
    }

    public void correr(int km){
        System.out.printf("\nHe corrido %d Km",km);
    }
    
}
