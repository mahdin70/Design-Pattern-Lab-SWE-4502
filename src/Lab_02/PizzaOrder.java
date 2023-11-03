package Lab_02;

public class PizzaOrder extends AbstractFoodOrder{
    @Override
    protected void validateOrder(FoodOrder order) {
        System.out.println("Validating " + order.getFoodItem() + " order for " + order.getCustomerName());
    }
    @Override
    protected void prepareFood(FoodOrder order) {
        System.out.println("Preparing " + order.getFoodItem() + " order for " + order.getCustomerName());
    }
    @Override
    protected void cookFood(FoodOrder order) {
        System.out.println("Baking " + order.getFoodItem() + " order for " + order.getCustomerName());
    }
    @Override
    protected void packFood(FoodOrder order) {
        System.out.println("Packing " + order.getFoodItem() + " order for " + order.getCustomerName());
    }
    @Override
    protected void deliverFood(FoodOrder order) {
        System.out.println("Delivering " + order.getFoodItem() + " order for " + order.getCustomerName());
    }
    @Override
    protected void printReceipt(FoodOrder order) {
        System.out.println("Printing receipt for " + order.getFoodItem() + " order for " + order.getCustomerName() + " || Amount : "+ order.getTotalPrice());
    }
}
