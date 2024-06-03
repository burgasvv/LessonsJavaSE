package Patterns.Observer.Calculator;

public class Main {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.setMethods(new Summary());
        numbers.setNumbers(20,25,25,20);
        numbers.cancelMethods(numbers.getMethods().get(0));
        numbers.setMethods(new Difference());
        numbers.setNumbers(150,25,25);
    }
}