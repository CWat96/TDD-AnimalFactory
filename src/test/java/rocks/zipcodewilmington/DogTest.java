package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `speak`
    @Test
    public void testSpeak() {
        //Given
        String name = "";
        Date birthDate = new Date();
        Integer id = 2323;
        Dog dog = new Dog(name, birthDate, id);
        String expected = "bark!";

        //When
        String Actual = dog.speak();
        //Then
        Assert.assertEquals(expected, Actual);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthDate() {
        //Given
        String name = "";
        Date birthDate = new Date();
        Integer id = 2323;
        Dog dog = new Dog(name, birthDate, id);
        Date expectedBirthDate = new Date();
        //When
        dog.setBirthDate(expectedBirthDate);
        //Then
        Date actualBirthdate = dog.getBirthDate();
        Assert.assertEquals(expectedBirthDate, actualBirthdate);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat() {
        //Given
        String name = ""; //create dog name
        Date birthDate = new Date(); // gave the dog a birthdate
        Integer id = 2323; // gave the dog an id
        Dog dog = new Dog(name, birthDate, id); // created a new dog and implemented its attributes
        Food food = new Food(); // created new food for the dog
        // When
        Integer Expected = 1; // when its time for the dog to eat it will increase its food +1
        dog.eat(food); // the dog eats the food
        Integer numberOfMealsEaten = dog.getNumberOfMealsEaten(); // the number of meals is = to dog gets +1 number of meals
        // Then
        Assert.assertEquals(Expected, numberOfMealsEaten); // compare what you expect in "when' to numberofmealseaten
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void testId() {
        //Given
        String name = ""; // create dog name
        Date birthDate = new Date(); // giving the dog a birthdate
        Integer id = 2323; // giving the dog an id
        Dog dog = new Dog(name, birthDate, id); // create new dog with attributes
        //When
        Integer Expected = 2323; // expected ID number that was previously initialized
        dog.getId(); // get the dog ID
        id = dog.getId();
        //Then
        Assert.assertEquals(Expected, id);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";
        Date birthDate = new Date();
        Integer id = 2323;

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
