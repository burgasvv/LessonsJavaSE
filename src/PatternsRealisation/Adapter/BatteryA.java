package PatternsRealisation.Adapter;

public class BatteryA {
    private String model;
    private Integer energy;

    public BatteryA(String model, Integer energy) {
        this.model = model;
        this.energy = energy;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getEnergy() {
        return energy;
    }

    public void setEnergy(Integer energy) {
        this.energy = energy;
    }

    @Override
    public String toString() {
        return "BatteryA{" +
                "model='" + model + '\'' +
                ", energy=" + energy +
                '}';
    }
}