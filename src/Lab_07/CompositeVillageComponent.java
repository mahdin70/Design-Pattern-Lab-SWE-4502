package Lab_07;

import java.util.ArrayList;
import java.util.List;

public class CompositeVillageComponent implements VillageComponent {
    private List<VillageComponent> components = new ArrayList<>();
    private String type;
    private List<String> shapes = new ArrayList<>();

    public void addComponent(VillageComponent component) {
        components.add(component);
    }

    @Override
    public void display() {
        for (VillageComponent component : components) {
            component.display();
        }
    }

    public List<VillageComponent> getComponents() {
        return components;
    }

    public String getType() {
        return type;
    }

    public List<String> getShapes() {
        return shapes;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void addShape(String shape) {
        shapes.add(shape);
    }
}
