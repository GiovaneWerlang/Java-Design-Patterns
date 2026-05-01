package br.gw.memento;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Tag(name="Behavioral")
@Path("/memento")
public class MementoResource {

    @GET
    public void execute() {
        BankAccount bankAccount = new BankAccount();
        Memento m0 = bankAccount.setBalance(500);

        Memento m1 = bankAccount.deposit(25);
        Memento m2 = bankAccount.deposit(15);

        System.out.println(bankAccount.getBalance());
        bankAccount.restore(m1);
        System.out.println(bankAccount.getBalance());
        bankAccount.restore(m2);
        System.out.println(bankAccount.getBalance());
        bankAccount.restore(m0);
        System.out.println(bankAccount.getBalance());

    }

}
