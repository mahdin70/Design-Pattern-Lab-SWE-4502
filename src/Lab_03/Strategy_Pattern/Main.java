package Lab_03.Strategy_Pattern;

public class Main {
    public static void main(String[] args) {

        PaymentStrategy bkashPayment = new BkashPayment("01764257445");
        PaymentStrategy bankPayment = new BankPayment("4018 269102 300");
        PaymentStrategy cashPayment = new CashPayment();

        bkashPayment.processPayment(1000);
        bankPayment.processPayment(1500);
        cashPayment.processPayment(2000);
    }
}
