package DesignPatterns.Observer;

public class EmailSender implements OrderPlaced{

    public EmailSender() {
        Flipkart.getInstance().registerSubscriber(this);
    }

    @Override
    public void announceOrderPlaced() {
        System.out.println("Sending emails ");
    }
}
