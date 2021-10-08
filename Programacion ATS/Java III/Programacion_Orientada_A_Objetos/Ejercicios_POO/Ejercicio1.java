package Programacion_Orientada_A_Objetos.Ejercicios_POO;

public class Ejercicio1 {
    
    // Obtener el perimetro y el area de un cuadrilatero o cuadrado
    // si es cuadrado, pororcionar un solo lado en el parametro del metodo constructor
    // sino, pues los dos lados

    private float lado1;
    private float lado2;

    // methods
    // metodo constructor 1 (cuadrilatero)
    public Ejercicio1(float lado1, float lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // si es un cuadrado ya que todos sus lados son iguales, necesita solo un lado
    public Ejercicio1(float lado1){
        this.lado1 = this.lado2 = lado1;
    }
    // el perimetro es igual a la suma de todos los lados
    public float getPerimetro(){
        float perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }

    public float getArea(){
        float area = (lado1 * lado2);
        return area;
    }



}
