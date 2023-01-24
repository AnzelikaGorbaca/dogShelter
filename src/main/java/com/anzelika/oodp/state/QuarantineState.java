package com.anzelika.oodp.state;

import com.anzelika.oodp.builder.Dog;

public class QuarantineState implements DogState {

    public static final String INVALID_ACTION = "Invalid action, dog is in quarantine";

    @Override
    public void adopt(Dog dog) {
        System.out.print(INVALID_ACTION);
    }

    @Override
    public void returnDog(Dog dog) {
        System.out.print(INVALID_ACTION);
    }

    @Override
    public void train(Dog dog) {
        System.out.print(INVALID_ACTION);
    }

    @Override
    public void sendToQurantine(Dog dog) {
            System.out.print(" Dog is sent to quarantine");}

}