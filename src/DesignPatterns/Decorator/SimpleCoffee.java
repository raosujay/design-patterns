package DesignPatterns.Decorator;

public class SimpleCoffee implements Coffee{

    @Override
    public String getIngredients() {
        return "Coffee";
    }

    @Override
    public double getCost() {
        return 10;
    }
}