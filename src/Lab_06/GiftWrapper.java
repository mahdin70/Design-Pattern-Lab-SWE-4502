package Lab_06;

public class GiftWrapper implements ShoppingCart{
    ShoppingCart cart;
    public GiftWrapper(ShoppingCart cart){
        this.cart = cart;
    }
    public void addGiftPayment(){
        System.out.println("Extra amount is charged for the Gift Wrapping");
    }
    public void addGiftWrap(){
        System.out.println("The Item is Wrapped by Gift Wrapper ");
    }
    @Override
    public void addToCart(String item){
        cart.addToCart(item);
        this.addGiftWrap();
    }
    @Override
    public void checkOut(PaymentStrategy payment){
        cart.checkOut(payment);
        this.addGiftPayment();
    }
}
