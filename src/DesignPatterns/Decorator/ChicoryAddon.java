package DesignPatterns.Decorator;

public class ChicoryAddon extends CoffeeDecorator{

    public ChicoryAddon(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Chicory";
    }

    @Override
    public double getCost() {
        return super.getCost() + 10;
    }
}