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
    }

    @Test
    void resta() {
    }

    @Test
    void multiplicacion() {
    }

    @Test
    void division() {
    }

    @Test
    void esPar() {
    }

    @Test
    void maximo() {
    }

    @Test
    void esDivisible() {
    }
}