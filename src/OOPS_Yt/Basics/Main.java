package OOPS_Yt.Basics;

import OOPS_Yt.Encapsulation.EncapIntro;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        //as soon as we create an object of a class, its default constructor is created and called in java here: Person().
        p1.age = 31;
        p1.name = "sujay";
        System.out.println(p1.name + " having age " + p1.age);

        Person p2 = new Person();
        p2.age = 28;
        p2.name = "sowmya";
        System.out.println(p2.name + " having age " + p2.age);

        p1.eat();

        //this is the best example for polymorphism
        p2.walk();
        p1.walk(55);

        System.out.println(Person.count + " No of times a constructor is called.");

        //constructor overloading
        Person p3 = new Person(52, "gayithri");
        System.out.println(p3.name + " age is " + p3.age);
        //no change because constructor is overloaded & this() is commented out.
        System.out.println(Person.count + " No of times a constructor is called.");

        //here in this developer class, all the properties and behaviors of person is working because of inheritance.
        Developer d1 = new Developer(32, "Nikesh");
        d1.doWork();
        d1.walk();
        //here it is looking initially for Developer walk method, and it is returning the output
        //this is run time polymorphism
        //if it is not found, then it'll look into parent class and return the output.
        d1.walk(25);
        System.out.println();

        //Encapsulation
        EncapIntro obj = new EncapIntro();
        obj.doSomething();
        //obj.doWork(); not working --> bcz doWork() is not public.
    }
}
