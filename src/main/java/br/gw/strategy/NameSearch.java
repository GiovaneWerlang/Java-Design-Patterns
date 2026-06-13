package br.gw.strategy;

public class NameSearch implements SearchStrategy {

    @Override
    public String search(String term) {
        return "name";
    }

}
