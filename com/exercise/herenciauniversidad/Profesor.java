package com.exercise.herenciauniversidad;

public class Profesor extends Persona{
    String departamento;
    String direccion;

    public Profesor(String nombre, String direccion, String departamento, String direccion1) {
        super(nombre, direccion);
        this.departamento = departamento;
        this.direccion = direccion1;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
