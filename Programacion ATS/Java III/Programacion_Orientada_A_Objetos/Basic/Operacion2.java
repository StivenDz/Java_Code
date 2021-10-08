//package Programacion_Orientada_A_Objetos;

public class Operacion2 {
    int sumar,resta,dividir,multiplicar;


    public int sumar(int a,int b){ // int a e int b son parametros porque estan en la declaracion de el metodo
        sumar = a + b;
        return sumar;
    }

    public int restar(int a, int b){
        resta = a - b;
        return resta;
    }

    public int multiplicar (int a, int b){
        multiplicar = a * b;
        return multiplicar;
    }
    public int dividir (int a, int b){
        dividir = a / b;
        return dividir;
    }


}
