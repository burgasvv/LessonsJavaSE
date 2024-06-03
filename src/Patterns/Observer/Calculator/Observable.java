package Patterns.Observer.Calculator;

import java.util.ArrayList;

public abstract class Observable {
    private final ArrayList<Method>methods;
    public Observable() {
        methods = new ArrayList<>();
    }
    public void setMethods(Method method){
        methods.add(method);
    }
    public void cancelMethods(Method method){
        methods.remove(method);
    }
    public ArrayList<Method> getMethods() {
        return methods;
    }

    public void setArgs(double ...arg){
        for (Method method : methods){
            System.out.println(method.count(arg));
        }
    }
}