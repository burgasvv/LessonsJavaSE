package PatternsRealisation.Strategy;

public class Car implements IMovable{
    private String model;
    private Integer price;

    public Car(String model, Integer price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void move() {
        System.out.println("Explorer is riding on car");
    }
}