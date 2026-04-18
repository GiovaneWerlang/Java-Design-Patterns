package br.gw.composite;

public class MenuItem extends MenuComponent {

    private String name;
    private String description;
    private double price;
    boolean vegetarian;

    public MenuItem(String name, String description, double price, boolean vegetarian) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.vegetarian = vegetarian;
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

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    @Override
    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append(" " + getName());
        if(isVegetarian()) sb.append(" (Vegetarian)");
        sb.append(", " + getPrice());
        sb.append(": " + getDescription());
        return sb.toString();
    }

}
