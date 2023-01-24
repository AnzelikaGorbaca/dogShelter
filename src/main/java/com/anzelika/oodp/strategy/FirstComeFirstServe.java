package com.anzelika.oodp.strategy;

import com.anzelika.oodp.bridge.DogShelterAbstraction;
import com.anzelika.oodp.builder.Dog;

public class FirstComeFirstServe implements AdoptionStrategy {

    @Override
    public boolean applyAdoptationStrategy(DogShelterAbstraction dogShelter) {
        System.out.println(" - ADOPTING STRATEGY: Adopting dog is organized on demand - first come first adopt");
        return true;
    }
}