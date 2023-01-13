package com.exercise.abstractservivo;

public class AnimalCarnivoro extends Animal{

    @Override
    void alimentarse() {
        System.out.println("Los animales carnivoros se alimentan de carne");
    }
}
