import java.util.Scanner;

public class ImprimirX {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tamanioMatriz = 0;

        do {
            System.out.println("ingrese el tamaño de la matriz > 0: ");
            tamanioMatriz = sc.nextInt();
        } while (tamanioMatriz == 0);

        String[][] matriz = crearMatriz(tamanioMatriz);
        agregarValoresMatriz(matriz);
        mostrarMatriz(matriz);
    }

    public static String[][] crearMatriz(int tamanioMatriz) {
        return new String[tamanioMatriz][tamanioMatriz];
    }

    public static void agregarValoresMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    matriz[i][j] = "x";
                } else {
                    matriz[i][j] = "_";
                }
            }
        }

        int cont = matriz[0].length - 1;
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][cont--] = "x";
        }
    }

    public static void mostrarMatriz(String[][] matriz) {
        System.out.println("matriz: ");
        for (String[] filas : matriz) {
            for (String columnas : filas) {
                System.out.print(columnas + " ");
            }
            System.out.println();
        }
    }


}
