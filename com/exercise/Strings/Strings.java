package com.exercise.Strings;

public class Strings {
    public int mayuscula(String nombre){
        int contador =0;


        for(int  i=0; i<nombre.length(); i++) {
            if(nombre.charAt(i)>=65 && nombre.charAt(i)<=90){
                contador++;
            }
        }
        return contador;
    }
    public int letrasRepetidas(String texto, char letra){
        int contador =0;
        for(int i =0;i<texto.length();i++){
            //          System.out.println(texto.charAt(i));
            if(texto.charAt(i) == letra){
                contador++;
            }
        }
        return contador;
    }

    public void eliminarEspacios(String texto){
        String textosinespacios= texto.replaceAll(" ","");
        System.out.println(textosinespacios);
    }

    public String stringInvertido(String texto){
        String invertido= "";
        for(int i = texto.length();i>0;i--) {
            invertido += texto.charAt(i-1) ;

        }
        return invertido;
    }



    public static void main(String[] args) {
        /**Mayusculas nombre1 = new Mayusculas();
         Mayusculas nombre2 = new Mayusculas();
         Mayusculas nombre3 = new Mayusculas();
         System.out.println(nombre1.mayuscula("YOHAN daza"));**/

        /**Strings letrasRepetidas = new Strings();
         System.out.println(letrasRepetidas.letrasRepetidas("Diego Alejandro el duro Izasa",'a'));**/
        /**Strings eliminarEspacios1 = new Strings();
        eliminarEspacios1.eliminarEspacios("yohan daza");**/

        /**Strings invertido1 = new Strings();
        System.out.println(invertido1.stringInvertido("Yohan Daza"));**/

    }
}

