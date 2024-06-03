package Patterns.Adapter;

public class Meteostation {
    private final ThermometerC thermometerC;
    public Meteostation(ThermometerC thermometerC) {
        this.thermometerC = thermometerC;
    }
    public String getThermometer() {
        return "Now: "+ thermometerC.getTemperature()+" degrees";
    }
}