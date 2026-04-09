package br.gw.chainresponsibility;

public class Creature {

    private String name;
    private int attack;
    private int defence;

    public Creature(String name, int attack, int defence) {
        this.name = name;
        this.attack = attack;
        this.defence = defence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    @Override
    public String toString() {
        return "Creature{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                ", defence=" + defence +
                '}';
    }
}
