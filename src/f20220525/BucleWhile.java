package f20220525;

import java.util.Scanner;

public class BucleWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la opcion. \n (1) Entrar \n (0) salir");
        int opcion = sc.nextInt(); // Capturando ingreso por consola

        // Valida que la condición sea true
        while (opcion != 1 && opcion != 0) {
            System.out.println("Ingrese una opcion valida. \n (1) Entrar \n (2) salir");
            opcion = sc.nextInt();
        }
    }
}
