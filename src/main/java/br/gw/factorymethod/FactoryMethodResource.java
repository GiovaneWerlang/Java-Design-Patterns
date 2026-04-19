package br.gw.factorymethod;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Tag(name="Creational")
@Path("/factorymethod")
public class FactoryMethodResource {

    @GET
    public void execute() {
        Point cartesianPoint = Point.newCartesianPoint(2, 3);
        Point polarPoint = Point.newPolarPoint(2, 3);
    }

}
