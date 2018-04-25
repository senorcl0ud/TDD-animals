package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;
import sun.security.x509.CertAttrSet;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a cat exists)
        Cat cat = new Cat(null, null, null);
        String givenName = "Milo";

        // When (a cat's name is set to the given name)
        cat.setName(givenName);

        // Then (we expect to get the given name from the cat)
        String catName =cat.getName();
        Assert.assertEquals(catName, givenName);


    }

    @Test
    public void speakTest(){
        //Given (I have a cat)
        Cat cat = new Cat(null,null,null);
        String catSpeechCheck = "meow!";

        //When ( A cat speaks,)
        String catSpeech = cat.speak();

        //Then ( should should expect the cat to say meow)
        Assert.assertEquals(catSpeechCheck, catSpeech);

    }

    @Test
    public void setBirthDateTest() {
        // Given (a name exists and a cat exists)
        Cat cat = new Cat(null, null, null);
        Date givenBirthDate = new Date();
        // When (a cat's name is set to the given name)
          cat.setBirthDate(givenBirthDate);
          Date catBirthDate = cat.getBirthDate();

        // Then (we expect to get the given name from the cat)
        Assert.assertEquals(givenBirthDate, catBirthDate);

    }

    @Test
    public void eatTest(){
        //Given ( I have a cat and a Food and a List of eaten food)
        Cat cat = new Cat(null,null,null);
        Food aFood = new Food();


        //When ( I have a cat eat food)
        int beforeEating = cat.getNumberOfMealsEaten();
        cat.eat(aFood);
        int afterEating = cat.getNumberOfMealsEaten();

        //Then (aFood should be added to eaten meals)
        Assert.assertEquals(beforeEating + 1, afterEating);

    }
    @Test
    public void getIdTest(){
        //Given( I have a cat object and an id )
        Integer catId = 1234567;
        Cat cat = new Cat(null,null,catId);

        //When (I get the id of the cat)
        Integer currentCatId = cat.getId();

        //Then( I should expect the cat to return the current id it holds)
        Assert.assertEquals(currentCatId, catId);
    }

    @Test
    public void instanceOfAnimalTest(){
        //Given (I have a cat object)
        Cat cat = new Cat ( null, null, null);


        //When (I check to see if it inherits Animal Class traits)


        //Then (I should expect that it shows it inherits)
        Assert.assertEquals(true, cat instanceof Animal );

    }
    @Test
    public void instanceOfMammalTest(){
        //Given(I have a cat object)
        Cat cat = new Cat ( null,null,null);
        //When(I check to see if it inherits Animal Class traits)

        //Then (I should expect it inherits Animal Class Traits)
        Assert.assertEquals(true, cat instanceof Mammal);
    }
}
