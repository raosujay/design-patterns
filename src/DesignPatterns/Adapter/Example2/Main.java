package DesignPatterns.Adapter.Example2;

public class Main {
    public static void main(String[] args) {
        Printer newPrinter = new ConcretePrinter();
        LegacyPrinter legacyPrinter = new PrinterAdapter(newPrinter);
        legacyPrinter.printLegacy();
    }
}
