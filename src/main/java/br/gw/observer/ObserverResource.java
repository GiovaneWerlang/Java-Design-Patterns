package br.gw.observer;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Tag(name="Behavioral")
@Path("/observer")
public class ObserverResource {

    @GET
    public void execute() {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserverA();
        Observer observer2 = new ConcreteObserverB();
        concreteSubject.attach(observer1);
        concreteSubject.attach(observer2);

        concreteSubject.applyBusinessRules();
        concreteSubject.applyBusinessRules();
        concreteSubject.applyBusinessRules();

        concreteSubject.detach(observer2);

        concreteSubject.applyBusinessRules();

    }

}
