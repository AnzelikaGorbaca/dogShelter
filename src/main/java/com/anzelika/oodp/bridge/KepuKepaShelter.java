package com.anzelika.oodp.bridge;

import com.anzelika.oodp.builder.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static java.lang.System.out;

public class KepuKepaShelter extends DogShelterAbstraction {

    public KepuKepaShelter(String name, String address, int maxCapacity, int count, List<Dog> dogs,
            ShelterType shelterType) {
        super(name, address, 0, count, dogs, shelterType);
    }

    @Override
    public void addDog(Dog dog) {
            dogs.add(dog);
            count++;
    }

    @Override
    public void removeDog(Dog dog) {
        dogs.remove(dog);
        count--;
        System.out.println("Dog removed from the Kepu Kepa Shelter");
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
                + "\n - SHELTER NAME: %s "
                + "\n - ADDRESS: %s "
                + "\n - MAX CAPACITY: Infinite"
                + "\n - DOGS COUNT IN SHELTER: %s", shelterType.getShelterType(), name, address, count);
    }
}
