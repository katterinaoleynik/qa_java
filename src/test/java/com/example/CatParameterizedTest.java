package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CatParameterizedTest {
    private final String actual;
    private final String expected;

    public CatParameterizedTest(String actual, String expected) {
        Cat cat = new Cat(new Feline());
        this.actual = cat.getSound();
        this.expected = expected;

    }

    @Parameterized.Parameters
    public static Object[][] getSound() {
        return new Object[][]{
                {"Гав", "Мяу"},
                {"Мяу", "Мяу"}
        };
    }

    @Test
    public void checkGetSound() {
        assertEquals(actual, expected);

    }

}