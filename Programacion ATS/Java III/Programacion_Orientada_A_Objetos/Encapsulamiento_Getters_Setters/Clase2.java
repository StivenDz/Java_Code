package Programacion_Orientada_A_Objetos.Encapsulamiento_Getters_Setters;

public class Clase2 {
    public static void main(String[] args) {
        Clase1 ob = new Clase1();

        ob.setEdad(10);
        System.out.println("La edad es: "+ob.getEdad());
        ob.setNombre("Stiven Diaz");
        System.out.println("El Nombre es: "+ob.getNombre());
    }
}
