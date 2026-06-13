package br.gw.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    public double state;
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
       if(observers.contains(observer)){
           System.out.println("Observer already attached");
           return;
       }
       this.observers.add(observer);
    }

    public void detach(Observer observer) {
        if(observers.contains(observer)){
            observers.remove(observer);
            System.out.println("Observer removed");
            return;
        }
        System.out.println("Observer not attached");
    }

    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(this);
        }
    }

    public void applyBusinessRules() {
        this.state = Math.floor(Math.random() * (10 + 1));
        System.out.println("State changed to " + this.state);
        this.notifyObservers();
    }

}
