package DesignPatterns.State;

public abstract class WaterState {
    public abstract void heat(Water water);
    public abstract void freeze(Water water);
}