package com.exercise.Conversor;

public class Main {
    public static void main(String[] args) {

        ConversorMetros conversion = new ConversorMetros(3.5);
        System.out.println(conversion.metrosACentimetros());
        System.out.println(conversion.metrosAMilimetros());
        System.out.println(conversion.metrosAPies());
        System.out.println(conversion.metrosAPulgadas());
        System.out.println(conversion.metrosAYardas());
    }
}
