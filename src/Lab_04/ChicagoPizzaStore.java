package Lab_04;

class ChicagoPizzaStore extends PizzaStore {
    Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if ("cheese".equals(type)) {
            return new CheesePizza(ingredientFactory);
        }
        else if ("pepperoni".equals(type)) {
            return new PepperoniPizza(ingredientFactory);
        }
        else {
            System.out.println("Invalid pizza type: " + type);
            return null;
        }
    }
}