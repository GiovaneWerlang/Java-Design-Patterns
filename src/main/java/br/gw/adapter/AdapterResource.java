package br.gw.adapter;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import java.util.ArrayList;
import java.util.List;

@Tag(name="Structural")
@Path("/adapter")
public class AdapterResource {

    @GET
    public void execute() {
        List<VectorObject> vectorObjects = new ArrayList<>(
                List.of(
                        new VectorRectangle(1,1,10,10),
                        new VectorRectangle(3,3,6,6)
                )
        );
        new Draw().draw(vectorObjects);
    }

}
