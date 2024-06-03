package Patterns.Observer.Calculator;

public class Numbers extends Observable{
    public void setNumbers(double ...arg){
        setArgs(arg);
    }
}