package Patterns.Observer.Calculator;

public class Difference extends Method{
    @Override
    public double count(double... arg) {
        double result = arg[0];
        for (int i = 1; i < arg.length; i++)
            result -= arg[i];
        return result;
    }
}