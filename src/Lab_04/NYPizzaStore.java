package Lab_04;
class NYPizzaStore extends PizzaStore {
    Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

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