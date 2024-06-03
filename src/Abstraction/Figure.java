package Abstraction;

import java.util.List;

public abstract class Figure {
    public List<Double>sides;
    public abstract double S();
    public abstract double P();
    public List<Double>getSides(){return sides;}
}