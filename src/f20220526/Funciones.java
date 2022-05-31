package f20220526;

import java.sql.DatabaseMetaData;

public class Funciones {

    public static void main(String[] args) {
        // Funciones
        // Existen 4 tipos de funciones
        // Solo 2 devuelven o retornan un valor
        // Las otras 2 no retornan nada
        // Los nombres de las funciones la primera letra siempre debe ir en minuscula

        saludo();
        calculoSumaPares(23, "33", 44l);
        boolean mayorOMenor = valorMayorEdad(18);
        if (mayorOMenor){
            System.out.println("Puede ingresar al curso");
        }else {
                System.out.println("No puede ingresar al curso");
            }
    }

    // Las funciones se deben declarar fuera del corchete del main
    // Estructura de una funcion
    // [accesador][Tipo de Retorno][Nombre de la Funcion](parametros a recibir){ Codigo que ejecutara la funcion}

    public static void calculoSumaPares(int num1, String num2, long num3) { // Esta funcion no devuelve nada
        int num4 = Integer.parseInt(num2);

        System.out.println(num1 + num4 + num3);
    }

    // El static nos permite acceder al metodo
    public static void saludo() { // Esta funcion no retorna nada
        // Solicitar el ingreso de datos
        System.out.println("Buenos dias");
    }

    // Funciones que retornan un tipo de datos
    public Integer obtenerEdad() { // Esta funcion devuelve el valor de la variable edad
        Integer edad = 18;
        return edad;
    }

    public static Boolean valorMayorEdad(Integer edad) { // Esta funcion devuelve un valor boolean
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
