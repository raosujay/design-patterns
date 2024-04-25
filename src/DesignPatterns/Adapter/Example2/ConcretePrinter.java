package DesignPatterns.Adapter.Example2;

public class ConcretePrinter implements Printer{
    @Override
    public void print() {
        System.out.println("Printing with New Printer");
    }
}