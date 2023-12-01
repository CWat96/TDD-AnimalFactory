package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void testCreateDog() {
        //Given
        String name = ""; // create dog name
        Date birthDate = new Date(); // giving the dog a birthdate
        Dog dog = AnimalFactory.createDog(name, birthDate); // Dog is in animal factory with attributes
        //When
        String expectedName = dog.getName();
        //Then
        Assert.assertNotNull(dog);
        Assert.assertTrue(true);

    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void testCreateCat() {
        //Given
        String name = ""; // create cat name
        Date birthDate = new Date(); // giving the cat a birthdate
        Cat cat = AnimalFactory.createCat(name, birthDate); // Cat is in animal factory with attributes
        //When
        String expectedName = cat.getName();
        //Then
        Assert.assertNotNull(cat);
        Assert.assertTrue(true);

    }
}
