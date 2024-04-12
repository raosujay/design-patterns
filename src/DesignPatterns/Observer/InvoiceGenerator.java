package DesignPatterns.Observer;

public class InvoiceGenerator implements OrderPlaced{
    public InvoiceGenerator() {
        Flipkart.getInstance().registerSubscriber(this);
    }
    @Override
    public void announceOrderPlaced() {
        System.out.println("Generating Invoice ");
    }
}
