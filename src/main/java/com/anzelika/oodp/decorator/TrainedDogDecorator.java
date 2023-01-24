package com.anzelika.oodp.decorator;

import com.anzelika.oodp.builder.Dog;

public class TrainedDogDecorator extends DogDecorator {
    public static final String TRAINED =  " \n   * Trained";

    public TrainedDogDecorator(CustomInformation customInformation) {
        super(customInformation);
    }

    @Override
    public String add() {
        return customInformation.add() + addTrained();
    }

    private String addTrained() {
    return TRAINED;
    }
}