package com.exercise.Empleados;

public class Empleados {
    int identificador;
    String nombre;
    String apellidos;
    int edadEmpleado;

    public Empleados() {
        this.identificador =100;
        this.nombre ="Nuevo Empleado";
        this.apellidos ="Nuevo Empleado";
        this.edadEmpleado =18;
    }

    public Empleados(int identificador, String nombre, String apellidos, int edadEmpleado) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edadEmpleado = edadEmpleado;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "identificador=" + identificador +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edadEmpleado=" + edadEmpleado +
                '}';
    }
}
