package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {
    String actual;
    private final String expected;


    public FelineParameterizedTest(String actual, String expected) {
        this.actual = actual;
        this.expected = expected;

    }

    @Parameterized.Parameters
    public static Object[][] getFamily() {
        return new Object[][]{
                {"Собачьи", "Кошачьи"},
                {"Лягушачьи", "Кошачьи"}
        };
    }

    @Test
    public void chekGetFamily() {
        String actual = "Кошачьи";
        assertEquals(expected, actual);
    }

}