package Patterns.Strategy.Methodics;

public class Difference extends Methodics{
    @Override
    public double method(double ...arg) {
        double diff = arg[0];
        for (int i = 1; i < arg.length; i++)
            diff -= arg[i];
        return diff;
    }
}