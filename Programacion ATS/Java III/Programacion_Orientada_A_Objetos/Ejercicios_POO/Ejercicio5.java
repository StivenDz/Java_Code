package Programacion_Orientada_A_Objetos.Ejercicios_POO;

public class Ejercicio5 {
    /*
    Diseñar un programa para trabajar con triangulos isóceles. para ello defina los atributos necessarios que se requieres
    proporcoene metodos de consulta, un metodo cons e implemente metodos para calcular el perimetro y el area de un
    triangulo, ademas implementar un metodo que a paratir de un arreglo de triangulos devuelva el area del triangulo 
    de mayor superficie

    isóceles = 2 lados iguales y la base
    perimetro = suma de todos sus lados, en este caso (2 x lado + base)
    */

    private double base;
    private double lado;

    public Ejercicio5(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }

    public double getPerimetro(){
        double perimetro = 2*lado+base;
        return perimetro;
    }

    public double getArea(){
        double area = (base*Math.sqrt((lado*lado)-((base*base)/4))/2);
        return area;
    }
}
