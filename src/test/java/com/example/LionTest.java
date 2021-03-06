package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)

public class LionTest {


    @Test
    public void testLionMaleHasMane() throws Exception {
        Lion lion = new Lion(new Feline(), "Самец");

        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void testLionFemaleHasNoMane() throws Exception {
        Lion lion = new Lion(new Feline(), "Самка");

        assertFalse(lion.doesHaveMane());
    }

    @Test
    public void testThereIsOnlyTwoGenders() {
        try {
            new Lion(new Feline(), "Неизвестный пол");
            fail("Expected exception was not thrown");
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
    }

    @Test
    public void testEatFoodMale() throws Exception {
        Feline felineMock = Mockito.mock(Feline.class);

        List<String> felineFood = List.of("Трава", "Различные растения");

        when(felineMock.eatMeat()).thenReturn(felineFood);
        Lion lion = new Lion(felineMock, "Самец");

        List<String> food = lion.getFood();

        assertEquals(felineFood, food);
    }

    @Test
    public void testEatFoodFemale() throws Exception {
        Feline felineMock = Mockito.mock(Feline.class);

        List<String> felineFood =  List.of("Трава", "Различные растения");

        when(felineMock.eatMeat()).thenReturn(felineFood);
        Lion lion = new Lion(felineMock, "Самка");

        List<String> food = lion.getFood();

        assertEquals(felineFood, food);
    }

    @Test
    public void testEatMeatMale() throws Exception {

        List<String> felineFood = List.of("Животные", "Птицы", "Рыба");

        Lion lion = new Lion(new Feline(), "Самец");

        List<String> food = lion.getFood();

        assertEquals(felineFood, food);
    }

    @Test
    public void testEatMeatFemale() throws Exception {

        List<String> felineFood =  List.of("Животные", "Птицы", "Рыба");

        Lion lion = new Lion(new Feline(), "Самка");

        List<String> food = lion.getFood();

        assertEquals(felineFood, food);
    }


    @Test
    public void testGetKittensMale() throws Exception {
        Lion lion = new Lion(new Feline(), "Самец");

        assertEquals(1, lion.getKittens());
    }

    @Test
    public void testGetKittensFemale() throws Exception {
        Lion lion = new Lion(new Feline(), "Самка");

        assertEquals(1, lion.getKittens());
    }


}
