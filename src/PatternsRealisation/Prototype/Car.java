package PatternsRealisation.Prototype;

public class Car {
    private String model;
    private Integer price;

    public Car(String model, Integer price) {
        this.model = model;
        this.price = price;
    }

    public Car(Car car) {
        this.model = car.getModel();
        this.price = car.getPrice();
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
    public Car cloneCar(){
        return new Car(model,price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}