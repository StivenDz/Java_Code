import java.util.Scanner;

public class All_Ejercicios_Matrices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ejercicio 1: crear y cargar una matriz de tam n x m y decir si es simetrica o no
        // Una matriz es simetrica cuando el numero de filas es igual al numero de columnas
        // Cuando se obtiene la misma matriz al cambiar sus filas por columnas
        
        int matriz[][],filas,columnas;

        
        System.out.print("\nDigite el numero de filas: ");
        filas = input.nextInt();
        System.out.print("Digite el numero de columnas: ");
        columnas = input.nextInt();

        while(filas!=columnas){

            System.out.println("\nDigite valores simetricos");
            System.out.print("\nDigite el numero de filas: ");
            filas = input.nextInt();
            System.out.print("Digite el numero de columnas: ");
            columnas = input.nextInt();}

        if(filas==columnas){
            matriz = new int[filas][columnas];
            System.out.println("\nLos valores son simetricos, llene la matriz");
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print("Digite el un valor para la posicion ["+i+"]"+"["+j+"]: ");
                    matriz[i][j] = input.nextInt();
                }
            }
            int Matriz[][] = new int[filas][columnas];

            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    Matriz[j][i] = matriz[i][j];
                }
            }

            boolean simetrica = false;
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    if (Matriz[i][j]==matriz[i][j]){
                        simetrica = true;
                    }
                    if (Matriz[i][j]!=matriz[i][j]){
                        simetrica = false;
                        break;
                    }
                }if (simetrica == false){break;}
            }

            if (simetrica){
                System.out.println("\nLa matriz es simetrica");
                System.out.println("");
                for (int i = 0; i < filas; i++) {
                    System.out.print("| ");
                    for (int j = 0; j < columnas; j++) {
                        if (matriz[i][j]<10 && matriz[i][j]>=0){
                            System.out.print(matriz[i][j]+" | ");
                        }else{System.out.print(matriz[i][j]+"| ");}
                    }
                    if (i+1 != filas){System.out.println();}
                }
                System.out.println("\n");
                for (int i = 0; i < filas; i++) {
                    System.out.print("| ");
                    for (int j = 0; j < columnas; j++) {
                        if (Matriz[i][j]<10 && Matriz[i][j]>=0){
                            System.out.print(Matriz[i][j]+" | ");
                        }else{System.out.print(Matriz[i][j]+"| ");}
                    }
                    if (i+1 != filas){System.out.println();}
                }
            }else{
                System.out.println("\nLa matriz no es simetrica");
                System.out.println("");
                for (int i = 0; i < filas; i++) {
                    System.out.print("| ");
                    for (int j = 0; j < columnas; j++) {
                        if (matriz[i][j]<10 && matriz[i][j]>=0){
                            System.out.print(matriz[i][j]+" | ");
                        }else{System.out.print(matriz[i][j]+"| ");}
                    }
                    if (i+1 != filas){System.out.println();}
                }
                System.out.println("\n");
                for (int i = 0; i < filas; i++) {
                    System.out.print("| ");
                    for (int j = 0; j < columnas; j++) {
                        if (Matriz[i][j]<10 && Matriz[i][j]>=0){
                            System.out.print(Matriz[i][j]+" | ");
                        }else{System.out.print(Matriz[i][j]+"| ");}
                    }
                    if (i+1 != filas){System.out.println();}
                }
            }
        }
        
        // Ejercicio 2: Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma

        int Atriz[][],Btriz[][],Ctriz[][];

        Atriz = new int[3][3];
        Btriz = new int[3][3];
        Ctriz = new int[3][3];

        System.out.println("\nLlene la Matriz #1 ");
        System.out.println("");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite un valor para la Matriz #1 en la posicion ["+i+"]["+j+"]: ");
                Atriz[i][j] = input.nextInt();
            }
        }

        System.out.println("\nLlene la Matriz #2 ");
        System.out.println("");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite un valor para la Matriz #2 en la posicion ["+i+"]["+j+"]: ");
                Btriz[i][j] = input.nextInt();
            }
        }
        int sumatoria = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Ctriz[i][j] = Atriz[i][j]+Btriz[i][j];
                sumatoria += Atriz[i][j]+Btriz[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("\nPosicion   Valor    Arreglo #1   +   Posicion    Valor    Arreglo #2   TOTAL   \n"+
                                    " ["+i+"]["+j+"]     " + Atriz[i][j]+"                    " + "    ["+i+"]["+j+"]       "+ Btriz[i][j]+"                    "+ Ctriz[i][j]);
            }
        }

        System.out.println("\n");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                if (Atriz[i][j]<10 && Atriz[i][j]>=0){
                    System.out.print(Atriz[i][j]+" | ");
                }else{System.out.print(Atriz[i][j]+"| ");}
            }
            if (i+1 != 3){System.out.println();}
        }

        System.out.println("\n");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                if (Btriz[i][j]<10 && Btriz[i][j]>=0){
                    System.out.print(Btriz[i][j]+" | ");
                }else{System.out.print(Btriz[i][j]+"| ");}
            }
            if (i+1 != 3){System.out.println();}
        }
        System.out.println("\n");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                if (Ctriz[i][j]<10 && Ctriz[i][j]>=0){
                    System.out.print(Ctriz[i][j]+" | ");
                }else{System.out.print(Ctriz[i][j]+"| ");}
            }
            if (i+1 != 3){System.out.println();}
        }
        System.out.println("\n-La sumatoria de todos los elementos de la Matriz #1 y la Matriz #2 es: "+sumatoria);

        // Entradas
        // 2 4 6 8 10 12 14 16 18      x2         sumatoria = 180

        // Vamos para el video 57.Programacion en java

        // Ejercicio 3: Crear y cargar una matriz de tamaño 3x3, transponerla y mostrarla
        
        int zatriz[][],tpuesta[][];

        zatriz = new int[3][3];
        tpuesta = new int [3][3];


        System.out.println("Llene la Matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < tpuesta.length; j++) {
                System.out.print("Digite un valor para la Matriz en la posicion ["+i+"]["+j+"]: ");
                zatriz[i][j] = input.nextInt();
            }
        }

        System.out.println("\nMatriz Original");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                if (zatriz[i][j]<10 && zatriz[i][j]>=0){
                    System.out.print(zatriz[i][j]+" | ");
                }else{System.out.print(zatriz[i][j]+"| ");}
            }
            if (i+1 != 3){System.out.println();}
        }

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 ; j++) {
               tpuesta [i][j]=zatriz[j][i];
            }
        }

        System.out.println("\nMatriz Traspuesta");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                if (tpuesta[i][j]<10 && tpuesta[i][j]>=0){
                    System.out.print(tpuesta[i][j]+" | ");
                }else{System.out.print(tpuesta[i][j]+"| ");}
            }
            if (i+1 != 3){System.out.println();}
        }
        

        // Ejercicio 4:
        // Crear una matriz de tamaño 7x7 y rellenarla de forma que los elementos de la diagonal
        // sean 1 y el resto 0

        //  | 1 | 0 | 0 | 0 | 0 | 0 | 0 |   pos [0][0]
        //  | 0 | 1 | 0 | 0 | 0 | 0 | 0 |   pos [1][1]
        //  | 0 | 0 | 1 | 0 | 0 | 0 | 0 |   pos [2][2]
        //  | 0 | 0 | 0 | 1 | 0 | 0 | 0 |   pos [3][3]
        //  | 0 | 0 | 0 | 0 | 1 | 0 | 0 |   pos [4][4]
        //  | 0 | 0 | 0 | 0 | 0 | 1 | 0 |   pos [5][5]
        //  | 0 | 0 | 0 | 0 | 0 | 0 | 1 |   pos [6][6]

        int xatriz[][] = new int [7][7];
        int pos = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == pos && j == pos){
                    xatriz[pos][pos]=1;
                    pos++;
                }else{xatriz[i][j]=0;}
            }
        }
        
        System.out.println("\nMatriz Con Diagonal de unos (1)");
        for (int i = 0; i < 7; i++) {
            System.out.print("| ");
            for (int j = 0; j < 7; j++) {
                if (xatriz[i][j]<10 && xatriz[i][j]>=0){
                    System.out.print(xatriz[i][j]+" | ");
                }else{System.out.print(xatriz[i][j]+"| ");}
            }
            if (i+1 != 7){System.out.println();}
        }
        

        // Crear y cargar una matriz de tamaño n x m, mostrar la suma de cada fila y de cada columna

        int e[][],f,c,sf = 0,sc = 0;

        System.out.print("Digite el numero de filas que tendra el arreglo: ");
        f = input.nextInt();
        System.out.print("Digite el numero de columnas que tendra el arreglo: ");
        c = input.nextInt();
        e = new int [f][c];

        System.out.println("\nLlene la Matriz");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Digite un valor para la Matriz en la posicion ["+i+"]["+j+"]: ");
                e[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < f; i++) {
            System.out.print("| ");
            for (int j = 0; j < c; j++) {
                if (e[i][j]<10 && e[i][j]>=0){
                    System.out.print(e[i][j]+" | ");
                }else{System.out.print(e[i][j]+"| ");}
            }
            if (i+1 != 7){System.out.println();}
        }
        
        System.out.println("");
        // suma de filas
        for (int i = 0; i < f; i++) {
            sf = 0;
            for (int j = 0; j < c; j++) {
                sf += e[i][j];
            }System.out.println("La suma de la fila ["+i+"] es: "+sf);
        }System.out.println("");

        // suma de columnas
        for (int j = 0; j < c; j++) {
            sc = 0;
            for (int i = 0; i < f; i++){
              sc += e[i][j];      
            }System.out.println("La suma de la columna ["+j+"] es: "+sc);
        }System.out.println("");
        
        // Ejercicio 6: Utilizando dos matrices de 5x9 y 9x5
        // cargar la primera y transponerla en la segunda

        // Eejrcicio 7: Crear una matriz "marco" de tamaño 5x5:
        // todos sus elementos deben ser 0 salvo los de los bordes que deben ser 1.

        // pos [0][0] | 1 | 1 | 1 | 1 | 1 |  pos [0][4]
        // pos [1][0] | 1 | 0 | 0 | 0 | 1 |  pos [1][4]  
        // pos [2][0] | 1 | 0 | 0 | 0 | 1 |  pos [2][4]
        // pos [3][0] | 1 | 0 | 0 | 0 | 1 |  pos [3][4]
        // pos [4][0] | 1 | 1 | 1 | 1 | 1 |  pos [4][4]
        
        int marco[][] = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4){
                    marco[i][j] = 1;
                }else if (j == 0 || j == 4){
                    marco[i][j]=1;
                }else{marco[i][j]=0;} // En java no es necesario ya que cuando inicializamos una matriz, todos los elementos son ceros
            }
        }
        System.out.println("\n La Matriz es ");
        for (int i = 0; i < 5; i++) {
            System.out.print("| ");
            for (int j = 0; j < 5; j++) {
                if (marco[i][j]<10 && marco[i][j]>=0){
                    System.out.print(marco[i][j]+" | ");
                }else{System.out.print(marco[i][j]+"| ");}
            }
            if (i+1 != 5){System.out.println();}
        }



        System.out.println("\n");
        input.close();
    }
}
