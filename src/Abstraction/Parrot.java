package Abstraction;

public class Parrot extends Animal{
    public Parrot(double weight) {
        super("Parrot", weight);
    }
    @Override
    public void Voice() {
        System.out.println("Argh");
    }
    public void Fly(){
        System.out.println("Parrot is flying");
    }
}