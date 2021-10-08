import java.util.Scanner;

public class SchoolGradingSystem {
    Scanner input = new Scanner(System.in);

    public int n;
    public String nombres  [] = {"armando","nicolas","daniel","maria","marcela","alexandra"};
    public double matriz[][];

    public double nombre [];
    public double calificacion[];

    public double calificaciones_aprobadas = 0;
    public int calificaciones_insuficientes = 0;

    public double peor_matematicas = 0;
    public double peor_informatica = 0;
    public double peor_geografia = 0;

    public String materia_con_peor_promedio = "";

    public void readData(){
        n = Integer.parseInt(input.nextLine());
        matriz = new double[n][4];
        for (int i = 0; i< n ; i++ ){
            String linea[] = input.nextLine().split(" ");
            for (int j = 0; j<4; j ++){
                matriz[i][j] = Double.parseDouble(linea[j]);
            }
        }
        nombre = new double [n];
        calificacion = new double [n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                nombre[i] = matriz[i][0];
                calificacion[i] = matriz[i][3];
            }
        }
    }

    public void question1(){
        for (int i = 0; i < n; i++) {
            if ((calificacion[i] >2.5) && (calificacion[i] <=5.0) ){
                calificaciones_aprobadas += 1;
            }
        }
        double porcentaje_de_aprobacion = calificaciones_aprobadas/n;
        System.out.printf("%,.2f",porcentaje_de_aprobacion);
    }

    public void question2(){
        for (int i = 0; i < n; i++) {
            if ((calificacion[i] >1) && (calificacion[i] <=2.5) ){
                calificaciones_insuficientes += 1;
            }
        }
        System.out.print("\n"+calificaciones_insuficientes);
    }

    public String question3(){
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
        if ((peor_geografia < peor_matematicas) && (peor_geografia < peor_informatica)){
            materia_con_peor_promedio = "geografia";
            
        }else if ((peor_matematicas < peor_geografia) && (peor_matematicas < peor_informatica)){
            materia_con_peor_promedio = "matematicas";
            
        }else if ((peor_informatica < peor_geografia) && (peor_informatica < peor_matematicas)){
            materia_con_peor_promedio = "informatica";
            
        }
        return materia_con_peor_promedio;
    }

    public String question4(){
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
        return nombres[etiqueta_mejor_desempeno];
    }
}
