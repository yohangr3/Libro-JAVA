package com.exercise.mamiferointerfaces;

public class Ornitorrinco extends Mamiferos implements Oviparos{


    public void ponerHuevos() {
        System.out.println("El ornitorrinco pone huevos.");
    }

    @Override
    void amamantarCrias() {
        System.out.println("El ornitorrinco amamanta a sus crías.");

    }
}
