package Lab_07;

public class WaterSource extends CompositeVillageComponent{
    public WaterSource(String type, String shape1, String shape2) {
        setType(type);
        addShape(shape1);
        addShape(shape2);
    }
}
