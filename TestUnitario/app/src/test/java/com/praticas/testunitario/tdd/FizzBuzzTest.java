package com.praticas.testunitario.tdd;

import com.praticas.testunitario.mockitomvp.LoginModel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    /**
     * //////////////////////////ESPECIFICACION////////////////////////////
     * 1.- Si es divisible por 3 entonces devolver "Fizz"
     * 2.- Si es divisible por 5 entonces devolver "Buzz"
     * 3.- Si es divisible por 3 y 5 entonces devolver "FizzBuzz"
     * 4.- Si nada de lo de arriba ocurre devolver el numero en String
     *
     */
    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception{
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void of_0is0(){
        Assert.assertEquals("0", fizzBuzz.of(0));
    }

}