import java.util.Scanner;

import javax.swing.JOptionPane;

public class All_Ejercicios_Ciclos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ejercicio 1: Leer un numero y mostrar su cuadrado,
        // repetir el proceso hasta que se introduzca un numero negativo
        ///*
        int numero, cuadrado;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        while(numero >= 0){
            cuadrado = (int)Math.pow(numero, 2);

            JOptionPane.showMessageDialog(null,"El numero " + numero+ " Elevado al cuadrado es: "+cuadrado);

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }

        // Ejercicio 2: Ler un numero e indicar si es positivo o negativo.
        // El proceso se repetirá hasta que se introduzca un cero

        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        while(n != 0){
            if(n>0){
                JOptionPane.showMessageDialog(null,"El numero " + n+ " es positivo");

            }else if(n<0){
                JOptionPane.showMessageDialog(null,"El numero " + n+ " es negativo");}

            n = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }

        // Ejercicio 3: Leer numeros hasta que se introduzca un cero,
        // Para cada uno indicar si es par o impar

        int m = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        while(m != 0){
            if(m %2 ==0 ){
                JOptionPane.showMessageDialog(null,"El numero " + m+ " es PAR");

            }else{
                JOptionPane.showMessageDialog(null,"El numero " + m+ " es IMPAR");}

            m = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }

        // Ejercicio 4: Pedir numeros hasta que se introduzca uno negativo,
        // y mostrar cuantos numeros se han introducido

        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        int contador = 0;

        while(x >= 0){
            
            contador++;

            x = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }JOptionPane.showMessageDialog(null,"Se introdujeron un total de "+ contador+" numeros");

        // Ejercicio 5: Adivina el numero

        int numero_aleatorio, numero_elegido, intentos = 0;

        System.out.println("Adivina el numero (0- 100)");
        numero_aleatorio = ((int)Math.random()*100);

        System.out.println("\nCual crees que es el numero: ");
        numero_elegido = input.nextInt();

        if (numero_elegido == numero_aleatorio){
            System.out.println("\nUffff que crack eres, Lo lograste en el primer intento\n ¡Apague y vamonos!");
        }

        while (numero_elegido != numero_aleatorio) {

            if(numero_elegido > numero_aleatorio){
                System.out.print("\n-Elige un numero mas pequeño: ");

            }else{System.out.print("\n-Elige un numero mas grande: ");}

            intentos++;
            numero_elegido = input.nextInt();

        }if (intentos == 1){
            System.out.println("\n¡Felicidades! Lo lograste en "+intentos+" Intento\nQue suerte tienes Crack");
        }else{
            System.out.println("\n¡Felicidades! Lo lograste en "+intentos+" Intentos");
        }

        // Ejercicio 6: suma

        int sumatoria = 0,num;

        num = input.nextInt();

        while(num != 0){
            sumatoria += num;
        }System.out.println("La sumatoria de todos los numeros ingresados es: "+sumatoria);

        // Ejercicio 7: pedir numeros hasta que se introduzca uno negativo
        // calular la media

        int number, elementos = 0, suma = 0;
        float media;

        System.out.print("Hallaremos la media");

        System.out.print("\nDigite un numero: ");

        number = input.nextInt();

        while(number>=0){

            suma += number;
            elementos++;

            System.out.print("Digite otro numero: ");
            number = input.nextInt();
        }
        if(elementos == 0){
            System.out.println("¡Error! la division entre cero no existe");
        }else{
            media = (float) suma/elementos;
            System.out.printf("La media es: %,.2f",media);
        }

        // Ejercicio 8: pedir un numero N y mostrar todos los numeros del 1 al N

        int a = input.nextInt();

        for (int i = 1; i <= a; i++) {
            System.out.println(i);
        }
        
        // Ejercicio 9: Escribir todos los numeros del 100 al 0 de 7 en 7

        for (int i = 100; i >=0 ; i-=7) {
           System.out.println(i);
            
        }

        // Ejercicio 10: pedir 10 numeros y escribir la suma total

        int l,sum = 0;

        for (int i = 0; i < 10; i++) {
            l = input.nextInt();
            sum += l;
        }
        System.out.println(sum);
        
        // Ejercicio 11: Producto de los 10 numeros pares

        long producto = 1;

        for (int i = 1; i <= 20; i+=2) {
            producto *= i;
        }

        System.out.println(producto);
        
        // Ejercicio 12: pedir un numero y calcular su factorial

        int p,factorial = 1;

        p = input.nextInt();
        for (int i = 2; i <= p; i++) {
            factorial *= i;
        }
        System.out.println(factorial);

        // Ejercicio 13: pedir 10 numeros. mostrar la media de los nuemros positivos,
        // La media de los numeros negativos y la cantidad de ceros
        
        int z,positivos = 0, negativos = 0, c_positivos = 0, c_negativos = 0, c_ceros = 0;
        float mediap, median;

        for (int i = 0; i < 10; i++) {
            z = input.nextInt();
            if(z > 0){
                positivos += z;
                c_positivos ++;
            }else if(z < 0){
                negativos += z;
                c_negativos ++;
            }else{
                c_ceros ++;
            }
        }

        mediap = positivos /c_positivos;
        median = negativos /c_negativos;

        System.out.printf("Media de positivos: %,.2f\nMedia de negativos: %2,.f\nCantidad de ceros: %d",mediap,median,c_ceros);

        // Ejercicio 14: pedir 10 sueldos. mostrar su suma y cuanos hay mayores de $1000

        //Ejercicio 15: Dadas las edades y alturas de 5 alumnos, mostrar la edad y estatura media,
        // la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden mas de 1.75


        int edad,sumaEdad = 0,conteoMayor18= 0, contadormayor75 = 0;
        float altura, sumaAltura = 0;

        for (int i = 0; i <5; i++) {
            System.out.print("Alumno #0"+(i+1)+"\n-Digite su edad: ");
            edad = Integer.parseInt(input.nextLine());
            System.out.print("Alumno #0"+(i+1)+"\n-Digite su estatura: ");
            altura = Float.parseFloat(input.nextLine());

            sumaEdad += edad;
            sumaAltura += altura;

            if (edad > 18){
                conteoMayor18 ++;
            }
            if (altura >1.75){
                contadormayor75++;
            }
        }


        float mediaEdad = (float) sumaEdad /5;
        float mediaAltura = (float) sumaAltura/5;

        System.out.printf("La edad promedio es: %,.2f\nLa estatura promedio es: %,.2f\nCantidad de alumnos mayores a 18 años: %d"+
        "\nCantidad de alumnos que miden mas de 1.75: %d ",mediaEdad,mediaAltura,conteoMayor18,contadormayor75);
        
        // Ejercicio 16: pide un numerodel 1 al 10 y mostrar la tabla de multiplicar de dicho numero

        System.out.print("Ingresa un numero entre el (1 y 10) para calcular sus multiplicaciones: ");
        int q = input.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(q +" x "+i+" = "+(q * i));
        }
        
        // Ejercicio 17: Gestion de facturas
        // codigo del articulo, cantidad vendida en litros y el precio por litro
        // se pide de 5 facturas introducidad: 
        // Facturacion total, cantidad en litros vendidos del articulo 1 y cuantas facturas se emitieron de mas de $600

        int codigo,facturasM6 = 0;
        float cantidad_v_lt, precio_x_lt,cantidad_lt_vendidos1 = 0,facturacion_total = 0;

        System.out.print("Ingrese la cantidad de facturas a ingresar: ");
        int can_facturas = input.nextInt();
        System.out.println();

        if (can_facturas >0){
            for (int i = 1; i <= can_facturas; i++) {

                System.out.print("Digite el codigo del articulo #" +i+": ");
                codigo = input.nextInt();

                System.out.print("Digite la cantidad vendida en litros del articulo #" +i+" con codigo "+codigo+" :");
                cantidad_v_lt = input.nextFloat();

                System.out.print("Digite el precio por litro del articulo #" +i+": ");
                precio_x_lt = input.nextFloat();

                System.out.println();

                float total = precio_x_lt * cantidad_v_lt;
                facturacion_total += total;

                if (codigo == 1){
                    cantidad_lt_vendidos1 += cantidad_v_lt;
                }
                if ( total > 600){
                    facturasM6++;
                }
            }
            System.out.printf("La facturacion total es de: $%,.0f\nCantidad en litros vendidos del articulo #01 es de: %,.0f Litros"+
            "\nLa cantidad de facturas que se emitieron de mas de $600 es de: %d",facturacion_total,cantidad_lt_vendidos1,facturasM6);

        }else{System.out.println("Por favor la cantidad de facturas a ingresar");}
        

        //Ejercicio 18:
        // hacer modiifcaciones al ejercicio anterior suponiendo que no se introduce el p por litro. solo existen tres productos con precios:
        // 1. 0.6 $/litro
        // 2. 3 $/litro
        // 3. 1.25 €/litro


        int xcodigo,xfacturasM6 = 0;
        float xcantidad_v_lt, xprecio_x_lt,xcantidad_lt_vendidos1 = 0,xfacturacion_total = 0,xtotal1 = 0,xtotal2 = 0,xtotal3 = 0;

        System.out.print("Ingrese la cantidad de facturas a ingresar: ");
        int xcan_facturas = input.nextInt();
        System.out.println();

        if (xcan_facturas >0){
            for (int i = 1; i <= xcan_facturas; i++) {

                System.out.print("Digite el codigo del articulo #" +i+": ");
                xcodigo = input.nextInt();

                System.out.print("Digite la cantidad vendida en litros del articulo #" +i+" con codigo "+xcodigo+" :");
                xcantidad_v_lt = input.nextFloat();

                if (xcodigo == 1){
                    xcantidad_lt_vendidos1 += xcantidad_v_lt;
                    xprecio_x_lt = 0.6f;
                    xtotal1 = xprecio_x_lt * xcantidad_v_lt;
                    xfacturacion_total += xtotal1;
                    if ( xtotal1 > 600){
                        xfacturasM6++;
                    }
                }else if (xcodigo == 2){
                    xprecio_x_lt = 3;
                    xtotal2 = xprecio_x_lt * xcantidad_v_lt;
                    xfacturacion_total += xtotal2;
                    if (xtotal2 >600){
                        xfacturasM6++;
                    }
                }else if (xcodigo == 3){
                    xprecio_x_lt = 1.25f;
                    xtotal3 = xprecio_x_lt * xcantidad_v_lt;
                    xfacturacion_total += xtotal3;
                    if (xtotal3 > 600){
                        xfacturasM6++;
                    }
                }

                System.out.println();
            }
            System.out.printf("La facturacion total es de: $%,.0f\nCantidad en litros vendidos del articulo #01 es de: %,.0f Litros"+
            "\nLa cantidad de facturas que se emitieron de mas de $600 es de: %d",xfacturacion_total,xcantidad_lt_vendidos1,xfacturasM6);
            System.out.println();

        }else{System.out.println("Por favor la cantidad de facturas a ingresar");}

        // Ejercicio 19: dadas 6 notas, escribir la cantidad de alumnos aprobados >=5 <=10, condicionados (=4) y suspensos <4 >-1

        float note;
        int aprobados = 0, condicionados = 0, suspensos = 0;

        int cantidad_de_alumnos = input.nextInt();


        for (int i = 1; i <= cantidad_de_alumnos; i++) {
            do{
                System.out.print("Digite la nota del alumno N°"+ i+" : ");
                note = input.nextInt();
            }while(note < 0 || note >10);

            if (note  >=4 || note <5){
                condicionados++;
            }else if(note >=5){
                aprobados++;
            }else if(note >=0 || note <4){
                suspensos++;
            }
        }

        System.out.printf("\n-Cantidad de estudiantes: %d\n-Cantidad de estudiantes suspensos: %d"+
        "\n-Cantidad de estudiantes condicionados: %d\n-Cantidad de estudiantes aprobados: %d",cantidad_de_alumnos,suspensos,condicionados,aprobados);
        System.out.println();


        // Ejercicio 20: pedir un numero N, introducir N sueldos, y mostrar el sueldo maximo

        int trabajadores;
        float sueldo, min = 0,max = 0;

        System.out.print("Ingresa la cantidad de trabajadores: ");
        trabajadores = input.nextInt();
        System.out.println();
        for (int i = 1; i <= trabajadores; i++) {
            System.out.print("Ingresa el sueldo del trabajador N°" +i+": " );
            sueldo = input.nextFloat();

            if (max < sueldo){
                max = sueldo;
            }
            if (min > sueldo){
                min = sueldo;
            }

        }

        System.out.printf("\n-El sueldo mayor es de: %,.0f\n-El sueldo menor es de: %,.0f",max,min);

        // Ejercicio 21: pedir 10 numeros y mostrar sy se ha introducido alguno negativo

        System.out.print("Ingresa la cantidad de numeros que vas a ingresar: ");
        int r = input.nextInt();
        int negative = 0;

        for (int i = 1; i <= r; i++) {
            if (i == 1){
                System.out.print("Ingresa un numero: ");
            }
            else{System.out.print("Ingresa otro numero: ");}
            
            int y = input.nextInt();

            if (y <0){
                negative++;
            }

        }
        if (negative > 0){
            System.out.println("Se introdujeron "+negative+" numeros negativos");
        }else{ System.out.println("No Se introdujeron numeros negativos");}

        // Ejercicio 22: pedir 5 calificaciones de alumnos y decir al final si hay algun suspenso

        
       



        input.close();
    }
}
