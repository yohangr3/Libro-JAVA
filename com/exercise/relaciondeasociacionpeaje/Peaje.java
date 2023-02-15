package com.exercise.relaciondeasociacionpeaje;

public class Peaje {
    String nombre;
    String departamento;

    int valorTotalRecolectado;

    public Peaje(String nombre, String departamento, int valorTotalRecolectado) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.valorTotalRecolectado = valorTotalRecolectado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getValorTotalRecolectado() {
        return valorTotalRecolectado;
    }

    public void setValorTotalRecolectado(int valorTotalRecolectado) {
        this.valorTotalRecolectado = valorTotalRecolectado;
    }
}
