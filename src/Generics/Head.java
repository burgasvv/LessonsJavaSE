package Generics;

public class Head {
    public String model;
    public Head(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public String toString() {
        return "Head{" +
                "model='" + model + '\'' +
                '}';
    }
}