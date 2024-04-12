package OOPS_Yt.Basics;

//Inheritance example
class Developer extends Person{
    public Developer(int age, String name) {
        //super keyword is used to call parent constructor
        super(age, name);
    }
    public void walk() {
        System.out.println("Developer " + name + " is walking");
    }
}
