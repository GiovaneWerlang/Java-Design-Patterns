package br.gw.composite;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Tag(name="Structural")
@Path("/composite")
public class CompositeResource {

    @GET
    public String execute() {

        MenuComponent pancakeMenu = new Menu("Pancake menu", "Breakfast");
        MenuComponent dinerMenu = new Menu("Diner menu", "Lunch");
        MenuComponent cafeMenu = new Menu("Cafe menu", "Dinner");
        MenuComponent dessertMenu = new Menu("Dessert menu", "Desserts");

        MenuComponent all = new Menu("All menu", "All menus");

        all.add(pancakeMenu);
        all.add(dinerMenu);
        all.add(cafeMenu);

        dinerMenu.add(
                new MenuItem(
                        "Pasta",
                        "Spaghetti with bread",
                        3,
                        true
                )
        );

        dinerMenu.add(dessertMenu);

        dessertMenu.add(
                new MenuItem(
                        "Apple pie",
                        "Apple pie with crust and vanilla",
                        1.6,
                        true
                )
        );

        return all.print();

    }

}
