package DesignPatterns.Strategy;

public class Car extends Movable{
    @Override
    public void move() {
        System.out.println("Riding on car");
    }
}