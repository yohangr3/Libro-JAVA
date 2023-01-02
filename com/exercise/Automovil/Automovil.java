package com.exercise.Automovil;

public class Automovil {
    String marca;
    int modelo;
    int motor;

    enum tipoCombustible{
        gasolina, bioetanol, diésel, biodiésel, gasnatural
    }

    tipoCombustible combustible;
    enum tipoAutomovil{
        carro_ciudad, subcompacto, compacto, familiar, ejecutivo, SUV
    }

    tipoAutomovil automovil;
    int numeroPuertas;
    int cantidadAsientos;
    int velocidadMaxima=120 ;
    enum tipoColor{
        blanco, negro, rojo, naranja, amarillo, verde, azul, violeta
    }

    tipoColor color ;
    int velocidadActual=0;

    boolean automatico;

    public Automovil(String marca, int modelo, int motor, tipoCombustible combustible, tipoAutomovil automovil, int numeroPuertas, int cantidadAsientos, int velocidadMaxima, tipoColor color, int velocidadActual, boolean automatico) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.combustible = combustible;
        this.automovil = automovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = velocidadActual;
        this.automatico = automatico;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public tipoCombustible getCombustible() {
        return combustible;
    }

    public void setCombustible(tipoCombustible combustible) {
        this.combustible = combustible;
    }

    public tipoAutomovil getAutomovil() {
        return automovil;
    }

    public void setAutomovil(tipoAutomovil automovil) {
        this.automovil = automovil;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public tipoColor getColor() {
        return color;
    }

    public void setColor(tipoColor color) {
        this.color = color;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    public int acelerar(int acelerar){
        velocidadActual = velocidadActual+acelerar;
        if(velocidadActual > velocidadMaxima){

            return velocidadActual;
        }else {
            return velocidadActual;
        }


    }
    public int desacelerar(int descelerar){
        velocidadActual = velocidadActual-descelerar;
        if(velocidadActual<0){
            return 0;
        }else {
            return velocidadActual;
        }
    }
    public int frenar(){
        return velocidadActual=0;
    }

    public int tiempoLlegada(int distancia){
        int tiempoLlegada = distancia/velocidadActual;
        return tiempoLlegada;
    }

    public Boolean automatico() {
        if(automatico == true){
            return true;
        }else {
            return false;
        }
    }

    public int multas(){
        int multa = 0;
        if (velocidadActual > velocidadMaxima){
            multa++;
            return multa;
        }else {
            return velocidadActual;
        }
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", motor=" + motor +
                ", combustible=" + combustible +
                ", automovil=" + automovil +
                ", numeroPuertas=" + numeroPuertas +
                ", cantidadAsientos=" + cantidadAsientos +
                ", velocidadMaxima=" + velocidadMaxima +
                ", color=" + color +
                ", velocidadActual=" + velocidadActual +
                ", automatico=" + automatico +
                '}';
    }
}
