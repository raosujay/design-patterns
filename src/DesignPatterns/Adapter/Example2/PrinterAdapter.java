package DesignPatterns.Adapter.Example2;

public class PrinterAdapter implements LegacyPrinter{
    private final Printer printer;

    public PrinterAdapter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void printLegacy() {
        printer.print();
    }
}
