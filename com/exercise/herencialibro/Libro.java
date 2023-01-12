package com.exercise.herencialibro;

public class Libro {
    String titulo;
    String autor;
    double precio;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void imprimir(){
        System.out.println("El autor del libro es : " + autor);
        System.out.println("El titulo del libro es : " + titulo);
        System.out.println("El precio del libro es : " + precio);

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
