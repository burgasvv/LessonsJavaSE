package Patterns.Observer.NewsPaper;

import java.util.ArrayList;

public abstract class Observable {
    private final ArrayList<Subscriber> subscribers;
    public Observable() {
        subscribers = new ArrayList<>();
    }
    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }
    public void cancelSubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }
    public void Notify(){
        for (Subscriber subscriber : subscribers)
            System.out.println(subscriber.Notify());
    }
}