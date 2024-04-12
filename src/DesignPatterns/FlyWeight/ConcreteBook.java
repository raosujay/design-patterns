package DesignPatterns.FlyWeight;

public class ConcreteBook implements Book{
    private final String title;
    public ConcreteBook(String title) {
        this.title = title;
    }

    @Override
    public void read() {
        System.out.println("Reading book with title: " + title);
    }
}
