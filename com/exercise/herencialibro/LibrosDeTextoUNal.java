package com.exercise.herencialibro;

public class LibrosDeTextoUNal extends LibrosDeTexto{
    String facultad;

    public LibrosDeTextoUNal(String titulo, String autor, String curso, String facultad) {
        super(titulo, autor, curso);
        this.facultad = facultad;
    }

    public void imprimir(){
        System.out.println("El autor del libro es : " + autor);
        System.out.println("El titulo del libro es : " + titulo);
        System.out.println("El precio del libro es : " + precio);
        System.out.println("El curso es : " + curso);
        System.out.println("Facultad de : "+ facultad);

    }
}
