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
    }
    
}
