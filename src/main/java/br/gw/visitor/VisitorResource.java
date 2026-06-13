package br.gw.visitor;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Tag(name="Behavioral")
@Path("/visitor")
public class VisitorResource {

    @GET
    public void execute() {
        AdditionExpression e = new AdditionExpression(
                new DoubleExpression(1),
                new AdditionExpression(
                        new DoubleExpression(2),
                        new DoubleExpression(3)
                ));
        ExpressionPrinter ep = new ExpressionPrinter();
        ep.visit(e);
        System.out.println(ep);

        ExpressionCalculator calc = new ExpressionCalculator();
        calc.visit(e);
        System.out.println(ep + " = " + calc.result);
    }

}
