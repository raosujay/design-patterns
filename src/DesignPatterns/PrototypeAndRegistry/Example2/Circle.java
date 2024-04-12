package DesignPatterns.PrototypeAndRegistry.Example2;

public class Circle implements Shape {
    private int radius;
    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        return new Circle(radius);
    }
}
