package DesignPatterns.Adapter.Example1;

public class Paytm {
    private BankApi bankApi;

    public Paytm(BankApi bankApi) {
        this.bankApi = bankApi;
    }

    public void performOperation() {
        bankApi.getBalance();
        bankApi.transferFunds("Sujay", "Sowmya", 1000.0);
    }
}