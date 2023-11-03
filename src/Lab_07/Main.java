package Lab_07;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        VillageBuilder builder = new VillageBuilder();

        House house = new MudHouse("Triangle", "Square");
        Tree tree = new MangoTree("Circle", "Triangle");
        WaterSource waterSource = new SwimmingPool("Square", "Circle");

        builder.buildHouse(house);
        builder.buildTree(tree);
        builder.buildWaterSource(waterSource);

        CompositeVillageComponent village = builder.getVillage();

        System.out.println("Village Components:");
        VillageIterator iterator = new VillageIterator(village.getComponents());
        String lastType = null;

        while (iterator.hasNext()) {
            VillageComponent component = iterator.next();
            if (component instanceof CompositeVillageComponent) {
                CompositeVillageComponent composite = (CompositeVillageComponent) component;
                String type = composite.getClass().getSimpleName();
                if (!type.equals(lastType)) {
                    System.out.println("Component Name: " + composite.getType() + ", Declared Shapes: " + composite.getShapes());
                }
                lastType = type;
            }
        }
    }
}
