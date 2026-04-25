package br.gw.iterator;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Tag(name="Behavioral")
@Path("/iterator")
public class IteratorResource {

    @GET
    public void execute() {
        Library library = new Library();
        library.addBook(new Book("SOLID"));
        library.addBook(new Book("Clean Code"));
        library.addBook(new Book("Java"));

        Iterator<Book> iterator = library.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getTitle());
        }
    }

}
