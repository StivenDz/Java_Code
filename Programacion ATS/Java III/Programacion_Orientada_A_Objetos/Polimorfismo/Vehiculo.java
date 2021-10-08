package Programacion_Orientada_A_Objetos.Polimorfismo;

public class Vehiculo {
    protected String matricula;
    protected String marca;
    protected String modelo;


    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void showData(){
        System.out.printf("\nMatricula: %s\nMarca: %s\nModelo: %s",matricula,marca,modelo);
    }

}
