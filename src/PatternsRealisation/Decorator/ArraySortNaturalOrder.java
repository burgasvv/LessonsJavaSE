package PatternsRealisation.Decorator;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortNaturalOrder extends ArrayDecorator{
    public ArraySortNaturalOrder(ArrayClass arrayClass) {
        super(arrayClass);
    }

    @Override
    public void apply() {
        Arrays.sort(array,Comparator.naturalOrder());
    }
}