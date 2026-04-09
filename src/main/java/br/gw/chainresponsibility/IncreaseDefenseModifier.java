package br.gw.chainresponsibility;

public class IncreaseDefenseModifier extends CreatureModifier {

    public IncreaseDefenseModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handle() {
        System.out.println("Increasing " + creature.getName() + "'s Defense");
        creature.setDefence(creature.getDefence() + 4);
        super.handle();
    }

}
