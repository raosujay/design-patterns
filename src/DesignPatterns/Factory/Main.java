package DesignPatterns.Factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.getShape("CIRCLE");
        circle.draw();

        Shape square = factory.getShape("Rectangle");
        square.draw();
    }
}
