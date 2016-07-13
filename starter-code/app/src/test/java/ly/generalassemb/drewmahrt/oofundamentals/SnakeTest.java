package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by stacyzolnikov on 7/13/16.
 */
public class SnakeTest {

    Snake snake = new Snake(true);

    @Test
    public void testSnakeNoise() throws Exception{
        String actualString;
        String expectedString;

        expectedString = "Hiss!!!";
        actualString = snake.makeNoise();
        assertEquals("Method is correct", expectedString, actualString);
    }

    public void testSnakeTopSpeed() throws Exception{
        int actualInt;
        int expectedInt;

        expectedInt = 5;
        actualInt = snake.getTopSpeed();
        assertEquals("Method is correct", expectedInt, actualInt);
    }
}
