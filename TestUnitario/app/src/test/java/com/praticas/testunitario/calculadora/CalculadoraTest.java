package com.praticas.testunitario.calculadora;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    public Calculadora calculadoraNull;
    public Calculadora calculadora;

    @Before
    public void setUp(){
        calculadora = new Calculadora();
        System.out.println("Se ha ejecutado setUp()");
    }

    @After
    public void tearDown(){
        calculadora =null;
        System.out.println("Se ha ejecutado setUp tearDown()");
    }

    @Test
    public void calculadoraNotNullTest() {
        Assert.assertNotNull("Calculadora debe ser null", calculadora);
        System.out.println("Se ha ejecutado el test calculadoraNullTest");
    }

    @Test
    public void sumarTestExplicado(){
        //Setup
        Calculadora calculadoraPrueba = new Calculadora();
        int resultadoExperado = 30;
        int resultadoActual;
        //Accion
        resultadoActual = calculadoraPrueba.sumar(10,20);
        //Assert
        //Assert.assertEquals(resultadoExperado, resultadoActual);
        Assert.assertEquals(30, calculadoraPrueba.sumar(10,20));
        System.out.println("Se ha ejecutado sumarTestExplicado()");
    }

    @Test
    public void calculadoraNullTest() {
        Assert.assertNull("Calculadora debe ser null", calculadoraNull);
        System.out.println("Se ha ejecutado el test calculadoraNullTest");
    }

    @Test
    public void ejemploAssert() {
        Assert.assertTrue(1==1);
        Assert.assertFalse(1==2);

        Assert.assertNotNull(calculadora);
        //Assert.assertNull(calculadora);

        Calculadora calculadora1 = new Calculadora();
        Calculadora calculadora2 = new Calculadora();
        Calculadora calculadora3 = calculadora1;

       // Assert.assertSame(calculadora1, calculadora2);
        Assert.assertSame(calculadora1, calculadora3);
        Assert.assertNotSame(calculadora1, calculadora2);

        Assert.assertEquals("a","a");
        Assert.assertEquals("Esto es una prueba AssertEquals","Fa","Fa");

       // Assert.fail("Fallo detectado Manualmente");

    }

    @Test
    public void sumar() {
        //SetUp
        int a = 10;
        int b = 20;
        int resultadoEsperado = 30;
        int resultado;
        //Accion
        resultado = calculadora.sumar(a,b);
        //Assert
        Assert.assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void restar() {
    }

    @Ignore("Metodo no listo. Ignorar por ahora ejemplo!")
    @Test(timeout = 600)
    public void operacionLargaDuracion_TimeOut_Test() {
       calculadora.operadoraLargaDuracion();
    }


}