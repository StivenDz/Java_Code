package Programacion_Orientada_A_Objetos.Ejercicios_POO;

public class Ejercicio3 {
    /*
    Construir un programa que dada una serie de vehiculos caracterizados
    por su marca, modelo y precio, imprima las propiedades del vehiculo mas barato
    para ello, se deberán leer por teclado las caracteristicas de cada vehiculo
    y crear una clase que represente a cada uno de ellos.    
    */

    // caracteristicas/Atrubitos

    private String marca;
    private String modelo;
    private float precio;


    public Ejercicio3(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio(){
        return precio;
    }

    public void showData(){
        System.out.printf("Marca: %s\nModelo: %s\nPrecio: $ %,.0f",marca,modelo,precio);
    }

    
}
