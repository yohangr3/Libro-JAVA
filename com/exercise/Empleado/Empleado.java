package com.exercise.Empleado;

public class Empleado {
    int identificadorEmpleado=0;
    String nombre;
    String apellido;
    static double salario;
    static int contador=0;

    static double totalSalario;


    public Empleado(String nombre, String apellido, double salario) {
        contador++;
        identificadorEmpleado=contador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }
    public void imprimir() {
        System.out.println("Identificador del empleado = " + identificadorEmpleado);
        System.out.println("Nombre del empleado= " + nombre);
        System.out.println("Apellido del empleado = " + apellido);
        System.out.println("Salario del empleado = " + salario);
        System.out.println();
    }


    public static double totalSalario(){
        totalSalario = totalSalario+salario;
        return totalSalario;
    }



}
