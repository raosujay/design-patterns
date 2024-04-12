package OOPS_Yt.Encapsulation.Example2;

public class Laptop {
    int ram;
    private int price;

    public void setPrice(int price) {
        //if we make it false then we can't set the price
        boolean isAdmin = false;
        if(!isAdmin) {
            System.out.println("you can't set the price");
        } else {
            this.price = price;
        }
    }

    public int getPrice() {
        return price;
    }
}