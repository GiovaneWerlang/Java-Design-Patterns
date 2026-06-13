package br.gw.state;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Tag(name="Behavioral")
@Path("/state")
public class StateResource {

    @GET
    public void execute() {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }

}
