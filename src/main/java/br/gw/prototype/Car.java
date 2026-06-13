package br.gw.prototype;

public class Car {

    public String name;
    public String color;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Car(Car other) {
        this.name = other.name;
        this.color = other.color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}
