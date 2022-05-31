package f20220526;

import java.util.Scanner;

public class CalculadoraFunciones {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // generar la calculadora con lo aprendido.
        // debe tener las 4 funciones basicas y averigual si los valores son pares o impares con la operacion de resto+
        int num1;
        int num2;
        int opcion;

        System.out.println("ingrese un numero");
        num1 = sc.nextInt();
        System.out.println("ingrese un segundo numero");
        num2 = sc.nextInt();



        do {
            System.out.println(" (0) salir \n (1) sumar \n (2) restar \n (3) multiplicar \n (4) dividir \n (5) resto");

            opcion = sc.nextInt();

        }while (opcion < 0 || opcion > 5 );

        switch (opcion) {
            case 0://SALIR
                //accion para la opcion 0
                System.out.println("+-+-+-+ Vuelva Pronto :) +-+-+-+");
                break;
            case 1://sumar
                //accion para la opcion 1
                System.out.println("+----Suma----+");
                System.out.println(num1 + " + " + num2 + " = " + suma(num1,num2));
                break;
            case 2://resta
                //accion para la opcion 2
                System.out.println("----Resta----");
                System.out.println(num1 + " - " + num2 + " = " + resta(num1,num2));
                break;
            case 3://multiplicacion
                //accion para la opcion 3
                System.out.println("----Multiplica----");
                System.out.println(num1 + " * " + num2 + " = " + multiplicacion(num1,num2));
                break;
            case 4://division
                //accion para la opcion 4
                System.out.println("----Divide----");
                System.out.println(num1 + " / " + num2 + " = " + division(num1,num2));
                break;
            case 5://resto
                //accion para la opcion 5
                System.out.println("----Resto----");
                System.out.println(num1 + " % " + num2 + " = " + resto(num1,num2));
                break;

            default:
                System.out.println("opcion invalida, por favor ingrese un numero del 0 al 5.");
                break;
        }

        //System.out.println(suma(2, 3));
    }

    // Suma
    public static double suma(double num1, double num2) {
        return (num1 + num2);
    }

    // Resta
    public static double resta(double num1, double num2) {
        return (num1 - num2);
    }

    // Multiplicación
    public static double multiplicacion(double num1, double num2) {
        return (num1 * num2);
    }

    // Division
    public static double division(double num1, double num2) {
        return (num1 / num2);
    }

    //Funcion resto
    public static Double resto (double num1, double num2) {
        return (num1 % num2);
    }
}

