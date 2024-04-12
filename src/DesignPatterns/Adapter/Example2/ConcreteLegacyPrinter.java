package DesignPatterns.Adapter.Example2;

public class ConcreteLegacyPrinter implements LegacyPrinter{
    @Override
    public void printLegacy() {
        System.out.println("Printing via legacy printer");
    }
}
