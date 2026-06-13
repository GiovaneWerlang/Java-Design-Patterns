package br.gw.singleton;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Tag(name="Creational")
@Path("/singleton")
public class SingletonResource {

    @GET
    public void execute() {
        Singleton singleton = Singleton.getInstance();
    }

}
