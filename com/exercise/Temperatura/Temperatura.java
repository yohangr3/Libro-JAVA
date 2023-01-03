package com.exercise.Temperatura;

public class Temperatura {
    public static double convertirFahrenheitACelsius(double gradosFahrenheit) {
        double celcius = (gradosFahrenheit-32)/1.8;
        return celcius;
    }
    public static double convertirCelsiusAFahrenheit(double gradosCelsius){
        double fahrenheit = (gradosCelsius*1.8)+32;
        return fahrenheit;
    }
}
