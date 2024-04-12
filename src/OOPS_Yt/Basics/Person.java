package OOPS_Yt.Basics;

public class Person {
    //properties
    String name;
    int age;
    static  int count;
    public Person() {
        count++;
        System.out.println("calling constructor");
    }

    public Person(int newAge, String newName) {
        // this(); --> this is used to call default constructor with name Person()
        this.age = newAge;
        this.name = newName;
    }

    //behaviors are usually represented in methods
    //The behaviour of an object is represented by the methods it can perform
    void walk() {
        System.out.println(name + " is walking");
    }
    void walk(int steps) {
        System.out.println(name + " is walking " + steps + " steps");
    }
    void eat() {
        System.out.println(name + " is eating");
    }
    void doWork() {
        System.out.println("Person is working.");
    }
}