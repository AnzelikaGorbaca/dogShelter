package com.anzelika.oodp.bridge;

import com.anzelika.oodp.builder.Dog;

import java.util.ArrayList;
import java.util.List;

public class UlubeleShelter extends DogShelterAbstraction {
    private List<Dog> dogs = new ArrayList<>();

    public UlubeleShelter(String name, String address, int maxCapacity, int count, List<Dog> dogs,
            ShelterType shelterType) {
        super(name, address, maxCapacity, count, dogs, shelterType);
    }

    @Override
    public void addDog(Dog dog) {
        if(dogs.size() < maxCapacity) {
            dogs.add(dog);
            count++;
        } else {
            System.out.println("Ulubele Shelter is full, dog can't be added");
        }
    }

    @Override
    public void removeDog(Dog dog) {
        dogs.remove(dog);
        System.out.println("Dog removed from the Ulubele Shelter");
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
                + " \n - ADDRESS: %s "
                + " \n - MAX CAPACITY: %s  "
                + "\n - DOGS COUNT IN SHELTER: %s", shelterType.getShelterType(), name, address, maxCapacity, count);
    }


}