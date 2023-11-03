package Lab_06;

public class OnlinePaymentStrategy implements PaymentStrategy {
    private String Email;

    public OnlinePaymentStrategy(String Email){
        this.Email = Email;
    }
    @Override
    public void pay(){
        System.out.println("OP has transacted the amount :"+ this.Email);
    }
}
