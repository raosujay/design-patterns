package DesignPatterns.Adapter.Example1;

public interface BankApi {
    double getBalance();
    void transferFunds(String from, String to, Double amount);
}