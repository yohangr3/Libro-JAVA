package com.exercise.mamiferointerfaces;

public class Murcielago extends Mamiferos implements Volador{

    @Override
    public void volar() {
        System.out.println("El murcielago es un mamifero volador ");
    }

    @Override
    void amamantarCrias() {

    }
}
