package PatternsRealisation.Decorator;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortReversedOrder extends ArrayDecorator{

    public ArraySortReversedOrder(ArrayClass arrayClass) {
        super(arrayClass);
    }

    @Override
    public void apply() {
        Arrays.sort(array, Comparator.reverseOrder());
    }
}