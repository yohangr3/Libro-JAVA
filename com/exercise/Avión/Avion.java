package com.exercise.Avión;

public class Avion {
    String fabricante;
    int numeroDeMotores;

    public Avion(String fabricante, int numeroDeMotores) {
        this.fabricante = fabricante;
        this.numeroDeMotores = numeroDeMotores;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getNumeroDeMotores() {
        return numeroDeMotores;
    }

    public void setNumeroDeMotores(int numeroDeMotores) {
        this.numeroDeMotores = numeroDeMotores;
    }

    public void imprimirFabricante() {
        System.out.println("El fabricante del avión es : " +fabricante);
    }

    public void cambiarFabricante(Avion avion) {
        avion.setFabricante("Lockheed");
    }
    public int getNumeroMotores() {
        return numeroDeMotores;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "fabricante='" + fabricante + '\'' +
                ", numeroDeMotores=" + numeroDeMotores +
                '}';
    }
}
