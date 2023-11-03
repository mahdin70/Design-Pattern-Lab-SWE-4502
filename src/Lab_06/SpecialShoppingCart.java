package Lab_06;

public class SpecialShoppingCart implements ShoppingCart {
    @Override
    public void addToCart(String item){
        System.out.println(item + " is added to special shopping cart") ;
    }
    @Override
    public void checkOut(PaymentStrategy paymentStrategy){
        paymentStrategy.pay();
    }
}