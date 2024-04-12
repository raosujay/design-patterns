package DesignPatterns.Strategy;

public class ShoppingCart {
    private PaymentStrategy strategy;
    public ShoppingCart(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

//    This is not needed.
//    public void setStrategy(PaymentStrategy strategy) {
//        this.strategy = strategy;
//    }

    public void pay(int amount) {
        strategy.pay(amount);
    }
}