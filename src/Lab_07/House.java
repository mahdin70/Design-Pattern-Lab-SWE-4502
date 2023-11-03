package Lab_07;

public class House extends CompositeVillageComponent {
    public House(String type, String shape1, String shape2) {
        setType(type);
        addShape(shape1);
        addShape(shape2);
    }
}