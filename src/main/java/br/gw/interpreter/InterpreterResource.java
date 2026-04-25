package br.gw.interpreter;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import java.util.List;
import java.util.stream.Collectors;

@Tag(name="Behavioral")
@Path("/interpreter")
public class InterpreterResource {

    @GET
    public void execute() {
        String input = "(13+4)-(12+1)";
        List<Token> tokens = Lexing.execute(input);
        System.out.println(
            tokens.stream()
            .map(token -> token.toString())
            .collect(Collectors.joining("\t"))
        );
        Element parsed = Parser.parse(tokens);
        System.out.println(input + " = " + parsed.eval());
    }

}
