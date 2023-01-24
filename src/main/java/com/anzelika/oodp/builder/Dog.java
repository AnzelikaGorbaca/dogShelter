package com.anzelika.oodp.builder;



public class Dog {
    private String color;
    private String name;
    private int age;
    private String breed;
    private Gender gender;

    Dog(String name, int age, String breed, Gender gender, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.gender = gender;
        this.color = color;
    }

    public static DogBuilder builder() {
        return new DogBuilder();
    }

    public String getDescription() {
        return "\n\n*DOG \n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Breed: " + breed + "\n" +
                "Gender: " + gender + "\n" +
                "Color: " + color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public Gender getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }
}
