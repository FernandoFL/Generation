package f20220525;

import java.util.Scanner;

public class BucleDoWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // DoWhile
        // Este bucle se ejecutará al menos una vez
        // las variables deben estar fuera del "do" para que el while la reconosca
        int opcion = 0;
        do {
            System.out.println(" (0) salir \n (1) sumar \n (2) restar \n (3) multiplicar \n (4) dividir");
            opcion = sc.nextInt();

        }while(opcion < 0 || opcion > 4); // Se repite mientras la condicion sea verdadera

    }
}
