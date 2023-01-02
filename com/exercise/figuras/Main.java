package com.exercise.figuras;

public class Main {
    public static void main(String[] args) {

        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1,2);
        Cuadrado figura3 = new Cuadrado(3);
        Triangulo figura4 = new Triangulo(3,5);
        Rombo figura5 = new Rombo(16,12,10);
        Trapecio figura6 = new Trapecio(3.5,9.5,4,5,5);
        System.out.println(" área del círculo es = " + figura1.
                calcularArea());
        System.out.println(" perímetro del círculo es = " + figura1.
                calcularPerimetro());
        System.out.println();
        System.out.println(" área del rectángulo es = " + figura2.
                calcularArea());
        System.out.println(" perímetro del rectángulo es = " + figura2.
                calcularPerimetro());
        System.out.println();
        System.out.println(" área del cuadrado es = " + figura3.
                calcularArea());
        System.out.println(" perímetro del cuadrado es = " + figura3.
                calcularPerimetro());
        System.out.println();
        System.out.println(" área del triángulo es = " + figura4.
                calcularArea());
        System.out.println(" perímetro del triángulo es = " + figura4.
                calcularPerimetro());
        figura4.determinarTipoTriángulo();
        System.out.println();
        System.out.println(" área del rombo es = " + figura5.calcularArea());
        System.out.println(" perímetro del rombo es = " + figura5.calcularPerimetro());
        System.out.println(" área del trapecio es = " + figura6.calcularArea());
        System.out.println(" área del trapecio es = " + figura6.calcularPerimetro());
    }
}
