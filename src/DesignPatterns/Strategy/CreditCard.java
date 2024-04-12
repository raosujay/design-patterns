package DesignPatterns.Strategy;

public class CreditCard implements PaymentStrategy{
    private String name;
    private int cardNumber;
    public CreditCard(String name, int cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }
    public void pay(int amount) {
        System.out.println(amount + " Paid using CreditCard: " + name + ", number: " + cardNumber);
    }
}
