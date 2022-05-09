package edu.poniperro;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class CalculadoraTest {

    ICalculadora calculadora = null;
    private static final double DELTA = 1e-15;

    @Before
    public void setup() {
        calculadora = new Calculadora();
    }

    @Test
    public void testSuma() {
        assertEquals(4, calculadora.sumar(2, 2), DELTA);
        assertEquals(-4, calculadora.sumar(-2, -2), DELTA);
    }

    @Test
    public void testResta() {
        assertEquals(4, calculadora.restar(6, 2), DELTA);
        assertEquals(-8, calculadora.restar(-10, -2), DELTA);
    }

    @Test
    public void testMultiplicacion() {
        assertEquals((long)1000, (long)calculadora.multiplicar(100, 10));
    }

    @Test
    public void testDivisio() {
        assertEquals((long)100, (long)calculadora.dividir(1000, 10));
    }
    
}
