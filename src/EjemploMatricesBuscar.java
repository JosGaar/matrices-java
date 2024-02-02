public class EjemploMatricesBuscar {
    public static void main(String[] args) {

        int[][] matrizEnteros = {
                {35, 90, 3, 1978},
                {15, 2020, 10, 9},
                {67, 127, 3267, 1999}
        };

        int elementoBuscar = 9;
        boolean encontrado = false;

        int i;
        int j = 0;

        buscar:
        for (i = 0; i < matrizEnteros.length; i++) {
            for (j = 0; j < matrizEnteros[i].length; j++) {

                if (matrizEnteros[i][j] == elementoBuscar) {
                    encontrado = true;
                    break buscar;
                }

            }
        }

        if (encontrado) {
            System.out.println("se ha encontrado " + elementoBuscar + " en las coordenadas [" + i + ", " + j + "]");
        } else {
            System.out.println("no se encontro en la matriz");
        }

    }
}
