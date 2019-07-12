package Test.Testy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetRockTest {

    @Test
    void getName() {

        PetRock petRock = new PetRock("Andrzej");
        assertEquals("Andrzej", petRock.getName());

    }

    @Test
    void testHappy() {

        PetRock petRock = new PetRock("Andrzej");
        petRock.testUnhappyToStart();

    }

    @Test
    void testHappyAfterPlay() {


    }
}