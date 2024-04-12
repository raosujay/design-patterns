package DesignPatterns.Decorator;

public class MilkAddon extends CoffeeDecorator{
    public MilkAddon(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
    public String getIngredients() {
        return super.getIngredients()+ ", Milk";
    }

    @Override
    public double getCost() {
        return super.getCost()+ 5;
    }
}
