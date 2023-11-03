package Lab_06;

public class Main {
    public static void main(String[] args) {
        ShoppingCartFactory ShoppingCartFactory = new ShoppingCartFactory();

        BkashPaymentStrategy bkash = new BkashPaymentStrategy("01764257445");

        GiftWrapper giftWrapper  = new GiftWrapper(ShoppingCartFactory.CreateShoppingCart("Regular"));

        giftWrapper.addToCart("Football");
        giftWrapper.checkOut(bkash);
    }
}
