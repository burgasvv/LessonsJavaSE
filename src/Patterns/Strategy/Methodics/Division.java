package Patterns.Strategy.Methodics;

public class Division extends Methodics{
    @Override
    public double method(double ...arg) {
        double div = arg[0];
        for (int i = 1; i < arg.length; i++)
            div /= arg[i];
        return div;
    }
}