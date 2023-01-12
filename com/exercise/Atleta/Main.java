package com.exercise.Atleta;

public class Main {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("Alejandro Perlaza",9.55);
        atleta1.correr();
        Atleta atleta2 = new Atleta("Anthony Zambrano",9.28);
        atleta1.correr();
        Atleta atleta3 = new Atleta("Diego Palomeque",9.53);
        atleta1.correr();
        Atleta atleta4 = new Atleta("Gilmar Herrera",9.29);
        Atleta atleta5 = new Atleta();
        atleta1.correr();
        Atleta.imprimirSeleccion();
        atleta1.imprimir();
        atleta2.imprimir();
        atleta3.imprimir();
        atleta4.imprimir();
        atleta5.imprimir();
        Atleta.imprimirTiempoEquipo();



    }
}
