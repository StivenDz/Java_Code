package Programacion_Orientada_A_Objetos.Sobre_Escritura_De_Miembros;

public class Persona extends Animal {
    
    @Override
    public void comer(){
        System.out.println("Estoy comiendo sentado y con cubiertos");
    }
}
