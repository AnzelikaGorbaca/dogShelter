package com.anzelika.oodp.state;

import com.anzelika.oodp.builder.Dog;

public class AvailableState implements DogState {

    @Override
    public void adopt(Dog dog) {
        System.out.print(" Dog has been adopted");
    }

    @Override
    public void returnDog(Dog dog) {
        System.out.print(" Invalid action, dog is already available for adoption");
    }

    @Override
    public void train(Dog dog) {
        System.out.print(" Dog is now in training");
    }

    @Override
    public void sendToQurantine(Dog dog) {
        System.out.print(" Dog is sent to quarantine");}

}