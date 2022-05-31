package f20220526;

public class LibreriaMath {

    public static void main(String[] args) {
        // Libreria Math

        // Elevar o potencia
        double numElevado = Math.pow(4.5, 3);
        System.out.println(numElevado);

        double enteroMayor = Math.ceil(numElevado); // Redondeo al entero mayor
        System.out.println(enteroMayor);

        double enteroMenor = Math.floor(numElevado); // Redondeo al entero menor
        System.out.println(enteroMenor);

        double numRedondeoAuto = Math.round(numElevado); // Redondeo automatico ya sea hacia arriba o hacia abajo, concidera los decimales
        System.out.println(numRedondeoAuto);

        // Numeros Aleatorios

        double aleatorio = Math.random(); // Random  genera numeros mayores a 0.0 y menores a 1.0
        System.out.println(aleatorio);

        // numeros aleatorios entre  0 y 10

        double num010 = Math.random() * 10; // para generar numeros aleatorios solo basta multiplicarlo por el numero mayor
        System.out.println(num010);

        // numeros aleatorios 2 y 8

        double num28 = (Math.random() * (8 - 2)) + 2; /* random se multiplica por el limite superior  al cual se le resta el valor del limite inferiro y a eso se le suma el limite inferiro*/
        System.out.println(num28);

        // numeros aleatorios entre  -4 y 4

        double numNegPos = (Math.random() * (4 - (-4))) + (-4);
        System.out.println(numNegPos);
    }
}
