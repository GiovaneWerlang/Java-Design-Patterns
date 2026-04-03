package br.gw.builder;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Tag(name="Creational")
@Path("/builder")
public class BuilderResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String execute() {
        HtmlBuilder builder = new HtmlBuilder("ul");
        builder.addChild("li", "hello");
        builder.addChild("li", "world");
        System.out.println(builder);
        return builder.toString();
    }

}
