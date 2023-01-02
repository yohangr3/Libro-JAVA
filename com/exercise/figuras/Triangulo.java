package com.exercise.figuras;

public class Triangulo {
    double base;
    double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea(){
        return (base*altura)/2;
    }

    double calcularPerimetro(){
        return 2*altura + base;
    }

    double calcularHipotenusa() {
        return Math.pow(base*base + altura*altura, 0.5);
    }

    void determinarTipoTriángulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura
                == calcularHipotenusa()))
            System.out.println("Es un triángulo equilátero");
        else if ((base != altura) && (base != calcularHipotenusa()) &&
                (altura != calcularHipotenusa()))
            System.out.println("Es un triángulo escaleno");
        else
            System.out.println("Es un triángulo isósceles");
    }
}
