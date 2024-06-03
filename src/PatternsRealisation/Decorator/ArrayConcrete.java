package PatternsRealisation.Decorator;

import java.util.Random;

public class ArrayConcrete extends ArrayClass{
    public ArrayConcrete(Integer[] array) {
        super(array);
    }

    @Override
    public void apply() {
        array = new Random(0).ints(array.length,-100,100)
                .boxed().toArray(Integer[]::new);
    }
}