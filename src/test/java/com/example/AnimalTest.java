package com.example;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

public class AnimalTest {

    @Test
    public void checkGetFamily() {
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, " +
                "кошачьи, псовые, медвежьи, куньи";
        Animal animal = new Animal();
        assertEquals(expected, animal.getFamily());
    }


    @Test
    public void testGetFoodForHerbivore() throws Exception {
        Animal animalMock = Mockito.mock(Animal.class);

        ArrayList<String> herbivoreFood = new ArrayList<>();
        herbivoreFood.add("Трава");
        herbivoreFood.add("Различные растения");

        when(animalMock.getFood("Травоядное")).thenReturn(herbivoreFood);
        Animal animal = new Animal();

        List<String> food = animal.getFood("Травоядное");

        assertEquals(herbivoreFood, food);
    }

    @Test
    public void checkGetFoodForPredator() throws Exception {
        Animal animalMock = Mockito.mock(Animal.class);

        ArrayList<String> predatorFood = new ArrayList<>();
        predatorFood.add("Животные");
        predatorFood.add("Птицы");
        predatorFood.add("Рыба");

        when(animalMock.getFood("Хищник")).thenReturn(predatorFood);
        Animal animal = new Animal();

        List<String> food = animal.getFood("Хищник");

        assertEquals(predatorFood, food);
    }

    @Test
    public void checkGetFoodForUnknownSpecies() {

        try {
            Animal animal = new Animal();
            animal.getFood("Человек");
            fail("Expected exception was not thrown");
        } catch (Exception e) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник",
                    e.getMessage());


        }
    }

}
