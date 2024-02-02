import java.util.Scanner;

public class NumeroAlto {
    public static void main(String[] args) {

        /*
        Escriba un programa que imprima el número más alto de un arreglo de 7
         elementos (de rango 11 a 99), por ejemplo {14, 33, 15, 36, 78, 21, 43},
         si se repite un valor considerar uno solo.
         */

        Scanner sc = new Scanner(System.in);
        int[] a = new int[7];
        int num = 0;

        System.out.println("ingrese 7 numeros (de 11 a 99)");
        for (int i = 0; i < a.length; i++) {
            num = sc.nextInt();
            if (num > 11 && num < 99) {
                a[i] = num;
            } else {
                System.out.println("ingrese solo en el rango pedido");
                i--;
            }
        }

        int max = 0;
        for (int i = 0; i < a.length; i++) {
            max = (a[max] > a[i]) ? max : i;
        }

        System.out.println("el mayor es: " + a[max]);

    }
}
