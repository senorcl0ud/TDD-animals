package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`

    @Test
    public void testGetNumberOfDogs() {
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        int expectedNumOfDogs = 1;
        DogHouse.add(animal);
        int actualNumOfDogs = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(expectedNumOfDogs,actualNumOfDogs);
    }

    @Test
    public void addTest(){
        //Given ( I have a dog object I want to add to the dogHouse)
        Dog dog = new Dog (null,null,null);
        DogHouse.clear();

        // When ( I try to add a dog to the dogHouse)
        int expectedDogGetsAdded = 1;
        DogHouse.add(dog);
        int afterDogGetsAdded = DogHouse.getNumberOfDogs();

        // Then ( I should expect the number of dogs in the dogHouse to increase by 1)
        Assert.assertEquals(expectedDogGetsAdded , afterDogGetsAdded);
    }

    @Test
    public void removeByIdTest(){
        //Given(I have a dog in the dogHouse and it has an id)
        DogHouse.clear();
        Dog dog = new Dog(null,null,1234567890);
        DogHouse.add(dog);
        int previousNumOfDogs = 0;

        //When(I call the remove method)
        DogHouse.remove(1234567890);
        int currentNumberOfDogs = DogHouse.getNumberOfDogs();

        //Then(I should expect the amount of dogs to be reduced by one
        Assert.assertEquals(previousNumOfDogs , currentNumberOfDogs);
    }
    @Test
    public void removeTest(){
        //Given(I have a dog and add it to the dogHouse )
        Dog dog = new Dog(null,null,null);
        int previousNumOfDogs = 0;
        DogHouse.add(dog);

        //When(I call the remove method)
        DogHouse.remove(dog);
        int currentNumberOfDogs = DogHouse.getNumberOfDogs();

        //Then(I should expect the amount of dogs to be reduced by one
        Assert.assertEquals(previousNumOfDogs , currentNumberOfDogs);

    }
    @Test
    public void getDogByIdTest(){
        //Given( I have a dog with and ID and I add it to the dogHouse)
        DogHouse.clear();
        Integer dogId = 1234567;
        Dog dog = new Dog(null,null, dogId);
        DogHouse.add(dog);

        //When (I try to get that dog by it's id)
        Dog expectedDog = dog;
        DogHouse.getDogById(dogId);
        Dog actualDog = DogHouse.getDogById(dogId);

        //Then (I should expect to get back the dog with that id)
        Assert.assertEquals(expectedDog,actualDog);
    }
}

