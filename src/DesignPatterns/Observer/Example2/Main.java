package DesignPatterns.Observer.Example2;

public class Main {
    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();
        //observer - Tv9
        NewsChannel tv9 = new NewsChannel();

        observable.addObserver(tv9);
        observable.setNews("Breaking News !!! from Tv9");
        System.out.println(tv9.getNews());
    }
}