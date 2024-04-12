package DesignPatterns.FlyWeight;

public class Main {
    public static void main(String[] args) {
        BookFactory bookFactory = new BookFactory();

        Book book = bookFactory.getBook("Java Programming");
        book.read();

        Book book1 = bookFactory.getBook("Design Patterns");
        book1.read();

        Book book3 = bookFactory.getBook("Best Programming Practices");
        book3.read();
    }
}
