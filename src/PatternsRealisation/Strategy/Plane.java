package PatternsRealisation.Strategy;

public class Plane implements IFlyable{
    private String model;
    private Integer price;

    public Plane(String model, Integer price) {
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
        return "Plane{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void fly() {
        System.out.println("Explorer is flying on plane");
    }
}
