package com.exercise.figuras;

public class Rectangulo {

    double base;
    double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return base*altura;
    }

    double calcularPerimetro(){
        return 2*base+2*altura;
    }
}
