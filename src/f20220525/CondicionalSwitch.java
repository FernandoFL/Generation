package f20220525;

import java.util.Scanner;

public class CondicionalSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //menu
        System.out.println("Ingrese Opcion");
        System.out.println(" 1 Sumar \n 2 Restar \n 3 Multiplicar \n 4 Dividir");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1: // Suma
                // Accion para la opcion 1
                System.out.println("Esta es La suma");
                break;

            case 2: // Resta
                break;

            case 3: // Multiplicación
                break;

            case 4: // División
                break;

            default:
                System.out.println("La opcion elegina no es valida");
                break;
        }

    }
}
