package com.gfrozza.aula;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    void somaTeste() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.soma(10,5);
        Assertions.assertEquals(15, resultado);
    }

}
