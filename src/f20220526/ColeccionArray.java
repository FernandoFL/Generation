package f20220526;

import java.util.Arrays;

public class ColeccionArray {

    public static void main(String[] args) {

        // Array o arreglo o matriz
        // Los arrays se caracterizan por ser estaticos, es decir, no crecen o no aumentan su cantidad de valores
        String[] colores = {"negro", "rojo", "azul", "verde", "amarillo", "morado",};// las array solo pueden tener un tipo de valor este caso es String no acepta numeros
        Integer[] numerosPares = {2, 4, 6, 8, 10, 12};
        int[] primerosNumeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        // posicion inicial es en cero (0)

        System.out.println(colores[0]);
        System.out.println(numerosPares[1]);
        System.out.println(primerosNumeros[2]);

        // Se asigna un nuevo valor en la posicion 3
        numerosPares[3] = 14;
        System.out.println(numerosPares[3]);

        // Arroja un error  al intentar agregar un elemento en un indice que no existe. es distinto de javascript
        //numerosPares[7]=14; // Error fuera del indice
        //System.out.println(numerosPares[3]);

        //Largo del array
        System.out.println("tamaño array Colores" + colores.length);
        System.out.println("Tamaño array numeros pares" + numerosPares.length);
        System.out.println("Tamaño array primeros numeros" + primerosNumeros.length);

        // Solo entrega informacion de el arreglo
        System.out.println(colores);
        System.out.println(numerosPares);
        System.out.println(primerosNumeros);

        // Muestra o imprime lo que contiene el Arrays
        System.out.println(Arrays.toString(colores));
        System.out.println(Arrays.toString(numerosPares));
        System.out.println(Arrays.toString(primerosNumeros));

        // Recorrer un arrays

        for (int i = 0; i < primerosNumeros.length; i++) {
            System.out.println(primerosNumeros[i] + " ");
        }

        // Otra opcion para recorrer un arrays
        //for-each
        for (int i:primerosNumeros) {
            System.out.println(i);
        }

        for (String i: colores) {
            System.out.println(i);
        }

    }
}
