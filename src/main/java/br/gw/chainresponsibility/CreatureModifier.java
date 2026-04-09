package br.gw.chainresponsibility;

public class CreatureModifier implements Handler {

    protected Creature creature;
    protected CreatureModifier next;

    public CreatureModifier(Creature creature) {
        this.creature = creature;
    }

    public void setNext(CreatureModifier creatureModifier) {
        if(next != null) {
            next.setNext(creatureModifier);
        } else {
            next = creatureModifier;
        }
    }

    public void handle() {
        if(next != null) {
            next.handle();
        }
    }

}
