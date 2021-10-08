package Programacion_Orientada_A_Objetos.Ejercicios_Softwares.Ejercicio_9;

public class Rectangulo extends Poligono {

    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) { // ya sabemos cuantos lados vamos a utilizar, son 2
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double getArea() {

        return lado1 * lado2;
    }

    public double getLado1() {
        return lado1;
    }


    public double getLado2() {
        return lado2;
    }

    @Override
    public String toString() {
        return "\nRectangulo: "+super.toString()+" [lado1=" + lado1 + ", lado2=" + lado2 + "]";
    }

    

    
    
}
