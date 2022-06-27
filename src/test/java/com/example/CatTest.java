package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)


public class CatTest {


    @Test
    public void testGetSound() {
        String expected = "Мяу";
        Cat cat = new Cat(new Feline());
        assertEquals(expected, cat.getSound());

    }


    @Test
    public void testGetFood() throws Exception {
        Feline felineMock = Mockito.mock(Feline.class);
        Cat cat = new Cat(felineMock);
        List<String> expected = List.of("Живтоные","Птицы", "Рыба");
        Mockito.when(felineMock.eatMeat()).thenReturn(expected);
        List<String> actual = cat.getFood();
        assertEquals(expected, actual);

    }

}





