package com.exercise.abstractanimales;

public class Gatos extends Felinos{
    @Override
    public String getSonido() {
        return "Maullido";
    }

    @Override
    public String getAlimentos() {
        return "Ratones";
    }

    @Override
    public String getHábitat() {
        return "Domestico";
    }

    @Override
    public String getNombreCientífico() {
        return "Felis silvestris catus";
    }
}
