package Lab_02;

public class Main {
    public static void main(String[] args) {
        FoodOrder pizzaOrder = new FoodOrder("Mukit", "Pizza", 1200);
        FoodOrder burgerOrder = new FoodOrder("Jarif", "Burger", 400);

        PizzaOrder pizzaProcessor = new PizzaOrder();
        BurgerOrder burgerProcessor = new BurgerOrder();

        pizzaProcessor.processOrder(pizzaOrder);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        burgerProcessor.processOrder(burgerOrder);

    }
}
