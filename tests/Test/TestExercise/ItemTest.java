package Test.TestExercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void itemShouldNotBeNull() {

        Item item = new Item("Apple", 12);
        assertNotNull(item);

    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionOnWrongPriceParameter() {
        new Item("Apple", -10);
    }



}