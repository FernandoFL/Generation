package f20220525.f20220524;

import java.util.Scanner;

public class Condicionales {

    public static void main(String[] args) {
        // Esta libreria nos permite capturar valores por consola
        Scanner sc = new Scanner(System.in);
/*
        // Validar la mayoria de edad
        // Establecer punto critico --> mayoria de edad a partir de los 18 años

        int mayoriaEdad = 18;

        // Solicitar el ingreso de edad

        System.out.println("ingrese su edad");

        int edad = sc.nextInt(); // Se esta capturando el valor ingresado por consola y quedará almacenada en la variable edad.

        if (edad >= mayoriaEdad) {
            System.out.println("Usted es mayor de edad");
        } else {
            System.out.println("No esta permitido su ingreso");
        }

*/

        /*solicitar todos los string
         * nombre, apellido, direccion
         * numerico
         * edad,numero, direccion
         * saldo (S)
         * vamos a validar
         * que el usuario sea mayor de edad
         * saldo ($) 50000 en bolsillo minimo ($) 10000"no puede realizar apuestas"
         * cuanto apostara ($) 10000 minimo "no puede realizar apuestas"
         *
         */

        //Variables
        //Nombre
        System.out.println("Ingrese su Nombre: ");
        String nombre = sc.nextLine();

        //Apellido
        System.out.println("Ingrese su Apellido: ");
        String apellido = sc.nextLine();

        //Dirección
        System.out.println("Ingrese su direccion: ");
        String direccion = sc.nextLine();

        //Numeración
        System.out.println("Ingrese su numeración: ");
        int numeroDireccion = sc.nextInt();

        //Edad
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();

        // Saldo
        System.out.println("Ingrese su saldo: ");
        int saldo = sc.nextInt();

        //Mayoria edad y saldo mínimo de ingreso
        final int mayoriaEdad = 18;
        final int saldoMinIngreso = 50000;
        final int montoMinApuesta = 10000;

        if (edad >= mayoriaEdad && saldo >= saldoMinIngreso) {
            System.out.println("Cumples con los requisitos!");

            // Inicia Apuestas
            System.out.println("********MENU APUESTA*********");
            System.out.println("Jugador: " + nombre + " Saldo: " + saldo);

            System.out.println(nombre + " ingresa tu monto de apuesta: ");
            int apuesta = sc.nextInt();

            //Validación monto minimo de apuesta
            if (apuesta >= montoMinApuesta) {
                System.out.println("Apuesta Aprobada");
            } else {
                System.out.println("No cumples el monto minimo de apuesta");
            }
        } else {
            System.out.println("No cumples con los requisitos minimos para ingresar");
        }
    }
}
