package Patterns.State;

public abstract class WaterState  { // Состояние поведенческий паттерн, менят поведение;
    public abstract void heat(Water water);
    public abstract void freeze(Water water);
}