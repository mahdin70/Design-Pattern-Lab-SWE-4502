package Lab_03.Strategy_Pattern;

public class BankPayment implements PaymentStrategy{
    private String accountNumber;

    public BankPayment(String accountNumber){
        this.accountNumber = accountNumber;
    }

    @Override
    public void processPayment(double amount){
        System.out.println("Bank payment of " + amount + " taka has been made.");
    }
}
