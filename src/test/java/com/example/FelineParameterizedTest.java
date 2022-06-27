package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {
    private final String actual;
    private final String expected;



    public FelineParameterizedTest(String actual, String expected)  {
        Feline feline = new Feline();
        this.actual = feline.getFamily();
        this.expected = expected;

    }

    @Parameterized.Parameters
    public static Object[][] getFamily() {
        return new Object[][]{
                {"Собачьи", "Кошачьи"},
                {"Кошачьи", "Кошачьи"}
        };
    }

    @Test
    public void chekGetFamily()  {
        assertEquals(expected, actual);
    }

}