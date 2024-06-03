package Patterns.Strategy.Methodics;

public class Sum extends Methodics{
    @Override
    public double method(double ...arg) {
        double sum = 0;
        for (double v : arg)
            sum += v;
        return sum;
    }
}