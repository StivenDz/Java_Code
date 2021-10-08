import javax.swing.JOptionPane;

public class All_Ejercicios_Condicionales {
    public static void main(String[] args) {
        // Ejercicio 1: pedir un numero y mostrar en pantalla si es multiplo de 10 o no
        int numero;

        numero =Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        if(numero%10 == 0){
            JOptionPane.showMessageDialog(null,"El numero " + numero +" es multiplo de 10");
        }else{JOptionPane.showMessageDialog(null,"El numero " + numero +" no es multiplo de 10");}


        // Ejercicio 2: pedir dos numeros y decir cual es el mayor o si son iguales


        // Ejercicio 3: Determinar si una letra es mayuscula o no

        char letra;

        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);

        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null,"Esta es una letra mayuscula");
        }else{JOptionPane.showMessageDialog(null,"Esta no es una letra mayuscula");}

        // Ejercicio 4: en megaplaza se hace 20% de descuento a los clientes cuya compra supere los 300 Dollars
        // ¿cual sera la cantidad que pagará una persona por su compra?

        // Ejercicio 5: un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
        // si trabaja 40 horas o menos se le paga $16 por hora
        // si trabaja mas de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra

        // Ejercicio 6: hacer un programa que tome dos numeros y diga si ambos son pares o impares

        // Ejercicio 7: pedir tres numero y mostrarlos de mayor a menor

        int a,b,c;

        a = Integer.parseInt((JOptionPane.showInputDialog("Digite un numero: ")));
        b = Integer.parseInt((JOptionPane.showInputDialog("Digite un numero: ")));
        c = Integer.parseInt((JOptionPane.showInputDialog("Digite un numero: ")));

        if ((a>b) && (b>c)){
            JOptionPane.showMessageDialog(null,"Orden: "+a+" - "+b+" - "+c);
        }else if((a>c) && (c>b)){
            JOptionPane.showMessageDialog(null,"Orden: "+a+" - "+c+" - "+b);
        }else if ((b>a)&&(a>c)){
            JOptionPane.showMessageDialog(null,"Orden: "+b+" - "+a+" - "+c);
        }else if ((b>c)&&(c>a)){
            JOptionPane.showMessageDialog(null,"Orden: "+b+" - "+c+" - "+a);
        }else if ((c>a)&&(a>b)){
            JOptionPane.showMessageDialog(null,"Orden: "+c+" - "+a+" - "+b);
        }else{
            JOptionPane.showMessageDialog(null,"Orden: "+c+" - "+b+" - "+a);
        }

        // Ejercicio 8: pedir un numero entre 0 y 99,999 y decir cuantas cifras tiene

        // Ejercicio 9: validar dia, mes y año

        int dia,mes,año;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));

        if((dia>=1) && (dia<=30)){
            if ((mes>=1) && (mes<=12)){
                if (año != 0){
                    JOptionPane.showMessageDialog(null,"La fecha es ¡Correcta!");
                }else{JOptionPane.showMessageDialog(null,"El año es ¡Incorrecto!");}
            }else{
            JOptionPane.showMessageDialog(null,"El mes es ¡Incorrecto!");
        }
        }else{
            JOptionPane.showMessageDialog(null,"El dia es ¡Incorrecto!");
        }

        // Ejercicio 10: validar dia, mes y año, con meses de 28, 30 y 31 dias sin años bisiestos

        //Ejercicio 11: Calculadora

        int numero1, numero2,suma,resta,mult,div;
        char operacion;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        operacion = JOptionPane.showInputDialog("Digite la operacion que desea realizar: ").charAt(0);

        switch (operacion) {
            case 's': 
            case 'S':suma = numero1 + numero2;
            JOptionPane.showMessageDialog(null,"La suma es: "+suma);
                break;    
            case 'r':
            case 'R':resta = numero1 - numero2;
            JOptionPane.showMessageDialog(null,"La resta es: "+resta);
                break;
            case 'p':
            case 'P':
            case 'm':
            case 'M':mult = numero1 * numero2;
            JOptionPane.showMessageDialog(null,"La multiplicacion es: "+mult);
                break;
            case 'd':
            case 'D':div = numero1 / numero2;
            JOptionPane.showMessageDialog(null,"La division es: "+div);
                break;    
            default:JOptionPane.showMessageDialog(null,"¡Error, se qeuivocó de operacion!");
                break;
        }

        // Ejercicio 12: pedir una nota de cero a 10 y despues mostrarla de la forma:
        // insuficiente, suficiente, bien, notable y sobresaliente

        /* Cajero Automatico:

        hacer un programa que simule un cajero automatico con un saldo inicial de 1000 dollars
        , con el siguiente menu de opciones:


        1. Ingresar dinero a la cuenta
        2. Retirar dinero de la cuenta
        3. salir

        */

        final int saldo_inicial = 1000;
        int opcion;
        float ingreso, saldo_actual, retiro;
        boolean salir = false;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido A Su Cajero Automatico\n"
            + "1. Ingresar dinero a la cuenta\n"
            + "2. Retirar dinero de la cuenta\n"
            + "3. Salir"));

            switch (opcion) {
                case 1: ingreso = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea ingresar en la cuenta: "));
                            saldo_actual = saldo_inicial + ingreso;
                            JOptionPane.showMessageDialog(null,"Dinero en su cuenta: "+saldo_actual);
                    break;

                case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea retirar en la cuenta: "));
                        if (retiro>saldo_inicial){JOptionPane.showMessageDialog(null,"No cuenta con el saldo suficiente para este retiro\n Usted posee: "+ saldo_inicial + " en su cuenta");}
                        else{saldo_actual = saldo_inicial - retiro;
                            JOptionPane.showMessageDialog(null,"Dinero en su cuenta: "+saldo_actual);}
                    break;

                case 3 : JOptionPane.showMessageDialog(null,"¡Gracias por utilicar nuestros servicios!");
                            salir = true;
                    break;
                default: JOptionPane.showMessageDialog(null,"¡Opcion Incorrecta!");
                    break;
            }
            
        } while (!salir);

        // Ejercicio 14: Hacer un programa que pase de Kg a otra unidad de medida de masa,
        // mostrar en pantalla con las opciones posibles
    }
}
