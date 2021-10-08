package Programacion_Orientada_A_Objetos.Constantes_Y_Miembros_Estaticos;

public class main1 {
    public static void main(String[] args) {
        Final f = new Final("Stiven",18);

        // cumplí 19
        f.setEdad(19); // la edad como no es final/constante se puede cambiar, es con un setter porque es private
        f.showdata();

        


    }
}
