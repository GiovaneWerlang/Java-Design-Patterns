package br.gw.command;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Tag(name="Behavioral")
@Path("/command")
public class CommandResource {

    @GET
    public void execute() {
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount);

        List<Command> commands = new ArrayList<>(
            List.of(
                new BankAccountCommand(bankAccount, Action.DEPOSIT, 100),
                new BankAccountCommand(bankAccount, Action.WITHDRAW, 1000)
            )
        );

        for(Command cmd : commands) {
            cmd.call();
            System.out.println(bankAccount);
        }

        Collections.reverse(commands);

        for(Command cmd :commands) {
            cmd.undo();
            System.out.println(bankAccount);
        }

    }

}
