package DesignPatterns.Observer;

public class BadCritic extends Subscriber{
    @Override
    public String Notify() {
        return "Critic says it's too bad...";
    }
}