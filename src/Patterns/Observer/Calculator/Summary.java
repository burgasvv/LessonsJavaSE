package Patterns.Observer.Calculator;

public class Summary extends Method{
    @Override
    public double count(double... arg) {
        double result = 0;
        for (double d : arg)
            result += d;
        return result;
    }
}