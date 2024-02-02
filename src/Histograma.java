import java.util.Scanner;

public class Histograma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] histo = new int[12];

        System.out.println("digite elementos del 1 al 6");
        for (int i = 0; i < histo.length; i++) {
            histo[i] = sc.nextInt();
        }

        int[] iteraciones = new int[12];
        for (int i = 0; i < histo.length; i++) {
            int contador = 0;
            for (int j = 0; j < histo.length; j++) {
                if (histo[i] == histo[j]) {
                    contador++;
                }
            }
            iteraciones[i] = contador;
        }

        int[] arreglo = new int[6];

        for (int i = 0; i < iteraciones.length; i++) {
            if (histo[i] == 1) {
                arreglo[0] = iteraciones[i];
            }
            if (histo[i] == 2) {
                arreglo[1] = iteraciones[i];
            }
            if (histo[i] == 3) {
                arreglo[2] = iteraciones[i];
            }
            if (histo[i] == 4) {
                arreglo[3] = iteraciones[i];
            }
            if (histo[i] == 5) {
                arreglo[4] = iteraciones[i];
            }
            if (histo[i] == 6) {
                arreglo[5] = iteraciones[i];
            }
        }

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > 0) {
                System.out.print((i + 1)+ ": ");
                for (int j = 0; j < arreglo[i]; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print((i + 1) + ": ");
            }
            System.out.println();
        }

    }
}
