package com.exercise.figuras;

public class Trapecio {

    double baseMenor;
    double baseMayor;
    double altura;

    double lado1;
    double lado2;

    public Trapecio(double baseMenor, double baseMayor, double altura, double lado1, double lado2) {
        this.baseMenor = baseMenor;
        this.baseMayor = baseMayor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    double calcularArea(){
        return ((baseMayor+baseMenor)/2) * altura;
    }

    double calcularPerimetro(){
        return baseMenor+baseMayor+lado1+lado2;
    }
}
