package f20220526;

import com.sun.jdi.IntegerValue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ColeccionArrayList {

    public static void main(String[] args) {

        //ArrayList
        // Los ArrayList se caracterizan por ser dinamicos, es decir, Que pueden aumentar su cantidad de datos
        // Arreglo de tipo Objeto
        // PalabraReservada <TipoDato> NombreVariable

        ArrayList<String> colores = new ArrayList<String>();
        ArrayList<Integer> numerosPares = new ArrayList<Integer>();

        // Agrega un elemento a la lista
        colores.add("Rojo");
        colores.add("verde");
        colores.add(1, "morado"); // Desplaza el valor existente hacia la derecha

        // se puede imprimir el conteniudo directamente, al contrario de los arrays estaticos que se necesitan librerias
        System.out.println(colores);

        // Acceder a un elemento
        System.out.println(colores.get(2));

        // tamaño del arreglo size
        System.out.println(colores.size());

        // para modificar o reemplazar un valor en un aposicion es mediante el metodo set
        colores.set(2, "amarillo");
        System.out.println(colores);

        // Recorrer un arreglo dinamico con for
        for (int i = 0; i < colores.size(); i++) {
            System.out.println(colores.get(i));
        }

        System.out.println("*************************");

        // Recorrer un arreglo dinamico for-each
        for (String i : colores) {
            System.out.println(i);
        }

        // Ordena el arreglo de forma ascente
        Collections.sort(colores);


        // Para eliminar un elemento se debe utilizar el metodo remove
        colores.remove(2);
        System.out.println(colores);

        // Quitar todos los elementos del arreglo
        colores.clear();
        System.out.println(colores);

        numerosPares.add(4);
        numerosPares.add(2);
        numerosPares.add(6);
        numerosPares.add(10);
        numerosPares.add(8);

        System.out.println(numerosPares);

        Collections.sort(numerosPares);
        System.out.println(numerosPares);

        System.out.println("**************");

        // Invierte el orden de los elementos, pero NO ordena de manera desendente
        // Este metodo lo ocuparemos simpre a posterior del sort para obtener los elementos de manera desendente
        Collections.reverse(numerosPares);
        System.out.println(numerosPares);
    }
}
