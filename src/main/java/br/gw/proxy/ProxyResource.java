package br.gw.proxy;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Tag(name="Structural")
@Path("/proxy")
public class ProxyResource {

    @GET
    public void execute() {
        SubjectImpl subjectImpl = new SubjectImpl();
        subjectImpl.request();

        SubjectProxy subjectProxy = new SubjectProxy(subjectImpl);
        subjectProxy.request();
    }

}
