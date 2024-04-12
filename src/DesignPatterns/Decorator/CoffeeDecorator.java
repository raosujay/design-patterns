package DesignPatterns.Decorator;

public class CoffeeDecorator implements Coffee{
    private final Coffee decoratedCoffee;
    public CoffeeDecorator (Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public String getIngredients() {
        return decoratedCoffee.getIngredients();
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }
}