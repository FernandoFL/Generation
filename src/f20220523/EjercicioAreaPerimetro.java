package f20220523;

public class EjercicioAreaPerimetro {

    public static void main(String[] args) {
        // Calculo área Triangulo
        //variables estaticas

        System.out.println("***************************************************");
        System.out.println("*                 Calculo de Area                 *");
        System.out.println("***************************************************");

        // Área triángulo = ((base * altura)/2)
        float base = 12f;
        float altura = 14f;
        final int divisor = 2;

        double areaTriangulo = ((base * altura) / divisor);

        System.out.println("*                                                 *");
        System.out.println("*         El area del triangulo es: " + areaTriangulo + "          *");
        System.out.println("*                                                 *");

        // Calculo perimetro circulo

        System.out.println("***************************************************");
        System.out.println("*              Calculo de Perimetro               *");
        System.out.println("***************************************************");

        // Perimetro circulo = pi * diametro
        final float pi = 3.1416f;
        float diametro = 15;

        double perimetroCirculo = pi * diametro;

        System.out.println("*                                                 *");
        System.out.println("* El perimetro del circulo es: " + perimetroCirculo + "  *");
        System.out.println("*                                                 *");
        System.out.println("***************************************************");
    }
}
