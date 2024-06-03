package DesignPatterns.Strategy;

public class Boat extends Movable{
    @Override
    public void move() {
        System.out.println("Swimming on boat");
    }
}