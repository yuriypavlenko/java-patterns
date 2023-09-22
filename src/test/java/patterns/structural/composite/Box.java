package patterns.structural.composite;

import java.util.ArrayList;

public class Box implements Item {
    private final float cost;
    private final ArrayList<Item> items;

    Box (float cost) {
        this.cost = cost;
        items = new ArrayList<>();
    }

    public Box add(Item item) {
        this.items.add(item);
        return this;
    }

    public Box clear() {
        this.items.clear();
        return this;
    }

    @Override
    public float getCost() {
        float costTotal = cost;
        for (Item item : items) {
            costTotal += item.getCost();
        }
        return costTotal;
    }
}
