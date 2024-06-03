package PatternsRealisation.Decorator;

import java.util.Arrays;

public class ArrayNegative extends ArrayDecorator{

    public ArrayNegative(ArrayClass arrayClass) {
        super(arrayClass);
    }

    @Override
    public void apply() {
        array = Arrays.stream(array).filter(integer -> integer < 0).toArray(Integer[]::new);
    }
}