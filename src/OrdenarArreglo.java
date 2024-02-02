import java.util.Scanner;

public class OrdenarArreglo {
    public static void main(String[] args) {

        /*¨
        Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos.
        Luego debemos mostrarlos en el siguiente orden: el último, el primero, el penúltimo,
        el segundo, el antepenúltimo, el tercero, y así sucesivamente.
         */

        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];

        System.out.println("ingrese 10 numeros: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < a.length/2; i++) {
            System.out.println(a[a.length - 1 - i] + " " + a[i]);
        }

    }
}
