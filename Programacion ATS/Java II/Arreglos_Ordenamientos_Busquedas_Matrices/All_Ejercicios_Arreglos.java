import java.util.Scanner;


public class All_Ejercicios_Arreglos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ejercicio 1: Leer 5 numeros, guardarlos en un arreglo
        // y mostrarlos en el mismo orden introducido.
        
        float arreglo[] = new float[5];
        String conteo[] = {"primer","segundo","tercer","cuarto","ultimo"};
        float q;

        System.out.println();
        System.out.println("\n-Digite 5 numeros-");
        System.out.println();

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Digite el "+ conteo[i] + " numero: ");
            q = input.nextFloat();

            arreglo[i] = q;
        }
        System.out.println();

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("El "+conteo[i] +  " numero ingresado fue el: " + arreglo[i]);
        }
        
        // Ejercicio 2: Leer 5 numeros, guardarlos en un arreglo
        // y mostrarlos de atras para delante.

        float xarreglo[] = new float[5];
        String xconteo[] = {"primer","segundo","tercer","cuarto","ultimo"};
        float xq;

        System.out.println();
        System.out.println("\n-Digite 5 numeros-");
        System.out.println();

        for (int i = 0; i < xarreglo.length; i++) {
            System.out.print("Digite el "+ xconteo[i] + " numero: ");
            xq = input.nextFloat();

            xarreglo[i] = xq;
        }
        System.out.println();
        for (int i = xarreglo.length-1; i >= xarreglo.length-xarreglo.length ; i--) { 
        // for (int i = 4; i >= xarreglo.length-xarreglo.length ; i--)
        // for (int i = 4; i >= xarreglo.length-5 ; i--)
        // for (int i = 4; i >= 0 ; i--)
            System.out.println("El "+xconteo[i] +  " numero ingresado fue el: " + xarreglo[i]);
        }

        // Ejercicio 3: Leer 5 numeros por teclado, almacenarlos en un arreglo y a continuacion realizar la
        // media de los numeros positivos
        // media de los negativos
        // contar el numero de ceros

        System.out.print("\nDigite la cantidad de numeros que desea ingresar: ");
        int c = input.nextInt();
        float zarreglo[] = new float[c];
        float mp = 0,mn = 0, cc = 0,cp = 0, cn = 0;

        System.out.println();

        for (int i = 0; i < zarreglo.length; i++) {
            if (i == 0){
                System.out.print("Digite un numero: ");
            }else{System.out.print("Digite otro numero: ");}
            float z = input.nextFloat();

            zarreglo[i] = z;
        }

        for (float f : zarreglo) {
            if (f < 0){
                cn ++;
                mn += f;
            }else if(f>0){
                cp ++;
                mp += f;
            }else{
                cc ++;
            }
        }

        if (cp >0){
            float mep = mp/cp;
            System.out.printf("\n-La media de los numeros positivos es de: %,.2f",mep);
        }else{System.out.println("No se ingreso ningun numero positivo");}
        if (cn>0){
            float men = mn/cn;
            System.out.printf("-La media de los numeros negativos es de: %,.2f",men);
        }else{System.out.println("No se ingreso ningun numero negativo");}
        if(cc>0){
            System.out.printf("-La cantidad de ceros ingresados es de: %,.0f",cc);
        }else{System.out.println("No se ingreso ningun cero");}
        
        // Ejercicio 4: Leer 10 numeros enteros, save them in a array.
        // debemos mostrarlos en el siguiente orden: el primero, el ultimo,el segundo,el penultimo,
        // el tercero,el antepenultimo
        

        int nu [] = new int [10];

        for (int i = 0; i < nu.length; i++) {
            if (i == 0){
                System.out.print("Digite un numero: ");
            }else{System.out.print("Digite otro numero: ");}
            int v = input.nextInt();

            nu[i] = v;
        }
        int p = 0;
        int u = 9;

        for (int i = 0; i < nu.length/2; i++) {
            System.out.println(nu[p]);
            p++;
            System.out.println(nu[u]);
            u--; 
        }

        // Ejercicio 5: Leer por teclado dos tablas de 10 numerosenteros y mezclarlas en una tercera de la forma:
        // el 1° del A, el 1° del B...


        int tabla1[] =new int[10];
        int tabla2[] =new int[10];
        int tabla3[] =new int[20];

        System.out.println("\nllenemos la tabla N°1");
        System.out.println();
        for (int i = 0; i < tabla1.length; i++) {
            if (i == 0){
                System.out.print("-Digite un numero: ");
            }else{System.out.print("-Digite otro numero: ");}
            int va1 = input.nextInt();
            tabla1[i]= va1;
        }

        System.out.println("\nllenemos la tabla N°2");
        System.out.println();
        for (int i = 0; i < tabla2.length; i++) {
            if (i == 0){
                System.out.print("-Digite un numero: ");
            }else{System.out.print("-Digite otro numero: ");}
            int va2 = input.nextInt();
            tabla2[i]= va2;
        }

        System.out.println("\nllenaremos la tabla N°3");
        System.out.println();

        for (int i = 0; i < tabla2.length; i++) {
            System.out.println("El valor en la posicion #"+(i+1)+" de la primera tabla es: "+tabla1[i]);
            System.out.println("El valor en la posicion #"+(i+1)+" de la segunda tabla es: "+tabla2[i]);
            System.out.println();
        }
        int jx =0;
        for (int i = 0; i < tabla3.length; i++) {
            tabla3[jx]=tabla1[i];
            jx++;
            tabla3[jx]=tabla2[i];
            jx++;
        }

        System.out.println("\n-La tercer tababla es: ");
        System.out.println();
        System.out.print("[");
        for (int i : tabla3) {
            
            System.out.print(i+", ");
            
        }
        System.out.print("]");
        System.out.println();
        
        // Ejercicio 6: Leer los datos correspondientes a dos tablas de 12 elementos numericos
        // mezclarlos en una tercera de la forma:
        // 3 de la tA,3 de la tB,otros 3 de la tabla A y otros 3 de la B

        int Ta[],Tb[],Tc[];

        Ta = new int [12];
        Tb = new int [12];
        Tc = new int [24];

        System.out.println("\nLLenaremos la tabla N°1");
        for (int i = 0; i < Ta.length; i++) {
            if (i == 0){
                System.out.print((i+1)+"-Digite un numero: ");
            }else{System.out.print((i+1)+"-Digite otro numero: ");}
            Ta[i]= input.nextInt();
        }
        
        System.out.println("\nLLenaremos la tabla N°2");
        for (int i = 0; i < Tb.length; i++) {
            if (i == 0){
                System.out.print((i+1)+"-Digite un numero: ");
            }else{System.out.print((i+1)+"-Digite otro numero: ");}
            Tb[i]= input.nextInt();
        }

        int j =0;
        int k=0; 
        for (int i = 0; i < Tc.length; i++) {
            if (i<3){Tc[i]=Ta[k];k++;}
            else if(i>=3 && i<6){Tc[i]=Tb[j];j++;}
            else if(i>=6 && i<9){Tc[i]=Ta[k];k++;}
            else if(i>=9 && i<12){Tc[i]=Tb[j];j++;}
            else if(i>=12 && i<15){Tc[i]=Ta[k];k++;}
            else if(i>=15 && i<18){Tc[i]=Tb[j];j++;}
            else if(i>=18 && i<21){Tc[i]=Ta[k];k++;}
            else if(i>=21 && i<24){Tc[i]=Tb[j];j++;}
            
        }

        System.out.print("\n[ ");
        for (int i = 0; i < Tc.length; i++) {
            if(i >=0 && i <12){
                System.out.print(Tc[i]+", ");
            }
            if (i==12){
                System.out.println();
            }
            if(i>=12 && i<23){
                System.out.print(Tc[i]+", ");
            }
            if (i==23){
                System.out.print(Tc[i]+" ]");
            }
        }

        int max = Tc[0],min = Tc[0];
        for (int i : Tc) {
            if(i>max){
                max = i;
            }
            if(i<min){
                min = i;
            }
        }
        System.out.println("\nEl numero mayor en la tabla C es: "+max+"\nEl numero menor en la tabla C es: "+min);
        
        //Entradas:

        //15 30 35 33 22 55 45 85 2 44 88 99
        //25 96 10 66 11 100 11 100 71 200 300 450
        

        // Ejercicio 7: leer por teclado una serie de 10 numeros int,
        // la app debe indicarnos si estan ordenados de forma creciente,decreciente,en desorden o todos son iguales

        int yarreglo[] = new int[10];
        boolean creciente = false, decreciente = false;

        System.out.println("LLenaremos el arreglo");        
        for (int i = 0; i < yarreglo.length; i++) {
            if (i == 0){
                System.out.print((i+1)+"-Digite un numero: ");
            }else{System.out.print((i+1)+"-Digite otro numero: ");}
            yarreglo[i]= input.nextInt();
        }

        for (int i = 0; i < yarreglo.length-1; i++) {// -1 porque despues se pasa
            if(yarreglo[i]< arreglo[i+1]){ // Creciente: 1-2-3-4-5-6...
                creciente =true;
            }
            if(yarreglo[i]> arreglo[i+1]){ // Decreciente: 5-4-3-2-1...
                decreciente = true;
            }
        }

        if (creciente && !decreciente){ //es lo mismo que: if (creciente == true && decreciente == false)
            System.out.println("\nEl arreglo está en forma Creciente");

        }else if(!creciente && decreciente){System.out.println("\nEl arreglo está en forma Decreciente");}
        else if(creciente && decreciente){
            System.out.println("\nEl arreglo está en Desorden");
        }else if (!creciente && !decreciente){System.out.println("\nEn el arreglo todos los numeros son iguales");}

        // Ejercicio 8: Diseñar una app que declare una tabla de 10 elementos enteros.
        // Leer mediante el taclado 8 numeros. despues se debe pedir un numero y una pos
        // insertarlo en la posicion indicada, desplazando los que esten detras
        // arreglo[pos] = change;




        // Ejercicio 9: desplazar una posicion en un arreglo
        // el primero pasa a ser el segundo,el segundo el tercero....el ultimo pasa a ser el primero


        int carreglo[] = new int[10],ultimo_arreglo;

        System.out.println("\nLlenar el arreglo");

        for (int i = 0; i < carreglo.length; i++) { // fill in the data
            if (i == 0){
                System.out.print((i+1)+"-Digite un numero: ");
            }else{System.out.print((i+1)+"-Digite otro numero: ");}
            carreglo[i]=input.nextInt();
        }

        System.out.print("\n["); // show array
        for (int i = 0; i < carreglo.length; i++) {System.out.print(carreglo[i]+", ");}
        System.out.print("]\n");

        ultimo_arreglo = carreglo[9];


        for (int i = carreglo.length-2; i >= carreglo.length-carreglo.length; i--) { // make the change
            carreglo[i+1]=carreglo[i];
            
            /*
            i = 8 // carreglo.length = 10 // 10-2=8
            i<=0 // carreglo.length-carreglo.length = 0

             [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
     pos      0  1  2  3  4  5  6  7  8  9
                                       (i+1) // i = 8 // 8+1=9 = pos
                                        //sera igual a el valor que esta en la pos i=8
                                        //
             [ ,1, 2, 3, 4, 5, 6, 7, 8, 9]// el 10 de la pos 9 esta almacenado en ultimo_arreglo

                carreglo[i+1]=carreglo[i];

            */
            
        }

        carreglo[0]=ultimo_arreglo; // [10,1, 2, 3, 4, 5, 6, 7, 8, 9]

        System.out.print("\n["); // show the array with the change
        for (int i = 0; i < carreglo.length; i++) {System.out.print(carreglo[i]+", ");}
        System.out.print("]\n");

        
        // Ejercicio 10: crear un programa que lea por teclado una tabla de 10 numeros 
        // y desplace N posiciones en el arreglo  en el arreglo (N es digitado por el user)

        int varreglo [] = new int[10];

        System.out.println("\nLLene el arreglo");
        for (int i = 0; i < varreglo.length; i++) {
            if (i == 0){
                System.out.print((i+1)+"-Digite un numero: ");
            }else{System.out.print((i+1)+"-Digite otro numero: ");}
            varreglo[i]=input.nextInt();
        }

        System.out.print("\n["); // show array
        for (int i = 0; i < varreglo.length; i++) {
            if (i>=0 && i <9){System.out.print(varreglo[i]+", ");}
            else{System.out.print(varreglo[i]+"");}
        }
        System.out.print("]\n");

        System.out.print("Digite cuantas posiciones deseas desplazar: ");
        int pos = input.nextInt();
        int jo = 1;
        int ultimo = 0;
        //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    //pos  0  1  2  3  4  5  6  7  8  9

        ultimo = varreglo[9];
        while(jo<=pos){
        //for (int i = varreglo.length-2; i >= varreglo.length-varreglo.length; i--) { // make the change
            for (int i = 8; i >= 0; i--) {
                varreglo[i+1]=varreglo[i];
            }
            jo++;
            varreglo[0]=ultimo;
            ultimo= varreglo[9];

        }

        System.out.println("\n[Se desplazaron "+pos+" posiciones]");
        System.out.print("\n[");
        for (int i = 0; i< varreglo.length; i++) {
            if (i>=0 && i<9){System.out.print(varreglo[i]+", ");}
            if (i==9){System.out.print(varreglo[i]+"");}
        }System.out.print("]\n");

        // 1 2 3 4 5 6 7 8 9 10


        // Ejercicio 11: Insertar un numero en un arreglo ordenado/creciente

        int barreglo[] = new int[10];

        System.out.println("Llene el arreglo");
        boolean xcreciente = true;
        int num,sitio_num=0,ji=0;
        do{
            for (int i = 0; i < barreglo.length/2; i++) {
                if (i == 0){
                    System.out.print((i+1)+"-Digite un numero: ");
                }else{System.out.print((i+1)+"-Digite otro numero: ");}
                barreglo[i]=input.nextInt();  
            }
            // comporbar si el arreglo esta de forma creciente o no
            for (int i = 0; i < 4; i++) {
                if (barreglo[i] < barreglo[i+1]){
                    xcreciente = true;
                }
                if (barreglo[i ]> barreglo[i+1]){
                    xcreciente = false;
                    break;
                }
            }
            if(xcreciente == false){ // if(!creciente){}
                System.out.println("\nEl arreglo no esta ordenado en forma creciente, vuelva a intentar: \n");
            }
        }while(!xcreciente);

        System.out.print("\nDigite un numero a insertar: ");
        num = input.nextInt();

        while(barreglo[ji]<num && ji<5){
            sitio_num++;
            ji++;
        }

        for (int i = 4; i>=sitio_num;i--){
            barreglo[i+1] = barreglo[i];
        }
        barreglo[sitio_num]= num;

        System.out.print("\n["); // show array
        for (int i = 0; i < 6; i++) {
            if (i>=0 && i <5){System.out.print(barreglo[i]+", ");}
            else{System.out.print(barreglo[i]+"");}

        }

        // Ejercicio 12: leer por teclado una tabla de 10 elementos numericos enteros
        // y una posicion (entre 0 y 9). eliminar el elemento situado en la posicion sin dejar huecos

        int narreglo[] = new int[10];
        int change;

        System.out.println("Llene el arreglo");
        for (int i = 0; i < narreglo.length; i++) {
            if (i == 0){
                System.out.print("Digite un numero: ");
            }else{System.out.print("Digite otro numero: ");}
            narreglo[i] = input.nextInt();
        }

        do{
            
            System.out.print("Digite la posicion que desea eliminar: ");
            change = input.nextInt();
            if (change>10 || change<1){
                System.out.print("Digite la posicion que desea eliminar entre (1-10): ");
            }
        }while(change>10 || change<1);

        for (int i = 0; i < narreglo.length-1; i++){
            if (i>= change-1){
                narreglo[i]=narreglo[i+1];
            }
        }
        System.out.print("\n[");
        for (int i = 0; i < narreglo.length-1; i++) {
            if (i>=0 && i<8){System.out.print(narreglo[i]+", ");}
            else{System.out.print(narreglo[i]+" ");}
        }System.out.print("]\n");

        
        // Ejercicio 13: Leer 10 enteros en una tabla.
        // Guardar en otra tabla los elementos pares de la primera linea 
        // Y a continuacion los elementos impares

        int marreglo[] = new int[10];
        int pares[],conteo_pares = 0;
        int impares[],conteo_impares = 0;

        System.out.println("\nLlene el arreglo");
        for (int i = 0; i < marreglo.length; i++) {
            if (i == 0){
                System.out.print("Digite un numero: ");
            }else{System.out.print("Digite otro numero: ");}
            marreglo[i] = input.nextInt();

            if (marreglo[i] % 2 == 0){
                conteo_pares++;
            }else{conteo_impares++;}
            
        }

        System.out.print("\n[");
        for (int i = 0; i < marreglo.length; i++) {
            if (i>=0 && i<8){System.out.print(marreglo[i]+", ");}
            else{System.out.print(marreglo[i]+" ");}
        }System.out.print("]\n");

        pares = new int[conteo_pares];
        impares = new int[conteo_impares];

        conteo_pares = 0;
        conteo_impares = 0;

        for (int i = 0; i < marreglo.length; i++) {
            if (marreglo[i]%2 ==0){
                pares[conteo_pares]=marreglo[i];
                conteo_pares++;
            }else{impares[conteo_impares]=marreglo[i];
                conteo_impares++;
            }
        }

        System.out.print("Arreglo de Pares\n[");
        for (int i = 0; i < pares.length; i++) { // pares.length or conteo_pares
            if (i>=0 && i<8){System.out.print(pares[i]+", ");}
            else{System.out.print(pares[i]+" ");}
        }System.out.print("]\n");

        System.out.print("Arreglo de Impares\n[");
        for (int i = 0; i < impares.length; i++) { // impares.length or conteo_impares
            if (i>=0 && i<8){System.out.print(impares[i]+", ");}
            else{System.out.print(impares[i]+" ");}
        }System.out.print("]\n");
        
        // Ejercicio 14: ller dos series de 10 enteros, que estarán ordenados crecientemente
        // fusionar las dos tablas en una tercera, de forma que sigan ordenados

        int A1[] = new int[10];
        int A2[] = new int[10];
        int F[] = new int[20];
        boolean acreciente = true;

        do{
            System.out.println("\nLlene el arreglo N°1");
            for (int i = 0; i < A1.length; i++) {
                if (i == 0){
                    System.out.print("Digite un numero: ");
                }else{System.out.print("Digite otro numero: ");}
                A1[i] = input.nextInt();
            }

            for (int i = 0; i < A1.length-1; i++) {
                if (A1[i]<A1[i+1]){
                    acreciente = true;
                }else{acreciente = false;}
            }if (!acreciente){System.out.println("Vuelva a llenar el arreglo, debe ser de forma creciente");}
        }while(!acreciente);

        do{
            System.out.println("\nLlene el arreglo N°2");
            for (int i = 0; i < A2.length; i++) {
                if (i == 0){
                    System.out.print("Digite un numero: ");
                }else{System.out.print("Digite otro numero: ");}
                A2[i] = input.nextInt();
            }
            for (int i = 0; i < A2.length-1; i++) {
                if (A2[i]<A2[i+1]){
                    acreciente = true;
                }else{acreciente = false;}
            }if (!acreciente){System.out.println("Vuelva a llenar el arreglo, debe ser de forma creciente");}
        }while(!acreciente);
        
        int jk=0,ik=0, kk=0; // Iteradores
        
        while(jk<10 && ik<10){
            if (A1[jk]<A2[ik]){
                F[kk]=A1[jk];
                jk++;
                kk++;

            }else{
                F[kk]=A2[ik];
                kk++;
                ik++;
            }
        }
        if (jk == 10){
            while(ik<10){
                F[kk]=A2[ik];
                ik++;
                kk++;

            }
        }else{
            while(jk<10){
                F[kk]=A1[jk];
                jk++;
                kk++;
            }
        }

        System.out.print("Arreglo fusionado de forma ordenada\n[");
        for (int i = 0; i < F.length; i++) {
            if (i>=0 && i<F.length-1){System.out.print(F[i]+", ");}
            else{System.out.print(F[i]+" ");}
        }System.out.print("]\n");

        
        //Ejercicio 15: Buscar un elemento en un arreglo ordenado

        int aarreglo[] = new int[10];
        int posicion = 0;
        boolean creci = true;


        do{
            System.out.println("Llene el arreglo de forma creciente");

            for (int i = 0; i < aarreglo.length; i++) {
                if (i == 0){
                    System.out.print("-Digite un numero: ");
                }else{System.out.print("-Digite otro numero: ");}
                aarreglo[i] = input.nextInt();
            }

            for (int i = 0; i < aarreglo.length-1; i++) {
                if (aarreglo[i]<aarreglo[i+1]){
                    creci = true;
                }else{creci = false;break;} // se coloca el break en un condicional cuando esta el if y else dentro de un for, si la condicion itera
            }if(!creci){System.out.println("¡RECUERDE!-Debe llenar el arreglo de forma creciente");}

        }while(!creci);

        System.out.print("\nDigite el numero que desea buscar: ");
        int busqueda = input.nextInt();
        boolean find = true;

        for (int i = 0; i < aarreglo.length; i++) {
            if(aarreglo[i]==busqueda){
                find = true;
                posicion = i;
                break;        // se coloca el break en un condicional cuando esta el if y else dentro de un for, si la condicion itera
            }else{find = false;}
        }
        if (find){System.out.println("\nEl numero "+busqueda+" está en la posicion "+posicion+" del arreglo");}
        else{System.out.println("\nEl numero "+busqueda+" No se encuentra en el arreglo");}

        // Otra solucion para encontrar el numero o no
        //
        //          int i = 0;
        //
        //          while(i<10 && aarreglo[i]<busqueda){i++;}
        //
        //          if (i==10){sysout("\nNumero no encontrado")}
        //          else{
        //              if(aarreglo[i]==numero){
        //               sysout("\nNumero encontrado en la posicion "+i);
        //
        //              }else{sysout("\nNumero no encontrado")}
        //          }
       

        //  Ejercicio 16: gestion de notas
        //      cada grupo o clase está compuesto por 5 alumnos.
        //      se pide leer las:
        //          las notas del primer, segundo y tercer trimestre de un grupo
        //      debemos mostrar al final:
        //          la nota media del grupo en cada trimestre, y la media del alumno que se encuentra en la posicion N
        //          (N se lee por el keyboard)

        System.out.println("\n");
        input.close();
    }
}
