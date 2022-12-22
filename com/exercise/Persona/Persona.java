package com.exercise.Persona;

public class Persona {

    String nombre;
    String apellido;
    int cedula;

    int añoNacimiento;

    String paisDeNacimiento;

    char sexo;
    public Persona(String nombre, String apellido, int cedula, int añoNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.añoNacimiento = añoNacimiento;

    }

    public Persona(String nombre, String apellido, int cedula, int añoNacimiento, String paisDeNacimiento, char sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.añoNacimiento = añoNacimiento;
        this.paisDeNacimiento = paisDeNacimiento;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula=" + cedula +
                ", añoNacimiento=" + añoNacimiento +
                ", paisDeNacimiento='" + paisDeNacimiento + '\'' +
                ", sexo=" + sexo +
                '}';
    }
}
