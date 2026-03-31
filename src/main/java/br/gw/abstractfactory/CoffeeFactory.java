package br.gw.abstractfactory;

public class CoffeeFactory implements HotDrinkFactory {

    @Override
    public HotDrink prepare(int amount) {
        System.out.println("Coffee beans ground, placed in hot water, poured " + amount + "ml, enjoy.");
        return new Coffee();
    }

}
