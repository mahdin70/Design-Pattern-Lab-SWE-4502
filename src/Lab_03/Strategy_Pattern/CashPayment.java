package Lab_03.Strategy_Pattern;

public class CashPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount){
        System.out.println("Cash payment of " + amount + " taka has been made.");
    }
}
