public class EjemploMatricesStringFor2 {
    public static void main(String[] args) {

        String[][] nombres = {{"pepe", "pepa"}, {"josefa", "paco"}, {"lucas", "apacha"}};

        System.out.println("\titerando con for each");
        for (String[] fila : nombres) {
            for (String columna : fila) {
                System.out.print(columna + "\t");
            }
            System.out.println();
        }

    }
}
