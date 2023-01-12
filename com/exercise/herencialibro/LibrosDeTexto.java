package com.exercise.herencialibro;

public class LibrosDeTexto extends Libro{

    String curso;

    public LibrosDeTexto(String titulo, String autor, String curso) {
        super(titulo, autor);
        this.curso = curso;
    }

    public void imprimir(){
        System.out.println("El autor del libro es : " + autor);
        System.out.println("El titulo del libro es : " + titulo);
        System.out.println("El precio del libro es : " + precio);
        System.out.println("El curso es : " + curso);

    }
}
