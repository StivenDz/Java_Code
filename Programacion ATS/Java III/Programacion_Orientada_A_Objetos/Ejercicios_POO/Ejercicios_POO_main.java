package Programacion_Orientada_A_Objetos.Ejercicios_POO;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicios_POO_main {

    // Metodo static del ejercicio 5
    public static double mayorArea(Ejercicio5 triangulos[]){
        double area;
        
        area = triangulos[0].getArea();
        for (int i = 0; i < triangulos.length; i++) {
            if(triangulos[i].getArea() > area){
                area = triangulos[i].getArea();
            }
        }return area;
    }

    // Metodo estatico del ejercicio 3
    public static int indice(Ejercicio3 coches[]){
        float precio;

        int indice = 0;
        precio = coches[0].getPrecio();
        for (int i = 1; i < coches.length; i++) {
            if(precio > coches[i].getPrecio()){
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Ejercicio 1
        
        Ejercicio1 e1;

        float lado1, lado2;

        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 1: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 2: "));

        if (lado1 == lado2){ // Es un cuadrado
            e1 = new Ejercicio1(lado1);
        }else{e1 = new Ejercicio1(lado1,lado2);}

        System.out.printf("El perimetro es: %,.2f\nEl area es: %,.2f",e1.getPerimetro(),e1.getArea());
        
        // Ejercicio 2

        char move;
        boolean leave = false;
        int mr = 0;

        Ejercicio2 pos = new Ejercicio2(0,0);
        System.out.printf("Posicion Inicial (%d,%d)\n",pos.getEjeX(),pos.getEjeX());

        
        while(!leave){
            do{      
            move = Character.toUpperCase(JOptionPane.showInputDialog("Ingrese el siguiente movimiento: \nW-Up\nS-Down\nA-Left\nD-Right\nL-Leave\n").charAt(0));
            if (move != 'W' && move != 'D' && move != 'S' && move != 'A' && move != 'L'){JOptionPane.showMessageDialog(null,"Movimiento no Reconocido");}
           }while(move != 'W' && move != 'D' && move != 'S' && move != 'A' && move != 'L');

           switch(move){
                case 'W':
                    pos.moveUp();
                    mr ++;
                    break;
                case 'S':
                    pos.moveDown();
                    mr ++;
                    break;
                case 'D':
                    pos.moveRight();
                    mr ++;
                    break;
                case 'A':
                    pos.moveLeft();
                    mr ++;
                    break;
                case 'L':
                    System.out.printf("Gracias por usar nuestro programa\nPosicion Final:    (%d,%d)\nMovimientos Realizados: %d",pos.getEjeX(),pos.getEjeY(),mr);
                    leave = true;
                    break;
           }
        }

        // Ejercicio 3

        String marca,modelo;
        float precio;
        int nv,indiceBarato;

        System.out.print("Digite la cantidad de vehiculos a registrar: ");
        nv = input.nextInt();

        Ejercicio3 coches[] = new Ejercicio3[nv];

        for (int i = 0; i < coches.length; i++) {
            input.nextLine();
            System.out.println("\nDigite las caracteristicas del coche #"+(i+1)+" ");
            System.out.print("Digite la marca: ");
            marca = input.nextLine();
            System.out.print("Digite el modelo: ");
            modelo = input.nextLine();
            System.out.print("Digite el precio: ");
            precio = input.nextFloat();

            coches[i] = new Ejercicio3(marca, modelo, precio);
        }

        indiceBarato = indice(coches);
        System.out.println("\nEl coche mas barato es: ");
        coches[indiceBarato].showData();
        
        // Ejercicio 4

        float tiempo;
        String nombre;
        int numero,ca,j;

        System.out.print("\nDigite la cantidad de atletas a registrar: ");
        ca = input.nextInt();

        Ejercicio4 atleta[] = new Ejercicio4[ca];
        

        for (int i = 0; i < atleta.length; i++) {
            System.out.println("\nDigite los datos del atleta #"+(i+1)+": ");
            System.out.print("-Digite el numero del atleta: ");
            numero = input.nextInt();
            input.nextLine();
            System.out.print("-Digite el nombre del atleta: ");
            nombre = input.nextLine();
            System.out.print("-Digite el tiempo que obtuvo el atleta: ");
            tiempo = input.nextFloat();

            atleta[i] = new Ejercicio4(numero, nombre, tiempo);
        }
        
        j = Ejercicio4.atletaWinner(atleta);
        
        System.out.printf("\nEl atleta ganador es %s, con numero de camiseta de %d y con un espectacular tiempo de %,.0f",atleta[j].getNombre(),atleta[j].getNumero(),atleta[j].getTiempo());
        

        double base,lado;
        int nt;

        System.out.print("Digite el numero de triangulos a trabajar: ");
        nt = input.nextInt();

        Ejercicio5 triangulos[] = new Ejercicio5[nt];

        for (int i = 0; i < triangulos.length; i++) {
            System.out.println("\nDigite los valores para el Triangulo #"+(i+1));
            System.out.print("Digite la Base: ");
            base = input.nextDouble();
            System.out.print("Digite el Lado: ");
            lado = input.nextDouble();

            triangulos[i] = new Ejercicio5(base,lado);

            System.out.printf("\nEl Perimetro del Triangulo es: %,.0f\nEl Area del Triangulo es: %,.0f\n",triangulos[i].getPerimetro(),triangulos[i].getArea());
        }
        System.out.printf("\nEl area del triangulo de mayor superficie es: %,.2f%n",mayorArea(triangulos));

        input.close();
    }
}
