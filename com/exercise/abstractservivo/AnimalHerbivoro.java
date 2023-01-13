package com.exercise.abstractservivo;

public class AnimalHerbivoro extends Animal{
    @Override
    void alimentarse() {
        System.out.println("Los animales herbivoros se alimentan de plantas");
    }
}
