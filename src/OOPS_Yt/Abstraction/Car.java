package OOPS_Yt.Abstraction;

abstract class Car {
    //abstract means a non-existence concept, so we are not allowed to create a object from this class.
    int price;
    String color;
//    void start() {
//        System.out.println("Car is Starting");
//    }
//    if we make start as abstract, then the method will not have a body, or it is not allowed in java.

    abstract void start();

    //in this abstract class, true abstraction of the following methods is not possible, so we prefer interfaces.
    void breaks() {
        System.out.println("Car is applying break");
    }
}