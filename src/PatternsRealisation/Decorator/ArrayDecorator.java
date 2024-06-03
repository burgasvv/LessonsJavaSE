package PatternsRealisation.Decorator;

public abstract class ArrayDecorator extends ArrayClass{
    protected ArrayClass arrayClass;
    public ArrayDecorator(ArrayClass arrayClass) {
        super(arrayClass.array);
        this.arrayClass = arrayClass;
    }
}