package br.gw.decorator;

public class Circle implements Shape {

    private int  radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String info() {
        return "A Circle with radius " + this.radius;
    }

}
