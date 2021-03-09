package com.praticas.testunitario.calculadora;

public class Calculadora {

    int resultado;

    public int sumar(int numero1, int numero2){
        return resultado = numero1 + numero2;
    }

    public int restar(int numero1, int numero2){
        return resultado = numero1 - numero2;
    }

    //No deberia estar aqui sino en otra clase, solo por prueba!
    public void operadoraLargaDuracion(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
