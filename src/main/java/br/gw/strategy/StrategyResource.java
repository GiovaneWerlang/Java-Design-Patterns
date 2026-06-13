package br.gw.strategy;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Tag(name="Behavioral")
@Path("/strategy")
public class StrategyResource {

    @POST
    @Path("/{searchType}")
    public String execute(@PathParam("searchType") SearchType searchType, String term) {
        SearchStrategy searchStrategy;
        switch (searchType) {
            case NAME -> searchStrategy = new NameSearch();
            case CATEGORY -> searchStrategy = new CategorySearch();
            default -> {
                return "Invalid searchType informed.";
            }
        }

        return searchStrategy.search(term);
    }

}
