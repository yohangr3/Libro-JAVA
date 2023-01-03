package com.exercise.Conversión_Área;

public class Main {
    public static void main(String[] args) {

        Area area1 = new Area(1);
        System.out.println(area1.convertirAHectaria());
        System.out.println(area1.convertirAKilometroCuadrados());
        System.out.println(area1.convertirAAcre());
    }
}
