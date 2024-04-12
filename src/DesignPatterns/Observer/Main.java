package DesignPatterns.Observer;

public class Main {
    public static void main(String[] args) {
        Flipkart flipkart = Flipkart.getInstance();
        EmailSender emailSender = new EmailSender();
        WareHouseManagement wareHouseManagement = new WareHouseManagement();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

        flipkart.OrderPlaced();
    }
}
