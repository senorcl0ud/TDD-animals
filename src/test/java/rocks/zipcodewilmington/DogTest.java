package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
    Dog dog = new Dog(null, null, null);
    String givenName = "Milo";

    // When (a dog's name is set to the given name)
        dog.setName(givenName);

    // Then (we expect to get the given name from the dog)
    String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }


    @Test
    public void constructorTest() {
        // Given (dog data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the dog)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void speakTest(){
        //Given (I have a cat)
        Dog dog = new Dog(null,null,null);
        String dogSpeechCheck = "bark!";

        //When ( A cat speaks,)
        String dogSpeech = dog.speak();

        //Then ( should should expect the cat to say meow)
        Assert.assertEquals(dogSpeechCheck, dogSpeech);

    }

    @Test
    public void setBirthDateTest() {
        // Given (a name exists and a cat exists)
        Dog dog = new Dog(null, null, null);
        Date givenBirthDate = new Date();
        // When (a cat's name is set to the given name)
        dog.setBirthDate(givenBirthDate);
        Date catBirthDate = dog.getBirthDate();

        // Then (we expect to get the given name from the cat)
        Assert.assertEquals(givenBirthDate, catBirthDate);

    }

    @Test
    public void eatTest(){
        //Given ( I have a cat and a Food and a List of eaten food)
        Dog dog = new Dog(null,null,null);
        Food aFood = new Food();


        //When ( I have a cat eat food)
        int beforeEating = 1 ;
        dog.eat(aFood);
        int afterEating = dog.getNumberOfMealsEaten();

        //Then (aFood should be added to eaten meals)
        Assert.assertEquals(beforeEating, afterEating);

    }

    @Test
    public void getIdTest(){
        //Given( I have a cat object and an id )
        Integer dogId = 1234567;
        Dog dog = new Dog(null,null,dogId);

        //When (I get the id of the cat)
        Integer currentDogId = dog.getId();

        //Then( I should expect the cat to return the current id it holds)
        Assert.assertEquals(currentDogId, dogId);
    }

    @Test
    public void instanceOfAnimalTest(){
        //Given (I have a cat object)
        Dog dog = new Dog ( null, null, null);


        //When (I check to see if it inherits Animal Class traits)


        //Then (I should expect that it shows it inherits)
        Assert.assertTrue(dog instanceof Animal);

    }
    @Test
    public void instanceOfMammalTest(){
        //Given(I have a cat object)
       Dog dog = new Dog ( null,null,null);
        //When(I check to see if it inherits Animal Class traits)

        //Then (I should expect if it inherits Animal Class Traits)
        Assert.assertTrue(dog instanceof Mammal);
    }
}
