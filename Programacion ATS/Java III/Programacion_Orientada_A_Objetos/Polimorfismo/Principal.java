package Programacion_Orientada_A_Objetos.Polimorfismo;

public class Principal {
    public static void main(String[] args) {
        Vehiculo misVehiculos[] = new Vehiculo[4];

        misVehiculos[0] = new Vehiculo("GH67","Ferrari","A89");
        misVehiculos[1] = new VehiculoTurismo("78HJ", "Audi", "B14", 4);
        misVehiculos[2] = new VehiculoDeportivo("QRJ58", "BMW", "5X", 500);
        misVehiculos[3] = new VehiculoFurgoneta("HFJ11", "Toyota", "J9", 2000);

        for (Vehiculo vehiculos : misVehiculos) {
            vehiculos.showData();
            System.out.println("");
        }
    }
}
