package com.exercise.paquete;

public class Envio {
    Persona persona;
    Persona destinatario;
    Persona Remitente;

    enum tipoEnvio{
        nacional,internacional
    }
    tipoEnvio tipo;

    enum tipoContenido{
        documento , mercancia
    }
    tipoContenido contenido;

    public Envio(Persona persona, Persona destinatario, Persona remitente, tipoEnvio tipo, tipoContenido contenido) {
        this.persona = persona;
        this.destinatario = destinatario;
        Remitente = remitente;
        this.tipo = tipo;
        this.contenido = contenido;
    }

    class Persona{
        String nombre;
        String apellido;
        int numeroDocumento;
        String direccion;
        int telefono;

        public Persona(String nombre, String apellido, int numeroDocumento, String direccion, int telefono) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.numeroDocumento = numeroDocumento;
            this.direccion = direccion;
            this.telefono = telefono;
        }
    }

    /**public int valorEnvio(){
        if(tipoEnvio.nacional && tipoContenido.documento )
    }**/
}
