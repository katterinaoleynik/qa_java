package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    Feline feline = new Feline();
    private final String gender;
    private final boolean expected;

    @Parameterized.Parameters
    public static Object[][] getGender() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    public LionParameterizedTest(String gender, boolean expected) {
        this.gender = gender;
        this.expected = expected;
    }

    @Test
    public void createLionMaleTest() throws Exception {
        Lion lion = new Lion(feline, gender);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }
}