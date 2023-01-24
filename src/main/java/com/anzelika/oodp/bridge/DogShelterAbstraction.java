package com.anzelika.oodp.bridge;


import com.anzelika.oodp.builder.Dog;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
public abstract class DogShelterAbstraction {
    String name;
    String address;
    int maxCapacity;
    int count;
    List<Dog> dogs;
    ShelterType shelterType;

    public DogShelterAbstraction(String name, String address, int maxCapacity, int count, List<Dog> dogs,
            ShelterType shelterType) {
        this.name = name;
        this.address = address;
        this.maxCapacity = maxCapacity;
        this.count = count;
        this.dogs = dogs;
        this.shelterType = shelterType;
    }

    public abstract void addDog(Dog dog);

    public abstract void removeDog(Dog dog);

    public abstract String getName();

    public abstract List<Dog> getDogs();

    public abstract String displayInformation();

}
