package br.gw.observer;

public class ConcreteObserverB implements Observer {

    public void update(Subject subject) {
        if (subject instanceof ConcreteSubject && ((ConcreteSubject) subject).state > 4) {
            System.out.println("ConcreteObserverB - update");
        }
    }

}
