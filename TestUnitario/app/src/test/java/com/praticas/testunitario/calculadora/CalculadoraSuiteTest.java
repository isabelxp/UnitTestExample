package com.praticas.testunitario.calculadora;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value = Suite.class)
@Suite.SuiteClasses({
        CalculadoraParametrizadaTest.class,
        CalculadoraTest.class
})
public class CalculadoraSuiteTest {
}
