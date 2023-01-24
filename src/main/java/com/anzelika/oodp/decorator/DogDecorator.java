package com.anzelika.oodp.decorator;


public abstract class DogDecorator implements CustomInformation {
    protected CustomInformation customInformation;

    public DogDecorator(CustomInformation customInformation) {
        this.customInformation = customInformation;
    }

    @Override
    public String add() {
        return customInformation.add();
    }
}
