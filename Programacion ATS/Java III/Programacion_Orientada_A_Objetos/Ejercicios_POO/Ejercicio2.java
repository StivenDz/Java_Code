package Programacion_Orientada_A_Objetos.Ejercicios_POO;

public class Ejercicio2 {
    /*
    Construir un programa que permita dirigir el movimiento de un objeto
    dentro de un tablero y actualice su posicion
    dentro del mismo.

    los movimientos posibles son up,down,left,right.
    tras cada movimieto el programa mostrara la nueva direccion elegida y las coordenadas
    de situacion del objeto dentro del tablero
    */

    private int ejeX;
    private int ejeY;

    public Ejercicio2(int ejeX, int ejeY){
        this.ejeX = ejeX;
        this.ejeY = ejeY;
    }

    public void moveUp(){
        ejeY ++;
        System.out.printf("Movimiento Realizado hacia Arriba\nLas coordenadas son (%d,%d)\n ",ejeX,ejeY);
    }

    public void moveDown(){
        ejeY --;
        System.out.printf("Movimiento Realizado Hacia Abajo\nLas coordenadas son (%d,%d)\n ",ejeX,ejeY);
    }
    public void moveLeft(){
        ejeX --;
        System.out.printf("Movimiento Realizado Hacia La Izquierda\nLas coordenadas son (%d,%d)\n ",ejeX,ejeY);
    }
    public void moveRight(){
        ejeX ++;
        System.out.printf("Movimiento Realizado Hacia La Derecha\nLas coordenadas son (%d,%d)\n ",ejeX,ejeY);
    }

    public int getEjeX() {
        return ejeX;
    }
    
    public int getEjeY() {
        return ejeY;
    }
    
}
