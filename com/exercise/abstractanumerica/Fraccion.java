package com.exercise.abstractanumerica;


/**
public class Fraccion extends Numerica{

    int numerador;
    int denominador;

    public Fraccion() {
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    @Override
    public String toString() {

        return "Numerador " + numerador + ", denominador " + denominador ;
    }

    @Override
    public boolean equals(Object ob) {
        if(!(ob instanceof Fraccion))
            return false;
        Fraccion other = (Fraccion)ob;
         if (denominador != other.denominador || numerador != other.numerador) {
            return false;
        }
         return true;

    }

     @Override
    public Numerica sumar(Numerica numero) {
        Fraccion other = (Fraccion)numero;
        if(numero instanceof Fraccion)
            return null;


    }

    @Override
    public Numerica restar(Numerica número) {
        return null;
    }

    @Override
    public Numerica multiplicar(Numerica número) {
        return null;
    }

    @Override
    public Numerica dividir(Numerica número){
        return null;
        }

}**/
