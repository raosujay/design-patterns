package DesignPatterns.Adapter.Example1;

public class Main {
    public static void main(String[] args) {
        Paytm paytm = new Paytm(new HDFCAdapter());
        paytm.performOperation();

        System.out.println();

        Paytm paytm1 = new Paytm(new IDFCAdapter());
        paytm1.performOperation();
    }
}