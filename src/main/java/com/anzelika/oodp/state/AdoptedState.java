package com.anzelika.oodp.state;

import com.anzelika.oodp.builder.Dog;

public class AdoptedState implements DogState {

    @Override
    public void adopt(Dog dog) {
        System.out.print(" Invalid action, dog is already adopted");
    }

    @Override
    public void returnDog(Dog dog) {
        System.out.print(" Dog has been returned");
    }

    @Override
    public void train(Dog dog) {
        System.out.print(" Invalid action, dog is already adopted");
    }

    @Override
    public void sendToQurantine(Dog dog) {
        System.out.println("Invalid action, dog is already adopted");
    }
}