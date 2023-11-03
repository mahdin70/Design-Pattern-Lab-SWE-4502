package Lab_07;

public class Tree extends CompositeVillageComponent{
    public Tree(String type, String shape1, String shape2) {
        setType(type);
        addShape(shape1);
        addShape(shape2);
    }
}
