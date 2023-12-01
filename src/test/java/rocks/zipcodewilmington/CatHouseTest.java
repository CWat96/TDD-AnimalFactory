package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void testAddCat() {
        //Given
        String name = "Zula"; //create cat name
        Date birthDate = new Date(); // gave the cat a birthdate
        Integer id = 2525; // gave the cat an id
        Cat cat = new Cat(name, birthDate, id);
        //When
        CatHouse.add(cat); // retriving one cat from the cathouse
        //Then
        Cat retrieveCat = CatHouse.getCatById(id); // retrieve cat from cathouse by it's ID #
        Assert.assertNotNull(retrieveCat); //Checking if cat was added to house
        Assert.assertEquals(id, retrieveCat.getId());
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveCat() {
        //Given
        String name = "Zula"; //create cat name
        Date birthDate = new Date(); // gave the cat a birthdate
        Integer id = 2525; // gave the cat an id
        Cat cat = new Cat(name, birthDate, id);
        //When
        CatHouse.add(cat); // Adding cat before removing it
        CatHouse.remove(id); // removing cat/by i.d
        //Then
        Cat removedID = CatHouse.getCatById(id);
        Assert.assertTrue(true); // Checking if cat was removed
    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void test() {
        //Given
        String name = "Zula"; //create cat name
        Date birthDate = new Date(); // gave the cat a birthdate
        Integer id = 2525; // gave the cat an id
        Cat cat = new Cat(name, birthDate, id);
        //When
        CatHouse.add(cat); // Add cat to cathouse
        CatHouse.remove(cat); // Remove cat from cathouse
        //Then
        int numberOfCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(0, numberOfCats);
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
}
