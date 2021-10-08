package Programacion_Orientada_A_Objetos.Ejercicios_POO;

public class Ejercicio4 {
    /*
    Construir un programa para una competencia de atletismo
    el programad ebe gestoinar una serie de atletas caracterizados por:
    su numero de atleta, nombre y tiempo de carrera, al final el programa debe
    mostrar los datos del atleta ganador de la carrera
    */

    private int numero;
    private String nombre;
    private float tiempo;


    public Ejercicio4(int numero, String nombre, float tiempo) {
        this.numero = numero;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public float getTiempo(){
        return tiempo;
    }

    public static int atletaWinner(Ejercicio4 atleta[]){
        float timeLow = atleta[0].getTiempo();
        int indice = 0;

        for (int i = 0; i < atleta.length; i++) {
            if(timeLow > atleta[i].getTiempo()){
                timeLow = atleta[i].getTiempo();
                indice = i;
            }
        }return indice;     
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

}
