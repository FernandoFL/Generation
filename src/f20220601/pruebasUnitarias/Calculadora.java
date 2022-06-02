package f20220601.pruebasUnitarias;

public class Calculadora {

    // Crear los 4 metodos basicos

    // Metodo Suma
    public int suma(int num1, int num2) {
        return num1 + num2;
    }

    // Metodo Resta
    public int resta(int num1, int num2) {
        return num1 - num2;
    }

    // Metodo Multiplicación
    public int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    // Metodo Suma
    public String division(int num1, int num2) {
        if (num2 != 0) {
            String resultado = Integer.toString(num1 / num2);
            return resultado;
        }
        return ("No se puede dividir por cero");
    }

    // Metodo numero par
    public String numParImpar(int num1) {
        String resultado;
        if (num1 % 2 == 0) {
            resultado = "Es par";
        } else {
            resultado = "Es Impar";
        }
        return resultado;
    }
}
