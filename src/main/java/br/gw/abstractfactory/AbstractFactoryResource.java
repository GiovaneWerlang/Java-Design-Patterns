package br.gw.abstractfactory;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Tag(name="Creational")
@Path("/abstractfactory")
public class AbstractFactoryResource {

    @GET
    public boolean execute() throws Exception {
        HotDrinkMachine machine = new HotDrinkMachine();
        HotDrink drink =  machine.makeDrink();
        drink.consume();

        return true;
    }

}
