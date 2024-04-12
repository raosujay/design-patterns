package DesignPatterns.PrototypeAndRegistry.Example2;

public class Main {
    public static void main(String[] args) {
        // Register some shapes
        ShapeRegistry.registerShape("circle", new Circle(5));
        ShapeRegistry.registerShape("square", new Square(10));

        // Create new shapes by cloning prototypes
        Shape newCircle = ShapeRegistry.getShape("circle").clone();
        Shape newSquare = ShapeRegistry.getShape("square").clone();

        System.out.println("newCircle = " + newCircle);
        System.out.println("newSquare = " + newSquare);

        // Now newCircle and newSquare are independent objects with copied properties
    }
}