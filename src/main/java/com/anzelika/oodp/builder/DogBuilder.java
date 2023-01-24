package com.anzelika.oodp.builder;

public class DogBuilder {
    private String name;
    private int age;
    private String breed;
    private Gender gender;
    private String color;

    public DogBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public DogBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public DogBuilder setBreed(String breed) {
        this.breed = breed;
        return this;
    }

    public DogBuilder setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public DogBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public Dog createDog() {
        return new Dog(name, age, breed, gender, color);
    }
}

