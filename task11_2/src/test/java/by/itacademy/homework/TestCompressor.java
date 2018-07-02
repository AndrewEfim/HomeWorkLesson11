package by.itacademy.homework;

import org.junit.Assert;
import org.junit.Test;

public class TestCompressor {

    Compressor compressor = new Compressor( );

    @Test
    public void testCompressor() {
        Assert.assertEquals(compressor.compressor("wersssssia"),("wers5ia"));
    }


}
