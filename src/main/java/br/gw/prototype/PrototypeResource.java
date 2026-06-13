package br.gw.prototype;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Tag(name="Creational")
@Path("/prototype")
public class PrototypeResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Car execute() {
        Car porsche = new Car("Porsche", "Red");
        Car copy = new Car(porsche);
        copy.name = "Ferrari";
        return copy;
    }

}
