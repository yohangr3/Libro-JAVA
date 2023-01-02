package com.exercise.Pelicula;

public class Pelicula {
    String nombre;
    String director;
    enum tipoGenero{
        ACCIÓN, COMEDIA, DRAMA ,SUSPENSO
    }
    
    tipoGenero genero;
    int duracion;
    int año;
    double calificacion;

    public Pelicula(String nombre, String director, tipoGenero genero, int duracion, int año, double calificacion) {
        this.nombre = nombre;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.año = año;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public tipoGenero getGenero() {
        return genero;
    }

    public void setGenero(tipoGenero genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "nombre='" + nombre + '\'' +
                ", director='" + director + '\'' +
                ", genero=" + genero +
                ", duracion=" + duracion +
                ", año=" + año +
                ", calificacion=" + calificacion +
                '}';
    }
    
    public boolean esPeliculaEpica(){
        if(duracion >= 3){
            return  true;
        }else{
            return false;
        }
    }
    
    protected String calcularValoracion(){
        if(calificacion >= 0 && calificacion <=2 ){
            return "Muy mala";
        } else if (calificacion > 2 && calificacion<=5) {
            return "Mala";
        }else if (calificacion > 5 && calificacion<=7) {
            return "Regular";
            
        } else if (calificacion >7 && calificacion<=8) {
            return "Buena";
        }else if (calificacion > 8 && calificacion<=10) {
            return "Excelente";
        }else {
            return "Calificación fuera del rango de 0 a 10";
        }
    }

    protected boolean esSimilar(Pelicula pelicula){
        if(pelicula.genero == genero && pelicula.calcularValoracion() == calcularValoracion()){
            return true;
        }else {
            return false;
        }
    }

    public String imprimirCartel(){
        return "-------- " + nombre + " -------- \n" +
                "         "+"****" + "         \n"+
                "         "+año + "         \n"+
                "         "+tipoGenero.DRAMA+","+tipoGenero.ACCIÓN+","+tipoGenero.SUSPENSO+"\n" +"         \n"+
                "         "+director;
    }
}
