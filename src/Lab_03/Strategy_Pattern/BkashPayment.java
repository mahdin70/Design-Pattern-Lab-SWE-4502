package Lab_03.Strategy_Pattern;

public class BkashPayment implements PaymentStrategy{
    private String phoneNumber;

    public BkashPayment(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void processPayment(double amount){
        System.out.println("Bkash payment of " + amount + " taka has been made.");
    }
}
