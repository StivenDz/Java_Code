package Programacion_Orientada_A_Objetos.Polimorfismo;

public class VehiculoDeportivo extends Vehiculo {
    private int cilindrada;

    public VehiculoDeportivo(String matricula, String marca, String modelo,int cilindrada) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada(){
        return cilindrada;
    }

    @Override
    public void showData(){
        System.out.printf("\nMatricula: %s\nMarca: %s\nModelo: %s\nCilindraje: %d",matricula,marca,modelo,cilindrada);
    }

    
}
