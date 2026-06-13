package br.gw.strategy;

public class CategorySearch implements SearchStrategy {

    @Override
    public String search(String term) {
        return "categogy";
    }
}
