package br.gw.nullobject;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Tag(name="Behavioral")
@Path("/nullobject")
public class NullObjectResource {

    @GET
    public void execute() {
        NullLog log = new NullLog();
        BankAccount bankAccount = new BankAccount(log);
        bankAccount.deposit(1000);
        bankAccount.withdraw(500);
    }

}
