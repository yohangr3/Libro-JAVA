package com.exercise.figuras;

public class Rombo {

    double diagonal1;
    double diagonal2;

    double lado;

    public Rombo(double diagonal1, double diagonal2,double lado) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.lado = lado;
    }

    double calcularArea(){
        return (diagonal1 * diagonal2)/2;
    }

    double calcularPerimetro(){
        return lado*4;
    }
}
