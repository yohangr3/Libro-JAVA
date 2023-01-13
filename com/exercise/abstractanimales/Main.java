package com.exercise.abstractanimales;

public class Main {
    public static void main(String[] args) {

        Animal[] animales1= new Animal[4];
        animales1[0] = new Gatos();
        animales1[1] = new Perros();
        animales1[2] = new Lobos();
        animales1[3] = new Leones();

        for(int i=0; i<animales1.length; i++) {
            System.out.println(animales1[i].getSonido());
            System.out.println(animales1[i].getAlimentos());
            System.out.println(animales1[i].getHábitat());
            System.out.println(animales1[i].getNombreCientífico());
            System.out.println("--------------------------------");
        }
    }

}
