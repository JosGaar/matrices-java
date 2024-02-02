public class EjemploMatricesStringFor {
    public static void main(String[] args) {

        String[][] nombres = new String[3][2];
        nombres[0][0] = "pepe";
        nombres[0][1] = "pepa";
        nombres[1][0] = "josefa";
        nombres[1][1] = "paco";
        nombres[2][0] = "lucas";
        nombres[2][1] = "apacha";

        System.out.println("\titerando con for: ");
        for (int i = 0; i < nombres.length; i++) { // filas
            for (int j = 0; j < nombres[i].length; j++) { // columnas de acuerdo a la fila
                System.out.println("nombres " + i + " : " + nombres[i][j]);
            }
        }

        System.out.println("\titerando con for each");
        for (String[] fila : nombres) {
            for (String columna : fila) {
                System.out.print(columna + "\t");
            }
            System.out.println();
        }

    }
}
