package f20220527;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ColeccionesMap {

    public static void main(String[] args) {

        // Coleciones Map

        // Definicion o estructura de un HashMap
        //HashMap<K, V> map = new HashMap<K, V>(); entre los <> se debe entregar el tipo de dato que ingresaran
        // K es  la key o clave; V value O valor
        //HashMap mapa =new HashMap(); esta es otra opcion para escribir un HashMap y este es el mas utilizado concidera valores de tipo objetos

        HashMap objHashMap = new HashMap();

        //objHashMap.put(Clave,Valor);
        objHashMap.put("Nombre", "Fernando");
        objHashMap.put("ApellidoP", "Faúndez");
        objHashMap.put("ApellidoM", "López");
        objHashMap.put("Edad", "29");

        System.out.println("Elementos del mapa");
        System.out.println(objHashMap);

        // para imprimir valores se realiza a traves de la clave
        System.out.println(objHashMap.get("ApellidoM"));

        // Para eliminar un par de datos, es decir, se elimina Clave<->Valor
        objHashMap.remove("ApellidoM");
        System.out.println(objHashMap);

        // Como saber o ver todas las claves o llaves  de un mapa
        System.out.println(objHashMap.keySet());

        //Como Mostrar todos los valores del mapa
        System.out.println(objHashMap.values());

        // Arrays dinamico
        ArrayList<String> vocales = new ArrayList<String>();
        vocales.add("a");
        vocales.add("e");
        vocales.add("i");
        vocales.add("o");
        vocales.add("u");

        // como agregar un arrayList
        objHashMap.put("Vocales",vocales); // Para agregar un arraysList se debe agregar con el nombre fuera de comillas
        // Debido a que un arraysList es de tipo Objeto, al colocar comillas las definimos como string
        System.out.println(objHashMap);

        // Si no encuentra la clave, retorna un null
        System.out.println(objHashMap.get("Vocales"));

        System.out.println("************************************");
        //Como recorrer un HashMap
        /* Para poder recorrer con un for-eash  */
        for (Object clave:objHashMap.keySet()){
            System.out.println(clave);
            System.out.println(objHashMap.get(clave));
        }

        System.out.println("************************************");

        for(Object clave : objHashMap.keySet()) {
            System.out.println("clave: "+clave +" - valor: "+objHashMap.get(clave));

        }


        //Crear un menu de comida
        //solicitar al usuario que ingrese un plata
        // imprimimos el plato

    }
}
