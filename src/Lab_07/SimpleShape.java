package Lab_07;

public class SimpleShape implements VillageComponent{
    private String name;

    public SimpleShape(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println(name);
    }
}
