package com.exercise.Articulo_Científico;

public class Main {
    public static void main(String[] args) {
        String[] palabras = {"Física","Espacio","Tiempo"};
        ArticuloCientifico artículo = new ArticuloCientifico("La teoría especial de la relatividad", "Albert Einstein",palabras, "Anales de Física", 1913, "Las leyes de la física son las mismas en todos los sistemas de referencia inerciales");
        artículo.imprimir();

    }
}
