package DesignPatterns.Decorator;

public class Main {
    public static void main(String[] args) {
        Coffee myCoffee = new SimpleCoffee();
        System.out.println("Cost: " + myCoffee.getCost() + ", Ingredients: " + myCoffee.getIngredients());

        myCoffee = new MilkAddon(myCoffee);
        System.out.println("Cost: " + myCoffee.getCost() + ", Ingredients: " + myCoffee.getIngredients());

        myCoffee = new ChicoryAddon(myCoffee);
        System.out.println("Cost: " + myCoffee.getCost() + ", Ingredients: " + myCoffee.getIngredients());
    }
}