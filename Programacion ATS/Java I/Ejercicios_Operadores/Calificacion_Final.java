import java.util.Scanner;

public class Calificacion_Final {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float nota;

        System.out.println("\n+----- Calcularemos su nota final -----+\n");

        String examenes[] = {" Participacion","l primer examen parcial","l segundo examen parcial","l examen final"};
        float notas[] = new float[4];
        float porcentajes[] = {0.10f,0.25f,0.25f,0.40f};

        System.out.print("-Digite su nombre y apellido: ");
        String nombre = input.nextLine();
        System.out.println();
        
        for (int i = 0; i < examenes.length; i++) {
            System.out.print("-Digite la nota de" + examenes[i] + ": ");
            nota = input.nextFloat();
            notas[i]= nota;
        }
        float Calificacion_Final = 0;

        for (int i = 0; i < examenes.length; i++) {
            Calificacion_Final += notas[i]*porcentajes[i];
            
        }
        if (Calificacion_Final>6.5){
            System.out.printf("\n+----- La calificacion Final del Estudiante %s es : %,.2f -----+\n\n                        ¡Aprobaste!    \n",nombre,Calificacion_Final);
        }else{
            System.out.printf("\n+----- La calificacion Final del Estudiante %s es : %,.2f -----+\n\n                        ¡No Aprobaste!    \n",nombre,Calificacion_Final);
        }
        System.out.println();

        input.close();
    }
}
