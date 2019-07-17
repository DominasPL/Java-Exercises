package Test.TestExercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionOnWrongPriceParameter() {
        new Item("Apple", -10);
    }



}