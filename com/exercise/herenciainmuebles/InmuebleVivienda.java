package com.exercise.herenciainmuebles;

public class InmuebleVivienda extends inmuebles{
    int numeroDeHabitaciones;
    int numeroDeBaños;

    public InmuebleVivienda(int identificadorInmobiliario, int area, String direccion, double precioVenta, int numeroDeHabitaciones, int numeroDeBaños) {
        super(identificadorInmobiliario, area, direccion, precioVenta);
        this.numeroDeHabitaciones = numeroDeHabitaciones;
        this.numeroDeBaños = numeroDeBaños;
    }

    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Número de habitaciones = " + numeroDeHabitaciones);
        System.out.println("Número de baños = " + numeroDeBaños);
    }
}
