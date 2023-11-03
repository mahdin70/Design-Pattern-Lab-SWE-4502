package Lab_07;

public class VillageBuilder {
    private CompositeVillageComponent village = new CompositeVillageComponent();

    public void buildHouse(House house) {
        village.addComponent(house);
    }

    public void buildTree(Tree tree) {
        village.addComponent(tree);
    }

    public void buildWaterSource(WaterSource waterSource) {
        village.addComponent(waterSource);
    }

    public CompositeVillageComponent getVillage() {
        return village;
    }
}
