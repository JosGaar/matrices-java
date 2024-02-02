import java.util.Scanner;

public class OcurrenciaArreglo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];

        System.out.println("digite 10 elementos");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int k = 0;
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            int contador = 0;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    contador++;
                }
            }
            if (contador > max) {
                max = contador;
                k = i;
            }
        }

        System.out.println("elemento que mas se repite " + a[k]);
        System.out.println("se repite " + (max + 1) + " veces");

    }
}
