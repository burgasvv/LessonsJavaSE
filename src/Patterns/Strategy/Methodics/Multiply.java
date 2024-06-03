package Patterns.Strategy.Methodics;

public class Multiply extends Methodics{
    @Override
    public double method(double ...arg) {
        double multiply = 1;
        for (double v : arg)
            multiply *= v;
        return multiply;
    }
}