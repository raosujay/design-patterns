package OOPS_Yt.Abstraction;

public class Main {
    public static void main(String[] args) {
        //'Car' is abstract; cannot be instantiated
        //Car c1 = new Car();
        //c1.start();

        //here car is a concept and from this concept we have create actual objects Audi and BMW so from here
        //we can create objects and call it
        Audi a1 = new Audi();
        a1.start();

        BMW b1 = new BMW();
        b1.start();
    }
}