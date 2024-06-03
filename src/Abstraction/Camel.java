package Abstraction;

public class Camel extends Animal{
    public Camel(double weight) {
        super("Camel", weight);
    }
    @Override
    public void Voice() {
        System.out.println("Chew-chew");
    }
}