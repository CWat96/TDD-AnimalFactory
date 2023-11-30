package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest() {
        //Given
        String name = "Zula";
        Date birthDate = new Date();
        Integer id = 2525;
        Cat Zula = new Cat(name, birthDate, id);
        //When
        String Actual = "Zula";
        String Expected = Zula.getName();
        //Then
        Assert.assertEquals(Actual, Expected);
    }

    // TODO - Create tests for `speak`
    @Test
    public void testSpeak() {
        //Given
        String name = "Zula";
        Date birthDate = new Date();
        Integer id = 2525;
        Cat zula = new Cat(name, birthDate, id);
        String expected = "meow!";

        //When
        String Actual = zula.speak();
        //Then
        Assert.assertEquals(expected, Actual);
    }

        // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthDate() {
            //Given
            String name = "Zula";
            Date birthDate = new Date();
            Integer id = 2525;
            Cat cat = new Cat(name, birthDate, id);
            Date expectedBirthDate = new Date();
            //When
            cat.setBirthDate(expectedBirthDate);
            //Then
            Date actualBirthdate = cat.getBirthDate();
            Assert.assertEquals(expectedBirthDate, actualBirthdate);
        }

        // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat() {
        //Given
        String name = "Zula";
        Date birthDate = new Date();
        Integer id = 2525;
    }


        // TODO - Create tests for `Integer getId()`
        // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
        // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    }

//    @Test
//    public void constructorTest() {
//        // Given (cat data)
//        String givenName = "Zula";
//        Date givenBirthDate = new Date();
//        Integer givenId = 0;
//
//        // When (a cat is constructed)
//        Cat cat = new Cat(givenName, givenBirthDate, givenId);
//
//        // When (we retrieve data from the cat)
//        String retrievedName = cat.getName();
//        Date retrievedBirthDate = cat.getBirthDate();
//        Integer retrievedId = cat.getId();
//
//        // Then (we expect the given data, to match the retrieved data)
//        Assert.assertEquals(givenName, retrievedName);
//        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
//        Assert.assertEquals(givenId, retrievedId);
//    }
//    }
