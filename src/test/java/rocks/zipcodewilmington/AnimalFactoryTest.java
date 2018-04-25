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
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest() {
    //Given ( That I create a dogHouse to put dog objects in )

    //When (I use create a dog)
        Dog newDog = AnimalFactory.createDog("fido", new Date());

        long  dogId = newDog.getId();
    //Then (I should expect to have an Id based on the number of dogs in the house)
        Assert.assertEquals(dogId,0);

    }
    @Test
    public void createCatTest() {
        //Given ( That I create a dogHouse to put dog objects in )

        //When (I use create a dog)
        Cat newCat = AnimalFactory.createCat("fluffy", new Date());
        long catId = newCat.getId();
        //Then (I should expect to have an Id based on the number of dogs in the house)
        Assert.assertEquals(catId,0);

    }


}
