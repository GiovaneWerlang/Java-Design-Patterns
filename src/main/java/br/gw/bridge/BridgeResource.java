package br.gw.bridge;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Tag(name="Structural")
@Path("bridge")
public class BridgeResource {

    @GET
    public void execute() {
        VectorRenderer vectorRenderer = new VectorRenderer();
        Circle circle = new Circle(vectorRenderer, 5);
        circle.draw();
        circle.resize(2);
        circle.draw();
    }

}
