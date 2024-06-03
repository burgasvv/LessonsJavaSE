package PatternsRealisation.Observer;

public interface IObservable {

    void add(Observer observer);
    void remove(Observer observer);
    Observer get(int index);
    void message();
}