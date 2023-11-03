package Lab_04;

abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Veggies[] veggies;
    Pepperoni pepperoni;

    Clams clam;

    abstract void prepare();

    void bake() {
        System.out.println("Baking for 25 minutes at 350°F");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Placing the pizza in a box");
    }

    @Override
    public String toString() {
        return name ;
    }
}