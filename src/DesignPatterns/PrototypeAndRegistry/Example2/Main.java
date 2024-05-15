package DesignPatterns.PrototypeAndRegistry.Example2;

public class Main {
    public static void main(String[] args) {
        // Register some shapes
        ShapeRegistry.registerShape("circle", new Circle(5));
        ShapeRegistry.registerShape("square", new Square(10));

        // Create new shapes by cloning prototypes
        Shape newCircle = ShapeRegistry.getShape("circle").clone();
        Shape newSquare = ShapeRegistry.getShape("square").clone();
        // Shape noShape = ShapeRegistry.getShape(null).clone();
        // throw error : IllegalArgumentException: Shape not found: null

        System.out.println("newCircle = " + newCircle);
        System.out.println("newSquare = " + newSquare);
        // System.out.println("newSquare = " + noShape);

        // Now newCircle and newSquare are independent objects with copied properties
    }
}