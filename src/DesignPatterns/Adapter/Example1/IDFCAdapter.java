package DesignPatterns.Adapter.Example1;

public class IDFCAdapter implements BankApi{
    @Override
    public double getBalance() {
        System.out.println("Getting balance from IDFC Bank");
        return 0;
    }

    @Override
    public void transferFunds(String from, String to, Double amount) {
        System.out.println("Transferring balance via IDFC Bank");
    }
}
