import java.util.Scanner;

public class ImprimirSilla {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese un numero n");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("error");
            System.exit(1);
        }

        int[][] matriz = new int[n][n];
        int mitad = matriz.length / 2;

        for (int i = 0; i < matriz.length; i++) {
            matriz[i][0] = 1;
            matriz[mitad][i] = 1;

            if (i > mitad) {
                matriz[i][n - 1] = 1;
            }

        }

        System.out.println("matriz: ");
        for (int[] filas : matriz) {
            for (int columnas : filas) {
                System.out.print(columnas + " ");
            }
            System.out.println();
        }

    }
}
