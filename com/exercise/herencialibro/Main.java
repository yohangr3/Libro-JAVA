package com.exercise.herencialibro;

public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("Relato de un asesino", "Mario Mendoza");
        libro1.setPrecio(50000);
        LibrosDeTexto libro2 = new LibrosDeTexto("Principito", "Antoine de Saint-Exupéry","Primaria");
        libro2.setPrecio(100000);
        LibrosDeTextoUNal libro3 = new LibrosDeTextoUNal("Calculo 1","Stewart","Calculo 1","Ingenieria");
        libro3.setPrecio(200000);
        Novelas novela1 = new Novelas("Romeo y Julieta" , "William Shakespeare", Novelas.tipoNovela.romántica);
        libro1.imprimir();
        System.out.println("----------------------------------------");
        libro2.imprimir();
        System.out.println("----------------------------------------");
        libro3.imprimir();
        System.out.println("----------------------------------------");
        novela1.imprimir();
        System.out.println("----------------------------------------");


    }
}
