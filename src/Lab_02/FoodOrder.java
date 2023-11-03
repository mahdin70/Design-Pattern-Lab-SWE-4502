package Lab_02;

public class FoodOrder {
    private String customerName;
    private String foodItem;
    private double totalPrice;

    public FoodOrder(String customerName, String foodItem, double totalPrice) {
        this.customerName = customerName;
        this.foodItem = foodItem;
        this.totalPrice = totalPrice;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}

