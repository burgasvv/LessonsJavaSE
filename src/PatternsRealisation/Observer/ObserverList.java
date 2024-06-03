package PatternsRealisation.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverList implements IObservable{
    private final List<Observer>observers;

    public ObserverList() {
        observers = new ArrayList<>();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public Observer get(int index) {
        return observers.get(index);
    }

    @Override
    public void message() {
        observers.forEach(Observer::message);
    }
}