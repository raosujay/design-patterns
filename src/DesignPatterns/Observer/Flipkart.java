package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
    private static Flipkart instance;
    private List<OrderPlaced> Subscribers = new ArrayList<>();

    public static Flipkart getInstance() {
        if(instance == null) {
            instance = new Flipkart();
        }
        return instance;
    }
    public void OrderPlaced() {
        //notify the subscribers
        for(OrderPlaced Subscribers : Subscribers) {
            Subscribers.announceOrderPlaced();
        }
    }
    public void registerSubscriber(OrderPlaced subscribers) {
        Subscribers.add(subscribers);
    }
    public void unregisterSubscriber(OrderPlaced subscribers) {
        Subscribers.add(subscribers);
    }
    private Flipkart() {
    }
}