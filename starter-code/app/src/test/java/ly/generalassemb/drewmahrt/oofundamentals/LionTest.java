package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by stacyzolnikov on 7/13/16.
 */
public class LionTest {

    Lion lion = new Lion(true);
    @Test
    public void testLionSound() throws Exception {
        String expectedString;
        String actualString;

        expectedString = "Roar!!!";
        actualString = lion.makeNoise();
        assertEquals("Method is correct", expectedString, actualString);
    }

    @Test
    public void testLionTopSpeed() throws Exception{
            int expectedInt;
            int actualInt;

            expectedInt = 50;
            actualInt = lion.getTopSpeed();
            assertEquals("Method is correct", expectedInt, actualInt);

        }
    }


