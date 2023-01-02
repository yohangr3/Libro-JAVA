package com.exercise.Avión;

public class Main {
    public static void main(String[] args) {

        Avion avion1 = new Avion("Airbus",4);
        Avion avion2;
        Avion avion3 = new Avion("Boeing",4);
        Avion avion4 = new Avion("Raytheon ",4);
        avion2 = avion1;
        avion4= avion3;

        avion1.imprimirFabricante(); //Airbus
        avion2.imprimirFabricante();
        avion1.setFabricante("Douglas");
        avion1.imprimirFabricante();
        avion2.imprimirFabricante();
        avion1.cambiarFabricante(avion2);
        avion2.imprimirFabricante();
        System.out.println();

        avion3.imprimirFabricante();
        avion4.imprimirFabricante();
        avion3.setFabricante("Stealth");
        avion3.imprimirFabricante();

    }
}
