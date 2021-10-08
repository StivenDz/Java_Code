import java.util.Scanner;

public class reto1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nombres  [] = {"armando","nicolas","daniel","maria","marcela","alexandra"};
        String materias [] = {"geografia","matematicas","informatica"};
        //String generos   [] = {"m","f"};

        int n = Integer.parseInt(input.nextLine());   // Cantidad de Iteracion 

        double nombre [] = new double [n];
        double genero [] = new double [n];
        double materia [] = new double [n];
        double calificacion [] = new double [n];

        double matriz [][] = new double[n][4];

        for (int i = 0; i< n ; i++ ){
            String linea[] = input.nextLine().split(" ");
            for (int j = 0; j<4; j ++){
                matriz[i][j] = Double.parseDouble(linea[j]);
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                nombre[i] = matriz[i][0];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                genero[i] = matriz[i][1];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                materia[i] = matriz[i][2];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                calificacion[i] = matriz[i][3];
            }
        }

        double calificaciones_aprobadas = 0;

        for (int i = 0; i < n; i++) {
            if ((calificacion[i] >2.5) && (calificacion[i] <=5.0) ){
                calificaciones_aprobadas += 1;
            }
        }
        double porcentaje_de_aprobacion = calificaciones_aprobadas/n;
        
        int calificaciones_insuficientes = 0;

        for (int i = 0; i < n; i++) {
            if ((calificacion[i] >1) && (calificacion[i] <=2.5) ){
                calificaciones_insuficientes += 1;
            }
        }

        double peor_matematicas = 0;
        double peor_informatica = 0;
        double peor_geografia = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                if(matriz[i][1]==0.0){
                    if (matriz[i][2]==1.0){
                        peor_geografia += matriz[i][3];

                    }
                    else if (matriz[i][2]==2.0){
                        peor_matematicas += matriz[i][3];
                    }
                    else if(matriz[i][2]==3.0){
                        peor_informatica += matriz[i][3];
                    }
                }
            }
        }

        String materia_con_peor_promedio = "";

        if ((peor_geografia < peor_matematicas) && (peor_geografia < peor_informatica)){
            materia_con_peor_promedio = "geografia";
        }else if ((peor_matematicas < peor_geografia) && (peor_matematicas < peor_informatica)){
            materia_con_peor_promedio = "matematicas";
        }else if ((peor_informatica < peor_geografia) && (peor_informatica < peor_matematicas)){
            materia_con_peor_promedio = "informatica";
        }

        double max = matriz[0][3];
        int etiqueta_mejor_desempeno = ((int)(matriz[0][0]))-1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                if(matriz[i][2] == 1.0){    
                    if(max < matriz[i][3]){ 
                        max = matriz[i][3];
                        etiqueta_mejor_desempeno = ((int)(matriz[i][0]))-1;}}
            }
        }


        System.out.printf("%,.2f",porcentaje_de_aprobacion);
        System.out.print("\n"+calificaciones_insuficientes);
        System.out.print("\n"+materia_con_peor_promedio);
        System.out.print("\n"+nombres[etiqueta_mejor_desempeno]);

        input.close();    
    }
}
