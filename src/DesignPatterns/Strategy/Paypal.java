package DesignPatterns.Strategy;

public class Paypal implements PaymentStrategy{
    private String email;
    private String userId;
    public Paypal(String email, String userId) {
        this.email = email;
        this.userId = userId;
    }
    public void pay(int amount) {
        System.out.println(amount + " Paid using Paypal: UserId: " + userId + ", email: " + email);
    }
}