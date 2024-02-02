public class EjemploMatricesSimetrica {
    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3, 4},
                {2, 1, 0, 5},
                {3, 0, 1, 6},
                {4, 5, 6, 7}
        };

        boolean simetrica = true;

        // utilizando while
        int i = 0, j;
        salir:
        while (i < matriz.length) {
            j = 0;
            while (j < i) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break salir;
                }
                j++;
            }
            i++;
        }

        // utilizando for
        salir:
        for (int k = 0; k < matriz.length; k++) {
            for (int l = 0; l < k; l++) {
                if (matriz[k][l] != matriz[l][k]) {
                    simetrica = false;
                    break salir;
                }
            }
        }

        if (simetrica) {
            System.out.println("la matriz es simetrica");
        } else {
            System.out.println("la matriz no es simetrica");
        }

    }
}
