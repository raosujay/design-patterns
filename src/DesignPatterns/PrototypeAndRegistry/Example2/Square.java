package DesignPatterns.PrototypeAndRegistry.Example2;

public class Square implements Shape{
    private int sideLength;
    public Square(int sideLength) {
        this.sideLength = sideLength;
    }
    @Override
    public Shape clone() {
        return new Square(sideLength);
    }
}
