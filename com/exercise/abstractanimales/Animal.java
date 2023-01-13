package com.exercise.abstractanimales;

public abstract class Animal {
    String sonidos;
    String alimentos;
    String habitat;
    String nombreCientifico;

    public abstract String getNombreCientífico();
    public abstract String getSonido();
     public abstract String getAlimentos();
    public abstract String getHábitat();
}
