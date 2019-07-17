package Test.TestExercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void itemShouldNotBeNull() {
        Item item = new Item("Apple", 12);
        assertNotNull(item);
    }

    @Test
    public void itemShouldHaveRightAttributesValues() {
        Item item = new Item("Apple", 12);
        assertEquals("Apple", item.getName());
        assertEquals(12d, item.getPrice(), 0.1);

    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionOnWrongPriceParameter() {
        new Item("Apple", -10);
    }



}