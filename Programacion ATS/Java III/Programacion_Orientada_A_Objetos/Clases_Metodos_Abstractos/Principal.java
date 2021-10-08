package Programacion_Orientada_A_Objetos.Clases_Metodos_Abstractos;

public class Principal {
    public static void main(String[] args) {
        Planta planta1 = new Planta();
        AnimalCarnivoro animalC = new AnimalCarnivoro();

        planta1.alimentarse();
        animalC.alimentarse();
    }
    

}
