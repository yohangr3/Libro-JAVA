package com.exercise.abstractanimales;

public class Perros extends Canidos{

    @Override
    public String getSonido() {
        return "Ladrido";
    }

    @Override
    public String getAlimentos() {
        return "Carnivoro";
    }

    @Override
    public String getHábitat() {
        return "Domestico";
    }

    @Override
    public String getNombreCientífico() {
        return "Canis lupus familiaris";
    }
}
