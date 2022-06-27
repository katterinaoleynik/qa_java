package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineTest {


    @Test
    public void testGetKittens() {
        int expected = 1;
        Feline feline = new Feline();
        assertEquals(expected, feline.getKittens());

    }

    @Test
    public void testGetFamily() {
        String expected = "Кошачьи";
        Feline feline = new Feline();
        assertEquals(expected, feline.getFamily());

    }
}











