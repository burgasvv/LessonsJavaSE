package Abstraction;

public class Monkey extends Animal{
    public Monkey(double weight) {
        super("Monkey", weight);
    }
    @Override
    public void Voice() {
        System.out.println("Ugh-Ugh");
    }
}