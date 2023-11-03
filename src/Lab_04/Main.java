package Lab_04;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza nyCheesePizza = nyStore.orderPizza("cheese");
        if (nyCheesePizza != null) {
            System.out.println("Ethan ordered a " + nyCheesePizza);
        }

        Pizza chicagoPepperoniPizza = chicagoStore.orderPizza("pepperoni");
        if (chicagoPepperoniPizza != null) {
            System.out.println("Joel ordered a " + chicagoPepperoniPizza);
        }
    }
}