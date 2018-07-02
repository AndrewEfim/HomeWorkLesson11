package by.itacademy.homework;

import org.junit.Assert;
import org.junit.Test;

public class TestDeCompressor {

    DeCompressor deCompressor = new DeCompressor();
    @Test
    public void testDeCompressor(){
        Assert.assertEquals(deCompressor.deCompressor("wers5ia"),("wersssssia"));
    }
}
