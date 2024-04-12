package DesignPatterns.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class BookFactory {
    private final Map<String, Book> books = new HashMap<>();
    public Book getBook(String title) {
        Book newBook = books.get(title);
        if(newBook == null) {
            newBook = new ConcreteBook(title);
            books.put(title, newBook);
        }
        return newBook;
    }
}
