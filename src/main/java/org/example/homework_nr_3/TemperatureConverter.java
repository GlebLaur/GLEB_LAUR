package org.example.homework_nr_3;

import javax.sound.midi.Soundbank;

public class TemperatureConverter {
    double x;
    double y;

    public double toFahrenheit() {
        return x * 1.8;
    }
        public double toCelsius(){
            return y / 1.8;
    }

    public static void main(String[] args) {
        TemperatureConverter tc = new TemperatureConverter(32, 0);
        TemperatureConverter tc1 = new TemperatureConverter(0, 32.4);
        System.out.println("32 degrees Celsius in Fahrenheit: " + tc.toFahrenheit());
        System.out.println("32.4 degrees Fahrenheit in Celsius: " + tc1.toCelsius());
    }
    TemperatureConverter(double x, double y){
        this.x = x;
        this.y = y;
    }
}


