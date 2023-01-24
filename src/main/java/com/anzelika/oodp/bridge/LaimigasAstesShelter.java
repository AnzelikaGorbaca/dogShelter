package com.anzelika.oodp.bridge;

import com.anzelika.oodp.builder.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static java.lang.System.out;

public class LaimigasAstesShelter extends DogShelterAbstraction{

    public LaimigasAstesShelter(String name, String address, int maxCapacity, int count, List<Dog> dogs,
            ShelterType shelterType) {
        super(name, address, maxCapacity, count, dogs, shelterType);
    }

    @Override
    public void addDog(Dog dog) {
        if(dogs.size() < maxCapacity) {
            dogs.add(dog);
            count ++;
        } else {
            System.out.println("Laimigas Astes Shelter is full, dog can't be added now, but you can contact Shelter directly to reserve place for a dog ");
        }
    }

    @Override
    public void removeDog(Dog dog) {
        dogs.remove(dog);
        count --;
        System.out.println("Dog removed from the Laimigas Astes Shelter");
    }


    @Override
    public List<Dog> getDogs() {
        return new ArrayList<>(dogs);
    }

    @Override
    public String getName() {
        return name.toUpperCase();
    }

    @Override
    public String displayInformation() {
        return String.format("\nSHELTER INFORMATION "
                + "\n - TYPE: %s "
                + "\n - SHELTER NAME: %s. "
                + " \n - ADDRESS: %s. "
                + " \n - MAX CAPACITY: %s  "
                + "\n - DOGS COUNT IN SHELTER: %s"
                + "\n - ADDITIONAL INFORMATION: There is possibility visitors to come and walk with dogs in the weekends. ", shelterType.getShelterType(), name, address, maxCapacity, count);
    }
}
