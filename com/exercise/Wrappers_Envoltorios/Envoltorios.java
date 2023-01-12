package com.exercise.Wrappers_Envoltorios;

public class Envoltorios {
    byte a = 7;
    int b = 100;
    float c = 28.9f;
    double d = 271.8;
    char e = 'M';
    /* Atributos que son envoltorios (wrappers). Cada envoltorio está
    asociado a su correspondiente tipo primitivo de dato */
    Byte objetoByte;
    Integer objetoInteger;
    Float objetoFloat;
    Double objetoDouble;
    Character objetoChar;

    public void convertirToWrapper() {
        objetoByte = Byte.valueOf(a);
        objetoInteger = Integer.valueOf(b);
        objetoFloat = Float.valueOf(c);
        objetoDouble = Double.valueOf(d);
        objetoChar = e; /* Character no tiene un constructor como los otros envoltorios */
        System.out.println("Objeto Byte = " + objetoByte);
        System.out.println("Objeto Integer = " + objetoInteger);
        System.out.println("Objeto Float = " + objetoFloat);
        System.out.println("Objeto Double = " + objetoDouble);
        System.out.println("Objeto Character = " + objetoChar);
    }
    public void convertirToTipoPrimitivo() {
        byte tipoByte = objetoByte;
        int tipoInt = objetoInteger;
        float tipoFloat = objetoFloat;
        double tipoDouble = objetoDouble;
        char tipoChar = objetoChar;
        System.out.println("Tipo byte = " + tipoByte);
        System.out.println("Tipo int = " + tipoInt);
        System.out.println("Tipo float = " + tipoFloat);
        System.out.println("Tipo double = " + tipoDouble);
        System.out.println("Tipo char = " + tipoChar);
}
    /**
     * Método que realiza varias acciones en un objeto de tipo Character
     */
    public void consultarChar() {
        boolean esMiníscula = Character.isLowerCase(e);
        System.out.println("¿El carácter e = “ + e + “ está en minúscula? = " + esMiníscula);
// Determina si el carácter está en mayúscula
        boolean esMayúscula = Character.isUpperCase(e);
        System.out.println("¿El carácter e = " + e +  "está en mayúscula? = " + esMayúscula);
        boolean esLetra = Character.isLetter(e); /* Determina si el
carácter es una letra */
        System.out.println("¿El carácter e = " + e + " está una letra? = " +esLetra);
        boolean esDigito = Character.isDigit(e); /* Determina si el
carácter es un dígito */
        System.out.println("¿El carácter e = " + e + " es un dígito? =  "+ esDigito);
        char charMinúscula = Character.toLowerCase(e); /* Convierte el
carácter a minúscula */
        System.out.println("Carácter e = " + e + " convertido a minúscula = " + charMinúscula);
    }
    /**
     * Método main que instancia un objeto Envoltorio y prueba los
     * métodos para convertir de tipo primitivo de dato a envoltorio, de
     * envoltorio a tipo primitivo de dato y diferentes métodos del
     * envoltorio Character
     */
    public static void main(String args[]) {
        Envoltorios wrapper = new Envoltorios();
        wrapper.convertirToWrapper();
        wrapper.convertirToTipoPrimitivo();
        wrapper.consultarChar();
    }
}
