package Lab_07;

import java.util.List;

public class VillageIterator {
    private List<VillageComponent> components;
    private int position;

    public VillageIterator(List<VillageComponent> components) {
        this.components = components;
        position = 0;
    }

    public boolean hasNext() {
        return position < components.size();
    }

    public VillageComponent next() {
        if (hasNext()) {
            VillageComponent component = components.get(position);
            position++;
            return component;
        }
        return null;
    }

    public List<VillageComponent> getComponents() {
        return components;
    }
}
