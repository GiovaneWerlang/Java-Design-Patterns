package br.gw.mediator;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Tag(name="Behavioral")
@Path("/mediator")
public class MediatorResource {

    @GET
    public void execute() {
        ChatRoom room = new ChatRoom();

        Person peter = new Person("Peter");
        Person jane = new Person("Jane");

        room.join(peter);
        room.join(jane);

        peter.say("hi room");
        jane.say("oh, hi peter");

        Person dewey = new Person("Dewey");
        room.join(dewey);
        dewey.say("hi everyone!");

        jane.privateMessage("Dewey", "glad you could join us!");
    }

}
