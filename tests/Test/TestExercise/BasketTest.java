package Test.TestExercise;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static org.junit.Assert.*;

public class BasketTest {

    private Basket basket;
    private Item item;

    @Before
    public void setUp() {
        basket = new Basket();
        item = new Item("Watermelon", 20);
    }

    @Test
    public void shouldAllowToAddItemWithQuantityOne() {
        basket.addItemToBasket(item, 1);
        Map<Item, Integer> map = new HashMap<>();
        map.put(item, 1);
        assertEquals(basket.getOrderedItems(), map);
    }

    @Test
    public void shouldAllowToAddItemWithManyQuantity() {
        basket.addItemToBasket(item, 300);
        Map<Item, Integer> map = new HashMap<>();
        map.put(item, 300);
        assertEquals(basket.getOrderedItems(), map);
    }

    @Test
    public void shouldAllowToAddNewItemToTheBasket() {
        basket.addItemToBasket(item, 10);
        assertTrue(basket.getOrderedItems().containsKey(item));
        assertEquals(10, (int) basket.getOrderedItems().get(item));
    }
//
    @Test
    public void shouldAllowToRemoveItemFromBasket() {
        basket.addItemToBasket(item, 10);
        basket.removeItemFromBasket(item,10);
        assertFalse(basket.getOrderedItems().containsKey(item));
    }


    @Test
    public void shouldAllowToChangeItemAmountInTheBasket() {
        basket.addItemToBasket(item, 10);
        basket.removeItemFromBasket(item,5);
        assertEquals(5, (int) basket.getOrderedItems().get(item));
    }


    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionWhenBasketIsEmpty() {
        basket.removeItemFromBasket(item, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionWhenAmountIsZero() {
        basket.addItemToBasket(item, 10);
        basket.removeItemFromBasket(item, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionWhenItemIsNotInTheBasket() {
        Item item1 = new Item("Pineapple", 10);
        basket.addItemToBasket(item, 10);
        basket.removeItemFromBasket(item1, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionWhenAmountIsGreaterThanItemAmountInBasket() {
        basket.addItemToBasket(item, 10);
        basket.removeItemFromBasket(item, 500);
    }


}