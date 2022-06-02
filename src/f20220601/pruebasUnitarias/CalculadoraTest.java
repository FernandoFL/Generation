package f20220601.pruebasUnitarias;

import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void suma() {
        Calculadora cal = new Calculadora();
        int resultado = cal.suma(2, 2); //4
        assertEquals(4, resultado);
    }

    @Test
    public void resta() {
    }

    @Test
    public void multiplicacion() {
    }

    @Test
    public void division() {
    }

    @Test
    public void numParImpar() {
        Calculadora cal = new Calculadora();
        String resultado = cal.numParImpar(1);
        if (Objects.equals(resultado, "Es par")) {
            assertEquals("Es par",resultado);
            System.out.println(resultado);
        }   else {
            assertEquals("Es Impar",resultado);
            System.out.println(resultado);
        }
    }
}