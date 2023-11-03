package Lab_02;

abstract class AbstractFoodOrder {
    public void processOrder(FoodOrder order) {
        validateOrder(order);
        prepareFood(order);
        cookFood(order);
        packFood(order);
        deliverFood(order);
        printReceipt(order);
    }

    protected abstract void validateOrder(FoodOrder order);

    protected abstract void prepareFood(FoodOrder order);

    protected abstract void cookFood(FoodOrder order);

    protected abstract void packFood(FoodOrder order);

    protected abstract void deliverFood(FoodOrder order);

    protected abstract void printReceipt(FoodOrder order);
}
