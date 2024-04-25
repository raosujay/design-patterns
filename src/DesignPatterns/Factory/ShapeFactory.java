package DesignPatterns.Factory;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if(shapeType == null) {
            return null;
        }
        if(shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        }
        if(shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}