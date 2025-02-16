package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void testAddDog() {
        //Given
        String name = "Milo";
        Date birthDate = new Date();
        Integer id = 2323;
        Dog dog = new Dog(name, birthDate, id);
        //When
        DogHouse.add(dog);
        //Then
        Dog retrieveDog = DogHouse.getDogById(id);
        Assert.assertNotNull(retrieveDog);
        Assert.assertEquals(id, retrieveDog.getId());
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveId() {
        //Given
        String name = "Milo";
        Date birthDate = new Date();
        Integer id = 2323;
        Dog dog = new Dog(name, birthDate, id);
        //When
        DogHouse.add(dog);
        DogHouse.remove(id);
        //Then
        Dog removedID = DogHouse.getDogById(id);
        Assert.assertTrue(true);
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void testRemoveDog() {
        //Given
        String name = "Milo";
        Date birthDate = new Date();
        Integer id = 2323;
        Dog dog = new Dog(name, birthDate, id);
        //When
        DogHouse.add(dog);
        DogHouse.remove(dog);
        //Then
        int numberOfDogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(3, numberOfDogs);
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void testDogById() {
        //Given
        String name = "Milo";
        Date birthDate = new Date();
        Integer id = 2323;
        Dog dog = new Dog(name, birthDate, id);
        //When
        DogHouse.add(dog);
        DogHouse.getDogById(id);
        //Then
        Dog retrieveId = DogHouse.getDogById(id);
        Assert.assertTrue(true);
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
