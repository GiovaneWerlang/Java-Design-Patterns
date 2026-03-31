package br.gw.abstractfactory;

public class TeaFactory implements HotDrinkFactory {

    @Override
    public HotDrink prepare(int amount) {
        System.out.println("Tea placed in hot water, poured " + amount + "ml, enjoy.");
        return new Tea();
    }

}
