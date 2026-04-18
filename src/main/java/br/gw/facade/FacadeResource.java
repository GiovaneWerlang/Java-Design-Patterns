package br.gw.facade;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Tag(name="Structural")
@Path("/facade")
public class FacadeResource {

    @GET
    public void execute() {
        BankFacade bankFacade = new BankFacade();
        bankFacade.getAccount("123");
        bankFacade.transfer("123", "455", 50);
        bankFacade.pay("123", "83z", 50);
    }

}
