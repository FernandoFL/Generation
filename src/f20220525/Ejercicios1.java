package f20220525;

import java.util.Scanner;

public class Ejercicios1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Solicitud de datos al usuario
        //Solicitar edad
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        int opcion;

        while (edad <= 18) {
            System.out.println("ingrese una edad valida");
            edad = sc.nextInt();
        }

        if (edad >= 70) {
            opcion = 1;
        } else if (edad >= 50) {
            opcion = 2;
        } else if (edad >= 30) {
            opcion = 3;
        } else {
            opcion = 4;
        }

        switch (opcion) {
            case 1:
                System.out.println("Valor Prima $500");
                break;
            case 2:
                System.out.println("Valor Prima $400");
                break;
            case 3:
                System.out.println("Valor Prima $250");
                break;
            case 4:
                System.out.println("Valor Prima $100");
        }

        // esta es la version corta del switch
        /*switch (opcion) {
            case 1 -> System.out.println("Valor Prima $500");
            case 2 -> System.out.println("Valor Prima $400");
            case 3 -> System.out.println("Valor Prima $250");
            case 4 -> System.out.println("Valor Prima $100");    */
    }
}