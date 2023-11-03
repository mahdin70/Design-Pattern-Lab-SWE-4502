package Lab_06;

public interface ShoppingCart {
    public void addToCart(String item);
    public void checkOut(PaymentStrategy paymentStrategy);
}
