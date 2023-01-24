package com.anzelika.oodp.state;

import com.anzelika.oodp.builder.Dog;

public class TrainingState implements DogState {

    @Override
    public void adopt(Dog dog) {
        System.out.println("Invalid action, dog is in training");
    }

    @Override
    public void returnDog(Dog dog) {
        System.out.println("Invalid action, dog is in training");
    }

    @Override
    public void train(Dog dog) {
        System.out.println (" Dog has finished training");
    }

    @Override
    public void sendToQurantine(Dog dog) {
        System.out.print (" Dog is sent to quarantine");}
}