package com.exercise.polimorfismovehiculo;

public  class Vehiculo {
    protected String matricula;
    protected String marca;
    protected String modelo;

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    String mostrarDatos() {
        return "La matricula del vehiculo es : "+matricula+"\n"
        + "La marca del vehiculo es : " + marca + "\n"
        + "El modelo del vehiculo es : " + modelo;
    }
}
