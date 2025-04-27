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
        // Caso 1: a es el mayor
        assertEquals(10, calculadora.maximo(10, 5, 3));

        // Caso 2: b es el mayor
        assertEquals(15, calculadora.maximo(10, 15, 3));

        // Caso 3: c es el mayor
        assertEquals(20, calculadora.maximo(10, 5, 20));

        // Caso 4: a y b son iguales y mayores que c
        assertEquals(10, calculadora.maximo(10, 10, 5));

        // Caso 5: a, b y c son iguales
        assertEquals(7, calculadora.maximo(7, 7, 7));
    }

    @Test
    void esDivisible() {
        // Caso 1: El número es divisible por el divisor
        assertTrue(calculadora.esDivisible(10, 2));

        // Caso 2: El número no es divisible por el divisor
        assertFalse(calculadora.esDivisible(10, 3));

        // Caso 3: El divisor es 0 (debe lanzar una excepción)
        assertThrows(IllegalArgumentException.class, () -> calculadora.esDivisible(10, 0));
    }
}