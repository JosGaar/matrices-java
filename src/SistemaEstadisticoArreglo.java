import java.util.Scanner;

public class SistemaEstadisticoArreglo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        int pos = 0, neg = 0, ceros = 0, cantPos = 0, cantNeg = 0;

        System.out.println("ingrese 7 elementos");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] > 0) {
                pos += arr[i];
                cantPos++;
            }

            if (arr[i] < 0) {
                neg += arr[i];
                cantNeg++;
            }

            if (arr[i] == 0) {
                ceros++;
            }
        }

        if (cantPos > 0) {
            System.out.println("el promedio de los positivo es: " + pos / cantPos);
        } else {
            System.out.println("no hay positivos");
        }

        if (cantNeg > 0) {
            System.out.println("el promedio de los negativos es: " + neg / cantNeg);
        } else {
            System.out.println("no hay negativos");
        }

        if (ceros > 0) {
            System.out.println("la cantidad de ceros son: " + ceros);
        } else {
            System.out.println("no hay ceros");
        }

    }
}
