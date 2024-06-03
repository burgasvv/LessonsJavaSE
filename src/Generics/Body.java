package Generics;

public class Body {
    private String model;
    public Body(String model) {
        setModel(model);
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public String toString() {
        return "Body{" +
                "model='" + model + '\'' +
                '}';
    }
}