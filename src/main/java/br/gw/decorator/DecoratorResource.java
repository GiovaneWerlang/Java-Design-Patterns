package br.gw.decorator;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Tag(name="Structural")
@Path("/decorator")
public class DecoratorResource {

    @GET
    public void execute() {
        Circle circle = new Circle(5);
        System.out.println(circle.info());

        ColoredShape coloredShape = new ColoredShape(new Circle(2), "red");
        System.out.println(coloredShape.info());
    }

}
