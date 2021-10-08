public class SchoolGradingSystem extends GradingSystem {

    public void loadData(){
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
}
