package Programacion_Orientada_A_Objetos.Polimorfismo;

public class VehiculoFurgoneta extends Vehiculo {
    private int carga;
    
    public VehiculoFurgoneta(String matricula, String marca, String modelo,int carga) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga(){
        return carga;
    }

    @Override
    public void showData(){
        System.out.printf("\nMatricula: %s\nMarca: %s\nModelo: %s\nCarga: %d",matricula,marca,modelo,carga);
    }
    
}
