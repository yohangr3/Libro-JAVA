package com.exercise.abstractanimales;

public class Leones extends Felinos{

    @Override
    public String getSonido() {
        return "Rugido";
    }

    @Override
    public String getAlimentos() {
        return "Carnivoro";
    }

    @Override
    public String getHábitat() {
        return "Pradera";
    }

    @Override
    public String getNombreCientífico() {
        return "Panthera leo";
    }
}
