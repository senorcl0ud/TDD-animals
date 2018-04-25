package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testGetNumberOfCats() {
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        int expectedNumOfCats = 1;
        CatHouse.add(animal);
        int actualNumOfDogs = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expectedNumOfCats,actualNumOfDogs);
    }

    @Test
    public void addTest(){
        //Given ( I have a dog object I want to add to the dogHouse)
        CatHouse.clear();
        Cat cat = new Cat (null,null,null);

        // When ( I try to add a dog to the dogHouse)
        int whenCatGetsAdded = 1; // number of cats should equal 1
        CatHouse.add(cat);
        int afterCatGetsAdded = CatHouse.getNumberOfCats();

        // Then ( I should expect the number of dogs in the dogHouse to increase by 1)
        Assert.assertEquals(whenCatGetsAdded , afterCatGetsAdded);
    }

    @Test
    public void removeByIdTest(){
        CatHouse.clear();
        //Given(I have a cat in the catHouse and it has an id)
        Cat cat = new Cat(null,null,1234567890);
        CatHouse.add(cat);
        int currentNumberOfCats = CatHouse.getNumberOfCats();

        //When(I call the remove method)
        CatHouse.remove(1234567890);
        int expectedNumOfCats = 1 ;

        //Then(I should expect the amount of dogs to be reduced by one
        Assert.assertEquals(expectedNumOfCats, currentNumberOfCats);
    }
    @Test
    public void removeTest(){
        CatHouse.clear();
        //Given(I have a dog in the dogHouse )
        Cat cat = new Cat(null,null,null);
        int previousNumOfCats = CatHouse.getNumberOfCats();

        //When(I call the remove method)
        CatHouse.remove(cat);
        int currentNumberOfCats = CatHouse.getNumberOfCats();

        //Then(I should expect the amount of dogs to be reduced by one
        Assert.assertEquals(previousNumOfCats, currentNumberOfCats);
    }
    @Test
    public void getCatByIdTest(){
        //Given( I have a cat with and ID and I add it to the dogHouse)
        CatHouse.clear();
         Integer catId = 1234567;
        Cat cat = new Cat(null,null, catId);
        CatHouse.add(cat);

        //When (I try to get that dog by it's id)
        Cat expectedCat = cat;
        Cat actualCat = CatHouse.getCatById(catId);

        //Then (I should expect to get back the dog with that id)
        Assert.assertEquals(expectedCat,actualCat);
    }

}
