package com.praticas.testunitario.calculadora;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

@RunWith(value = Parameterized.class)
public class CalculadoraParametrizadaTest {

    private int numero1;
    private int numero2;
    private int resultadoEsperado;
    private Calculadora calculadora;

    @Parameterized.Parameters
    public static Iterable<Object[]> obtenerDatosPruebaTest(){
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{6,2,8});
        list.add(new Object[]{6,3,9});
        list.add(new Object[]{6,4,10});
        list.add(new Object[]{6,10,16});
        return list;
    }
    public CalculadoraParametrizadaTest(int a,int b,int c){
        numero1 = a;
        numero2 = b;
        resultadoEsperado = c;
    }

    @Before
    public void setUp(){
        calculadora = new Calculadora();
    }

    @Test
    public void dividirTest(){
        Assert.assertEquals(resultadoEsperado, calculadora.sumar(numero1,numero2));
    }


}
