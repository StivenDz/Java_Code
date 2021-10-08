package Programacion_Orientada_A_Objetos.Polimorfismo;

public class VehiculoTurismo extends Vehiculo {

    private int numeroPuertas;

    public VehiculoTurismo(String matricula, String marca, String modelo,int numeroPuertas) {
        super(matricula, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeropuertas(){
        return numeroPuertas;
    }

    @Override
    public void showData(){
        System.out.printf("\nMatricula: %s\nMarca: %s\nModelo: %s\nNumero de Puertas: %d",matricula,marca,modelo,numeroPuertas);
    }
    
}
