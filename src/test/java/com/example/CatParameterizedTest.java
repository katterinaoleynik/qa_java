package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CatParameterizedTest {
    String actual;
    private final String expected;

    public CatParameterizedTest(String actual, String expected) {
        this.actual = actual;
        this.expected = expected;

    }

    @Parameterized.Parameters
    public static Object[][] getSound() {
        return new Object[][]{
                {"Гав", "Мяу"},
                {"Хрю", "Мяу"}
        };
    }

    @Test
    public void checkGetSound() {
        String actual = "Мяу";
        assertEquals(actual, expected);

    }

}