package DesignPatterns.Adapter;

public class TermometerF {
    private final double temperature;
    public double getTemperature() {
        return temperature;
    }
    public TermometerF() {
        temperature = 60.0;
    }
    @Override
    public String toString() {
        return "TermometerF{" +
                "temperature=" + temperature +
                '}';
    }
}