package br.gw.composite;

import java.util.ArrayList;

public class Menu extends MenuComponent{

    private ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<MenuComponent> getMenuComponents() {
        return menuComponents;
    }

    public void setMenuComponents(ArrayList menuComponents) {
        this.menuComponents = menuComponents;
    }

    @Override
    public String print() {
        StringBuilder sb = new StringBuilder();

        appendWithNewLine(sb, description);
        appendWithNewLine(sb,"-----------------------------------");
        for (MenuComponent component : getMenuComponents()) {
            appendWithNewLine(sb, component.print());
        }

        return sb.toString();
    }

    private void appendWithNewLine(StringBuilder sb, String text) {
        sb.append(text);
        addNewLine(sb);
    }

    private void addNewLine(StringBuilder sb) {
        sb.append("\n");
    }

}
