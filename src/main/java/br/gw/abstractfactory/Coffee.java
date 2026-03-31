package br.gw.abstractfactory;

public class Coffee implements HotDrink {

    @Override
    public void consume() {
        System.out.println("Coffee consumed.");
    }
}
