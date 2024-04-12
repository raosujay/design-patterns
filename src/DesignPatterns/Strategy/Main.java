package DesignPatterns.Strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(new CreditCard("SBI Card", 1228438485));
        cart.pay(5000);

        ShoppingCart cart1 = new ShoppingCart(new Paypal("sujay.s@gmail.com", "sujay.92"));
        cart1.pay(6000);
    }
}
