package Abstraction;

import java.util.ArrayList;

public class Triangle extends Figure{
    public Triangle(double a, double b, double c) {
        sides = new ArrayList<>();
        sides.add(a);
        sides.add(b);
        sides.add(c);
    }
    @Override
    public double S() {
        return Math.sqrt(P()*(P()-sides.get(0))*(P()-sides.get(1))*(P()-sides.get(2)));
    }
    @Override
    public double P() {
        return sides.get(0) + sides.get(1) + sides.get(2);
    }
}