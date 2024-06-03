package DesignPatterns.Adapter;

public class MeteoStation {
    private final TermometerC temperature;
    public MeteoStation(TermometerC temperature) {
        this.temperature = temperature;
    }
    public TermometerC getTemperature() {
        return temperature;
    }
    @Override
    public String toString() {
        return "MeteoStation{" +
                "temperature=" + temperature +
                '}';
    }
}