package Programacion_Orientada_A_Objetos.Ejercicios_Softwares.Ejercicio_9;

public abstract class Poligono {
    protected int lados;

    

    // Super clase
    /*
    Hacer un programa para calcular el area de Poligonos
    (Triangulos y Rectangulos) el Programa debe ser capaz de almacenar en un arreglo de N triangulos y rectangulos
    y al final mostrar el area y los datos de cada uno. para ello se tendra lo siguiente

    - una super clase llamada Poligono
    - una sub clase llamada rectangulo
    - una sub clase llamada triangulo
    */

    public Poligono(int lados) {
        this.lados = lados;
    }

    public int getLados(){
        return lados;
    }

    // declaramos el metodo area como abstracto
    public abstract double getArea();

    @Override
    public String toString() {
        return "Numero de lados= [" + lados + "]";
    }

    

}
