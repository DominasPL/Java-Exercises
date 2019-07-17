package Test.TestExercise;

import java.util.Map;

public class Basket {

    private Map<Item, Integer> orderedItems;

    public Basket(Map<Item, Integer> orderedItems) {
        this.orderedItems = orderedItems;
    }

    public Map<Item, Integer> getOrderedItems() {
        return orderedItems;
    }

    public void setOrderedItems(Map<Item, Integer> orderedItems) {
        this.orderedItems = orderedItems;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "orderedItems=" + orderedItems +
                '}';
    }
}
