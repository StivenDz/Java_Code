

public class main2 {
    public static void main(String[] args) {
        Operacion2 op2 = new Operacion2();
        int a = 5, b = 7;


        System.out.printf("\nLa suma de %d + %d = %d",a,b,op2.sumar(a, b)); // a y b son metodos
        System.out.printf("\nLa resta de %d - %d = %d",a,b,op2.restar(a, b));
        System.out.printf("\nLa multiplicacion de %d * %d = %d",a,b,op2.multiplicar(a, b));
        System.out.printf("\nLa division de %d / %d = %d",a,b,op2.dividir(a, b));
    }
}
