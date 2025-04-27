package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @AfterEach
    void tearDown() {
        calculadora = null;
    }


    @Test
    void suma() {
        assertEquals(5, calculadora.suma(2, 3));
        assertEquals(-1, calculadora.suma(-2, 1));
    }

    @Test
    void resta() {
        assertEquals(1, calculadora.resta(3, 2));
        assertEquals(-3, calculadora.resta(-2, 1));
    }

    @Test
    void multiplicacion() {
        assertEquals(6, calculadora.multiplicacion(2, 3));
        assertEquals(0, calculadora.multiplicacion(0, 5));
    }

    @Test
    void division() {
        try{
            assertEquals(2, calculadora.division(6, 3));
            assertEquals(0, calculadora.division(0, 5));
        } catch (IllegalArgumentException e) {
            fail("No se esperaba una excepción: " + e.getMessage());
        }
    }

    @Test
    void esPar() {
        assertTrue(calculadora.esPar(4));
        assertFalse(calculadora.esPar(5));
    }

    @Test
    void maximo() {
    }

    @Test
    void esDivisible() {
    }
}