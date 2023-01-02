package com.exercise.Pelicula;

public class Main {
    public static void main(String[] args) {

        Pelicula pelicula1 = new Pelicula("Rambo1","Sylvester Stallone",
                Pelicula.tipoGenero.ACCIÓN,4,1996,9);
        Pelicula pelicula2 = new Pelicula("Rambo2","Sylvester Stallone",
                Pelicula.tipoGenero.ACCIÓN,4,1999,9);
        System.out.println(pelicula1.esPeliculaEpica());
        System.out.println(pelicula2.esPeliculaEpica());
        System.out.println("La pelicula tiene una valoración " + pelicula1.calcularValoracion());
        System.out.println("La pelicula tiene una valoración " + pelicula2.calcularValoracion());
        System.out.println("Las peliculas son similares " + pelicula1.esSimilar(pelicula2));



    }


}
