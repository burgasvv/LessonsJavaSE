package Abstraction;

public abstract class Animal {
    private final String name;
    private final double weight;
    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public void Feed(){
        System.out.println("You feed " + getName());
    }
    public abstract void Voice();
}