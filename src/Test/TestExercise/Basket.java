package Test.TestExercise;

import java.util.HashMap;
import java.util.Map;

public class Basket {

    private Map<Item, Integer> orderedItems;

    public Basket() {
        this.orderedItems = new HashMap<>();
    }

    public Map<Item, Integer> getOrderedItems() {
        return orderedItems;
    }

    public void setOrderedItems(Map<Item, Integer> orderedItems) {
        this.orderedItems = orderedItems;
    }

    public void addItemToBasket(Item item, int amount) {

        if (orderedItems.containsKey(item)) {
            orderedItems.put(item, orderedItems.get(item) + amount);
        } else {
            orderedItems.put(item, amount);
        }

    }

    public void removeItemFromBasket(Item item, int amount) {

        if (orderedItems.containsKey(item) && amount > 0 && amount < orderedItems.get(item))
            orderedItems.put(item, orderedItems.get(item) - amount);

        else if (orderedItems.containsKey(item) && amount == orderedItems.get(item))
            orderedItems.remove(item);

        else
            throw new IllegalArgumentException("An item is not in the basket or an amount is incorrect!");

    }
}
