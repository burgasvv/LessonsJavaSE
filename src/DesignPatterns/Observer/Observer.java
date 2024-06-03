package DesignPatterns.Observer;

import java.util.ArrayList;

public class Observer {
    private final ArrayList<Subscriber>subscribers;

    public Observer() {
        subscribers = new ArrayList<>();
    }
    public ArrayList<Subscriber> getSubscribers() {
        return subscribers;
    }
    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }
    public void cancelSubscription(Subscriber subscriber){
        subscribers.remove(subscriber);
    }
    public void Notify(){
        for (Subscriber subscriber : subscribers)
            System.out.println(subscriber.Notify());
    }
}