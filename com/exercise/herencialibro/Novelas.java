package com.exercise.herencialibro;

public class Novelas extends Libro{
    enum tipoNovela {
        histórica, romántica, policíaca, realista, ciencia, ficción , aventuras
    }
    tipoNovela  novela;

    public Novelas(String titulo, String autor, tipoNovela novela) {
        super(titulo, autor);
        this.novela = novela;
    }

    public void imprimir(){
        System.out.println("El autor del libro es : " + autor);
        System.out.println("El titulo del libro es : " + titulo);
        System.out.println("El precio del libro es : " + precio);
        System.out.println("El tipo de novela es :" + novela);

    }
}
