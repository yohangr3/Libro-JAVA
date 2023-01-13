package com.exercise.herenciauniversidad;

public class Estudiante extends Persona{
    String carrera;
    int semestre;

    public Estudiante(String nombre, String direccion, String carrera, int semestre) {
        super(nombre, direccion);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}
