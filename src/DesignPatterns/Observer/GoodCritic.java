package DesignPatterns.Observer;

public class GoodCritic extends Subscriber{
    @Override
    public String Notify() {
        return "Critic says it's awesome!";
    }
}
