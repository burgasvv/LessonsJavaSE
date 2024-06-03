package Abstraction;

public class Buffalo extends Animal{
    public Buffalo(double weight) {
        super("Buffalo", weight);
    }
    @Override
    public void Voice() {
        System.out.println("Mu-Mu");
    }
}