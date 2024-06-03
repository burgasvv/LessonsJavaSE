package DesignPatterns.Adapter;

public class Adapter extends TermometerC{
    public Adapter(TermometerF termometerF) {
        temperature = (termometerF.getTemperature() - 32) * 5/9;
    }
}