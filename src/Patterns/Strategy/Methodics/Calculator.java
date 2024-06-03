package Patterns.Strategy.Methodics;

public class Calculator {
    private Methodics methodics;
    public Calculator(Methodics methodics) {
        this.methodics = methodics;
    }
    public void changeMethodics(Methodics methodics){
        this.methodics = methodics;
    }
    public double calculate(double ...arg){
        return methodics.method(arg);
    }
}