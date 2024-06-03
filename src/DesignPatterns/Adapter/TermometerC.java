package DesignPatterns.Adapter;

public class TermometerC {
    protected double temperature;
    public TermometerC() {
        temperature = 15.5;
    }
    public double getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "TermometerC{" +
                "temperature=" + temperature +
                '}';
    }
}