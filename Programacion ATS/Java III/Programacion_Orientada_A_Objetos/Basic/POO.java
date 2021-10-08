
public class POO {
    public static void main(String[] args) {
        //Crear objeto de tipo Coche

        Coche coche1 = new Coche();

        coche1.color = "Blanco";
        coche1.marca = "Audi";
        coche1.km = 0;

        System.out.printf("%n El coche1 es de color %s, es marca %s, y tiene %d Km recorridos",coche1.color,coche1.marca,coche1.km);

        Coche coche2 = new Coche();

        coche2.color = "Azul";
        coche2.marca = " Ferrari";
        coche2.km = 100;

        System.out.printf("%n El coche2 es de color %s, es marca %s, y tiene %d Km recorridos",coche2.color,coche2.marca,coche2.km);
    }
}
