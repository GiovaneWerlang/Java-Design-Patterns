package br.gw.chainresponsibility;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Tag(name="Behavioral")
@Path("/chainresponsibility")
public class ChainResponsibilityResource {

    @GET
    public void execute() {
        Creature wolf = new Creature("Wolf", 1, 1);
        System.out.println(wolf);

        CreatureModifier root = new CreatureModifier(wolf);

        root.setNext(new DoubleAttackModifier(wolf));
        root.setNext(new IncreaseDefenseModifier(wolf));

        root.handle();
        System.out.println(wolf);
    }

}
