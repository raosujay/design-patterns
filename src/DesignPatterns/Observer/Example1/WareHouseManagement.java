package DesignPatterns.Observer.Example1;

public class WareHouseManagement implements OrderPlaced{
    public WareHouseManagement() {
        Flipkart.getInstance().registerSubscriber(this);
    }

    @Override
    public void announceOrderPlaced() {
        System.out.println("WareHouse Updating");
    }
}
