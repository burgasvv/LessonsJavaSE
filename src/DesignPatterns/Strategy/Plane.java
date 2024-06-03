package DesignPatterns.Strategy;

public class Plane extends Movable{
    @Override
    public void move() {
        System.out.println("Flying on plane");
    }
}