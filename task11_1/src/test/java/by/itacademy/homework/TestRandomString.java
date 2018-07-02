package by.itacademy.homework;

import by.itacademy.homework.random.RandomString;
import org.junit.Assert;
import org.junit.Test;

public class TestRandomString {
    @Test
    public void randomIsRandom(){
        Assert.assertNotEquals(new RandomString().execute(),"Metallica");

    }
}
