package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import java.util.ArrayList;

import static android.test.MoreAsserts.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by stacyzolnikov on 7/13/16.
 */
public class ZooTest {

    @Test
    public void testZooAddButton() throws Exception {
        int expectedInt;
        int actualInt;

        Zoo zoo = Zoo.getInstance();

        zoo.addAnimal(new Lion(true));
        zoo.addAnimal(new Lion(true));
        zoo.addAnimal(new Lion(true));
        zoo.addAnimal(new Lion(true));

        expectedInt = 4;
        actualInt = zoo.getAnimals().size();
        assertTrue(expectedInt == actualInt);

    }


    @Test
    public void testRemoveAnimalButton() throws Exception {
        int actualInt;
        int expectedInt;
        Zoo zoo = Zoo.getInstance();

        zoo.addAnimal(new Lion(true));
        zoo.addAnimal(new Lion(true));
        zoo.addAnimal(new Lion(true));
        zoo.addAnimal(new Lion(true));
        zoo.getAnimals().remove(new Lion(true));

        expectedInt=3;
        actualInt = zoo.getAnimals().size();
        assertTrue(expectedInt == actualInt);

    }



}
