package PatternsRealisation.Decorator;

import java.util.Arrays;

public abstract class ArrayClass {

    protected Integer[]array;
    private final int length;

    public ArrayClass(Integer[] array) {
        this.array = array;
        length = array.length;
    }

    public Integer[] getArray() {
        return array;
    }

    public int getLength() {
        return length;
    }

    public void setArray(Integer[] array) {
        this.array = array;
    }
    public abstract void apply();

    @Override
    public String toString() {
        return "ArrayClass{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}