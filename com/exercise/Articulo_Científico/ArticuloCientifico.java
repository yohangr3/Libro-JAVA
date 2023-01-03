package com.exercise.Articulo_Científico;

public class ArticuloCientifico {
    String nombreArticulo;
    String autor;
    String[] palabrasClave = new String[3] ;
    String nombrePublicacion;
    int año;
    String resumen;

    public ArticuloCientifico(String nombreArticulo, String autor) {
        this.nombreArticulo = nombreArticulo;
        this.autor = autor;
    }

    public ArticuloCientifico(String nombreArticulo, String autor, String[] palabrasClave, String nombrePublicacion, int año) {
        this(nombreArticulo,autor);
        this.palabrasClave = palabrasClave;
        this.nombrePublicacion = nombrePublicacion;
        this.año = año;
    }

    public ArticuloCientifico(String nombreArticulo, String autor, String palabrasClave[], String nombrePublicacion, int año, String resumen) {
        this(nombreArticulo,autor,palabrasClave,nombrePublicacion,año);
        this.resumen = resumen;
    }

    public void imprimir(){
        System.out.println("Nombre del artículo :" + nombreArticulo +"\n");
        System.out.println("Autor : " + autor+"\n" );
        System.out.println("Palabras clave :" + palabrasClave );
        for (int i = 0; i < palabrasClave.length;i++){
            System.out.println(palabrasClave[i]);;
        }
        System.out.println("Nombre de la publicación :" +nombrePublicacion+"\n");
        System.out.println("año : " + año +"\n");
        System.out.println("resumen : " + resumen+"\n");
    }
}
