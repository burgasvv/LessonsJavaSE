package Patterns.Adapter;

public class ThermometerAdapter extends ThermometerC { // pattern "Adapter"
    public ThermometerAdapter(ThermometerF thermometerF) {
        temperature = (thermometerF.getTemperature() - 32) * 5/9;
    }
}